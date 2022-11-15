# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestMinerController(BaseTestCase):
    """MinerController integration test stubs"""

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
