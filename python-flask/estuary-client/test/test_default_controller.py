# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.models.util_viewer_response import UtilViewerResponse  # noqa: E501
from estuary-client.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_viewer_get(self):
        """Test case for viewer_get

        Fetch viewer details
        """
        response = self.client.open(
            '/viewer',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
