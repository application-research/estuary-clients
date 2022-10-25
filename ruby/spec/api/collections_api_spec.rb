=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.28

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::CollectionsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CollectionsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::CollectionsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CollectionsApi' do
    it 'should create an instance of CollectionsApi' do
      expect(@instance).to be_instance_of(SwaggerClient::CollectionsApi)
    end
  end

  # unit tests for collections_coluuid_commit_post
  # Produce a CID of the collection contents
  # This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
  # @param coluuid coluuid
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'collections_coluuid_commit_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for collections_coluuid_contents_delete
  # Deletes a content from a collection
  # This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
  # @param coluuid Collection ID
  # @param contentid Content ID
  # @param body Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;)
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'collections_coluuid_contents_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for collections_coluuid_delete
  # Deletes a collection
  # This endpoint is used to delete an existing collection.
  # @param coluuid Collection ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'collections_coluuid_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for collections_coluuid_get
  # Get contents in a collection
  # This endpoint is used to get contents in a collection. If no colpath query param is passed
  # @param coluuid coluuid
  # @param [Hash] opts the optional parameters
  # @option opts [String] :dir Directory
  # @return [String]
  describe 'collections_coluuid_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for collections_coluuid_post
  # Add contents to a collection
  # This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
  # @param coluuid coluuid
  # @param content_i_ds Content IDs to add to collection
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, String>]
  describe 'collections_coluuid_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for collections_fs_add_post
  # Add a file to a collection
  # This endpoint adds a file to a collection
  # @param coluuid Collection ID
  # @param content Content
  # @param path Path to file
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'collections_fs_add_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for collections_get
  # List all collections
  # This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
  # @param [Hash] opts the optional parameters
  # @return [Array<CollectionsCollection>]
  describe 'collections_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for collections_post
  # Create a new collection
  # This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
  # @param body Collection name and description
  # @param [Hash] opts the optional parameters
  # @return [CollectionsCollection]
  describe 'collections_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
