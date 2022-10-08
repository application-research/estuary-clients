package estuary_client.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import estuary_client.client.model.UtilHttpError;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PinningApi extends SwaggerApi {
    /**
    * Constructor for the PinningApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PinningApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_pinning_pins_get: String = "pinning_pins_get";
        public static const event_pinning_pins_pinid_delete: String = "pinning_pins_pinid_delete";
        public static const event_pinning_pins_pinid_get: String = "pinning_pins_pinid_get";
        public static const event_pinning_pins_pinid_post: String = "pinning_pins_pinid_post";
        public static const event_pinning_pins_post: String = "pinning_pins_post";


    /*
     * Returns void 
     */
    public function pinning_pins_get (): String {
        // create path and map variables
        var path: String = "/pinning/pins".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "pinning_pins_get";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function pinning_pins_pinid_delete (pinid: String): String {
        // create path and map variables
        var path: String = "/pinning/pins/{pinid}".replace(/{format}/g,"xml").replace("{" + "pinid" + "}", getApiInvoker().escapeString(pinid));

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
        token.completionEventType = "pinning_pins_pinid_delete";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function pinning_pins_pinid_get (pinid: String): String {
        // create path and map variables
        var path: String = "/pinning/pins/{pinid}".replace(/{format}/g,"xml").replace("{" + "pinid" + "}", getApiInvoker().escapeString(pinid));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "pinning_pins_pinid_get";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function pinning_pins_pinid_post (pinid: String): String {
        // create path and map variables
        var path: String = "/pinning/pins/{pinid}".replace(/{format}/g,"xml").replace("{" + "pinid" + "}", getApiInvoker().escapeString(pinid));

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
        token.completionEventType = "pinning_pins_pinid_post";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function pinning_pins_post (cid: String, name: String): String {
        // create path and map variables
        var path: String = "/pinning/pins".replace(/{format}/g,"xml").replace("{" + "cid" + "}", getApiInvoker().escapeString(cid)).replace("{" + "name" + "}", getApiInvoker().escapeString(name));

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
        token.completionEventType = "pinning_pins_post";

        token.returnType = null ;
        return requestId;

    }
}
}
