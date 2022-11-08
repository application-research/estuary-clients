(ns estuary-client.api.autoretrieve
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn admin-autoretrieve-init-post-with-http-info
  "Register autoretrieve server
  This endpoint registers a new autoretrieve server"
  [addresses pub-key ]
  (check-required-params addresses pub-key)
  (call-api "/admin/autoretrieve/init" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"addresses" addresses "pubKey" pub-key }
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-autoretrieve-init-post
  "Register autoretrieve server
  This endpoint registers a new autoretrieve server"
  [addresses pub-key ]
  (:data (admin-autoretrieve-init-post-with-http-info addresses pub-key)))

(defn admin-autoretrieve-list-get-with-http-info
  "List autoretrieve servers
  This endpoint lists all registered autoretrieve servers"
  []
  (call-api "/admin/autoretrieve/list" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-autoretrieve-list-get
  "List autoretrieve servers
  This endpoint lists all registered autoretrieve servers"
  []
  (:data (admin-autoretrieve-list-get-with-http-info)))

(defn autoretrieve-heartbeat-post-with-http-info
  "Marks autoretrieve server as up
  This endpoint updates the lastConnection field for autoretrieve"
  [token ]
  (check-required-params token)
  (call-api "/autoretrieve/heartbeat" :post
            {:path-params   {}
             :header-params {"token" token }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn autoretrieve-heartbeat-post
  "Marks autoretrieve server as up
  This endpoint updates the lastConnection field for autoretrieve"
  [token ]
  (:data (autoretrieve-heartbeat-post-with-http-info token)))

