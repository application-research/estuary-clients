# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.main_get_api_keys_resp import MainGetApiKeysResp  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestUserController(BaseTestCase):
    """UserController integration test stubs"""

    def test_user_api_keys_get(self):
        """Test case for user_api_keys_get

        Get API keys for a user
        """
        response = self.client.open(
            '//user/api-keys',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_api_keys_key_delete(self):
        """Test case for user_api_keys_key_delete

        Revoke a User API Key.
        """
        response = self.client.open(
            '//user/api-keys/{key}'.format(key='key_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_api_keys_post(self):
        """Test case for user_api_keys_post

        Create API keys for a user
        """
        query_string = [('expiry', 'expiry_example'),
                        ('perms', 'perms_example')]
        response = self.client.open(
            '//user/api-keys',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_export_get(self):
        """Test case for user_export_get

        Export user data
        """
        response = self.client.open(
            '//user/export',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_stats_get(self):
        """Test case for user_stats_get

        Create API keys for a user
        """
        response = self.client.open(
            '//user/stats',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
