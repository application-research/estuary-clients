(ns estuary-api.api.collections
  (:require [estuary-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn collections-coluuid-commit-post-with-http-info
  "Produce a CID of the collection contents
  This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection."
  [coluuid ]
  (check-required-params coluuid)
  (call-api "/collections/{coluuid}/commit" :post
            {:path-params   {"coluuid" coluuid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn collections-coluuid-commit-post
  "Produce a CID of the collection contents
  This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection."
  [coluuid ]
  (:data (collections-coluuid-commit-post-with-http-info coluuid)))

(defn collections-coluuid-delete-with-http-info
  "Deletes a collection
  This endpoint is used to delete an existing collection."
  [coluuid ]
  (check-required-params coluuid)
  (call-api "/collections/{coluuid}" :delete
            {:path-params   {"coluuid" coluuid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["bearerAuth"]}))

(defn collections-coluuid-delete
  "Deletes a collection
  This endpoint is used to delete an existing collection."
  [coluuid ]
  (:data (collections-coluuid-delete-with-http-info coluuid)))

(defn collections-coluuid-get-with-http-info
  "Get contents in a collection
  This endpoint is used to get contents in a collection. If no colpath query param is passed"
  ([coluuid ] (collections-coluuid-get-with-http-info coluuid nil))
  ([coluuid {:keys [dir ]}]
   (check-required-params coluuid)
   (call-api "/collections/{coluuid}" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"coluuid" coluuid "dir" dir }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn collections-coluuid-get
  "Get contents in a collection
  This endpoint is used to get contents in a collection. If no colpath query param is passed"
  ([coluuid ] (collections-coluuid-get coluuid nil))
  ([coluuid optional-params]
   (:data (collections-coluuid-get-with-http-info coluuid optional-params))))

(defn collections-coluuid-post-with-http-info
  "Add contents to a collection
  This endpoint adds already-pinned contents (that have ContentIDs) to a collection."
  [body ]
  (check-required-params body)
  (call-api "/collections/{coluuid}" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn collections-coluuid-post
  "Add contents to a collection
  This endpoint adds already-pinned contents (that have ContentIDs) to a collection."
  [body ]
  (:data (collections-coluuid-post-with-http-info body)))

(defn collections-fs-add-post-with-http-info
  "Add a file to a collection
  This endpoint adds a file to a collection"
  [coluuid content path ]
  (check-required-params coluuid content path)
  (call-api "/collections/fs/add" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"coluuid" coluuid "content" content "path" path }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn collections-fs-add-post
  "Add a file to a collection
  This endpoint adds a file to a collection"
  [coluuid content path ]
  (:data (collections-fs-add-post-with-http-info coluuid content path)))

(defn collections-get-with-http-info
  "List all collections
  This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user."
  [id ]
  (check-required-params id)
  (call-api "/collections/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn collections-get
  "List all collections
  This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user."
  [id ]
  (:data (collections-get-with-http-info id)))

(defn collections-post-with-http-info
  "Create a new collection
  This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection."
  [body ]
  (check-required-params body)
  (call-api "/collections/" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn collections-post
  "Create a new collection
  This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection."
  [body ]
  (:data (collections-post-with-http-info body)))

