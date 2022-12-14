# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' ApiEstimateDealBody Class
#'
#' @field durationBlks 
#' @field replication 
#' @field size 
#' @field verified 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ApiEstimateDealBody <- R6::R6Class(
  'ApiEstimateDealBody',
  public = list(
    `durationBlks` = NULL,
    `replication` = NULL,
    `size` = NULL,
    `verified` = NULL,
    initialize = function(`durationBlks`, `replication`, `size`, `verified`){
      if (!missing(`durationBlks`)) {
        stopifnot(is.numeric(`durationBlks`), length(`durationBlks`) == 1)
        self$`durationBlks` <- `durationBlks`
      }
      if (!missing(`replication`)) {
        stopifnot(is.numeric(`replication`), length(`replication`) == 1)
        self$`replication` <- `replication`
      }
      if (!missing(`size`)) {
        stopifnot(is.numeric(`size`), length(`size`) == 1)
        self$`size` <- `size`
      }
      if (!missing(`verified`)) {
        self$`verified` <- `verified`
      }
    },
    toJSON = function() {
      ApiEstimateDealBodyObject <- list()
      if (!is.null(self$`durationBlks`)) {
        ApiEstimateDealBodyObject[['durationBlks']] <- self$`durationBlks`
      }
      if (!is.null(self$`replication`)) {
        ApiEstimateDealBodyObject[['replication']] <- self$`replication`
      }
      if (!is.null(self$`size`)) {
        ApiEstimateDealBodyObject[['size']] <- self$`size`
      }
      if (!is.null(self$`verified`)) {
        ApiEstimateDealBodyObject[['verified']] <- self$`verified`
      }

      ApiEstimateDealBodyObject
    },
    fromJSON = function(ApiEstimateDealBodyJson) {
      ApiEstimateDealBodyObject <- jsonlite::fromJSON(ApiEstimateDealBodyJson)
      if (!is.null(ApiEstimateDealBodyObject$`durationBlks`)) {
        self$`durationBlks` <- ApiEstimateDealBodyObject$`durationBlks`
      }
      if (!is.null(ApiEstimateDealBodyObject$`replication`)) {
        self$`replication` <- ApiEstimateDealBodyObject$`replication`
      }
      if (!is.null(ApiEstimateDealBodyObject$`size`)) {
        self$`size` <- ApiEstimateDealBodyObject$`size`
      }
      if (!is.null(ApiEstimateDealBodyObject$`verified`)) {
        self$`verified` <- ApiEstimateDealBodyObject$`verified`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "durationBlks": %d,
           "replication": %d,
           "size": %d,
           "verified": %s
        }',
        self$`durationBlks`,
        self$`replication`,
        self$`size`,
        self$`verified`
      )
    },
    fromJSONString = function(ApiEstimateDealBodyJson) {
      ApiEstimateDealBodyObject <- jsonlite::fromJSON(ApiEstimateDealBodyJson)
      self$`durationBlks` <- ApiEstimateDealBodyObject$`durationBlks`
      self$`replication` <- ApiEstimateDealBodyObject$`replication`
      self$`size` <- ApiEstimateDealBodyObject$`size`
      self$`verified` <- ApiEstimateDealBodyObject$`verified`
    }
  )
)