package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CollectionsCollection
import io.swagger.model.MainCreateCollectionBody
import io.swagger.model.MainDeleteContentFromCollectionBody
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
    def collectionsColuuidContentsDelete ( String coluuid, String contentid, MainDeleteContentFromCollectionBody body, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/{coluuid}/contents"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (coluuid == null) {
            throw new RuntimeException("missing required params coluuid")
        }
        // verify required params are set
        if (contentid == null) {
            throw new RuntimeException("missing required params contentid")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
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
                    String.class )
                    
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

        if (!"null".equals(String.valueOf(dir)))
            queryParams.put("dir", String.valueOf(dir))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def collectionsColuuidPost ( String coluuid, List<Integer> contentIDs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/{coluuid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (coluuid == null) {
            throw new RuntimeException("missing required params coluuid")
        }
        // verify required params are set
        if (contentIDs == null) {
            throw new RuntimeException("missing required params contentIDs")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
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
                    String.class )
                    
    }
    def collectionsGet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/collections/"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    List.class )
                    
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
                    CollectionsCollection.class )
                    
    }
}
