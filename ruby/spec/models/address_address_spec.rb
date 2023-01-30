=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.39
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::AddressAddress
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AddressAddress' do
  before do
    # run before each test
    @instance = SwaggerClient::AddressAddress.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AddressAddress' do
    it 'should create an instance of AddressAddress' do
      expect(@instance).to be_instance_of(SwaggerClient::AddressAddress)
    end
  end
end
