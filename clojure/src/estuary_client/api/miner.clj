(ns estuary-client.api.miner
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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

