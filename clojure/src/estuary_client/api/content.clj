(ns estuary-client.api.content
  (:require [estuary-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn content-add-car-post-with-http-info
  "Add Car object
  This endpoint is used to add a car object to the network. The object can be a file or a directory."
  ([body ] (content-add-car-post-with-http-info body nil))
  ([body {:keys [ignore-dupes filename ]}]
   (check-required-params body)
   (call-api "/content/add-car" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ignore-dupes" ignore-dupes "filename" filename }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn content-add-car-post
  "Add Car object
  This endpoint is used to add a car object to the network. The object can be a file or a directory."
  ([body ] (content-add-car-post body nil))
  ([body optional-params]
   (:data (content-add-car-post-with-http-info body optional-params))))

(defn content-add-ipfs-post-with-http-info
  "Add IPFS object
  This endpoint is used to add an IPFS object to the network. The object can be a file or a directory."
  ([body ] (content-add-ipfs-post-with-http-info body nil))
  ([body {:keys [ignore-dupes ]}]
   (check-required-params body)
   (call-api "/content/add-ipfs" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ignore-dupes" ignore-dupes }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn content-add-ipfs-post
  "Add IPFS object
  This endpoint is used to add an IPFS object to the network. The object can be a file or a directory."
  ([body ] (content-add-ipfs-post body nil))
  ([body optional-params]
   (:data (content-add-ipfs-post-with-http-info body optional-params))))

(defn content-add-post-with-http-info
  "Add new content
  This endpoint is used to upload new content."
  ([^File data ] (content-add-post-with-http-info data nil))
  ([^File data {:keys [filename coluuid replication ignore-dupes lazy-provide dir ]}]
   (check-required-params data)
   (call-api "/content/add" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"coluuid" coluuid "replication" replication "ignore-dupes" ignore-dupes "lazy-provide" lazy-provide "dir" dir }
              :form-params   {"data" data "filename" filename }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn content-add-post
  "Add new content
  This endpoint is used to upload new content."
  ([^File data ] (content-add-post data nil))
  ([^File data optional-params]
   (:data (content-add-post-with-http-info data optional-params))))

(defn content-aggregated-content-get-with-http-info
  "Get aggregated content stats
  This endpoint returns aggregated content stats"
  [content ]
  (check-required-params content)
  (call-api "/content/aggregated/{content}" :get
            {:path-params   {"content" content }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-aggregated-content-get
  "Get aggregated content stats
  This endpoint returns aggregated content stats"
  [content ]
  (:data (content-aggregated-content-get-with-http-info content)))

(defn content-all-deals-get-with-http-info
  "Get all deals for a user
  This endpoint is used to get all deals for a user"
  [begin duration all ]
  (check-required-params begin duration all)
  (call-api "/content/all-deals" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"begin" begin "duration" duration "all" all }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-all-deals-get
  "Get all deals for a user
  This endpoint is used to get all deals for a user"
  [begin duration all ]
  (:data (content-all-deals-get-with-http-info begin duration all)))

(defn content-bw-usage-content-get-with-http-info
  "Get content bandwidth
  This endpoint returns content bandwidth"
  [content ]
  (check-required-params content)
  (call-api "/content/bw-usage/{content}" :get
            {:path-params   {"content" content }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-bw-usage-content-get
  "Get content bandwidth
  This endpoint returns content bandwidth"
  [content ]
  (:data (content-bw-usage-content-get-with-http-info content)))

(defn content-create-post-with-http-info
  "Add a new content
  This endpoint adds a new content"
  ([req ] (content-create-post-with-http-info req nil))
  ([req {:keys [ignore-dupes ]}]
   (check-required-params req)
   (call-api "/content/create" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"ignore-dupes" ignore-dupes }
              :form-params   {}
              :body-param    req
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn content-create-post
  "Add a new content
  This endpoint adds a new content"
  ([req ] (content-create-post req nil))
  ([req optional-params]
   (:data (content-create-post-with-http-info req optional-params))))

(defn content-deals-get-with-http-info
  "Content with deals
  This endpoint lists all content with deals"
  ([] (content-deals-get-with-http-info nil))
  ([{:keys [limit offset ]}]
   (call-api "/content/deals" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["bearerAuth"]})))

(defn content-deals-get
  "Content with deals
  This endpoint lists all content with deals"
  ([] (content-deals-get nil))
  ([optional-params]
   (:data (content-deals-get-with-http-info optional-params))))

(defn content-ensure-replication-datacid-get-with-http-info
  "Ensure Replication
  This endpoint ensures that the content is replicated to the specified number of providers"
  [datacid ]
  (check-required-params datacid)
  (call-api "/content/ensure-replication/{datacid}" :get
            {:path-params   {"datacid" datacid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-ensure-replication-datacid-get
  "Ensure Replication
  This endpoint ensures that the content is replicated to the specified number of providers"
  [datacid ]
  (:data (content-ensure-replication-datacid-get-with-http-info datacid)))

(defn content-failures-content-get-with-http-info
  "List all failures for a content
  This endpoint returns all failures for a content"
  [content ]
  (check-required-params content)
  (call-api "/content/failures/{content}" :get
            {:path-params   {"content" content }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-failures-content-get
  "List all failures for a content
  This endpoint returns all failures for a content"
  [content ]
  (:data (content-failures-content-get-with-http-info content)))

(defn content-id-get-with-http-info
  "Content
  This endpoint returns a content by its ID"
  [id ]
  (check-required-params id)
  (call-api "/content/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-id-get
  "Content
  This endpoint returns a content by its ID"
  [id ]
  (:data (content-id-get-with-http-info id)))

(defn content-importdeal-post-with-http-info
  "Import a deal
  This endpoint imports a deal into the shuttle."
  [body ]
  (check-required-params body)
  (call-api "/content/importdeal" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-importdeal-post
  "Import a deal
  This endpoint imports a deal into the shuttle."
  [body ]
  (:data (content-importdeal-post-with-http-info body)))

(defn content-list-get-with-http-info
  "List all pinned content
  This endpoint lists all content"
  []
  (call-api "/content/list" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-list-get
  "List all pinned content
  This endpoint lists all content"
  []
  (:data (content-list-get-with-http-info)))

(defn content-read-cont-get-with-http-info
  "Read content
  This endpoint reads content from the blockstore"
  [cont ]
  (check-required-params cont)
  (call-api "/content/read/{cont}" :get
            {:path-params   {"cont" cont }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-read-cont-get
  "Read content
  This endpoint reads content from the blockstore"
  [cont ]
  (:data (content-read-cont-get-with-http-info cont)))

(defn content-staging-zones-get-with-http-info
  "Get staging zone for user
  This endpoint is used to get staging zone for user."
  []
  (call-api "/content/staging-zones" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-staging-zones-get
  "Get staging zone for user
  This endpoint is used to get staging zone for user."
  []
  (:data (content-staging-zones-get-with-http-info)))

(defn content-stats-get-with-http-info
  "Get content statistics
  This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten"
  [limit offset ]
  (check-required-params limit offset)
  (call-api "/content/stats" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"limit" limit "offset" offset }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-stats-get
  "Get content statistics
  This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten"
  [limit offset ]
  (:data (content-stats-get-with-http-info limit offset)))

(defn content-status-id-get-with-http-info
  "Content Status
  This endpoint returns the status of a content"
  [id ]
  (check-required-params id)
  (call-api "/content/status/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["bearerAuth"]}))

(defn content-status-id-get
  "Content Status
  This endpoint returns the status of a content"
  [id ]
  (:data (content-status-id-get-with-http-info id)))

