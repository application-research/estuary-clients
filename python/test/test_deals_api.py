# coding: utf-8

"""
    Estuary API

    This is the API for the Estuary application.  # noqa: E501

    OpenAPI spec version: 0.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.deals_api import DealsApi  # noqa: E501
from swagger_client.rest import ApiException


class TestDealsApi(unittest.TestCase):
    """DealsApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.deals_api.DealsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_deal_estimate_post(self):
        """Test case for deal_estimate_post

        Estimate the cost of a deal  # noqa: E501
        """
        pass

    def test_deal_info_dealid_get(self):
        """Test case for deal_info_dealid_get

        Get Deal Info  # noqa: E501
        """
        pass

    def test_deal_proposal_propcid_get(self):
        """Test case for deal_proposal_propcid_get

        Get Proposal  # noqa: E501
        """
        pass

    def test_deal_query_miner_get(self):
        """Test case for deal_query_miner_get

        Query Ask  # noqa: E501
        """
        pass

    def test_deal_status_by_proposal_propcid_get(self):
        """Test case for deal_status_by_proposal_propcid_get

        Get Deal Status by PropCid  # noqa: E501
        """
        pass

    def test_deal_status_miner_propcid_get(self):
        """Test case for deal_status_miner_propcid_get

        Deal Status  # noqa: E501
        """
        pass

    def test_deal_transfer_in_progress_get(self):
        """Test case for deal_transfer_in_progress_get

        Transfer In Progress  # noqa: E501
        """
        pass

    def test_deal_transfer_status_post(self):
        """Test case for deal_transfer_status_post

        Transfer Status  # noqa: E501
        """
        pass

    def test_deals_failures_get(self):
        """Test case for deals_failures_get

        Get storage failures for user  # noqa: E501
        """
        pass

    def test_deals_make_miner_post(self):
        """Test case for deals_make_miner_post

        Make Deal  # noqa: E501
        """
        pass

    def test_deals_status_deal_get(self):
        """Test case for deals_status_deal_get

        Get Deal Status  # noqa: E501
        """
        pass

    def test_public_deals_failures_get(self):
        """Test case for public_deals_failures_get

        Get storage failures  # noqa: E501
        """
        pass

    def test_public_miners_storage_query_miner_get(self):
        """Test case for public_miners_storage_query_miner_get

        Query Ask  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()