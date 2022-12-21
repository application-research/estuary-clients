# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.github_com_application_research_estuary_api_v1_claim_msg_response import GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse  # noqa: E501
from estuary-client.models.github_com_application_research_estuary_api_v1_claim_response import GithubComApplicationResearchEstuaryApiV1ClaimResponse  # noqa: E501
from estuary-client.models.miner_claim_miner_body import MinerClaimMinerBody  # noqa: E501
from estuary-client.models.miner_miner_set_info_params import MinerMinerSetInfoParams  # noqa: E501
from estuary-client.models.miner_suspend_miner_body import MinerSuspendMinerBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestMinerController(BaseTestCase):
    """MinerController integration test stubs"""

    def test_miner_claim_miner_get(self):
        """Test case for miner_claim_miner_get

        Get Claim Miner Message
        """
        response = self.client.open(
            '/miner/claim/{miner}'.format(miner='miner_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_miner_claim_post(self):
        """Test case for miner_claim_post

        Claim Miner
        """
        body = MinerClaimMinerBody()
        response = self.client.open(
            '/miner/claim',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_miner_set_info_miner_put(self):
        """Test case for miner_set_info_miner_put

        Set Miner Info
        """
        body = MinerMinerSetInfoParams()
        response = self.client.open(
            '/miner/set-info/{miner}'.format(miner='miner_example'),
            method='PUT',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_miner_suspend_miner_post(self):
        """Test case for miner_suspend_miner_post

        Suspend Miner
        """
        body = MinerSuspendMinerBody()
        response = self.client.open(
            '/miner/suspend/{miner}'.format(miner='miner_example'),
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_miner_unsuspend_miner_put(self):
        """Test case for miner_unsuspend_miner_put

        Unuspend Miner
        """
        response = self.client.open(
            '/miner/unsuspend/{miner}'.format(miner='miner_example'),
            method='PUT')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_miners_deals_miner_get(self):
        """Test case for public_miners_deals_miner_get

        Get all miners deals
        """
        query_string = [('ignore_failed', 'ignore_failed_example')]
        response = self.client.open(
            '/public/miners/deals/{miner}'.format(miner='miner_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_miners_stats_miner_get(self):
        """Test case for public_miners_stats_miner_get

        Get miner stats
        """
        response = self.client.open(
            '/public/miners/stats/{miner}'.format(miner='miner_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
