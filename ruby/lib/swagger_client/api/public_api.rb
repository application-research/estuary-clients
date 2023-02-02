=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.40
=end

module SwaggerClient
  class PublicApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get Full Content by Cid
    # This endpoint returns the content associated with a CID
    # @param cid Cid
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def get_cid_get(cid, opts = {})
      get_cid_get_with_http_info(cid, opts)
      nil
    end

    # Get Full Content by Cid
    # This endpoint returns the content associated with a CID
    # @param cid Cid
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def get_cid_get_with_http_info(cid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.get_cid_get ...'
      end
      # verify the required parameter 'cid' is set
      if @api_client.config.client_side_validation && cid.nil?
        fail ArgumentError, "Missing the required parameter 'cid' when calling PublicApi.get_cid_get"
      end
      # resource path
      local_var_path = '/get/{cid}'.sub('{' + 'cid' + '}', cid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#get_cid_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get Content by Cid
    # This endpoint returns the content record associated with a CID
    # @param cid Cid
    # @param [Hash] opts the optional parameters
    # @return [String]
    def public_by_cid_cid_get(cid, opts = {})
      data, _status_code, _headers = public_by_cid_cid_get_with_http_info(cid, opts)
      data
    end

    # Get Content by Cid
    # This endpoint returns the content record associated with a CID
    # @param cid Cid
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def public_by_cid_cid_get_with_http_info(cid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_by_cid_cid_get ...'
      end
      # verify the required parameter 'cid' is set
      if @api_client.config.client_side_validation && cid.nil?
        fail ArgumentError, "Missing the required parameter 'cid' when calling PublicApi.public_by_cid_cid_get"
      end
      # resource path
      local_var_path = '/public/by-cid/{cid}'.sub('{' + 'cid' + '}', cid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_by_cid_cid_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get public node info
    # This endpoint returns information about the node
    # @param [Hash] opts the optional parameters
    # @return [ApiPublicNodeInfo]
    def public_info_get(opts = {})
      data, _status_code, _headers = public_info_get_with_http_info(opts)
      data
    end

    # Get public node info
    # This endpoint returns information about the node
    # @param [Hash] opts the optional parameters
    # @return [Array<(ApiPublicNodeInfo, Integer, Hash)>] ApiPublicNodeInfo data, response status code and response headers
    def public_info_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_info_get ...'
      end
      # resource path
      local_var_path = '/public/info'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'ApiPublicNodeInfo' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_info_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get deal metrics
    # This endpoint is used to get deal metrics
    # @param [Hash] opts the optional parameters
    # @return [String]
    def public_metrics_deals_on_chain_get(opts = {})
      data, _status_code, _headers = public_metrics_deals_on_chain_get_with_http_info(opts)
      data
    end

    # Get deal metrics
    # This endpoint is used to get deal metrics
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def public_metrics_deals_on_chain_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_metrics_deals_on_chain_get ...'
      end
      # resource path
      local_var_path = '/public/metrics/deals-on-chain'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_metrics_deals_on_chain_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get all miners deals
    # This endpoint returns all miners deals
    # @param miner Filter by miner
    # @param [Hash] opts the optional parameters
    # @option opts [String] :ignore_failed Ignore Failed
    # @return [String]
    def public_miners_deals_miner_get(miner, opts = {})
      data, _status_code, _headers = public_miners_deals_miner_get_with_http_info(miner, opts)
      data
    end

    # Get all miners deals
    # This endpoint returns all miners deals
    # @param miner Filter by miner
    # @param [Hash] opts the optional parameters
    # @option opts [String] :ignore_failed Ignore Failed
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def public_miners_deals_miner_get_with_http_info(miner, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_miners_deals_miner_get ...'
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling PublicApi.public_miners_deals_miner_get"
      end
      # resource path
      local_var_path = '/public/miners/deals/{miner}'.sub('{' + 'miner' + '}', miner.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'ignore-failed'] = opts[:'ignore_failed'] if !opts[:'ignore_failed'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_miners_deals_miner_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get all miners
    # This endpoint returns all miners
    # @param miner Filter by miner
    # @param [Hash] opts the optional parameters
    # @return [String]
    def public_miners_failures_miner_get(miner, opts = {})
      data, _status_code, _headers = public_miners_failures_miner_get_with_http_info(miner, opts)
      data
    end

    # Get all miners
    # This endpoint returns all miners
    # @param miner Filter by miner
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def public_miners_failures_miner_get_with_http_info(miner, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_miners_failures_miner_get ...'
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling PublicApi.public_miners_failures_miner_get"
      end
      # resource path
      local_var_path = '/public/miners/failures/{miner}'.sub('{' + 'miner' + '}', miner.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_miners_failures_miner_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get miner stats
    # This endpoint returns miner stats
    # @param miner Filter by miner
    # @param [Hash] opts the optional parameters
    # @return [String]
    def public_miners_stats_miner_get(miner, opts = {})
      data, _status_code, _headers = public_miners_stats_miner_get_with_http_info(miner, opts)
      data
    end

    # Get miner stats
    # This endpoint returns miner stats
    # @param miner Filter by miner
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def public_miners_stats_miner_get_with_http_info(miner, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_miners_stats_miner_get ...'
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling PublicApi.public_miners_stats_miner_get"
      end
      # resource path
      local_var_path = '/public/miners/stats/{miner}'.sub('{' + 'miner' + '}', miner.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_miners_stats_miner_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Net Addrs
    # This endpoint is used to get net addrs
    # @param [Hash] opts the optional parameters
    # @return [Array<String>]
    def public_net_addrs_get(opts = {})
      data, _status_code, _headers = public_net_addrs_get_with_http_info(opts)
      data
    end

    # Net Addrs
    # This endpoint is used to get net addrs
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<String>, Integer, Hash)>] Array<String> data, response status code and response headers
    def public_net_addrs_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_net_addrs_get ...'
      end
      # resource path
      local_var_path = '/public/net/addrs'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'Array<String>' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_net_addrs_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Net Peers
    # This endpoint is used to get net peers
    # @param [Hash] opts the optional parameters
    # @return [Array<String>]
    def public_net_peers_get(opts = {})
      data, _status_code, _headers = public_net_peers_get_with_http_info(opts)
      data
    end

    # Net Peers
    # This endpoint is used to get net peers
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<String>, Integer, Hash)>] Array<String> data, response status code and response headers
    def public_net_peers_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_net_peers_get ...'
      end
      # resource path
      local_var_path = '/public/net/peers'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'Array<String>' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_net_peers_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Public stats
    # This endpoint is used to get public stats.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def public_stats_get(opts = {})
      data, _status_code, _headers = public_stats_get_with_http_info(opts)
      data
    end

    # Public stats
    # This endpoint is used to get public stats.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def public_stats_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.public_stats_get ...'
      end
      # resource path
      local_var_path = '/public/stats'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#public_stats_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
