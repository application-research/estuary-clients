package estuary-client.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import flash.filesystem.File;
import estuary-client.client.model.MainImportDealBody;
import estuary-client.client.model.UtilContentAddIpfsBody;
import estuary-client.client.model.UtilContentAddResponse;
import estuary-client.client.model.UtilContentCreateBody;
import estuary-client.client.model.UtilHttpError;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ContentApi extends SwaggerApi {
    /**
    * Constructor for the ContentApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ContentApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_content_add_car_post: String = "content_add_car_post";
        public static const event_content_add_ipfs_post: String = "content_add_ipfs_post";
        public static const event_content_add_post: String = "content_add_post";
        public static const event_content_aggregated_content_get: String = "content_aggregated_content_get";
        public static const event_content_all_deals_get: String = "content_all_deals_get";
        public static const event_content_bw_usage_content_get: String = "content_bw_usage_content_get";
        public static const event_content_create_post: String = "content_create_post";
        public static const event_content_deals_get: String = "content_deals_get";
        public static const event_content_ensure_replication_datacid_get: String = "content_ensure_replication_datacid_get";
        public static const event_content_failures_content_get: String = "content_failures_content_get";
        public static const event_content_id_get: String = "content_id_get";
        public static const event_content_importdeal_post: String = "content_importdeal_post";
        public static const event_content_list_get: String = "content_list_get";
        public static const event_content_read_cont_get: String = "content_read_cont_get";
        public static const event_content_staging_zones_get: String = "content_staging_zones_get";
        public static const event_content_stats_get: String = "content_stats_get";
        public static const event_content_status_id_get: String = "content_status_id_get";


    /*
     * Returns String 
     */
    public function content_add_car_post (body: String, ignoreDupes: String, filename: String): String {
        // create path and map variables
        var path: String = "/content/add-car".replace(/{format}/g,"xml");

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

        if("null" != String(ignoreDupes))
            queryParams["ignore-dupes"] = toPathValue(ignoreDupes);
if("null" != String(filename))
            queryParams["filename"] = toPathValue(filename);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, body, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_add_car_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_add_ipfs_post (body: UtilContentAddIpfsBody, ignoreDupes: String): String {
        // create path and map variables
        var path: String = "/content/add-ipfs".replace(/{format}/g,"xml");

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

        if("null" != String(ignoreDupes))
            queryParams["ignore-dupes"] = toPathValue(ignoreDupes);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, body, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_add_ipfs_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns UtilContentAddResponse 
     */
    public function content_add_post (data: File, filename: String, coluuid: String, replication: Number, ignoreDupes: String, lazyProvide: String, dir: String): String {
        // create path and map variables
        var path: String = "/content/add".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }
) {
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
if("null" != String(replication))
            queryParams["replication"] = toPathValue(replication);
if("null" != String(ignoreDupes))
            queryParams["ignore-dupes"] = toPathValue(ignoreDupes);
if("null" != String(lazyProvide))
            queryParams["lazy-provide"] = toPathValue(lazyProvide);
if("null" != String(dir))
            queryParams["dir"] = toPathValue(dir);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_add_post";

        token.returnType = UtilContentAddResponse;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_aggregated_content_get (content: String): String {
        // create path and map variables
        var path: String = "/content/aggregated/{content}".replace(/{format}/g,"xml").replace("{" + "content" + "}", getApiInvoker().escapeString(content));

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
        token.completionEventType = "content_aggregated_content_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_all_deals_get (begin: String, duration: String, all: String): String {
        // create path and map variables
        var path: String = "/content/all-deals".replace(/{format}/g,"xml");

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

        if("null" != String(begin))
            queryParams["begin"] = toPathValue(begin);
if("null" != String(duration))
            queryParams["duration"] = toPathValue(duration);
if("null" != String(all))
            queryParams["all"] = toPathValue(all);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_all_deals_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_bw_usage_content_get (content: String): String {
        // create path and map variables
        var path: String = "/content/bw-usage/{content}".replace(/{format}/g,"xml").replace("{" + "content" + "}", getApiInvoker().escapeString(content));

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
        token.completionEventType = "content_bw_usage_content_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_create_post (req: UtilContentCreateBody, ignoreDupes: String): String {
        // create path and map variables
        var path: String = "/content/create".replace(/{format}/g,"xml");

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

        if("null" != String(ignoreDupes))
            queryParams["ignore-dupes"] = toPathValue(ignoreDupes);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, req, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_create_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_deals_get (limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/content/deals".replace(/{format}/g,"xml");

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

        if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);
if("null" != String(offset))
            queryParams["offset"] = toPathValue(offset);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_deals_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_ensure_replication_datacid_get (datacid: String): String {
        // create path and map variables
        var path: String = "/content/ensure-replication/{datacid}".replace(/{format}/g,"xml").replace("{" + "datacid" + "}", getApiInvoker().escapeString(datacid));

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
        token.completionEventType = "content_ensure_replication_datacid_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_failures_content_get (content: String): String {
        // create path and map variables
        var path: String = "/content/failures/{content}".replace(/{format}/g,"xml").replace("{" + "content" + "}", getApiInvoker().escapeString(content));

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
        token.completionEventType = "content_failures_content_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_id_get (id: Number): String {
        // create path and map variables
        var path: String = "/content/{id}".replace(/{format}/g,"xml").replace("{" + "id" + "}", getApiInvoker().escapeString(id));

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
        token.completionEventType = "content_id_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_importdeal_post (body: MainImportDealBody): String {
        // create path and map variables
        var path: String = "/content/importdeal".replace(/{format}/g,"xml");

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
        token.completionEventType = "content_importdeal_post";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_list_get (): String {
        // create path and map variables
        var path: String = "/content/list".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_list_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_read_cont_get (cont: String): String {
        // create path and map variables
        var path: String = "/content/read/{cont}".replace(/{format}/g,"xml").replace("{" + "cont" + "}", getApiInvoker().escapeString(cont));

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
        token.completionEventType = "content_read_cont_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_staging_zones_get (): String {
        // create path and map variables
        var path: String = "/content/staging-zones".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_staging_zones_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_stats_get (limit: String, offset: String): String {
        // create path and map variables
        var path: String = "/content/stats".replace(/{format}/g,"xml");

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

        if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);
if("null" != String(offset))
            queryParams["offset"] = toPathValue(offset);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "content_stats_get";

        token.returnType = String;
        return requestId;

    }

    /*
     * Returns String 
     */
    public function content_status_id_get (id: Number): String {
        // create path and map variables
        var path: String = "/content/status/{id}".replace(/{format}/g,"xml").replace("{" + "id" + "}", getApiInvoker().escapeString(id));

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
        token.completionEventType = "content_status_id_get";

        token.returnType = String;
        return requestId;

    }
}
}
