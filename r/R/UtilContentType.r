# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' UtilContentType Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UtilContentType <- R6::R6Class(
  'UtilContentType',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      UtilContentTypeObject <- list()

      UtilContentTypeObject
    },
    fromJSON = function(UtilContentTypeJson) {
      UtilContentTypeObject <- jsonlite::fromJSON(UtilContentTypeJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(UtilContentTypeJson) {
      UtilContentTypeObject <- jsonlite::fromJSON(UtilContentTypeJson)
    }
  )
)