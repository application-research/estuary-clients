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

public class MinerApi extends SwaggerApi {
    /**
    * Constructor for the MinerApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function MinerApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_public_miners_deals_miner_get: String = "public_miners_deals_miner_get";
        public static const event_public_miners_stats_miner_get: String = "public_miners_stats_miner_get";


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
}
}
