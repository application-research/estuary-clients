note
    description: "API tests for NET_API"
    date: "$Date$"
    revision: "$Revision$"


class NET_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_net_addrs_get
            -- Net Addrs
            -- 
            -- This endpoint is used to get net addrs 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.net_addrs_get
            assert ("not_implemented", False)
        end
    
    test_public_miners_failures_miner_get
            -- Get all miners
            -- 
            -- This endpoint returns all miners 
        local
            l_response: STRING_32
            l_miner: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_miner
                      
            -- l_response := api.public_miners_failures_miner_get(l_miner)
            assert ("not_implemented", False)
        end
    
    test_public_miners_get
            -- Get all miners
            -- 
            -- This endpoint returns all miners 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.public_miners_get
            assert ("not_implemented", False)
        end
    
    test_public_net_addrs_get
            -- Net Addrs
            -- 
            -- This endpoint is used to get net addrs 
        local
            l_response: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.public_net_addrs_get
            assert ("not_implemented", False)
        end
    
    test_public_net_peers_get
            -- Net Peers
            -- 
            -- This endpoint is used to get net peers 
        local
            l_response: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.public_net_peers_get
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: NET_API
            -- Create an object instance of `NET_API'.
        once            
            create { NET_API } Result
        end

end
