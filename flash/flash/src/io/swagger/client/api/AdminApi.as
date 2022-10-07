package io.swagger.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class AdminApi extends SwaggerApi {
    /**
    * Constructor for the AdminApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function AdminApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_admin_peering_peers_delete: String = "admin_peering_peers_delete";
        public static const event_admin_peering_peers_get: String = "admin_peering_peers_get";
        public static const event_admin_peering_peers_post: String = "admin_peering_peers_post";
        public static const event_admin_peering_start_post: String = "admin_peering_start_post";
        public static const event_admin_peering_status_get: String = "admin_peering_status_get";
        public static const event_admin_peering_stop_post: String = "admin_peering_stop_post";
        public static const event_admin_system_config_get: String = "admin_system_config_get";
        public static const event_admin_users_get: String = "admin_users_get";


    /*
     * Returns void 
     */
    public function admin_peering_peers_delete (): String {
        // create path and map variables
        var path: String = "/admin/peering/peers".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_peering_peers_delete";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function admin_peering_peers_get (): String {
        // create path and map variables
        var path: String = "/admin/peering/peers".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_peering_peers_get";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function admin_peering_peers_post (): String {
        // create path and map variables
        var path: String = "/admin/peering/peers".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_peering_peers_post";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function admin_peering_start_post (): String {
        // create path and map variables
        var path: String = "/admin/peering/start".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_peering_start_post";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function admin_peering_status_get (): String {
        // create path and map variables
        var path: String = "/admin/peering/status".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_peering_status_get";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function admin_peering_stop_post (): String {
        // create path and map variables
        var path: String = "/admin/peering/stop".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_peering_stop_post";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function admin_system_config_get (): String {
        // create path and map variables
        var path: String = "/admin/system/config".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_system_config_get";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function admin_users_get (): String {
        // create path and map variables
        var path: String = "/admin/users".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "admin_users_get";

        token.returnType = null ;
        return requestId;

    }
}
}
