package estuary-client.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import estuary-client.client.model.MainGetApiKeysResp;
import estuary-client.client.model.UtilHttpError;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class UserApi extends SwaggerApi {
    /**
    * Constructor for the UserApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function UserApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_user_api_keys_get: String = "user_api_keys_get";
        public static const event_user_api_keys_key_delete: String = "user_api_keys_key_delete";
        public static const event_user_api_keys_post: String = "user_api_keys_post";
        public static const event_user_export_get: String = "user_export_get";
        public static const event_user_stats_get: String = "user_stats_get";


    /*
     * Returns Array 
     */
    public function user_api_keys_get (): String {
        // create path and map variables
        var path: String = "/user/api-keys".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "user_api_keys_get";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function user_api_keys_key_delete (key: String): String {
        // create path and map variables
        var path: String = "/user/api-keys/{key}".replace(/{format}/g,"xml").replace("{" + "key" + "}", getApiInvoker().escapeString(key));

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
        token.completionEventType = "user_api_keys_key_delete";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns MainGetApiKeysResp 
     */
    public function user_api_keys_post (expiry: String, perms: String): String {
        // create path and map variables
        var path: String = "/user/api-keys".replace(/{format}/g,"xml");

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

        if("null" != String(expiry))
            queryParams["expiry"] = toPathValue(expiry);
if("null" != String(perms))
            queryParams["perms"] = toPathValue(perms);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "user_api_keys_post";

        token.returnType = MainGetApiKeysResp;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function user_export_get (): String {
        // create path and map variables
        var path: String = "/user/export".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "user_export_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function user_stats_get (): String {
        // create path and map variables
        var path: String = "/user/stats".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "user_stats_get";

        token.returnType = String;
        return requestId;

    }
}
}
