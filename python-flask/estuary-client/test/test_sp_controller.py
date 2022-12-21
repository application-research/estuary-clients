# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.api_storage_provider_resp import ApiStorageProviderResp  # noqa: E501
from estuary-client.models.github_com_application_research_estuary_api_v2_claim_msg_response import GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse  # noqa: E501
from estuary-client.models.github_com_application_research_estuary_api_v2_claim_response import GithubComApplicationResearchEstuaryApiV2ClaimResponse  # noqa: E501
from estuary-client.models.miner_claim_miner_body import MinerClaimMinerBody  # noqa: E501
from estuary-client.models.miner_miner_set_info_params import MinerMinerSetInfoParams  # noqa: E501
from estuary-client.models.miner_suspend_miner_body import MinerSuspendMinerBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestSpController(BaseTestCase):
    """SpController integration test stubs"""

    def test_storage_providers_claim_post(self):
        """Test case for storage_providers_claim_post

        Claim Storage Provider
        """
        body = MinerClaimMinerBody()
        response = self.client.open(
            '/storage-providers/claim',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_claim_sp_get(self):
        """Test case for storage_providers_claim_sp_get

        Get Claim Storage Provider
        """
        response = self.client.open(
            '/storage-providers/claim/{sp}'.format(sp='sp_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_deals_sp_get(self):
        """Test case for storage_providers_deals_sp_get

        Get all storage providers deals
        """
        query_string = [('ignore_failed', 'ignore_failed_example')]
        response = self.client.open(
            '/storage-providers/deals/{sp}'.format(sp='sp_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_failures_sp_get(self):
        """Test case for storage_providers_failures_sp_get

        Get all storage providers
        """
        response = self.client.open(
            '/storage-providers/failures/{sp}'.format(sp='sp_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_get(self):
        """Test case for storage_providers_get

        Get all storage providers
        """
        response = self.client.open(
            '/storage-providers',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_set_info_sp_put(self):
        """Test case for storage_providers_set_info_sp_put

        Set Storage Provider Info
        """
        body = MinerMinerSetInfoParams()
        response = self.client.open(
            '/storage-providers/set-info/{sp}'.format(sp='sp_example'),
            method='PUT',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_stats_sp_get(self):
        """Test case for storage_providers_stats_sp_get

        Get storage provider stats
        """
        response = self.client.open(
            '/storage-providers/stats/{sp}'.format(sp='sp_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_suspend_sp_post(self):
        """Test case for storage_providers_suspend_sp_post

        Suspend Storage Provider
        """
        body = MinerSuspendMinerBody()
        response = self.client.open(
            '/storage-providers/suspend/{sp}'.format(sp='sp_example'),
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_storage_providers_unsuspend_sp_put(self):
        """Test case for storage_providers_unsuspend_sp_put

        Unuspend Storage Provider
        """
        response = self.client.open(
            '/storage-providers/unsuspend/{sp}'.format(sp='sp_example'),
            method='PUT')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
