=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.28

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::PeeringApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PeeringApi' do
  before do
    # run before each test
    @instance = SwaggerClient::PeeringApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PeeringApi' do
    it 'should create an instance of PeeringApi' do
      expect(@instance).to be_instance_of(SwaggerClient::PeeringApi)
    end
  end

  # unit tests for admin_peering_peers_delete
  # Remove peers on Peering Service
  # This endpoint can be used to remove a Peer from the Peering Service
  # @param body Peer ids
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'admin_peering_peers_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_peering_peers_get
  # List all Peering peers
  # This endpoint can be used to list all peers on Peering Service
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'admin_peering_peers_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_peering_peers_post
  # Add peers on Peering Service
  # This endpoint can be used to add a Peer from the Peering Service
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'admin_peering_peers_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_peering_start_post
  # Start Peering
  # This endpoint can be used to start the Peering Service
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'admin_peering_start_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_peering_status_get
  # Check Peering Status
  # This endpoint can be used to check the Peering status
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'admin_peering_status_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for admin_peering_stop_post
  # Stop Peering
  # This endpoint can be used to stop the Peering Service
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'admin_peering_stop_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
