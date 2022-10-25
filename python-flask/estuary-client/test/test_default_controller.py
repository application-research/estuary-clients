# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_deal_transfer_status_post(self):
        """Test case for deal_transfer_status_post

        
        """
        response = self.client.open(
            '//deal/transfer/status',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
