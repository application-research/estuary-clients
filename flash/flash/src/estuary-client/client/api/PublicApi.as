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

public class PublicApi extends SwaggerApi {
    /**
    * Constructor for the PublicApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PublicApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_public_by_cid_cid_get: String = "public_by_cid_cid_get";
        public static const event_public_info_get: String = "public_info_get";
        public static const event_public_metrics_deals_on_chain_get: String = "public_metrics_deals_on_chain_get";
        public static const event_public_miners_deals_miner_get: String = "public_miners_deals_miner_get";
        public static const event_public_miners_failures_miner_get: String = "public_miners_failures_miner_get";
        public static const event_public_miners_get: String = "public_miners_get";
        public static const event_public_miners_stats_miner_get: String = "public_miners_stats_miner_get";
        public static const event_public_net_addrs_get: String = "public_net_addrs_get";
        public static const event_public_net_peers_get: String = "public_net_peers_get";
        public static const event_public_stats_get: String = "public_stats_get";


    /*
     * Returns String 
     */
    public function public_by_cid_cid_get (cid: String): String {
        // create path and map variables
        var path: String = "/public/by-cid/{cid}".replace(/{format}/g,"xml").replace("{" + "cid" + "}", getApiInvoker().escapeString(cid));

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
        token.completionEventType = "public_by_cid_cid_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function public_info_get (): String {
        // create path and map variables
        var path: String = "/public/info".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_info_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function public_metrics_deals_on_chain_get (): String {
        // create path and map variables
        var path: String = "/public/metrics/deals-on-chain".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_metrics_deals_on_chain_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function public_miners_deals_miner_get (miner: String, ignoreFailed: String): String {
        // create path and map variables
        var path: String = "/public/miners/deals/{miner}".replace(/{format}/g,"xml").replace("{" + "miner" + "}", getApiInvoker().escapeString(miner));

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

        if("null" != String(ignoreFailed))
            queryParams["ignore-failed"] = toPathValue(ignoreFailed);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_miners_deals_miner_get";

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
     * Returns String 
     */
    public function public_miners_stats_miner_get (miner: String): String {
        // create path and map variables
        var path: String = "/public/miners/stats/{miner}".replace(/{format}/g,"xml").replace("{" + "miner" + "}", getApiInvoker().escapeString(miner));

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
        token.completionEventType = "public_miners_stats_miner_get";

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

    /*
     * Returns String 
     */
    public function public_stats_get (): String {
        // create path and map variables
        var path: String = "/public/stats".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_stats_get";

        token.returnType = String;
        return requestId;

    }
}
}
