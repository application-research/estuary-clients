note
    description: "API tests for METRICS_API"
    date: "$Date$"
    revision: "$Revision$"


class METRICS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
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

feature {NONE} -- Implementation

    api: METRICS_API
            -- Create an object instance of `METRICS_API'.
        once            
            create { METRICS_API } Result
        end

end
