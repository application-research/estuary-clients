note
    description: "API tests for USER_API"
    date: "$Date$"
    revision: "$Revision$"


class USER_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_user_api_keys_get
            -- Get API keys for a user
            -- 
            -- This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user. 
        local
            l_response: LIST [LIST [MAIN_GET_API_KEYS_RESP]]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.user_api_keys_get
            assert ("not_implemented", False)
        end
    
    test_user_api_keys_key_or_hash_delete
            -- Revoke a User API Key.
            -- 
            -- This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#39;s assigned to the user. Revoked API keys are completely deleted and are not recoverable. 
        local
            l_response: STRING_32
            l_key_or_hash: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_key_or_hash
                      
            -- l_response := api.user_api_keys_key_or_hash_delete(l_key_or_hash)
            assert ("not_implemented", False)
        end
    
    test_user_api_keys_post
            -- Create API keys for a user
            -- 
            -- This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features. 
        local
            l_response: MAIN_GET_API_KEYS_RESP
            l_expiry: STRING_32
            l_perms: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.user_api_keys_post(l_expiry, l_perms)
            assert ("not_implemented", False)
        end
    
    test_user_export_get
            -- Export user data
            -- 
            -- This endpoint is used to get API keys for a user. 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.user_export_get
            assert ("not_implemented", False)
        end
    
    test_user_stats_get
            -- Create API keys for a user
            -- 
            -- This endpoint is used to create API keys for a user. 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.user_stats_get
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: USER_API
            -- Create an object instance of `USER_API'.
        once            
            create { USER_API } Result
        end

end
