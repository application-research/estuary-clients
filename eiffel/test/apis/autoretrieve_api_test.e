note
    description: "API tests for AUTORETRIEVE_API"
    date: "$Date$"
    revision: "$Revision$"


class AUTORETRIEVE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_admin_autoretrieve_init_post
            -- Register autoretrieve server
            -- 
            -- This endpoint registers a new autoretrieve server 
        local
            l_response: STRING_32
            l_addresses: STRING_32
            l_pub_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_addresses
            -- l_pub_key
                      
            -- l_response := api.admin_autoretrieve_init_post(l_addresses, l_pub_key)
            assert ("not_implemented", False)
        end
    
    test_admin_autoretrieve_list_get
            -- List autoretrieve servers
            -- 
            -- This endpoint lists all registered autoretrieve servers 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.admin_autoretrieve_list_get
            assert ("not_implemented", False)
        end
    
    test_autoretrieve_heartbeat_post
            -- Marks autoretrieve server as up
            -- 
            -- This endpoint updates the lastConnection field for autoretrieve 
        local
            l_response: STRING_32
            l_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_token
                      
            -- l_response := api.autoretrieve_heartbeat_post(l_token)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: AUTORETRIEVE_API
            -- Create an object instance of `AUTORETRIEVE_API'.
        once            
            create { AUTORETRIEVE_API } Result
        end

end
