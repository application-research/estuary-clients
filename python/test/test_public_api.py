# coding: utf-8

"""
    Estuary API

    This is the API for the Estuary application.  # noqa: E501

    OpenAPI spec version: 0.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import estuary-client
from estuary-client.api.public_api import PublicApi  # noqa: E501
from estuary-client.rest import ApiException


class TestPublicApi(unittest.TestCase):
    """PublicApi unit test stubs"""

    def setUp(self):
        self.api = estuary-client.api.public_api.PublicApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_public_by_cid_cid_get(self):
        """Test case for public_by_cid_cid_get

        Get Content by Cid  # noqa: E501
        """
        pass

    def test_public_info_get(self):
        """Test case for public_info_get

        Get public node info  # noqa: E501
        """
        pass

    def test_public_metrics_deals_on_chain_get(self):
        """Test case for public_metrics_deals_on_chain_get

        Get deal metrics  # noqa: E501
        """
        pass

    def test_public_miners_deals_miner_get(self):
        """Test case for public_miners_deals_miner_get

        Get all miners deals  # noqa: E501
        """
        pass

    def test_public_miners_failures_miner_get(self):
        """Test case for public_miners_failures_miner_get

        Get all miners  # noqa: E501
        """
        pass

    def test_public_miners_get(self):
        """Test case for public_miners_get

        Get all miners  # noqa: E501
        """
        pass

    def test_public_miners_stats_miner_get(self):
        """Test case for public_miners_stats_miner_get

        Get miner stats  # noqa: E501
        """
        pass

    def test_public_net_addrs_get(self):
        """Test case for public_net_addrs_get

        Net Addrs  # noqa: E501
        """
        pass

    def test_public_net_peers_get(self):
        """Test case for public_net_peers_get

        Net Peers  # noqa: E501
        """
        pass

    def test_public_stats_get(self):
        """Test case for public_stats_get

        Public stats  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
