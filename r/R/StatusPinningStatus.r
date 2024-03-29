# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' StatusPinningStatus Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StatusPinningStatus <- R6::R6Class(
  'StatusPinningStatus',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      StatusPinningStatusObject <- list()

      StatusPinningStatusObject
    },
    fromJSON = function(StatusPinningStatusJson) {
      StatusPinningStatusObject <- jsonlite::fromJSON(StatusPinningStatusJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(StatusPinningStatusJson) {
      StatusPinningStatusObject <- jsonlite::fromJSON(StatusPinningStatusJson)
    }
  )
)
