# coding: utf-8

"""
    Estuary API

    This is the API for the Estuary application.  # noqa: E501

    OpenAPI spec version: 0.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import estuary_client
from estuary_client.api.content_api import ContentApi  # noqa: E501
from estuary_client.rest import ApiException


class TestContentApi(unittest.TestCase):
    """ContentApi unit test stubs"""

    def setUp(self):
        self.api = ContentApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_admin_invites_code_post(self):
        """Test case for admin_invites_code_post

        Create an Estuary invite  # noqa: E501
        """
        pass

    def test_admin_invites_get(self):
        """Test case for admin_invites_get

        Get Estuary invites  # noqa: E501
        """
        pass

    def test_content_add_car_post(self):
        """Test case for content_add_car_post

        Upload content via a car file  # noqa: E501
        """
        pass

    def test_content_add_ipfs_post(self):
        """Test case for content_add_ipfs_post

        Add IPFS object  # noqa: E501
        """
        pass

    def test_content_add_post(self):
        """Test case for content_add_post

        Upload a file  # noqa: E501
        """
        pass

    def test_content_aggregated_content_get(self):
        """Test case for content_aggregated_content_get

        Get aggregated content stats  # noqa: E501
        """
        pass

    def test_content_all_deals_get(self):
        """Test case for content_all_deals_get

        Get all deals for a user  # noqa: E501
        """
        pass

    def test_content_bw_usage_content_get(self):
        """Test case for content_bw_usage_content_get

        Get content bandwidth  # noqa: E501
        """
        pass

    def test_content_create_post(self):
        """Test case for content_create_post

        Add a new content  # noqa: E501
        """
        pass

    def test_content_deals_get(self):
        """Test case for content_deals_get

        Content with deals  # noqa: E501
        """
        pass

    def test_content_ensure_replication_datacid_get(self):
        """Test case for content_ensure_replication_datacid_get

        Ensure Replication  # noqa: E501
        """
        pass

    def test_content_failures_content_get(self):
        """Test case for content_failures_content_get

        List all failures for a content  # noqa: E501
        """
        pass

    def test_content_id_get(self):
        """Test case for content_id_get

        Content  # noqa: E501
        """
        pass

    def test_content_importdeal_post(self):
        """Test case for content_importdeal_post

        Import a deal  # noqa: E501
        """
        pass

    def test_content_list_get(self):
        """Test case for content_list_get

        List all pinned content  # noqa: E501
        """
        pass

    def test_content_read_cont_get(self):
        """Test case for content_read_cont_get

        Read content  # noqa: E501
        """
        pass

    def test_content_staging_zones_get(self):
        """Test case for content_staging_zones_get

        Get staging zone for user, excluding its contents  # noqa: E501
        """
        pass

    def test_content_staging_zones_staging_zone_contents_get(self):
        """Test case for content_staging_zones_staging_zone_contents_get

        Get contents for a staging zone  # noqa: E501
        """
        pass

    def test_content_staging_zones_staging_zone_get(self):
        """Test case for content_staging_zones_staging_zone_get

        Get staging zone without its contents field populated  # noqa: E501
        """
        pass

    def test_content_stats_get(self):
        """Test case for content_stats_get

        Get content statistics  # noqa: E501
        """
        pass

    def test_content_status_id_get(self):
        """Test case for content_status_id_get

        Content Status  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
