# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestPeersController(BaseTestCase):
    """PeersController integration test stubs"""

    def test_admin_peering_peers_delete(self):
        """Test case for admin_peering_peers_delete

        Remove peers on Peering Service
        """
        body = [True]
        response = self.client.open(
            '/admin/peering/peers',
            method='DELETE',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_peers_get(self):
        """Test case for admin_peering_peers_get

        List all Peering peers
        """
        response = self.client.open(
            '/admin/peering/peers',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_peers_post(self):
        """Test case for admin_peering_peers_post

        Add peers on Peering Service
        """
        response = self.client.open(
            '/admin/peering/peers',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_start_post(self):
        """Test case for admin_peering_start_post

        Start Peering
        """
        response = self.client.open(
            '/admin/peering/start',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_status_get(self):
        """Test case for admin_peering_status_get

        Check Peering Status
        """
        response = self.client.open(
            '/admin/peering/status',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_stop_post(self):
        """Test case for admin_peering_stop_post

        Stop Peering
        """
        response = self.client.open(
            '/admin/peering/stop',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
