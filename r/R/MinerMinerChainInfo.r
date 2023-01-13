# Estuary API
#
# This is the API for the Estuary application.
#
# OpenAPI spec version: 0.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' MinerMinerChainInfo Class
#'
#' @field addresses 
#' @field owner 
#' @field peerId 
#' @field worker 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MinerMinerChainInfo <- R6::R6Class(
  'MinerMinerChainInfo',
  public = list(
    `addresses` = NULL,
    `owner` = NULL,
    `peerId` = NULL,
    `worker` = NULL,
    initialize = function(`addresses`, `owner`, `peerId`, `worker`){
      if (!missing(`addresses`)) {
        stopifnot(is.list(`addresses`), length(`addresses`) != 0)
        lapply(`addresses`, function(x) stopifnot(is.character(x)))
        self$`addresses` <- `addresses`
      }
      if (!missing(`owner`)) {
        stopifnot(is.character(`owner`), length(`owner`) == 1)
        self$`owner` <- `owner`
      }
      if (!missing(`peerId`)) {
        stopifnot(is.character(`peerId`), length(`peerId`) == 1)
        self$`peerId` <- `peerId`
      }
      if (!missing(`worker`)) {
        stopifnot(is.character(`worker`), length(`worker`) == 1)
        self$`worker` <- `worker`
      }
    },
    toJSON = function() {
      MinerMinerChainInfoObject <- list()
      if (!is.null(self$`addresses`)) {
        MinerMinerChainInfoObject[['addresses']] <- self$`addresses`
      }
      if (!is.null(self$`owner`)) {
        MinerMinerChainInfoObject[['owner']] <- self$`owner`
      }
      if (!is.null(self$`peerId`)) {
        MinerMinerChainInfoObject[['peerId']] <- self$`peerId`
      }
      if (!is.null(self$`worker`)) {
        MinerMinerChainInfoObject[['worker']] <- self$`worker`
      }

      MinerMinerChainInfoObject
    },
    fromJSON = function(MinerMinerChainInfoJson) {
      MinerMinerChainInfoObject <- jsonlite::fromJSON(MinerMinerChainInfoJson)
      if (!is.null(MinerMinerChainInfoObject$`addresses`)) {
        self$`addresses` <- MinerMinerChainInfoObject$`addresses`
      }
      if (!is.null(MinerMinerChainInfoObject$`owner`)) {
        self$`owner` <- MinerMinerChainInfoObject$`owner`
      }
      if (!is.null(MinerMinerChainInfoObject$`peerId`)) {
        self$`peerId` <- MinerMinerChainInfoObject$`peerId`
      }
      if (!is.null(MinerMinerChainInfoObject$`worker`)) {
        self$`worker` <- MinerMinerChainInfoObject$`worker`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "addresses": [%s],
           "owner": %s,
           "peerId": %s,
           "worker": %s
        }',
        lapply(self$`addresses`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`owner`,
        self$`peerId`,
        self$`worker`
      )
    },
    fromJSONString = function(MinerMinerChainInfoJson) {
      MinerMinerChainInfoObject <- jsonlite::fromJSON(MinerMinerChainInfoJson)
      self$`addresses` <- MinerMinerChainInfoObject$`addresses`
      self$`owner` <- MinerMinerChainInfoObject$`owner`
      self$`peerId` <- MinerMinerChainInfoObject$`peerId`
      self$`worker` <- MinerMinerChainInfoObject$`worker`
    }
  )
)
