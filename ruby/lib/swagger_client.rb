=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.28

=end

# Common files
require 'swagger_client/api_client'
require 'swagger_client/api_error'
require 'swagger_client/version'
require 'swagger_client/configuration'

# Models
require 'swagger_client/models/collections_collection'
require 'swagger_client/models/main_channel_id_param'
require 'swagger_client/models/main_create_collection_body'
require 'swagger_client/models/main_delete_content_from_collection_body'
require 'swagger_client/models/main_estimate_deal_body'
require 'swagger_client/models/main_get_api_keys_resp'
require 'swagger_client/models/main_import_deal_body'
require 'swagger_client/models/types_ipfs_list_pin_status_response'
require 'swagger_client/models/types_ipfs_pin'
require 'swagger_client/models/types_ipfs_pin_status_response'
require 'swagger_client/models/util_content_add_ipfs_body'
require 'swagger_client/models/util_content_add_response'
require 'swagger_client/models/util_content_create_body'
require 'swagger_client/models/util_http_error'

# APIs
require 'swagger_client/api/admin_api'
require 'swagger_client/api/autoretrieve_api'
require 'swagger_client/api/collections_api'
require 'swagger_client/api/content_api'
require 'swagger_client/api/deals_api'
require 'swagger_client/api/metrics_api'
require 'swagger_client/api/miner_api'
require 'swagger_client/api/net_api'
require 'swagger_client/api/peering_api'
require 'swagger_client/api/peers_api'
require 'swagger_client/api/pinning_api'
require 'swagger_client/api/public_api'
require 'swagger_client/api/user_api'

module SwaggerClient
  class << self
    # Customize default settings for the SDK using block.
    #   SwaggerClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
