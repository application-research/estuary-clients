# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestMetricsController(BaseTestCase):
    """MetricsController integration test stubs"""

    def test_public_metrics_deals_on_chain_get(self):
        """Test case for public_metrics_deals_on_chain_get

        Get deal metrics
        """
        response = self.client.open(
            '/public/metrics/deals-on-chain',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
