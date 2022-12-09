# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.main_import_deal_body import MainImportDealBody  # noqa: E501
from estuary-client.models.util_content_add_ipfs_body import UtilContentAddIpfsBody  # noqa: E501
from estuary-client.models.util_content_create_body import UtilContentCreateBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestContentController(BaseTestCase):
    """ContentController integration test stubs"""

    def test_admin_invites_code_post(self):
        """Test case for admin_invites_code_post

        Create an Estuary invite
        """
        response = self.client.open(
            '/admin/invites/{code}'.format(code='code_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_invites_get(self):
        """Test case for admin_invites_get

        Get Estuary invites
        """
        response = self.client.open(
            '/admin/invites',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_add_car_post(self):
        """Test case for content_add_car_post

        Upload content via a car file
        """
        response = self.client.open(
            '/content/add-car',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_add_ipfs_post(self):
        """Test case for content_add_ipfs_post

        Add IPFS object
        """
        body = UtilContentAddIpfsBody()
        query_string = [('ignore_dupes', 'ignore_dupes_example')]
        response = self.client.open(
            '/content/add-ipfs',
            method='POST',
            data=json.dumps(body),
            content_type='*/*',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_add_post(self):
        """Test case for content_add_post

        Upload a file
        """
        response = self.client.open(
            '/content/add',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_aggregated_content_get(self):
        """Test case for content_aggregated_content_get

        Get aggregated content stats
        """
        response = self.client.open(
            '/content/aggregated/{content}'.format(content='content_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_all_deals_get(self):
        """Test case for content_all_deals_get

        Get all deals for a user
        """
        query_string = [('begin', 'begin_example'),
                        ('duration', 'duration_example'),
                        ('all', 'all_example')]
        response = self.client.open(
            '/content/all-deals',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_bw_usage_content_get(self):
        """Test case for content_bw_usage_content_get

        Get content bandwidth
        """
        response = self.client.open(
            '/content/bw-usage/{content}'.format(content='content_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_create_post(self):
        """Test case for content_create_post

        Add a new content
        """
        body = UtilContentCreateBody()
        query_string = [('ignore_dupes', 'ignore_dupes_example')]
        response = self.client.open(
            '/content/create',
            method='POST',
            data=json.dumps(body),
            content_type='*/*',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_deals_get(self):
        """Test case for content_deals_get

        Content with deals
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '/content/deals',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_ensure_replication_datacid_get(self):
        """Test case for content_ensure_replication_datacid_get

        Ensure Replication
        """
        response = self.client.open(
            '/content/ensure-replication/{datacid}'.format(datacid='datacid_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_failures_content_get(self):
        """Test case for content_failures_content_get

        List all failures for a content
        """
        response = self.client.open(
            '/content/failures/{content}'.format(content='content_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_id_get(self):
        """Test case for content_id_get

        Content
        """
        response = self.client.open(
            '/content/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_importdeal_post(self):
        """Test case for content_importdeal_post

        Import a deal
        """
        body = MainImportDealBody()
        response = self.client.open(
            '/content/importdeal',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_list_get(self):
        """Test case for content_list_get

        List all pinned content
        """
        response = self.client.open(
            '/content/list',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_read_cont_get(self):
        """Test case for content_read_cont_get

        Read content
        """
        response = self.client.open(
            '/content/read/{cont}'.format(cont='cont_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_staging_zones_get(self):
        """Test case for content_staging_zones_get

        Get staging zone for user
        """
        response = self.client.open(
            '/content/staging-zones',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_stats_get(self):
        """Test case for content_stats_get

        Get content statistics
        """
        query_string = [('limit', 'limit_example'),
                        ('offset', 'offset_example')]
        response = self.client.open(
            '/content/stats',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_status_id_get(self):
        """Test case for content_status_id_get

        Content Status
        """
        response = self.client.open(
            '/content/status/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
