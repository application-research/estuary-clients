# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' PeeringPeeringPeer Class
#'
#' @field Addrs 
#' @field Connected 
#' @field ID 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PeeringPeeringPeer <- R6::R6Class(
  'PeeringPeeringPeer',
  public = list(
    `Addrs` = NULL,
    `Connected` = NULL,
    `ID` = NULL,
    initialize = function(`Addrs`, `Connected`, `ID`){
      if (!missing(`Addrs`)) {
        stopifnot(is.list(`Addrs`), length(`Addrs`) != 0)
        lapply(`Addrs`, function(x) stopifnot(is.character(x)))
        self$`Addrs` <- `Addrs`
      }
      if (!missing(`Connected`)) {
        self$`Connected` <- `Connected`
      }
      if (!missing(`ID`)) {
        stopifnot(is.character(`ID`), length(`ID`) == 1)
        self$`ID` <- `ID`
      }
    },
    toJSON = function() {
      PeeringPeeringPeerObject <- list()
      if (!is.null(self$`Addrs`)) {
        PeeringPeeringPeerObject[['Addrs']] <- self$`Addrs`
      }
      if (!is.null(self$`Connected`)) {
        PeeringPeeringPeerObject[['Connected']] <- self$`Connected`
      }
      if (!is.null(self$`ID`)) {
        PeeringPeeringPeerObject[['ID']] <- self$`ID`
      }

      PeeringPeeringPeerObject
    },
    fromJSON = function(PeeringPeeringPeerJson) {
      PeeringPeeringPeerObject <- jsonlite::fromJSON(PeeringPeeringPeerJson)
      if (!is.null(PeeringPeeringPeerObject$`Addrs`)) {
        self$`Addrs` <- PeeringPeeringPeerObject$`Addrs`
      }
      if (!is.null(PeeringPeeringPeerObject$`Connected`)) {
        self$`Connected` <- PeeringPeeringPeerObject$`Connected`
      }
      if (!is.null(PeeringPeeringPeerObject$`ID`)) {
        self$`ID` <- PeeringPeeringPeerObject$`ID`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "Addrs": [%s],
           "Connected": %s,
           "ID": %s
        }',
        lapply(self$`Addrs`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`Connected`,
        self$`ID`
      )
    },
    fromJSONString = function(PeeringPeeringPeerJson) {
      PeeringPeeringPeerObject <- jsonlite::fromJSON(PeeringPeeringPeerJson)
      self$`Addrs` <- PeeringPeeringPeerObject$`Addrs`
      self$`Connected` <- PeeringPeeringPeerObject$`Connected`
      self$`ID` <- PeeringPeeringPeerObject$`ID`
    }
  )
)
