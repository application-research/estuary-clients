# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MainChannelIDParam Class
#'
#' @field id 
#' @field initiator 
#' @field responder 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MainChannelIDParam <- R6::R6Class(
  'MainChannelIDParam',
  public = list(
    `id` = NULL,
    `initiator` = NULL,
    `responder` = NULL,
    initialize = function(`id`, `initiator`, `responder`){
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`initiator`)) {
        stopifnot(is.character(`initiator`), length(`initiator`) == 1)
        self$`initiator` <- `initiator`
      }
      if (!missing(`responder`)) {
        stopifnot(is.character(`responder`), length(`responder`) == 1)
        self$`responder` <- `responder`
      }
    },
    toJSON = function() {
      MainChannelIDParamObject <- list()
      if (!is.null(self$`id`)) {
        MainChannelIDParamObject[['id']] <- self$`id`
      }
      if (!is.null(self$`initiator`)) {
        MainChannelIDParamObject[['initiator']] <- self$`initiator`
      }
      if (!is.null(self$`responder`)) {
        MainChannelIDParamObject[['responder']] <- self$`responder`
      }

      MainChannelIDParamObject
    },
    fromJSON = function(MainChannelIDParamJson) {
      MainChannelIDParamObject <- jsonlite::fromJSON(MainChannelIDParamJson)
      if (!is.null(MainChannelIDParamObject$`id`)) {
        self$`id` <- MainChannelIDParamObject$`id`
      }
      if (!is.null(MainChannelIDParamObject$`initiator`)) {
        self$`initiator` <- MainChannelIDParamObject$`initiator`
      }
      if (!is.null(MainChannelIDParamObject$`responder`)) {
        self$`responder` <- MainChannelIDParamObject$`responder`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %d,
           "initiator": %s,
           "responder": %s
        }',
        self$`id`,
        self$`initiator`,
        self$`responder`
      )
    },
    fromJSONString = function(MainChannelIDParamJson) {
      MainChannelIDParamObject <- jsonlite::fromJSON(MainChannelIDParamJson)
      self$`id` <- MainChannelIDParamObject$`id`
      self$`initiator` <- MainChannelIDParamObject$`initiator`
      self$`responder` <- MainChannelIDParamObject$`responder`
    }
  )
)
