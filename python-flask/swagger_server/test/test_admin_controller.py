# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestAdminController(BaseTestCase):
    """AdminController integration test stubs"""

    def test_admin_peering_peers_delete(self):
        """Test case for admin_peering_peers_delete

        Remove peers on Peering Service
        """
        response = self.client.open(
            '//admin/peering/peers',
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_peers_get(self):
        """Test case for admin_peering_peers_get

        List all Peering peers
        """
        response = self.client.open(
            '//admin/peering/peers',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_peers_post(self):
        """Test case for admin_peering_peers_post

        Add peers on Peering Service
        """
        response = self.client.open(
            '//admin/peering/peers',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_start_post(self):
        """Test case for admin_peering_start_post

        Start Peering
        """
        response = self.client.open(
            '//admin/peering/start',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_status_get(self):
        """Test case for admin_peering_status_get

        Check Peering Status
        """
        response = self.client.open(
            '//admin/peering/status',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_peering_stop_post(self):
        """Test case for admin_peering_stop_post

        Stop Peering
        """
        response = self.client.open(
            '//admin/peering/stop',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_system_config_get(self):
        """Test case for admin_system_config_get

        Get systems(estuary/shuttle) config
        """
        response = self.client.open(
            '//admin/system/config',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_users_get(self):
        """Test case for admin_users_get

        Get all users
        """
        response = self.client.open(
            '//admin/users',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
