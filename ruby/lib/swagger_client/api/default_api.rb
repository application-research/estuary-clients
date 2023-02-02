=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.40
=end

module SwaggerClient
  class DefaultApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Fetch viewer details
    # This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.
    # @param [Hash] opts the optional parameters
    # @return [UtilViewerResponse]
    def viewer_get(opts = {})
      data, _status_code, _headers = viewer_get_with_http_info(opts)
      data
    end

    # Fetch viewer details
    # This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.
    # @param [Hash] opts the optional parameters
    # @return [Array<(UtilViewerResponse, Integer, Hash)>] UtilViewerResponse data, response status code and response headers
    def viewer_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DefaultApi.viewer_get ...'
      end
      # resource path
      local_var_path = '/viewer'

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

      return_type = opts[:return_type] || 'UtilViewerResponse' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DefaultApi#viewer_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
