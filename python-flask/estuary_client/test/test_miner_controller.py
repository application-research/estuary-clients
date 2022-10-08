# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary_client.test import BaseTestCase


class TestMinerController(BaseTestCase):
    """MinerController integration test stubs"""

    def test_public_miners_deals_miner_get(self):
        """Test case for public_miners_deals_miner_get

        Get all miners deals
        """
        response = self.client.open(
            '//public/miners/deals/{miner}'.format(miner='miner_example'),
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


if __name__ == '__main__':
    import unittest
    unittest.main()
