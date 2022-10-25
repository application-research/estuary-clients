(ns estuary-client.api.default
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn deal-transfer-status-post-with-http-info
  ""
  []
  (call-api "/deal/transfer/status" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["bearerAuth"]}))

(defn deal-transfer-status-post
  ""
  []
  (:data (deal-transfer-status-post-with-http-info)))

