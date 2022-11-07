package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.UtilHttpError

import java.util.*;

@Mixin(ApiUtils)
class AutoretrieveApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def adminAutoretrieveInitPost ( String addresses, String pubKey, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/admin/autoretrieve/init"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (addresses == null) {
            throw new RuntimeException("missing required params addresses")
        }
        // verify required params are set
        if (pubKey == null) {
            throw new RuntimeException("missing required params pubKey")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def adminAutoretrieveListGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/admin/autoretrieve/list"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def autoretrieveHeartbeatPost ( String token, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/autoretrieve/heartbeat"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        
        headerParams.put("token", token)

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
}
