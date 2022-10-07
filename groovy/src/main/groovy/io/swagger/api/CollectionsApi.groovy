package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.MainCollection
import io.swagger.model.MainCreateCollectionBody
import io.swagger.model.Map
import io.swagger.model.UtilHttpError

import java.util.*;

@Mixin(ApiUtils)
class CollectionsApi {
    String basePath = "https://api.estuary.tech"
    String versionPath = "/api/v1"

    def collectionsColuuidCommitPost ( String coluuid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/{coluuid}/commit"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (coluuid == null) {
            throw new RuntimeException("missing required params coluuid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )
                    
    }
    def collectionsColuuidDelete ( String coluuid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/{coluuid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (coluuid == null) {
            throw new RuntimeException("missing required params coluuid")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def collectionsColuuidGet ( String coluuid, String dir, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/{coluuid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (coluuid == null) {
            throw new RuntimeException("missing required params coluuid")
        }

        if (!"null".equals(String.valueOf(coluuid)))
            queryParams.put("coluuid", String.valueOf(coluuid))
if (!"null".equals(String.valueOf(dir)))
            queryParams.put("dir", String.valueOf(dir))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def collectionsColuuidPost ( List<Integer> body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/{coluuid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "map",
                    String.class )
                    
    }
    def collectionsFsAddPost ( String coluuid, String content, String path, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/fs/add"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (coluuid == null) {
            throw new RuntimeException("missing required params coluuid")
        }
        // verify required params are set
        if (content == null) {
            throw new RuntimeException("missing required params content")
        }
        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        if (!"null".equals(String.valueOf(coluuid)))
            queryParams.put("coluuid", String.valueOf(coluuid))
if (!"null".equals(String.valueOf(content)))
            queryParams.put("content", String.valueOf(content))
if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def collectionsGet ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    MainCollection.class )
                    
    }
    def collectionsPost ( MainCreateCollectionBody body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/"

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
                    MainCollection.class )
                    
    }
}
