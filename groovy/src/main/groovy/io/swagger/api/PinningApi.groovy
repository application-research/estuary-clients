package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.TypesIpfsPin
import io.swagger.model.UtilHttpError

import java.util.*;

@Mixin(ApiUtils)
class PinningApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def pinningPinsGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pinning/pins"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def pinningPinsPinidDelete ( String pinid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pinning/pins/{pinid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (pinid == null) {
            throw new RuntimeException("missing required params pinid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    String.class )
                    
    }
    def pinningPinsPinidGet ( String pinid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pinning/pins/{pinid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (pinid == null) {
            throw new RuntimeException("missing required params pinid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def pinningPinsPinidPost ( String pinid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pinning/pins/{pinid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (pinid == null) {
            throw new RuntimeException("missing required params pinid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def pinningPinsPost ( TypesIpfsPin pin, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pinning/pins"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (pin == null) {
            throw new RuntimeException("missing required params pin")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
}
