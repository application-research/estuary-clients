package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.MainChannelIDParam
import io.swagger.model.MainEstimateDealBody
import io.swagger.model.UtilHttpError

import java.util.*;

@Mixin(ApiUtils)
class DealsApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def dealEstimatePost ( MainEstimateDealBody body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/estimate"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def dealInfoDealidGet ( Integer dealid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/info/{dealid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (dealid == null) {
            throw new RuntimeException("missing required params dealid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def dealProposalPropcidGet ( String propcid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/proposal/{propcid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (propcid == null) {
            throw new RuntimeException("missing required params propcid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def dealQueryMinerGet ( String miner, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/query/{miner}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (miner == null) {
            throw new RuntimeException("missing required params miner")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def dealStatusByProposalPropcidGet ( String propcid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/status-by-proposal/{propcid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (propcid == null) {
            throw new RuntimeException("missing required params propcid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def dealStatusMinerPropcidGet ( String miner, String propcid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/status/{miner}/{propcid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (miner == null) {
            throw new RuntimeException("missing required params miner")
        }
        // verify required params are set
        if (propcid == null) {
            throw new RuntimeException("missing required params propcid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def dealTransferInProgressGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/transfer/in-progress"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def dealTransferStatusPost ( MainChannelIDParam chanid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deal/transfer/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (chanid == null) {
            throw new RuntimeException("missing required params chanid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def dealsFailuresGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deals/failures"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def dealsMakeMinerPost ( String miner, String dealRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deals/make/{miner}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (miner == null) {
            throw new RuntimeException("missing required params miner")
        }
        // verify required params are set
        if (dealRequest == null) {
            throw new RuntimeException("missing required params dealRequest")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def dealsStatusDealGet ( Integer deal, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/deals/status/{deal}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (deal == null) {
            throw new RuntimeException("missing required params deal")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def publicDealsFailuresGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/deals/failures"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def publicMinersStorageQueryMinerGet ( String miner, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/miners/storage/query/{miner}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (miner == null) {
            throw new RuntimeException("missing required params miner")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
}
