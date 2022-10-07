# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestAutoretrieveController(BaseTestCase):
    """AutoretrieveController integration test stubs"""

    def test_admin_autoretrieve_init_post(self):
        """Test case for admin_autoretrieve_init_post

        Register autoretrieve server
        """
        pubKey = 'pubKey_example'
        response = self.client.open(
            '//admin/autoretrieve/init',
            method='POST',
            data=json.dumps(pubKey),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_autoretrieve_list_get(self):
        """Test case for admin_autoretrieve_list_get

        List autoretrieve servers
        """
        response = self.client.open(
            '//admin/autoretrieve/list',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_autoretrieve_heartbeat_post(self):
        """Test case for autoretrieve_heartbeat_post

        Marks autoretrieve server as up
        """
        headers = [('token', 'token_example')]
        response = self.client.open(
            '//autoretrieve/heartbeat',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
