# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MainDeleteContentFromCollectionBody Class
#'
#' @field by 
#' @field value 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MainDeleteContentFromCollectionBody <- R6::R6Class(
  'MainDeleteContentFromCollectionBody',
  public = list(
    `by` = NULL,
    `value` = NULL,
    initialize = function(`by`, `value`){
      if (!missing(`by`)) {
        stopifnot(is.character(`by`), length(`by`) == 1)
        self$`by` <- `by`
      }
      if (!missing(`value`)) {
        stopifnot(is.character(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
    },
    toJSON = function() {
      MainDeleteContentFromCollectionBodyObject <- list()
      if (!is.null(self$`by`)) {
        MainDeleteContentFromCollectionBodyObject[['by']] <- self$`by`
      }
      if (!is.null(self$`value`)) {
        MainDeleteContentFromCollectionBodyObject[['value']] <- self$`value`
      }

      MainDeleteContentFromCollectionBodyObject
    },
    fromJSON = function(MainDeleteContentFromCollectionBodyJson) {
      MainDeleteContentFromCollectionBodyObject <- jsonlite::fromJSON(MainDeleteContentFromCollectionBodyJson)
      if (!is.null(MainDeleteContentFromCollectionBodyObject$`by`)) {
        self$`by` <- MainDeleteContentFromCollectionBodyObject$`by`
      }
      if (!is.null(MainDeleteContentFromCollectionBodyObject$`value`)) {
        self$`value` <- MainDeleteContentFromCollectionBodyObject$`value`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "by": %s,
           "value": %s
        }',
        self$`by`,
        self$`value`
      )
    },
    fromJSONString = function(MainDeleteContentFromCollectionBodyJson) {
      MainDeleteContentFromCollectionBodyObject <- jsonlite::fromJSON(MainDeleteContentFromCollectionBodyJson)
      self$`by` <- MainDeleteContentFromCollectionBodyObject$`by`
      self$`value` <- MainDeleteContentFromCollectionBodyObject$`value`
    }
  )
)