# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.main_channel_id_param import MainChannelIDParam  # noqa: E501
from estuary-client.models.main_estimate_deal_body import MainEstimateDealBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestDealsController(BaseTestCase):
    """DealsController integration test stubs"""

    def test_deal_estimate_post(self):
        """Test case for deal_estimate_post

        Estimate the cost of a deal
        """
        body = MainEstimateDealBody()
        response = self.client.open(
            '/deal/estimate',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deal_info_dealid_get(self):
        """Test case for deal_info_dealid_get

        Get Deal Info
        """
        response = self.client.open(
            '/deal/info/{dealid}'.format(dealid=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deal_proposal_propcid_get(self):
        """Test case for deal_proposal_propcid_get

        Get Proposal
        """
        response = self.client.open(
            '/deal/proposal/{propcid}'.format(propcid='propcid_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deal_query_miner_get(self):
        """Test case for deal_query_miner_get

        Query Ask
        """
        response = self.client.open(
            '/deal/query/{miner}'.format(miner='miner_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deal_status_by_proposal_propcid_get(self):
        """Test case for deal_status_by_proposal_propcid_get

        Get Deal Status by PropCid
        """
        response = self.client.open(
            '/deal/status-by-proposal/{propcid}'.format(propcid='propcid_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deal_status_miner_propcid_get(self):
        """Test case for deal_status_miner_propcid_get

        Deal Status
        """
        response = self.client.open(
            '/deal/status/{miner}/{propcid}'.format(miner='miner_example', propcid='propcid_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deal_transfer_in_progress_get(self):
        """Test case for deal_transfer_in_progress_get

        Transfer In Progress
        """
        response = self.client.open(
            '/deal/transfer/in-progress',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deal_transfer_status_post(self):
        """Test case for deal_transfer_status_post

        Transfer Status
        """
        body = MainChannelIDParam()
        response = self.client.open(
            '/deal/transfer/status',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deals_failures_get(self):
        """Test case for deals_failures_get

        Get storage failures for user
        """
        response = self.client.open(
            '/deals/failures',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deals_make_miner_post(self):
        """Test case for deals_make_miner_post

        Make Deal
        """
        body = 'body_example'
        response = self.client.open(
            '/deals/make/{miner}'.format(miner='miner_example'),
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deals_status_deal_get(self):
        """Test case for deals_status_deal_get

        Get Deal Status
        """
        response = self.client.open(
            '/deals/status/{deal}'.format(deal=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_deals_failures_get(self):
        """Test case for public_deals_failures_get

        Get storage failures
        """
        response = self.client.open(
            '/public/deals/failures',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_public_miners_storage_query_miner_get(self):
        """Test case for public_miners_storage_query_miner_get

        Query Ask
        """
        response = self.client.open(
            '/public/miners/storage/query/{miner}'.format(miner='miner_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
