note
    description: "API tests for COLLECTIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class COLLECTIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_collections_coluuid_commit_post
            -- Produce a CID of the collection contents
            -- 
            -- This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection. 
        local
            l_response: STRING_32
            l_coluuid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_coluuid
                      
            -- l_response := api.collections_coluuid_commit_post(l_coluuid)
            assert ("not_implemented", False)
        end
    
    test_collections_coluuid_contents_delete
            -- Deletes a content from a collection
            -- 
            -- This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path 
        local
            l_response: STRING_32
            l_coluuid: STRING_32
            l_contentid: STRING_32
            l_body: MAIN_DELETE_CONTENT_FROM_COLLECTION_BODY
        do
            -- TODO: Initialize required params.
            -- l_coluuid
            -- l_contentid
            -- l_body
                      
            -- l_response := api.collections_coluuid_contents_delete(l_coluuid, l_contentid, l_body)
            assert ("not_implemented", False)
        end
    
    test_collections_coluuid_delete
            -- Deletes a collection
            -- 
            -- This endpoint is used to delete an existing collection. 
        local
            l_response: STRING_32
            l_coluuid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_coluuid
                      
            -- l_response := api.collections_coluuid_delete(l_coluuid)
            assert ("not_implemented", False)
        end
    
    test_collections_coluuid_get
            -- Get contents in a collection
            -- 
            -- This endpoint is used to get contents in a collection. If no colpath query param is passed 
        local
            l_response: STRING_32
            l_coluuid: STRING_32
            l_dir: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_coluuid
                      
            -- l_response := api.collections_coluuid_get(l_coluuid, l_dir)
            assert ("not_implemented", False)
        end
    
    test_collections_coluuid_post
            -- Add contents to a collection
            -- 
            -- This endpoint adds already-pinned contents (that have ContentIDs) to a collection. 
        local
            l_response: STRING_32
            l_coluuid: STRING_32
            l_content_ids: LIST [INTEGER_32]
        do
            -- TODO: Initialize required params.
            -- l_coluuid
            -- create {ARRAYED_LIST [INTEGER_32]} l_content_ids.make (2)
                      
            -- l_response := api.collections_coluuid_post(l_coluuid, l_content_ids)
            assert ("not_implemented", False)
        end
    
    test_collections_fs_add_post
            -- Add a file to a collection
            -- 
            -- This endpoint adds a file to a collection 
        local
            l_response: STRING_32
            l_coluuid: STRING_32
            l_content: STRING_32
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_coluuid
            -- l_content
            -- l_path
                      
            -- l_response := api.collections_fs_add_post(l_coluuid, l_content, l_path)
            assert ("not_implemented", False)
        end
    
    test_collections_get
            -- List all collections
            -- 
            -- This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user. 
        local
            l_response: LIST [LIST [COLLECTIONS_COLLECTION]]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.collections_get
            assert ("not_implemented", False)
        end
    
    test_collections_post
            -- Create a new collection
            -- 
            -- This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection. 
        local
            l_response: COLLECTIONS_COLLECTION
            l_body: MAIN_CREATE_COLLECTION_BODY
        do
            -- TODO: Initialize required params.
            -- l_body
                      
            -- l_response := api.collections_post(l_body)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: COLLECTIONS_API
            -- Create an object instance of `COLLECTIONS_API'.
        once            
            create { COLLECTIONS_API } Result
        end

end
