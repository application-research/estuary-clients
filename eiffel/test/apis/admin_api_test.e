note
    description: "API tests for ADMIN_API"
    date: "$Date$"
    revision: "$Revision$"


class ADMIN_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_admin_peering_peers_delete
            -- Remove peers on Peering Service
            -- 
            -- This endpoint can be used to remove a Peer from the Peering Service 
        local
            l_body: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [STRING_32]} l_body.make (2)
                      
            -- api.admin_peering_peers_delete(l_body)
            assert ("not_implemented", False)
        end
    
    test_admin_peering_peers_get
            -- List all Peering peers
            -- 
            -- This endpoint can be used to list all peers on Peering Service 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.admin_peering_peers_get
            assert ("not_implemented", False)
        end
    
    test_admin_peering_peers_post
            -- Add peers on Peering Service
            -- 
            -- This endpoint can be used to add a Peer from the Peering Service 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.admin_peering_peers_post
            assert ("not_implemented", False)
        end
    
    test_admin_peering_start_post
            -- Start Peering
            -- 
            -- This endpoint can be used to start the Peering Service 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.admin_peering_start_post
            assert ("not_implemented", False)
        end
    
    test_admin_peering_status_get
            -- Check Peering Status
            -- 
            -- This endpoint can be used to check the Peering status 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.admin_peering_status_get
            assert ("not_implemented", False)
        end
    
    test_admin_peering_stop_post
            -- Stop Peering
            -- 
            -- This endpoint can be used to stop the Peering Service 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.admin_peering_stop_post
            assert ("not_implemented", False)
        end
    
    test_admin_system_config_get
            -- Get systems(estuary/shuttle) config
            -- 
            -- This endpoint is used to get system configs. 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.admin_system_config_get
            assert ("not_implemented", False)
        end
    
    test_admin_users_get
            -- Get all users
            -- 
            -- This endpoint is used to get all users. 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.admin_users_get
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADMIN_API
            -- Create an object instance of `ADMIN_API'.
        once            
            create { ADMIN_API } Result
        end

end
