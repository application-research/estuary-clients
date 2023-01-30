=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.39
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::AutoretrieveApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AutoretrieveApi' do
  before do
    # run before each test
    @instance = SwaggerClient::AutoretrieveApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AutoretrieveApi' do
    it 'should create an instance of AutoretrieveApi' do
      expect(@instance).to be_instance_of(SwaggerClient::AutoretrieveApi)
    end
  end

  # unit tests for admin_autoretrieve_init_post
  # Register autoretrieve server
  # This endpoint registers a new autoretrieve server
  # @param addresses 
  # @param pub_key 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'admin_autoretrieve_init_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_autoretrieve_list_get
  # List autoretrieve servers
  # This endpoint lists all registered autoretrieve servers
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'admin_autoretrieve_list_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for autoretrieve_heartbeat_post
  # Marks autoretrieve server as up
  # This endpoint updates the lastConnection field for autoretrieve
  # @param token Autoretrieve&#x27;s auth token
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'autoretrieve_heartbeat_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
