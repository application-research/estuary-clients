(ns estuary-client.api.peers
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn admin-peering-peers-delete-with-http-info
  "Remove peers on Peering Service
  This endpoint can be used to remove a Peer from the Peering Service"
  [peer-ids ]
  (check-required-params peer-ids)
  (call-api "/admin/peering/peers" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    peer-ids
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-peering-peers-delete
  "Remove peers on Peering Service
  This endpoint can be used to remove a Peer from the Peering Service"
  [peer-ids ]
  (:data (admin-peering-peers-delete-with-http-info peer-ids)))

(defn admin-peering-peers-get-with-http-info
  "List all Peering peers
  This endpoint can be used to list all peers on Peering Service"
  []
  (call-api "/admin/peering/peers" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-peering-peers-get
  "List all Peering peers
  This endpoint can be used to list all peers on Peering Service"
  []
  (:data (admin-peering-peers-get-with-http-info)))

(defn admin-peering-peers-post-with-http-info
  "Add peers on Peering Service
  This endpoint can be used to add a Peer from the Peering Service"
  []
  (call-api "/admin/peering/peers" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-peering-peers-post
  "Add peers on Peering Service
  This endpoint can be used to add a Peer from the Peering Service"
  []
  (:data (admin-peering-peers-post-with-http-info)))

(defn admin-peering-start-post-with-http-info
  "Start Peering
  This endpoint can be used to start the Peering Service"
  []
  (call-api "/admin/peering/start" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-peering-start-post
  "Start Peering
  This endpoint can be used to start the Peering Service"
  []
  (:data (admin-peering-start-post-with-http-info)))

(defn admin-peering-status-get-with-http-info
  "Check Peering Status
  This endpoint can be used to check the Peering status"
  []
  (call-api "/admin/peering/status" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-peering-status-get
  "Check Peering Status
  This endpoint can be used to check the Peering status"
  []
  (:data (admin-peering-status-get-with-http-info)))

(defn admin-peering-stop-post-with-http-info
  "Stop Peering
  This endpoint can be used to stop the Peering Service"
  []
  (call-api "/admin/peering/stop" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn admin-peering-stop-post
  "Stop Peering
  This endpoint can be used to stop the Peering Service"
  []
  (:data (admin-peering-stop-post-with-http-info)))

