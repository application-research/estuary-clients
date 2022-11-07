package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.UtilHttpError

import java.util.*;

@Mixin(ApiUtils)
class MinerApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def publicMinersDealsMinerGet ( String miner, String ignoreFailed, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/miners/deals/{miner}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (miner == null) {
            throw new RuntimeException("missing required params miner")
        }

        if (!"null".equals(String.valueOf(ignoreFailed)))
            queryParams.put("ignore-failed", String.valueOf(ignoreFailed))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def publicMinersStatsMinerGet ( String miner, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/miners/stats/{miner}"

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
