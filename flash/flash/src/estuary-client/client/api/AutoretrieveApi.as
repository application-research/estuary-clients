package estuary-client.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import estuary-client.client.model.UtilHttpError;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class AutoretrieveApi extends SwaggerApi {
    /**
    * Constructor for the AutoretrieveApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function AutoretrieveApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_admin_autoretrieve_init_post: String = "admin_autoretrieve_init_post";
        public static const event_admin_autoretrieve_list_get: String = "admin_autoretrieve_list_get";
        public static const event_autoretrieve_heartbeat_post: String = "autoretrieve_heartbeat_post";


    /*
     * Returns String 
     */
    public function admin_autoretrieve_init_post (addresses: String, pubKey: String): String {
        // create path and map variables
        var path: String = "/admin/autoretrieve/init".replace(/{format}/g,"xml");

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_autoretrieve_init_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function admin_autoretrieve_list_get (): String {
        // create path and map variables
        var path: String = "/admin/autoretrieve/list".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_autoretrieve_list_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function autoretrieve_heartbeat_post (token: String): String {
        // create path and map variables
        var path: String = "/autoretrieve/heartbeat".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["token"] = toPathValue(token);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "autoretrieve_heartbeat_post";

        token.returnType = String;
        return requestId;

    }
}
}
