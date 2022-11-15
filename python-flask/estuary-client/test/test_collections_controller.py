# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from estuary-client.models.collections_collection import CollectionsCollection  # noqa: E501
from estuary-client.models.main_create_collection_body import MainCreateCollectionBody  # noqa: E501
from estuary-client.models.main_delete_content_from_collection_body import MainDeleteContentFromCollectionBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.test import BaseTestCase


class TestCollectionsController(BaseTestCase):
    """CollectionsController integration test stubs"""

    def test_collections_coluuid_commit_post(self):
        """Test case for collections_coluuid_commit_post

        Produce a CID of the collection contents
        """
        response = self.client.open(
            '/collections/{coluuid}/commit'.format(coluuid='coluuid_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_collections_coluuid_contents_delete(self):
        """Test case for collections_coluuid_contents_delete

        Deletes a content from a collection
        """
        body = MainDeleteContentFromCollectionBody()
        response = self.client.open(
            '/collections/{coluuid}/contents'.format(coluuid='coluuid_example', contentid='contentid_example'),
            method='DELETE',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_collections_coluuid_delete(self):
        """Test case for collections_coluuid_delete

        Deletes a collection
        """
        response = self.client.open(
            '/collections/{coluuid}'.format(coluuid='coluuid_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_collections_coluuid_get(self):
        """Test case for collections_coluuid_get

        Get contents in a collection
        """
        query_string = [('dir', 'dir_example')]
        response = self.client.open(
            '/collections/{coluuid}'.format(coluuid='coluuid_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_collections_coluuid_post(self):
        """Test case for collections_coluuid_post

        Add contents to a collection
        """
        body = [56]
        response = self.client.open(
            '/collections/{coluuid}'.format(coluuid='coluuid_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_collections_fs_add_post(self):
        """Test case for collections_fs_add_post

        Add a file to a collection
        """
        query_string = [('coluuid', 'coluuid_example'),
                        ('content', 'content_example'),
                        ('path', 'path_example')]
        response = self.client.open(
            '/collections/fs/add',
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_collections_get(self):
        """Test case for collections_get

        List all collections
        """
        response = self.client.open(
            '/collections/',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_collections_post(self):
        """Test case for collections_post

        Create a new collection
        """
        body = MainCreateCollectionBody()
        response = self.client.open(
            '/collections/',
            method='POST',
            data=json.dumps(body),
            content_type='*/*')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
