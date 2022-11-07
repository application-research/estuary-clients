package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.UtilHttpError

import java.util.*;

@Mixin(ApiUtils)
class NetApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def netAddrsGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/net/addrs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def publicMinersFailuresMinerGet ( String miner, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/miners/failures/{miner}"

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
    def publicMinersGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/miners"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def publicNetAddrsGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/net/addrs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def publicNetPeersGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/public/net/peers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
}
