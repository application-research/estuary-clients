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

# Unit tests for SwaggerClient::ApiEmptyResp
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ApiEmptyResp' do
  before do
    # run before each test
    @instance = SwaggerClient::ApiEmptyResp.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ApiEmptyResp' do
    it 'should create an instance of ApiEmptyResp' do
      expect(@instance).to be_instance_of(SwaggerClient::ApiEmptyResp)
    end
  end
end
