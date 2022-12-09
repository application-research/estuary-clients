=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.36
=end

require 'date'

module SwaggerClient
  class CollectionsCidType
    DIRECTORY = 'directory'.freeze
    FILE = 'file'.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = CollectionsCidType.constants.select { |c| CollectionsCidType::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #CollectionsCidType" if constantValues.empty?
      value
    end
  end
end
