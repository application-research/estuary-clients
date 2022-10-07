package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.File
import io.swagger.model.MainImportDealBody
import io.swagger.model.UtilContentAddIpfsBody
import io.swagger.model.UtilContentAddResponse

import java.util.*;

@Mixin(ApiUtils)
class ContentApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def contentAddCarPost ( String body, String filename, String commp, String size, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/add-car"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        if (!"null".equals(String.valueOf(filename)))
            queryParams.put("filename", String.valueOf(filename))
if (!"null".equals(String.valueOf(commp)))
            queryParams.put("commp", String.valueOf(commp))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def contentAddIpfsPost ( UtilContentAddIpfsBody body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/add-ipfs"

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
                    null )
                    
    }
    def contentAddPost ( File file, String coluuid, String dir, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/add"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (file == null) {
            throw new RuntimeException("missing required params file")
        }
        // verify required params are set
        if (coluuid == null) {
            throw new RuntimeException("missing required params coluuid")
        }
        // verify required params are set
        if (dir == null) {
            throw new RuntimeException("missing required params dir")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    UtilContentAddResponse.class )
                    
    }
    def contentAggregatedContentGet ( String content, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/aggregated/{content}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (content == null) {
            throw new RuntimeException("missing required params content")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def contentAllDealsGet ( String begin, String duration, String all, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/all-deals"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (begin == null) {
            throw new RuntimeException("missing required params begin")
        }
        // verify required params are set
        if (duration == null) {
            throw new RuntimeException("missing required params duration")
        }
        // verify required params are set
        if (all == null) {
            throw new RuntimeException("missing required params all")
        }

        if (!"null".equals(String.valueOf(begin)))
            queryParams.put("begin", String.valueOf(begin))
if (!"null".equals(String.valueOf(duration)))
            queryParams.put("duration", String.valueOf(duration))
if (!"null".equals(String.valueOf(all)))
            queryParams.put("all", String.valueOf(all))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def contentBwUsageContentGet ( String content, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/bw-usage/{content}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (content == null) {
            throw new RuntimeException("missing required params content")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def contentCreatePost ( String body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/create"

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
                    null )
                    
    }
    def contentDealsGet ( Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/deals"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(limit)))
            queryParams.put("limit", String.valueOf(limit))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def contentEnsureReplicationDatacidGet ( String datacid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/ensure-replication/{datacid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (datacid == null) {
            throw new RuntimeException("missing required params datacid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def contentFailuresContentGet ( String content, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/failures/{content}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (content == null) {
            throw new RuntimeException("missing required params content")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def contentImportdealPost ( MainImportDealBody body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/importdeal"

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
                    null )
                    
    }
    def contentListGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/list"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def contentReadContGet ( String cont, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/read/{cont}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (cont == null) {
            throw new RuntimeException("missing required params cont")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def contentStagingZonesGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/staging-zones"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def contentStatsGet ( String limit, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/stats"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (limit == null) {
            throw new RuntimeException("missing required params limit")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def contentStatusIdGet ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/status/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
}
