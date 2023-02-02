=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.40
=end

require 'date'

module SwaggerClient
  class StatusPinningStatus
    PINNING = 'pinning'.freeze
    PINNED = 'pinned'.freeze
    FAILED = 'failed'.freeze
    QUEUED = 'queued'.freeze
    OFFLOADED = 'offloaded'.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = StatusPinningStatus.constants.select { |c| StatusPinningStatus::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #StatusPinningStatus" if constantValues.empty?
      value
    end
  end
end
