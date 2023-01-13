# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.api_miner_resp import ApiMinerResp  # noqa: E501
from estuary-client.models.peering_peering_peer import PeeringPeeringPeer  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestAdminController(BaseTestCase):
    """AdminController integration test stubs"""

    def test_admin_miners_get(self):
        """Test case for admin_miners_get

        Get all miners
        """
        response = self.client.open(
            '/admin/miners/',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_peers_delete(self):
        """Test case for admin_peering_peers_delete

        Remove peers on Peering Service
        """
        body = ['body_example']
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
        body = [PeeringPeeringPeer()]
        response = self.client.open(
            '/admin/peering/peers',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
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

    def test_admin_system_config_get(self):
        """Test case for admin_system_config_get

        Get systems(estuary/shuttle) config
        """
        response = self.client.open(
            '/admin/system/config',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_users_get(self):
        """Test case for admin_users_get

        Get all users
        """
        response = self.client.open(
            '/admin/users',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
