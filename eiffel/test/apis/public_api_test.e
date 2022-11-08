note
    description: "API tests for PUBLIC_API"
    date: "$Date$"
    revision: "$Revision$"


class PUBLIC_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_public_by_cid_cid_get
            -- Get Content by Cid
            -- 
            -- This endpoint returns the content associated with a CID 
        local
            l_response: STRING_32
            l_cid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_cid
                      
            -- l_response := api.public_by_cid_cid_get(l_cid)
            assert ("not_implemented", False)
        end
    
    test_public_info_get
            -- Get public node info
            -- 
            -- This endpoint returns information about the node 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.public_info_get
            assert ("not_implemented", False)
        end
    
    test_public_metrics_deals_on_chain_get
            -- Get deal metrics
            -- 
            -- This endpoint is used to get deal metrics 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.public_metrics_deals_on_chain_get
            assert ("not_implemented", False)
        end
    
    test_public_miners_deals_miner_get
            -- Get all miners deals
            -- 
            -- This endpoint returns all miners deals 
        local
            l_response: STRING_32
            l_miner: STRING_32
            l_ignore_failed: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_miner
                      
            -- l_response := api.public_miners_deals_miner_get(l_miner, l_ignore_failed)
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
    
    test_public_miners_stats_miner_get
            -- Get miner stats
            -- 
            -- This endpoint returns miner stats 
        local
            l_response: STRING_32
            l_miner: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_miner
                      
            -- l_response := api.public_miners_stats_miner_get(l_miner)
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
    
    test_public_stats_get
            -- Public stats
            -- 
            -- This endpoint is used to get public stats. 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.public_stats_get
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PUBLIC_API
            -- Create an object instance of `PUBLIC_API'.
        once            
            create { PUBLIC_API } Result
        end

end
