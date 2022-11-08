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

public class NetApi extends SwaggerApi {
    /**
    * Constructor for the NetApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function NetApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_net_addrs_get: String = "net_addrs_get";
        public static const event_public_miners_failures_miner_get: String = "public_miners_failures_miner_get";
        public static const event_public_miners_get: String = "public_miners_get";
        public static const event_public_net_addrs_get: String = "public_net_addrs_get";
        public static const event_public_net_peers_get: String = "public_net_peers_get";


    /*
     * Returns String 
     */
    public function net_addrs_get (): String {
        // create path and map variables
        var path: String = "/net/addrs".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "net_addrs_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function public_miners_failures_miner_get (miner: String): String {
        // create path and map variables
        var path: String = "/public/miners/failures/{miner}".replace(/{format}/g,"xml").replace("{" + "miner" + "}", getApiInvoker().escapeString(miner));

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
        token.completionEventType = "public_miners_failures_miner_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function public_miners_get (): String {
        // create path and map variables
        var path: String = "/public/miners".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_miners_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function public_net_addrs_get (): String {
        // create path and map variables
        var path: String = "/public/net/addrs".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_net_addrs_get";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function public_net_peers_get (): String {
        // create path and map variables
        var path: String = "/public/net/peers".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_net_peers_get";

        token.returnType = Array;
        return requestId;

    }
}
}
