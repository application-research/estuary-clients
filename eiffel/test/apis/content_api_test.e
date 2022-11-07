note
    description: "API tests for CONTENT_API"
    date: "$Date$"
    revision: "$Revision$"


class CONTENT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_content_add_car_post
            -- Add Car object
            -- 
            -- This endpoint is used to add a car object to the network. The object can be a file or a directory. 
        local
            l_response: STRING_32
            l_body: STRING_32
            l_ignore_dupes: STRING_32
            l_filename: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_body
                      
            -- l_response := api.content_add_car_post(l_body, l_ignore_dupes, l_filename)
            assert ("not_implemented", False)
        end
    
    test_content_add_ipfs_post
            -- Add IPFS object
            -- 
            -- This endpoint is used to add an IPFS object to the network. The object can be a file or a directory. 
        local
            l_response: STRING_32
            l_body: UTIL_CONTENT_ADD_IPFS_BODY
            l_ignore_dupes: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_body
                      
            -- l_response := api.content_add_ipfs_post(l_body, l_ignore_dupes)
            assert ("not_implemented", False)
        end
    
    test_content_add_post
            -- Add new content
            -- 
            -- This endpoint is used to upload new content. 
        local
            l_response: UTIL_CONTENT_ADD_RESPONSE
            l_data: FILE
            l_filename: STRING_32
            l_coluuid: STRING_32
            l_replication: INTEGER_32
            l_ignore_dupes: STRING_32
            l_lazy_provide: STRING_32
            l_dir: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_data
                      
            -- l_response := api.content_add_post(l_data, l_filename, l_coluuid, l_replication, l_ignore_dupes, l_lazy_provide, l_dir)
            assert ("not_implemented", False)
        end
    
    test_content_aggregated_content_get
            -- Get aggregated content stats
            -- 
            -- This endpoint returns aggregated content stats 
        local
            l_response: STRING_32
            l_content: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_content
                      
            -- l_response := api.content_aggregated_content_get(l_content)
            assert ("not_implemented", False)
        end
    
    test_content_all_deals_get
            -- Get all deals for a user
            -- 
            -- This endpoint is used to get all deals for a user 
        local
            l_response: STRING_32
            l_begin: STRING_32
            l_duration: STRING_32
            l_var_all: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_begin
            -- l_duration
            -- l_var_all
                      
            -- l_response := api.content_all_deals_get(l_begin, l_duration, l_var_all)
            assert ("not_implemented", False)
        end
    
    test_content_bw_usage_content_get
            -- Get content bandwidth
            -- 
            -- This endpoint returns content bandwidth 
        local
            l_response: STRING_32
            l_content: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_content
                      
            -- l_response := api.content_bw_usage_content_get(l_content)
            assert ("not_implemented", False)
        end
    
    test_content_create_post
            -- Add a new content
            -- 
            -- This endpoint adds a new content 
        local
            l_response: STRING_32
            l_req: UTIL_CONTENT_CREATE_BODY
            l_ignore_dupes: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_req
                      
            -- l_response := api.content_create_post(l_req, l_ignore_dupes)
            assert ("not_implemented", False)
        end
    
    test_content_deals_get
            -- Content with deals
            -- 
            -- This endpoint lists all content with deals 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.content_deals_get(l_limit, l_offset)
            assert ("not_implemented", False)
        end
    
    test_content_ensure_replication_datacid_get
            -- Ensure Replication
            -- 
            -- This endpoint ensures that the content is replicated to the specified number of providers 
        local
            l_response: STRING_32
            l_datacid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_datacid
                      
            -- l_response := api.content_ensure_replication_datacid_get(l_datacid)
            assert ("not_implemented", False)
        end
    
    test_content_failures_content_get
            -- List all failures for a content
            -- 
            -- This endpoint returns all failures for a content 
        local
            l_response: STRING_32
            l_content: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_content
                      
            -- l_response := api.content_failures_content_get(l_content)
            assert ("not_implemented", False)
        end
    
    test_content_id_get
            -- Content
            -- 
            -- This endpoint returns a content by its ID 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id
                      
            -- l_response := api.content_id_get(l_id)
            assert ("not_implemented", False)
        end
    
    test_content_importdeal_post
            -- Import a deal
            -- 
            -- This endpoint imports a deal into the shuttle. 
        local
            l_response: STRING_32
            l_body: MAIN_IMPORT_DEAL_BODY
        do
            -- TODO: Initialize required params.
            -- l_body
                      
            -- l_response := api.content_importdeal_post(l_body)
            assert ("not_implemented", False)
        end
    
    test_content_list_get
            -- List all pinned content
            -- 
            -- This endpoint lists all content 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.content_list_get
            assert ("not_implemented", False)
        end
    
    test_content_read_cont_get
            -- Read content
            -- 
            -- This endpoint reads content from the blockstore 
        local
            l_response: STRING_32
            l_cont: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_cont
                      
            -- l_response := api.content_read_cont_get(l_cont)
            assert ("not_implemented", False)
        end
    
    test_content_staging_zones_get
            -- Get staging zone for user
            -- 
            -- This endpoint is used to get staging zone for user. 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.content_staging_zones_get
            assert ("not_implemented", False)
        end
    
    test_content_stats_get
            -- Get content statistics
            -- 
            -- This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten 
        local
            l_response: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_limit
            -- l_offset
                      
            -- l_response := api.content_stats_get(l_limit, l_offset)
            assert ("not_implemented", False)
        end
    
    test_content_status_id_get
            -- Content Status
            -- 
            -- This endpoint returns the status of a content 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id
                      
            -- l_response := api.content_status_id_get(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONTENT_API
            -- Create an object instance of `CONTENT_API'.
        once            
            create { CONTENT_API } Result
        end

end
