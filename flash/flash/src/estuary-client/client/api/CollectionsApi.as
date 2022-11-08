package estuary-client.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import estuary-client.client.model.CollectionsCollection;
import estuary-client.client.model.MainCreateCollectionBody;
import estuary-client.client.model.MainDeleteContentFromCollectionBody;
import estuary-client.client.model.UtilHttpError;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class CollectionsApi extends SwaggerApi {
    /**
    * Constructor for the CollectionsApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function CollectionsApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_collections_coluuid_commit_post: String = "collections_coluuid_commit_post";
        public static const event_collections_coluuid_contents_delete: String = "collections_coluuid_contents_delete";
        public static const event_collections_coluuid_delete: String = "collections_coluuid_delete";
        public static const event_collections_coluuid_get: String = "collections_coluuid_get";
        public static const event_collections_coluuid_post: String = "collections_coluuid_post";
        public static const event_collections_fs_add_post: String = "collections_fs_add_post";
        public static const event_collections_get: String = "collections_get";
        public static const event_collections_post: String = "collections_post";


    /*
     * Returns String 
     */
    public function collections_coluuid_commit_post (coluuid: String): String {
        // create path and map variables
        var path: String = "/collections/{coluuid}/commit".replace(/{format}/g,"xml").replace("{" + "coluuid" + "}", getApiInvoker().escapeString(coluuid));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_coluuid_commit_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function collections_coluuid_contents_delete (coluuid: String, contentid: String, body: MainDeleteContentFromCollectionBody): String {
        // create path and map variables
        var path: String = "/collections/{coluuid}/contents".replace(/{format}/g,"xml").replace("{" + "coluuid" + "}", getApiInvoker().escapeString(coluuid)).replace("{" + "contentid" + "}", getApiInvoker().escapeString(contentid));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, body, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_coluuid_contents_delete";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function collections_coluuid_delete (coluuid: String): String {
        // create path and map variables
        var path: String = "/collections/{coluuid}".replace(/{format}/g,"xml").replace("{" + "coluuid" + "}", getApiInvoker().escapeString(coluuid));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_coluuid_delete";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function collections_coluuid_get (coluuid: String, dir: String): String {
        // create path and map variables
        var path: String = "/collections/{coluuid}".replace(/{format}/g,"xml").replace("{" + "coluuid" + "}", getApiInvoker().escapeString(coluuid));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(dir))
            queryParams["dir"] = toPathValue(dir);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_coluuid_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function collections_coluuid_post (coluuid: String, contentIDs: Array): String {
        // create path and map variables
        var path: String = "/collections/{coluuid}".replace(/{format}/g,"xml").replace("{" + "coluuid" + "}", getApiInvoker().escapeString(coluuid));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, contentIDs, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_coluuid_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function collections_fs_add_post (coluuid: String, content: String, path: String): String {
        // create path and map variables
        var path: String = "/collections/fs/add".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(coluuid))
            queryParams["coluuid"] = toPathValue(coluuid);
if("null" != String(content))
            queryParams["content"] = toPathValue(content);
if("null" != String(path))
            queryParams["path"] = toPathValue(path);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_fs_add_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function collections_get (): String {
        // create path and map variables
        var path: String = "/collections/".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_get";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns CollectionsCollection 
     */
    public function collections_post (body: MainCreateCollectionBody): String {
        // create path and map variables
        var path: String = "/collections/".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, body, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "collections_post";

        token.returnType = CollectionsCollection;
        return requestId;

    }
}
}
