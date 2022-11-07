note
    description: "API tests for PEERS_API"
    date: "$Date$"
    revision: "$Revision$"


class PEERS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_admin_peering_peers_delete
            -- Remove peers on Peering Service
            -- 
            -- This endpoint can be used to remove a Peer from the Peering Service 
        local
            l_response: STRING_32
            l_peer_ids: LIST [BOOLEAN]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [BOOLEAN]} l_peer_ids.make (2)
                      
            -- l_response := api.admin_peering_peers_delete(l_peer_ids)
            assert ("not_implemented", False)
        end
    
    test_admin_peering_peers_get
            -- List all Peering peers
            -- 
            -- This endpoint can be used to list all peers on Peering Service 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.admin_peering_peers_get
            assert ("not_implemented", False)
        end
    
    test_admin_peering_peers_post
            -- Add peers on Peering Service
            -- 
            -- This endpoint can be used to add a Peer from the Peering Service 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.admin_peering_peers_post
            assert ("not_implemented", False)
        end
    
    test_admin_peering_start_post
            -- Start Peering
            -- 
            -- This endpoint can be used to start the Peering Service 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.admin_peering_start_post
            assert ("not_implemented", False)
        end
    
    test_admin_peering_status_get
            -- Check Peering Status
            -- 
            -- This endpoint can be used to check the Peering status 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.admin_peering_status_get
            assert ("not_implemented", False)
        end
    
    test_admin_peering_stop_post
            -- Stop Peering
            -- 
            -- This endpoint can be used to stop the Peering Service 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.admin_peering_stop_post
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PEERS_API
            -- Create an object instance of `PEERS_API'.
        once            
            create { PEERS_API } Result
        end

end
