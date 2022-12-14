# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' AddressAddress Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AddressAddress <- R6::R6Class(
  'AddressAddress',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      AddressAddressObject <- list()

      AddressAddressObject
    },
    fromJSON = function(AddressAddressJson) {
      AddressAddressObject <- jsonlite::fromJSON(AddressAddressJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(AddressAddressJson) {
      AddressAddressObject <- jsonlite::fromJSON(AddressAddressJson)
    }
  )
)