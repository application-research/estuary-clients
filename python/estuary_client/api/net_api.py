# coding: utf-8

"""
    Estuary API

    This is the API for the Estuary application.  # noqa: E501

    OpenAPI spec version: 0.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from estuary_client.api_client import ApiClient


class NetApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def admin_miners_get(self, **kwargs):  # noqa: E501
        """Get all miners  # noqa: E501

        This endpoint returns all miners. Note: value may be cached  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.admin_miners_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: ApiMinerResp
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.admin_miners_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.admin_miners_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def admin_miners_get_with_http_info(self, **kwargs):  # noqa: E501
        """Get all miners  # noqa: E501

        This endpoint returns all miners. Note: value may be cached  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.admin_miners_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: ApiMinerResp
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method admin_miners_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/admin/miners/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ApiMinerResp',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def public_miners_failures_miner_get(self, miner, **kwargs):  # noqa: E501
        """Get all miners  # noqa: E501

        This endpoint returns all miners  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.public_miners_failures_miner_get(miner, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str miner: Filter by miner (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.public_miners_failures_miner_get_with_http_info(miner, **kwargs)  # noqa: E501
        else:
            (data) = self.public_miners_failures_miner_get_with_http_info(miner, **kwargs)  # noqa: E501
            return data

    def public_miners_failures_miner_get_with_http_info(self, miner, **kwargs):  # noqa: E501
        """Get all miners  # noqa: E501

        This endpoint returns all miners  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.public_miners_failures_miner_get_with_http_info(miner, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str miner: Filter by miner (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['miner']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method public_miners_failures_miner_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'miner' is set
        if ('miner' not in params or
                params['miner'] is None):
            raise ValueError("Missing the required parameter `miner` when calling `public_miners_failures_miner_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'miner' in params:
            path_params['miner'] = params['miner']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/public/miners/failures/{miner}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def public_net_addrs_get(self, **kwargs):  # noqa: E501
        """Net Addrs  # noqa: E501

        This endpoint is used to get net addrs  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.public_net_addrs_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[str]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.public_net_addrs_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.public_net_addrs_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def public_net_addrs_get_with_http_info(self, **kwargs):  # noqa: E501
        """Net Addrs  # noqa: E501

        This endpoint is used to get net addrs  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.public_net_addrs_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[str]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method public_net_addrs_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/public/net/addrs', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[str]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def public_net_peers_get(self, **kwargs):  # noqa: E501
        """Net Peers  # noqa: E501

        This endpoint is used to get net peers  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.public_net_peers_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[str]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.public_net_peers_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.public_net_peers_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def public_net_peers_get_with_http_info(self, **kwargs):  # noqa: E501
        """Net Peers  # noqa: E501

        This endpoint is used to get net peers  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.public_net_peers_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[str]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method public_net_peers_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/public/net/peers', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[str]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
