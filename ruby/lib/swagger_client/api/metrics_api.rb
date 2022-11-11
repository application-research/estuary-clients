=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.29

=end

require 'uri'

module SwaggerClient
  class MetricsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
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
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def public_metrics_deals_on_chain_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MetricsApi.public_metrics_deals_on_chain_get ...'
      end
      # resource path
      local_var_path = '/public/metrics/deals-on-chain'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MetricsApi#public_metrics_deals_on_chain_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
