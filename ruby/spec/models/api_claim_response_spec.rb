=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.40
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::ApiClaimResponse
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ApiClaimResponse' do
  before do
    # run before each test
    @instance = SwaggerClient::ApiClaimResponse.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ApiClaimResponse' do
    it 'should create an instance of ApiClaimResponse' do
      expect(@instance).to be_instance_of(SwaggerClient::ApiClaimResponse)
    end
  end
  describe 'test attribute "success"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
