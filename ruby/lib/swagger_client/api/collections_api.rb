=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.37
=end

module SwaggerClient
  class CollectionsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Produce a CID of the collection contents
    # This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
    # @param coluuid coluuid
    # @param [Hash] opts the optional parameters
    # @return [String]
    def collections_coluuid_commit_post(coluuid, opts = {})
      data, _status_code, _headers = collections_coluuid_commit_post_with_http_info(coluuid, opts)
      data
    end

    # Produce a CID of the collection contents
    # This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
    # @param coluuid coluuid
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def collections_coluuid_commit_post_with_http_info(coluuid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_coluuid_commit_post ...'
      end
      # verify the required parameter 'coluuid' is set
      if @api_client.config.client_side_validation && coluuid.nil?
        fail ArgumentError, "Missing the required parameter 'coluuid' when calling CollectionsApi.collections_coluuid_commit_post"
      end
      # resource path
      local_var_path = '/collections/{coluuid}/commit'.sub('{' + 'coluuid' + '}', coluuid.to_s)

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
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_coluuid_commit_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Deletes a content from a collection
    # This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
    # @param body Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;)
    # @param coluuid Collection ID
    # @param [Hash] opts the optional parameters
    # @return [String]
    def collections_coluuid_contents_delete(body, coluuid, opts = {})
      data, _status_code, _headers = collections_coluuid_contents_delete_with_http_info(body, coluuid, opts)
      data
    end

    # Deletes a content from a collection
    # This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
    # @param body Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;)
    # @param coluuid Collection ID
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def collections_coluuid_contents_delete_with_http_info(body, coluuid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_coluuid_contents_delete ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling CollectionsApi.collections_coluuid_contents_delete"
      end
      # verify the required parameter 'coluuid' is set
      if @api_client.config.client_side_validation && coluuid.nil?
        fail ArgumentError, "Missing the required parameter 'coluuid' when calling CollectionsApi.collections_coluuid_contents_delete"
      end
      # resource path
      local_var_path = '/collections/{coluuid}/contents'.sub('{' + 'coluuid' + '}', coluuid.to_s)

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

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_coluuid_contents_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Deletes a collection
    # This endpoint is used to delete an existing collection.
    # @param coluuid Collection ID
    # @param [Hash] opts the optional parameters
    # @return [String]
    def collections_coluuid_delete(coluuid, opts = {})
      data, _status_code, _headers = collections_coluuid_delete_with_http_info(coluuid, opts)
      data
    end

    # Deletes a collection
    # This endpoint is used to delete an existing collection.
    # @param coluuid Collection ID
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def collections_coluuid_delete_with_http_info(coluuid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_coluuid_delete ...'
      end
      # verify the required parameter 'coluuid' is set
      if @api_client.config.client_side_validation && coluuid.nil?
        fail ArgumentError, "Missing the required parameter 'coluuid' when calling CollectionsApi.collections_coluuid_delete"
      end
      # resource path
      local_var_path = '/collections/{coluuid}'.sub('{' + 'coluuid' + '}', coluuid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_coluuid_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get contents in a collection
    # This endpoint is used to get contents in a collection. If no colpath query param is passed
    # @param coluuid coluuid
    # @param [Hash] opts the optional parameters
    # @option opts [String] :dir Directory
    # @return [Array<CollectionsCollectionListResponse>]
    def collections_coluuid_get(coluuid, opts = {})
      data, _status_code, _headers = collections_coluuid_get_with_http_info(coluuid, opts)
      data
    end

    # Get contents in a collection
    # This endpoint is used to get contents in a collection. If no colpath query param is passed
    # @param coluuid coluuid
    # @param [Hash] opts the optional parameters
    # @option opts [String] :dir Directory
    # @return [Array<(Array<CollectionsCollectionListResponse>, Integer, Hash)>] Array<CollectionsCollectionListResponse> data, response status code and response headers
    def collections_coluuid_get_with_http_info(coluuid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_coluuid_get ...'
      end
      # verify the required parameter 'coluuid' is set
      if @api_client.config.client_side_validation && coluuid.nil?
        fail ArgumentError, "Missing the required parameter 'coluuid' when calling CollectionsApi.collections_coluuid_get"
      end
      # resource path
      local_var_path = '/collections/{coluuid}'.sub('{' + 'coluuid' + '}', coluuid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'dir'] = opts[:'dir'] if !opts[:'dir'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'Array<CollectionsCollectionListResponse>' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_coluuid_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Add contents to a collection
    # This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
    # @param body Content IDs to add to collection
    # @param coluuid Collection UUID
    # @param [Hash] opts the optional parameters
    # @option opts [String] :dir Directory
    # @option opts [String] :overwrite Overwrite conflicting files
    # @return [String]
    def collections_coluuid_post(body, coluuid, opts = {})
      data, _status_code, _headers = collections_coluuid_post_with_http_info(body, coluuid, opts)
      data
    end

    # Add contents to a collection
    # This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
    # @param body Content IDs to add to collection
    # @param coluuid Collection UUID
    # @param [Hash] opts the optional parameters
    # @option opts [String] :dir Directory
    # @option opts [String] :overwrite Overwrite conflicting files
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def collections_coluuid_post_with_http_info(body, coluuid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_coluuid_post ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling CollectionsApi.collections_coluuid_post"
      end
      # verify the required parameter 'coluuid' is set
      if @api_client.config.client_side_validation && coluuid.nil?
        fail ArgumentError, "Missing the required parameter 'coluuid' when calling CollectionsApi.collections_coluuid_post"
      end
      # resource path
      local_var_path = '/collections/{coluuid}'.sub('{' + 'coluuid' + '}', coluuid.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'dir'] = opts[:'dir'] if !opts[:'dir'].nil?
      query_params[:'overwrite'] = opts[:'overwrite'] if !opts[:'overwrite'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(body) 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_coluuid_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Add a file to a collection
    # This endpoint adds a file to a collection
    # @param coluuid Collection ID
    # @param content Content
    # @param [Hash] opts the optional parameters
    # @option opts [String] :dir Directory inside collection
    # @option opts [String] :overwrite Overwrite file if already exists in path
    # @return [String]
    def collections_fs_add_post(coluuid, content, opts = {})
      data, _status_code, _headers = collections_fs_add_post_with_http_info(coluuid, content, opts)
      data
    end

    # Add a file to a collection
    # This endpoint adds a file to a collection
    # @param coluuid Collection ID
    # @param content Content
    # @param [Hash] opts the optional parameters
    # @option opts [String] :dir Directory inside collection
    # @option opts [String] :overwrite Overwrite file if already exists in path
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def collections_fs_add_post_with_http_info(coluuid, content, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_fs_add_post ...'
      end
      # verify the required parameter 'coluuid' is set
      if @api_client.config.client_side_validation && coluuid.nil?
        fail ArgumentError, "Missing the required parameter 'coluuid' when calling CollectionsApi.collections_fs_add_post"
      end
      # verify the required parameter 'content' is set
      if @api_client.config.client_side_validation && content.nil?
        fail ArgumentError, "Missing the required parameter 'content' when calling CollectionsApi.collections_fs_add_post"
      end
      # resource path
      local_var_path = '/collections/fs/add'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'coluuid'] = coluuid
      query_params[:'content'] = content
      query_params[:'dir'] = opts[:'dir'] if !opts[:'dir'].nil?
      query_params[:'overwrite'] = opts[:'overwrite'] if !opts[:'overwrite'].nil?

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
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_fs_add_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all collections
    # This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
    # @param [Hash] opts the optional parameters
    # @return [Array<CollectionsCollection>]
    def collections_get(opts = {})
      data, _status_code, _headers = collections_get_with_http_info(opts)
      data
    end

    # List all collections
    # This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<CollectionsCollection>, Integer, Hash)>] Array<CollectionsCollection> data, response status code and response headers
    def collections_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_get ...'
      end
      # resource path
      local_var_path = '/collections/'

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

      return_type = opts[:return_type] || 'Array<CollectionsCollection>' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a new collection
    # This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
    # @param body Collection name and description
    # @param [Hash] opts the optional parameters
    # @return [CollectionsCollection]
    def collections_post(body, opts = {})
      data, _status_code, _headers = collections_post_with_http_info(body, opts)
      data
    end

    # Create a new collection
    # This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
    # @param body Collection name and description
    # @param [Hash] opts the optional parameters
    # @return [Array<(CollectionsCollection, Integer, Hash)>] CollectionsCollection data, response status code and response headers
    def collections_post_with_http_info(body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CollectionsApi.collections_post ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling CollectionsApi.collections_post"
      end
      # resource path
      local_var_path = '/collections/'

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

      return_type = opts[:return_type] || 'CollectionsCollection' 

      auth_names = opts[:auth_names] || ['bearerAuth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CollectionsApi#collections_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
