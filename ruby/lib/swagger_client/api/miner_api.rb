=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.36
=end

module SwaggerClient
  class MinerApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get Claim Miner Message
    # This endpoint lets a user get the message in order to claim a miner
    # @param miner Miner claim message
    # @param [Hash] opts the optional parameters
    # @return [GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse]
    def miner_claim_miner_get(miner, opts = {})
      data, _status_code, _headers = miner_claim_miner_get_with_http_info(miner, opts)
      data
    end

    # Get Claim Miner Message
    # This endpoint lets a user get the message in order to claim a miner
    # @param miner Miner claim message
    # @param [Hash] opts the optional parameters
    # @return [Array<(GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse, Integer, Hash)>] GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse data, response status code and response headers
    def miner_claim_miner_get_with_http_info(miner, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MinerApi.miner_claim_miner_get ...'
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling MinerApi.miner_claim_miner_get"
      end
      # resource path
      local_var_path = '/miner/claim/{miner}'.sub('{' + 'miner' + '}', miner.to_s)

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

      return_type = opts[:return_type] || 'GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MinerApi#miner_claim_miner_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Claim Miner
    # This endpoint lets a user claim a miner
    # @param body Claim Miner Body
    # @param [Hash] opts the optional parameters
    # @return [GithubComApplicationResearchEstuaryApiV1ClaimResponse]
    def miner_claim_post(body, opts = {})
      data, _status_code, _headers = miner_claim_post_with_http_info(body, opts)
      data
    end

    # Claim Miner
    # This endpoint lets a user claim a miner
    # @param body Claim Miner Body
    # @param [Hash] opts the optional parameters
    # @return [Array<(GithubComApplicationResearchEstuaryApiV1ClaimResponse, Integer, Hash)>] GithubComApplicationResearchEstuaryApiV1ClaimResponse data, response status code and response headers
    def miner_claim_post_with_http_info(body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MinerApi.miner_claim_post ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling MinerApi.miner_claim_post"
      end
      # resource path
      local_var_path = '/miner/claim'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['*/*'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(body) 

      return_type = opts[:return_type] || 'GithubComApplicationResearchEstuaryApiV1ClaimResponse' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MinerApi#miner_claim_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Set Miner Info
    # This endpoint lets a user set miner info.
    # @param body Miner set info params
    # @param miner Miner to set info for
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, String>]
    def miner_set_info_miner_put(body, miner, opts = {})
      data, _status_code, _headers = miner_set_info_miner_put_with_http_info(body, miner, opts)
      data
    end

    # Set Miner Info
    # This endpoint lets a user set miner info.
    # @param body Miner set info params
    # @param miner Miner to set info for
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, String>, Integer, Hash)>] Hash<String, String> data, response status code and response headers
    def miner_set_info_miner_put_with_http_info(body, miner, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MinerApi.miner_set_info_miner_put ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling MinerApi.miner_set_info_miner_put"
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling MinerApi.miner_set_info_miner_put"
      end
      # resource path
      local_var_path = '/miner/set-info/{miner}'.sub('{' + 'miner' + '}', miner.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['*/*'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(body) 

      return_type = opts[:return_type] || 'Hash<String, String>' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MinerApi#miner_set_info_miner_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Suspend Miner
    # This endpoint lets a user suspend a miner.
    # @param body Suspend Miner Body
    # @param miner Miner to suspend
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, String>]
    def miner_suspend_miner_post(body, miner, opts = {})
      data, _status_code, _headers = miner_suspend_miner_post_with_http_info(body, miner, opts)
      data
    end

    # Suspend Miner
    # This endpoint lets a user suspend a miner.
    # @param body Suspend Miner Body
    # @param miner Miner to suspend
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, String>, Integer, Hash)>] Hash<String, String> data, response status code and response headers
    def miner_suspend_miner_post_with_http_info(body, miner, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MinerApi.miner_suspend_miner_post ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling MinerApi.miner_suspend_miner_post"
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling MinerApi.miner_suspend_miner_post"
      end
      # resource path
      local_var_path = '/miner/suspend/{miner}'.sub('{' + 'miner' + '}', miner.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['*/*'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(body) 

      return_type = opts[:return_type] || 'Hash<String, String>' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MinerApi#miner_suspend_miner_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Unuspend Miner
    # This endpoint lets a user unsuspend a miner.
    # @param miner Miner to unsuspend
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, String>]
    def miner_unsuspend_miner_put(miner, opts = {})
      data, _status_code, _headers = miner_unsuspend_miner_put_with_http_info(miner, opts)
      data
    end

    # Unuspend Miner
    # This endpoint lets a user unsuspend a miner.
    # @param miner Miner to unsuspend
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, String>, Integer, Hash)>] Hash<String, String> data, response status code and response headers
    def miner_unsuspend_miner_put_with_http_info(miner, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MinerApi.miner_unsuspend_miner_put ...'
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling MinerApi.miner_unsuspend_miner_put"
      end
      # resource path
      local_var_path = '/miner/unsuspend/{miner}'.sub('{' + 'miner' + '}', miner.to_s)

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

      return_type = opts[:return_type] || 'Hash<String, String>' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MinerApi#miner_unsuspend_miner_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: MinerApi.public_miners_deals_miner_get ...'
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling MinerApi.public_miners_deals_miner_get"
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
        @api_client.config.logger.debug "API called: MinerApi#public_miners_deals_miner_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
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
        @api_client.config.logger.debug 'Calling API: MinerApi.public_miners_stats_miner_get ...'
      end
      # verify the required parameter 'miner' is set
      if @api_client.config.client_side_validation && miner.nil?
        fail ArgumentError, "Missing the required parameter 'miner' when calling MinerApi.public_miners_stats_miner_get"
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
        @api_client.config.logger.debug "API called: MinerApi#public_miners_stats_miner_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
