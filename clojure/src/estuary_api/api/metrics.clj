(ns estuary-api.api.metrics
  (:require [estuary-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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

