(ns estuary-client.api.net
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn net-addrs-get-with-http-info
  "Net Addrs
  This endpoint is used to get net addrs"
  []
  (call-api "/net/addrs" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn net-addrs-get
  "Net Addrs
  This endpoint is used to get net addrs"
  []
  (:data (net-addrs-get-with-http-info)))

(defn public-miners-failures-miner-get-with-http-info
  "Get all miners
  This endpoint returns all miners"
  [miner ]
  (check-required-params miner)
  (call-api "/public/miners/failures/{miner}" :get
            {:path-params   {"miner" miner }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-miners-failures-miner-get
  "Get all miners
  This endpoint returns all miners"
  [miner ]
  (:data (public-miners-failures-miner-get-with-http-info miner)))

(defn public-miners-get-with-http-info
  "Get all miners
  This endpoint returns all miners"
  []
  (call-api "/public/miners" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-miners-get
  "Get all miners
  This endpoint returns all miners"
  []
  (:data (public-miners-get-with-http-info)))

(defn public-net-addrs-get-with-http-info
  "Net Addrs
  This endpoint is used to get net addrs"
  []
  (call-api "/public/net/addrs" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-net-addrs-get
  "Net Addrs
  This endpoint is used to get net addrs"
  []
  (:data (public-net-addrs-get-with-http-info)))

(defn public-net-peers-get-with-http-info
  "Net Peers
  This endpoint is used to get net peers"
  []
  (call-api "/public/net/peers" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-net-peers-get
  "Net Peers
  This endpoint is used to get net peers"
  []
  (:data (public-net-peers-get-with-http-info)))

