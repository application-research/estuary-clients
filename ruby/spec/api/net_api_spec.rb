=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.36
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::NetApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'NetApi' do
  before do
    # run before each test
    @instance = SwaggerClient::NetApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of NetApi' do
    it 'should create an instance of NetApi' do
      expect(@instance).to be_instance_of(SwaggerClient::NetApi)
    end
  end

  # unit tests for public_miners_failures_miner_get
  # Get all miners
  # This endpoint returns all miners
  # @param miner Filter by miner
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'public_miners_failures_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_get
  # Get all miners
  # This endpoint returns all miners
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'public_miners_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_net_addrs_get
  # Net Addrs
  # This endpoint is used to get net addrs
  # @param [Hash] opts the optional parameters
  # @return [Array<String>]
  describe 'public_net_addrs_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_net_peers_get
  # Net Peers
  # This endpoint is used to get net peers
  # @param [Hash] opts the optional parameters
  # @return [Array<String>]
  describe 'public_net_peers_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
