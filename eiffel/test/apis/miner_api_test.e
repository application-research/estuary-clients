note
    description: "API tests for MINER_API"
    date: "$Date$"
    revision: "$Revision$"


class MINER_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
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

feature {NONE} -- Implementation

    api: MINER_API
            -- Create an object instance of `MINER_API'.
        once            
            create { MINER_API } Result
        end

end
