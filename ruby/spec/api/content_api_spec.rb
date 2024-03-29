=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.40
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ContentApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ContentApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ContentApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ContentApi' do
    it 'should create an instance of ContentApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ContentApi)
    end
  end

  # unit tests for admin_invites_code_post
  # Create an Estuary invite
  # This endpoint is used to create an estuary invite.
  # @param code Invite code to be created
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'admin_invites_code_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_invites_get
  # Get Estuary invites
  # This endpoint is used to list all estuary invites.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'admin_invites_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_add_car_post
  # Add Car object
  # This endpoint is used to add a car object to the network. The object can be a file or a directory.
  # @param body Car
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ignore_dupes Ignore Dupes
  # @option opts [String] :filename Filename
  # @return [UtilContentAddResponse]
  describe 'content_add_car_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_add_ipfs_post
  # Add IPFS object
  # This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
  # @param body IPFS Body
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ignore_dupes Ignore Dupes
  # @option opts [String] :overwrite Overwrite conflicting files in collections
  # @return [String]
  describe 'content_add_ipfs_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_add_post
  # Add new content
  # This endpoint is used to upload new content.
  # @param data 
  # @param filename 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :coluuid Collection UUID
  # @option opts [Integer] :replication Replication value
  # @option opts [String] :ignore_dupes Ignore Dupes true/false
  # @option opts [String] :overwrite Overwrite files with the same path on same collection
  # @option opts [String] :lazy_provide Lazy Provide true/false
  # @option opts [String] :dir Directory
  # @return [UtilContentAddResponse]
  describe 'content_add_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_aggregated_content_get
  # Get aggregated content stats
  # This endpoint returns aggregated content stats
  # @param content Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_aggregated_content_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_all_deals_get
  # Get all deals for a user
  # This endpoint is used to get all deals for a user
  # @param _begin Begin
  # @param duration Duration
  # @param all All
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_all_deals_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_bw_usage_content_get
  # Get content bandwidth
  # This endpoint returns content bandwidth
  # @param content Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_bw_usage_content_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_contents_get
  # Get user contents
  # This endpoint is used to get user contents
  # @param limit limit
  # @param offset offset
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_contents_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_create_post
  # Add a new content
  # This endpoint adds a new content
  # @param body Content
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ignore_dupes Ignore Dupes
  # @return [String]
  describe 'content_create_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_deals_get
  # Content with deals
  # This endpoint lists all content with deals
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit Limit
  # @option opts [Integer] :offset Offset
  # @return [String]
  describe 'content_deals_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_ensure_replication_datacid_get
  # Ensure Replication
  # This endpoint ensures that the content is replicated to the specified number of providers
  # @param datacid Data CID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_ensure_replication_datacid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_failures_content_get
  # List all failures for a content
  # This endpoint returns all failures for a content
  # @param content Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_failures_content_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_id_get
  # Content
  # This endpoint returns a content by its ID
  # @param id Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_list_get
  # List all pinned content
  # This endpoint lists all content
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_list_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_staging_zones_get
  # Get staging zone for user, excluding its contents
  # This endpoint is used to get staging zone for user, excluding its contents.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_staging_zones_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_staging_zones_staging_zone_contents_get
  # Get contents for a staging zone
  # This endpoint is used to get the contents for a staging zone
  # @param staging_zone Staging Zone Content ID
  # @param limit limit
  # @param offset offset
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_staging_zones_staging_zone_contents_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_staging_zones_staging_zone_get
  # Get staging zone without its contents field populated
  # This endpoint is used to get a staging zone, excluding its contents.
  # @param staging_zone Staging Zone Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_staging_zones_staging_zone_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_stats_get
  # Get content statistics
  # This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
  # @param limit limit
  # @param offset offset
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_stats_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for content_status_id_get
  # Content Status
  # This endpoint returns the status of a content
  # @param id Content ID
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'content_status_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
