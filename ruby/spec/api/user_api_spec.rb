=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.37
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::UserApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'UserApi' do
  before do
    # run before each test
    @instance = SwaggerClient::UserApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UserApi' do
    it 'should create an instance of UserApi' do
      expect(@instance).to be_instance_of(SwaggerClient::UserApi)
    end
  end

  # unit tests for user_api_keys_get
  # Get API keys for a user
  # This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
  # @param [Hash] opts the optional parameters
  # @return [Array<ApiGetApiKeysResp>]
  describe 'user_api_keys_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for user_api_keys_key_or_hash_delete
  # Revoke a User API Key.
  # This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#x27;s assigned to the user. Revoked API keys are completely deleted and are not recoverable.
  # @param key_or_hash Key or Hash
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'user_api_keys_key_or_hash_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for user_api_keys_post
  # Create API keys for a user
  # This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :expiry Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
  # @option opts [String] :perms Permissions -- currently unused
  # @return [ApiGetApiKeysResp]
  describe 'user_api_keys_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for user_export_get
  # Export user data
  # This endpoint is used to get API keys for a user.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'user_export_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for user_stats_get
  # Get stats for the current user
  # This endpoint is used to get stats for the current user.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'user_stats_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
