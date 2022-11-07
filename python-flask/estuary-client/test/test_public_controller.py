# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestPublicController(BaseTestCase):
    """PublicController integration test stubs"""

    def test_public_by_cid_cid_get(self):
        """Test case for public_by_cid_cid_get

        Get Content by Cid
        """
        response = self.client.open(
            '//public/by-cid/{cid}'.format(cid='cid_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_info_get(self):
        """Test case for public_info_get

        Get public node info
        """
        response = self.client.open(
            '//public/info',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_metrics_deals_on_chain_get(self):
        """Test case for public_metrics_deals_on_chain_get

        Get deal metrics
        """
        response = self.client.open(
            '//public/metrics/deals-on-chain',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_miners_deals_miner_get(self):
        """Test case for public_miners_deals_miner_get

        Get all miners deals
        """
        query_string = [('ignore_failed', 'ignore_failed_example')]
        response = self.client.open(
            '//public/miners/deals/{miner}'.format(miner='miner_example'),
            method='GET',
            query_string=query_string)
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

    def test_public_miners_stats_miner_get(self):
        """Test case for public_miners_stats_miner_get

        Get miner stats
        """
        response = self.client.open(
            '//public/miners/stats/{miner}'.format(miner='miner_example'),
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

    def test_public_stats_get(self):
        """Test case for public_stats_get

        Public stats
        """
        response = self.client.open(
            '//public/stats',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
