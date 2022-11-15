# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.types_ipfs_list_pin_status_response import TypesIpfsListPinStatusResponse  # noqa: E501
from estuary-client.models.types_ipfs_pin import TypesIpfsPin  # noqa: E501
from estuary-client.models.types_ipfs_pin_status_response import TypesIpfsPinStatusResponse  # noqa: E501
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
        body = 'body_example'
        response = self.client.open(
            '/pinning/pins/{pinid}'.format(pinid='pinid_example'),
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pinning_pins_post(self):
        """Test case for pinning_pins_post

        Add and pin object
        """
        body = TypesIpfsPin()
        response = self.client.open(
            '/pinning/pins',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
