# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestNetController(BaseTestCase):
    """NetController integration test stubs"""

    def test_net_addrs_get(self):
        """Test case for net_addrs_get

        Net Addrs
        """
        response = self.client.open(
            '//net/addrs',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_miners_failures_miner_get(self):
        """Test case for public_miners_failures_miner_get

        Get all miners
        """
        response = self.client.open(
            '//public/miners/failures/{miner}'.format(miner='miner_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_miners_get(self):
        """Test case for public_miners_get

        Get all miners
        """
        response = self.client.open(
            '//public/miners',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_net_addrs_get(self):
        """Test case for public_net_addrs_get

        Net Addrs
        """
        response = self.client.open(
            '//public/net/addrs',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_net_peers_get(self):
        """Test case for public_net_peers_get

        Net Peers
        """
        response = self.client.open(
            '//public/net/peers',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
