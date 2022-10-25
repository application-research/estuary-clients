(ns estuary-client.api.public
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn public-by-cid-cid-get-with-http-info
  "Get Content by Cid
  This endpoint returns the content associated with a CID"
  [cid ]
  (check-required-params cid)
  (call-api "/public/by-cid/{cid}" :get
            {:path-params   {"cid" cid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-by-cid-cid-get
  "Get Content by Cid
  This endpoint returns the content associated with a CID"
  [cid ]
  (:data (public-by-cid-cid-get-with-http-info cid)))

(defn public-info-get-with-http-info
  "Get public node info
  This endpoint returns information about the node"
  []
  (call-api "/public/info" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-info-get
  "Get public node info
  This endpoint returns information about the node"
  []
  (:data (public-info-get-with-http-info)))

(defn public-metrics-deals-on-chain-get-with-http-info
  "Get deal metrics
  This endpoint is used to get deal metrics"
  []
  (call-api "/public/metrics/deals-on-chain" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-metrics-deals-on-chain-get
  "Get deal metrics
  This endpoint is used to get deal metrics"
  []
  (:data (public-metrics-deals-on-chain-get-with-http-info)))

(defn public-miners-deals-miner-get-with-http-info
  "Get all miners deals
  This endpoint returns all miners deals"
  ([miner ] (public-miners-deals-miner-get-with-http-info miner nil))
  ([miner {:keys [ignore-failed ]}]
   (check-required-params miner)
   (call-api "/public/miners/deals/{miner}" :get
             {:path-params   {"miner" miner }
              :header-params {}
              :query-params  {"ignore-failed" ignore-failed }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn public-miners-deals-miner-get
  "Get all miners deals
  This endpoint returns all miners deals"
  ([miner ] (public-miners-deals-miner-get miner nil))
  ([miner optional-params]
   (:data (public-miners-deals-miner-get-with-http-info miner optional-params))))

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

(defn public-miners-stats-miner-get-with-http-info
  "Get miner stats
  This endpoint returns miner stats"
  [miner ]
  (check-required-params miner)
  (call-api "/public/miners/stats/{miner}" :get
            {:path-params   {"miner" miner }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-miners-stats-miner-get
  "Get miner stats
  This endpoint returns miner stats"
  [miner ]
  (:data (public-miners-stats-miner-get-with-http-info miner)))

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

(defn public-stats-get-with-http-info
  "Public stats
  This endpoint is used to get public stats."
  []
  (call-api "/public/stats" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-stats-get
  "Public stats
  This endpoint is used to get public stats."
  []
  (:data (public-stats-get-with-http-info)))

