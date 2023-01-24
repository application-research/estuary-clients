=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.38
=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::MinerApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'MinerApi' do
  before do
    # run before each test
    @instance = SwaggerClient::MinerApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MinerApi' do
    it 'should create an instance of MinerApi' do
      expect(@instance).to be_instance_of(SwaggerClient::MinerApi)
    end
  end

  # unit tests for miner_claim_miner_get
  # Get Claim Miner Message
  # This endpoint lets a user get the message in order to claim a miner
  # @param miner Miner claim message
  # @param [Hash] opts the optional parameters
  # @return [ApiClaimMsgResponse]
  describe 'miner_claim_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for miner_claim_post
  # Claim Miner
  # This endpoint lets a user claim a miner
  # @param body Claim Miner Body
  # @param [Hash] opts the optional parameters
  # @return [ApiClaimResponse]
  describe 'miner_claim_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for miner_set_info_miner_put
  # Set Miner Info
  # This endpoint lets a user set miner info.
  # @param body Miner set info params
  # @param miner Miner to set info for
  # @param [Hash] opts the optional parameters
  # @return [ApiEmptyResp]
  describe 'miner_set_info_miner_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for miner_suspend_miner_post
  # Suspend Miner
  # This endpoint lets a user suspend a miner.
  # @param body Suspend Miner Body
  # @param miner Miner to suspend
  # @param [Hash] opts the optional parameters
  # @return [ApiEmptyResp]
  describe 'miner_suspend_miner_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for miner_unsuspend_miner_put
  # Unuspend Miner
  # This endpoint lets a user unsuspend a miner.
  # @param miner Miner to unsuspend
  # @param [Hash] opts the optional parameters
  # @return [ApiEmptyResp]
  describe 'miner_unsuspend_miner_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_deals_miner_get
  # Get all miners deals
  # This endpoint returns all miners deals
  # @param miner Filter by miner
  # @param [Hash] opts the optional parameters
  # @option opts [String] :ignore_failed Ignore Failed
  # @return [String]
  describe 'public_miners_deals_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for public_miners_stats_miner_get
  # Get miner stats
  # This endpoint returns miner stats
  # @param miner Filter by miner
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'public_miners_stats_miner_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
