(ns estuary-client.api.user
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
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

(defn user-api-keys-key-or-hash-delete-with-http-info
  "Revoke a User API Key.
  This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable."
  [key-or-hash ]
  (check-required-params key-or-hash)
  (call-api "/user/api-keys/{key_or_hash}" :delete
            {:path-params   {"key_or_hash" key-or-hash }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn user-api-keys-key-or-hash-delete
  "Revoke a User API Key.
  This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable."
  [key-or-hash ]
  (:data (user-api-keys-key-or-hash-delete-with-http-info key-or-hash)))

(defn user-api-keys-post-with-http-info
  "Create API keys for a user
  This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features."
  ([] (user-api-keys-post-with-http-info nil))
  ([{:keys [expiry perms ]}]
   (call-api "/user/api-keys" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"expiry" expiry "perms" perms }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn user-api-keys-post
  "Create API keys for a user
  This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features."
  ([] (user-api-keys-post nil))
  ([optional-params]
   (:data (user-api-keys-post-with-http-info optional-params))))

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

