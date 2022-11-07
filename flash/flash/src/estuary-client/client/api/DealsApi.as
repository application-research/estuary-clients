package estuary-client.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import estuary-client.client.model.MainChannelIDParam;
import estuary-client.client.model.MainEstimateDealBody;
import estuary-client.client.model.UtilHttpError;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class DealsApi extends SwaggerApi {
    /**
    * Constructor for the DealsApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function DealsApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_deal_estimate_post: String = "deal_estimate_post";
        public static const event_deal_info_dealid_get: String = "deal_info_dealid_get";
        public static const event_deal_proposal_propcid_get: String = "deal_proposal_propcid_get";
        public static const event_deal_query_miner_get: String = "deal_query_miner_get";
        public static const event_deal_status_by_proposal_propcid_get: String = "deal_status_by_proposal_propcid_get";
        public static const event_deal_status_miner_propcid_get: String = "deal_status_miner_propcid_get";
        public static const event_deal_transfer_in_progress_get: String = "deal_transfer_in_progress_get";
        public static const event_deal_transfer_status_post: String = "deal_transfer_status_post";
        public static const event_deals_failures_get: String = "deals_failures_get";
        public static const event_deals_make_miner_post: String = "deals_make_miner_post";
        public static const event_deals_status_deal_get: String = "deals_status_deal_get";
        public static const event_public_deals_failures_get: String = "public_deals_failures_get";
        public static const event_public_miners_storage_query_miner_get: String = "public_miners_storage_query_miner_get";


    /*
     * Returns String 
     */
    public function deal_estimate_post (body: MainEstimateDealBody): String {
        // create path and map variables
        var path: String = "/deal/estimate".replace(/{format}/g,"xml");

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
        token.completionEventType = "deal_estimate_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deal_info_dealid_get (dealid: Number): String {
        // create path and map variables
        var path: String = "/deal/info/{dealid}".replace(/{format}/g,"xml").replace("{" + "dealid" + "}", getApiInvoker().escapeString(dealid));

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
        token.completionEventType = "deal_info_dealid_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deal_proposal_propcid_get (propcid: String): String {
        // create path and map variables
        var path: String = "/deal/proposal/{propcid}".replace(/{format}/g,"xml").replace("{" + "propcid" + "}", getApiInvoker().escapeString(propcid));

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
        token.completionEventType = "deal_proposal_propcid_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deal_query_miner_get (miner: String): String {
        // create path and map variables
        var path: String = "/deal/query/{miner}".replace(/{format}/g,"xml").replace("{" + "miner" + "}", getApiInvoker().escapeString(miner));

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
        token.completionEventType = "deal_query_miner_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deal_status_by_proposal_propcid_get (propcid: String): String {
        // create path and map variables
        var path: String = "/deal/status-by-proposal/{propcid}".replace(/{format}/g,"xml").replace("{" + "propcid" + "}", getApiInvoker().escapeString(propcid));

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
        token.completionEventType = "deal_status_by_proposal_propcid_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deal_status_miner_propcid_get (miner: String, propcid: String): String {
        // create path and map variables
        var path: String = "/deal/status/{miner}/{propcid}".replace(/{format}/g,"xml").replace("{" + "miner" + "}", getApiInvoker().escapeString(miner)).replace("{" + "propcid" + "}", getApiInvoker().escapeString(propcid));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "deal_status_miner_propcid_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deal_transfer_in_progress_get (): String {
        // create path and map variables
        var path: String = "/deal/transfer/in-progress".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "deal_transfer_in_progress_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deal_transfer_status_post (chanid: MainChannelIDParam): String {
        // create path and map variables
        var path: String = "/deal/transfer/status".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, chanid, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "deal_transfer_status_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deals_failures_get (): String {
        // create path and map variables
        var path: String = "/deals/failures".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "deals_failures_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deals_make_miner_post (miner: String, dealRequest: String): String {
        // create path and map variables
        var path: String = "/deals/make/{miner}".replace(/{format}/g,"xml").replace("{" + "miner" + "}", getApiInvoker().escapeString(miner));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, dealRequest, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "deals_make_miner_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function deals_status_deal_get (deal: Number): String {
        // create path and map variables
        var path: String = "/deals/status/{deal}".replace(/{format}/g,"xml").replace("{" + "deal" + "}", getApiInvoker().escapeString(deal));

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
        token.completionEventType = "deals_status_deal_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function public_deals_failures_get (): String {
        // create path and map variables
        var path: String = "/public/deals/failures".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "public_deals_failures_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function public_miners_storage_query_miner_get (miner: String): String {
        // create path and map variables
        var path: String = "/public/miners/storage/query/{miner}".replace(/{format}/g,"xml").replace("{" + "miner" + "}", getApiInvoker().escapeString(miner));

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
        token.completionEventType = "public_miners_storage_query_miner_get";

        token.returnType = String;
        return requestId;

    }
}
}
