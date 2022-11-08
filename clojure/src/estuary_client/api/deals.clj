(ns estuary-client.api.deals
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn deal-estimate-post-with-http-info
  "Estimate the cost of a deal
  This endpoint estimates the cost of a deal"
  [body ]
  (check-required-params body)
  (call-api "/deal/estimate" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-estimate-post
  "Estimate the cost of a deal
  This endpoint estimates the cost of a deal"
  [body ]
  (:data (deal-estimate-post-with-http-info body)))

(defn deal-info-dealid-get-with-http-info
  "Get Deal Info
  This endpoint returns the deal info for a deal"
  [dealid ]
  (check-required-params dealid)
  (call-api "/deal/info/{dealid}" :get
            {:path-params   {"dealid" dealid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-info-dealid-get
  "Get Deal Info
  This endpoint returns the deal info for a deal"
  [dealid ]
  (:data (deal-info-dealid-get-with-http-info dealid)))

(defn deal-proposal-propcid-get-with-http-info
  "Get Proposal
  This endpoint returns the proposal for a deal"
  [propcid ]
  (check-required-params propcid)
  (call-api "/deal/proposal/{propcid}" :get
            {:path-params   {"propcid" propcid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-proposal-propcid-get
  "Get Proposal
  This endpoint returns the proposal for a deal"
  [propcid ]
  (:data (deal-proposal-propcid-get-with-http-info propcid)))

(defn deal-query-miner-get-with-http-info
  "Query Ask
  This endpoint returns the ask for a given CID"
  [miner ]
  (check-required-params miner)
  (call-api "/deal/query/{miner}" :get
            {:path-params   {"miner" miner }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-query-miner-get
  "Query Ask
  This endpoint returns the ask for a given CID"
  [miner ]
  (:data (deal-query-miner-get-with-http-info miner)))

(defn deal-status-by-proposal-propcid-get-with-http-info
  "Get Deal Status by PropCid
  Get Deal Status by PropCid"
  [propcid ]
  (check-required-params propcid)
  (call-api "/deal/status-by-proposal/{propcid}" :get
            {:path-params   {"propcid" propcid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-status-by-proposal-propcid-get
  "Get Deal Status by PropCid
  Get Deal Status by PropCid"
  [propcid ]
  (:data (deal-status-by-proposal-propcid-get-with-http-info propcid)))

(defn deal-status-miner-propcid-get-with-http-info
  "Deal Status
  This endpoint returns the status of a deal"
  [miner propcid ]
  (check-required-params miner propcid)
  (call-api "/deal/status/{miner}/{propcid}" :get
            {:path-params   {"miner" miner "propcid" propcid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-status-miner-propcid-get
  "Deal Status
  This endpoint returns the status of a deal"
  [miner propcid ]
  (:data (deal-status-miner-propcid-get-with-http-info miner propcid)))

(defn deal-transfer-in-progress-get-with-http-info
  "Transfer In Progress
  This endpoint returns the in-progress transfers"
  []
  (call-api "/deal/transfer/in-progress" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-transfer-in-progress-get
  "Transfer In Progress
  This endpoint returns the in-progress transfers"
  []
  (:data (deal-transfer-in-progress-get-with-http-info)))

(defn deal-transfer-status-post-with-http-info
  "Transfer Status
  This endpoint returns the status of a transfer"
  [chanid ]
  (check-required-params chanid)
  (call-api "/deal/transfer/status" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    chanid
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deal-transfer-status-post
  "Transfer Status
  This endpoint returns the status of a transfer"
  [chanid ]
  (:data (deal-transfer-status-post-with-http-info chanid)))

(defn deals-failures-get-with-http-info
  "Get storage failures for user
  This endpoint returns a list of storage failures for user"
  []
  (call-api "/deals/failures" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deals-failures-get
  "Get storage failures for user
  This endpoint returns a list of storage failures for user"
  []
  (:data (deals-failures-get-with-http-info)))

(defn deals-make-miner-post-with-http-info
  "Make Deal
  This endpoint makes a deal for a given content and miner"
  [miner deal-request ]
  (check-required-params miner deal-request)
  (call-api "/deals/make/{miner}" :post
            {:path-params   {"miner" miner }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    deal-request
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deals-make-miner-post
  "Make Deal
  This endpoint makes a deal for a given content and miner"
  [miner deal-request ]
  (:data (deals-make-miner-post-with-http-info miner deal-request)))

(defn deals-status-deal-get-with-http-info
  "Get Deal Status
  This endpoint returns the status of a deal"
  [deal ]
  (check-required-params deal)
  (call-api "/deals/status/{deal}" :get
            {:path-params   {"deal" deal }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn deals-status-deal-get
  "Get Deal Status
  This endpoint returns the status of a deal"
  [deal ]
  (:data (deals-status-deal-get-with-http-info deal)))

(defn public-deals-failures-get-with-http-info
  "Get storage failures
  This endpoint returns a list of storage failures"
  []
  (call-api "/public/deals/failures" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-deals-failures-get
  "Get storage failures
  This endpoint returns a list of storage failures"
  []
  (:data (public-deals-failures-get-with-http-info)))

(defn public-miners-storage-query-miner-get-with-http-info
  "Query Ask
  This endpoint returns the ask for a given CID"
  [miner ]
  (check-required-params miner)
  (call-api "/public/miners/storage/query/{miner}" :get
            {:path-params   {"miner" miner }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn public-miners-storage-query-miner-get
  "Query Ask
  This endpoint returns the ask for a given CID"
  [miner ]
  (:data (public-miners-storage-query-miner-get-with-http-info miner)))

