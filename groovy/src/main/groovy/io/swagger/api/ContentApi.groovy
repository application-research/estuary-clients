package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.File
import io.swagger.model.MainImportDealBody
import io.swagger.model.UtilContentAddIpfsBody
import io.swagger.model.UtilContentAddResponse
import io.swagger.model.UtilContentCreateBody
import io.swagger.model.UtilHttpError

import java.util.*;

@Mixin(ApiUtils)
class ContentApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def contentAddCarPost ( String body, String ignoreDupes, String filename, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/add-car"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        if (!"null".equals(String.valueOf(ignoreDupes)))
            queryParams.put("ignore-dupes", String.valueOf(ignoreDupes))
if (!"null".equals(String.valueOf(filename)))
            queryParams.put("filename", String.valueOf(filename))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def contentAddIpfsPost ( UtilContentAddIpfsBody body, String ignoreDupes, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/add-ipfs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        if (!"null".equals(String.valueOf(ignoreDupes)))
            queryParams.put("ignore-dupes", String.valueOf(ignoreDupes))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def contentAddPost ( File data, String filename, String coluuid, Integer replication, String ignoreDupes, String lazyProvide, String dir, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/add"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (data == null) {
            throw new RuntimeException("missing required params data")
        }

        if (!"null".equals(String.valueOf(coluuid)))
            queryParams.put("coluuid", String.valueOf(coluuid))
if (!"null".equals(String.valueOf(replication)))
            queryParams.put("replication", String.valueOf(replication))
if (!"null".equals(String.valueOf(ignoreDupes)))
            queryParams.put("ignore-dupes", String.valueOf(ignoreDupes))
if (!"null".equals(String.valueOf(lazyProvide)))
            queryParams.put("lazy-provide", String.valueOf(lazyProvide))
if (!"null".equals(String.valueOf(dir)))
            queryParams.put("dir", String.valueOf(dir))


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
                    String.class )
                    
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
                    String.class )
                    
    }
    def contentCreatePost ( UtilContentCreateBody req, String ignoreDupes, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/create"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (req == null) {
            throw new RuntimeException("missing required params req")
        }

        if (!"null".equals(String.valueOf(ignoreDupes)))
            queryParams.put("ignore-dupes", String.valueOf(ignoreDupes))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
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
                    String.class )
                    
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
                    String.class )
                    
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
    def contentIdGet ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/{id}"

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
                    String.class )
                    
    }
    def contentListGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/list"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
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
                    String.class )
                    
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
                    String.class )
                    
    }
    def contentStatsGet ( String limit, String offset, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/content/stats"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (limit == null) {
            throw new RuntimeException("missing required params limit")
        }
        // verify required params are set
        if (offset == null) {
            throw new RuntimeException("missing required params offset")
        }

        if (!"null".equals(String.valueOf(limit)))
            queryParams.put("limit", String.valueOf(limit))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
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
                    String.class )
                    
    }
}
