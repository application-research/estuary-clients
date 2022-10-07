(ns estuary-api.api.user
  (:require [estuary-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn user-api-keys-get-with-http-info
  "Get API keys for a user
  This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user."
  []
  (call-api "/user/api-keys" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn user-api-keys-get
  "Get API keys for a user
  This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user."
  []
  (:data (user-api-keys-get-with-http-info)))

(defn user-api-keys-key-delete-with-http-info
  "Revoke a User API Key.
  This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user."
  [key ]
  (check-required-params key)
  (call-api "/user/api-keys/{key}" :delete
            {:path-params   {"key" key }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn user-api-keys-key-delete
  "Revoke a User API Key.
  This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user."
  [key ]
  (:data (user-api-keys-key-delete-with-http-info key)))

(defn user-api-keys-post-with-http-info
  "Create API keys for a user
  This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features."
  []
  (call-api "/user/api-keys" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn user-api-keys-post
  "Create API keys for a user
  This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features."
  []
  (:data (user-api-keys-post-with-http-info)))

(defn user-export-get-with-http-info
  "Export user data
  This endpoint is used to get API keys for a user."
  []
  (call-api "/user/export" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn user-export-get
  "Export user data
  This endpoint is used to get API keys for a user."
  []
  (:data (user-export-get-with-http-info)))

(defn user-stats-get-with-http-info
  "Create API keys for a user
  This endpoint is used to create API keys for a user."
  []
  (call-api "/user/stats" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn user-stats-get
  "Create API keys for a user
  This endpoint is used to create API keys for a user."
  []
  (:data (user-stats-get-with-http-info)))

