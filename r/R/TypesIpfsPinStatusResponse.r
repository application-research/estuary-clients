# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' TypesIpfsPinStatusResponse Class
#'
#' @field created 
#' @field delegates 
#' @field info 
#' @field pin 
#' @field requestid 
#' @field status 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypesIpfsPinStatusResponse <- R6::R6Class(
  'TypesIpfsPinStatusResponse',
  public = list(
    `created` = NULL,
    `delegates` = NULL,
    `info` = NULL,
    `pin` = NULL,
    `requestid` = NULL,
    `status` = NULL,
    initialize = function(`created`, `delegates`, `info`, `pin`, `requestid`, `status`){
      if (!missing(`created`)) {
        stopifnot(is.character(`created`), length(`created`) == 1)
        self$`created` <- `created`
      }
      if (!missing(`delegates`)) {
        stopifnot(is.list(`delegates`), length(`delegates`) != 0)
        lapply(`delegates`, function(x) stopifnot(is.character(x)))
        self$`delegates` <- `delegates`
      }
      if (!missing(`info`)) {
        stopifnot(R6::is.R6(`info`))
        self$`info` <- `info`
      }
      if (!missing(`pin`)) {
        stopifnot(R6::is.R6(`pin`))
        self$`pin` <- `pin`
      }
      if (!missing(`requestid`)) {
        stopifnot(is.character(`requestid`), length(`requestid`) == 1)
        self$`requestid` <- `requestid`
      }
      if (!missing(`status`)) {
        stopifnot(is.character(`status`), length(`status`) == 1)
        self$`status` <- `status`
      }
    },
    toJSON = function() {
      TypesIpfsPinStatusResponseObject <- list()
      if (!is.null(self$`created`)) {
        TypesIpfsPinStatusResponseObject[['created']] <- self$`created`
      }
      if (!is.null(self$`delegates`)) {
        TypesIpfsPinStatusResponseObject[['delegates']] <- self$`delegates`
      }
      if (!is.null(self$`info`)) {
        TypesIpfsPinStatusResponseObject[['info']] <- self$`info`$toJSON()
      }
      if (!is.null(self$`pin`)) {
        TypesIpfsPinStatusResponseObject[['pin']] <- self$`pin`$toJSON()
      }
      if (!is.null(self$`requestid`)) {
        TypesIpfsPinStatusResponseObject[['requestid']] <- self$`requestid`
      }
      if (!is.null(self$`status`)) {
        TypesIpfsPinStatusResponseObject[['status']] <- self$`status`
      }

      TypesIpfsPinStatusResponseObject
    },
    fromJSON = function(TypesIpfsPinStatusResponseJson) {
      TypesIpfsPinStatusResponseObject <- jsonlite::fromJSON(TypesIpfsPinStatusResponseJson)
      if (!is.null(TypesIpfsPinStatusResponseObject$`created`)) {
        self$`created` <- TypesIpfsPinStatusResponseObject$`created`
      }
      if (!is.null(TypesIpfsPinStatusResponseObject$`delegates`)) {
        self$`delegates` <- TypesIpfsPinStatusResponseObject$`delegates`
      }
      if (!is.null(TypesIpfsPinStatusResponseObject$`info`)) {
        infoObject <- TODO_OBJECT_MAPPING$new()
        infoObject$fromJSON(jsonlite::toJSON(TypesIpfsPinStatusResponseObject$info, auto_unbox = TRUE))
        self$`info` <- infoObject
      }
      if (!is.null(TypesIpfsPinStatusResponseObject$`pin`)) {
        pinObject <- TypesIpfsPin$new()
        pinObject$fromJSON(jsonlite::toJSON(TypesIpfsPinStatusResponseObject$pin, auto_unbox = TRUE))
        self$`pin` <- pinObject
      }
      if (!is.null(TypesIpfsPinStatusResponseObject$`requestid`)) {
        self$`requestid` <- TypesIpfsPinStatusResponseObject$`requestid`
      }
      if (!is.null(TypesIpfsPinStatusResponseObject$`status`)) {
        self$`status` <- TypesIpfsPinStatusResponseObject$`status`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "created": %s,
           "delegates": [%s],
           "info": %s,
           "pin": %s,
           "requestid": %s,
           "status": %s
        }',
        self$`created`,
        lapply(self$`delegates`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`info`$toJSON(),
        self$`pin`$toJSON(),
        self$`requestid`,
        self$`status`
      )
    },
    fromJSONString = function(TypesIpfsPinStatusResponseJson) {
      TypesIpfsPinStatusResponseObject <- jsonlite::fromJSON(TypesIpfsPinStatusResponseJson)
      self$`created` <- TypesIpfsPinStatusResponseObject$`created`
      self$`delegates` <- TypesIpfsPinStatusResponseObject$`delegates`
      TODO_OBJECT_MAPPINGObject <- TODO_OBJECT_MAPPING$new()
      self$`info` <- TODO_OBJECT_MAPPINGObject$fromJSON(jsonlite::toJSON(TypesIpfsPinStatusResponseObject$info, auto_unbox = TRUE))
      TypesIpfsPinObject <- TypesIpfsPin$new()
      self$`pin` <- TypesIpfsPinObject$fromJSON(jsonlite::toJSON(TypesIpfsPinStatusResponseObject$pin, auto_unbox = TRUE))
      self$`requestid` <- TypesIpfsPinStatusResponseObject$`requestid`
      self$`status` <- TypesIpfsPinStatusResponseObject$`status`
    }
  )
)