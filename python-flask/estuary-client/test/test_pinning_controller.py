# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.pinner_ipfs_list_pin_status_response import PinnerIpfsListPinStatusResponse  # noqa: E501
from estuary-client.models.pinner_ipfs_pin import PinnerIpfsPin  # noqa: E501
from estuary-client.models.pinner_ipfs_pin_status_response import PinnerIpfsPinStatusResponse  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestPinningController(BaseTestCase):
    """PinningController integration test stubs"""

    def test_pinning_pins_get(self):
        """Test case for pinning_pins_get

        List all pin status objects
        """
        response = self.client.open(
            '/pinning/pins',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pinning_pins_pinid_delete(self):
        """Test case for pinning_pins_pinid_delete

        Delete a pinned object
        """
        response = self.client.open(
            '/pinning/pins/{pinid}'.format(pinid='pinid_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pinning_pins_pinid_get(self):
        """Test case for pinning_pins_pinid_get

        Get a pin status object
        """
        response = self.client.open(
            '/pinning/pins/{pinid}'.format(pinid='pinid_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pinning_pins_pinid_post(self):
        """Test case for pinning_pins_pinid_post

        Replace a pinned object
        """
        body = PinnerIpfsPin()
        response = self.client.open(
            '/pinning/pins/{pinid}'.format(pinid='pinid_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pinning_pins_post(self):
        """Test case for pinning_pins_post

        Add and pin object
        """
        body = PinnerIpfsPin()
        query_string = [('ignore_dupes', 'ignore_dupes_example'),
                        ('overwrite', 'overwrite_example')]
        response = self.client.open(
            '/pinning/pins',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
