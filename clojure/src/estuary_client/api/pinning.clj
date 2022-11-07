(ns estuary-client.api.pinning
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn pinning-pins-get-with-http-info
  "List all pin status objects
  This endpoint lists all pin status objects"
  []
  (call-api "/pinning/pins" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn pinning-pins-get
  "List all pin status objects
  This endpoint lists all pin status objects"
  []
  (:data (pinning-pins-get-with-http-info)))

(defn pinning-pins-pinid-delete-with-http-info
  "Delete a pinned object
  This endpoint deletes a pinned object."
  [pinid ]
  (check-required-params pinid)
  (call-api "/pinning/pins/{pinid}" :delete
            {:path-params   {"pinid" pinid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn pinning-pins-pinid-delete
  "Delete a pinned object
  This endpoint deletes a pinned object."
  [pinid ]
  (:data (pinning-pins-pinid-delete-with-http-info pinid)))

(defn pinning-pins-pinid-get-with-http-info
  "Get a pin status object
  This endpoint returns a pin status object."
  [pinid ]
  (check-required-params pinid)
  (call-api "/pinning/pins/{pinid}" :get
            {:path-params   {"pinid" pinid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn pinning-pins-pinid-get
  "Get a pin status object
  This endpoint returns a pin status object."
  [pinid ]
  (:data (pinning-pins-pinid-get-with-http-info pinid)))

(defn pinning-pins-pinid-post-with-http-info
  "Replace a pinned object
  This endpoint replaces a pinned object."
  [pinid ]
  (check-required-params pinid)
  (call-api "/pinning/pins/{pinid}" :post
            {:path-params   {"pinid" pinid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn pinning-pins-pinid-post
  "Replace a pinned object
  This endpoint replaces a pinned object."
  [pinid ]
  (:data (pinning-pins-pinid-post-with-http-info pinid)))

(defn pinning-pins-post-with-http-info
  "Add and pin object
  This endpoint adds a pin to the IPFS daemon."
  [pin ]
  (check-required-params pin)
  (call-api "/pinning/pins" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    pin
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn pinning-pins-post
  "Add and pin object
  This endpoint adds a pin to the IPFS daemon."
  [pin ]
  (:data (pinning-pins-post-with-http-info pin)))

