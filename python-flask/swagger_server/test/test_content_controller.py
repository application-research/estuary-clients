# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.main_import_deal_body import MainImportDealBody  # noqa: E501
from swagger_server.models.util_content_add_ipfs_body import UtilContentAddIpfsBody  # noqa: E501
from swagger_server.models.util_content_add_response import UtilContentAddResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestContentController(BaseTestCase):
    """ContentController integration test stubs"""

    def test_content_add_car_post(self):
        """Test case for content_add_car_post

        Add Car object
        """
        body = 'body_example'
        query_string = [('filename', 'filename_example'),
                        ('commp', 'commp_example'),
                        ('size', 'size_example')]
        response = self.client.open(
            '//content/add-car',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_add_ipfs_post(self):
        """Test case for content_add_ipfs_post

        Add IPFS object
        """
        body = UtilContentAddIpfsBody()
        response = self.client.open(
            '//content/add-ipfs',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_add_post(self):
        """Test case for content_add_post

        Add new content
        """
        data = dict(file=(BytesIO(b'some file data'), 'file.txt'))
        response = self.client.open(
            '//content/add'.format(coluuid='coluuid_example', dir='dir_example'),
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_aggregated_content_get(self):
        """Test case for content_aggregated_content_get

        Get aggregated content stats
        """
        response = self.client.open(
            '//content/aggregated/{content}'.format(content='content_example'),
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
            '//content/all-deals',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_bw_usage_content_get(self):
        """Test case for content_bw_usage_content_get

        Get content bandwidth
        """
        response = self.client.open(
            '//content/bw-usage/{content}'.format(content='content_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_create_post(self):
        """Test case for content_create_post

        Add a new content
        """
        body = 'body_example'
        response = self.client.open(
            '//content/create',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_deals_get(self):
        """Test case for content_deals_get

        Content with deals
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '//content/deals',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_ensure_replication_datacid_get(self):
        """Test case for content_ensure_replication_datacid_get

        Ensure Replication
        """
        response = self.client.open(
            '//content/ensure-replication/{datacid}'.format(datacid='datacid_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_failures_content_get(self):
        """Test case for content_failures_content_get

        List all failures for a content
        """
        response = self.client.open(
            '//content/failures/{content}'.format(content='content_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_importdeal_post(self):
        """Test case for content_importdeal_post

        Import a deal
        """
        body = MainImportDealBody()
        response = self.client.open(
            '//content/importdeal',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_list_get(self):
        """Test case for content_list_get

        List all pinned content
        """
        response = self.client.open(
            '//content/list',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_read_cont_get(self):
        """Test case for content_read_cont_get

        Read content
        """
        response = self.client.open(
            '//content/read/{cont}'.format(cont='cont_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_staging_zones_get(self):
        """Test case for content_staging_zones_get

        Get staging zone for user
        """
        response = self.client.open(
            '//content/staging-zones',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_stats_get(self):
        """Test case for content_stats_get

        Get content statistics
        """
        response = self.client.open(
            '//content/stats'.format(limit='limit_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_content_status_id_get(self):
        """Test case for content_status_id_get

        Content Status
        """
        response = self.client.open(
            '//content/status/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
