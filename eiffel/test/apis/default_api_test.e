note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_deal_transfer_status_post
            -- 
            -- 
            --  
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.deal_transfer_status_post
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once            
            create { DEFAULT_API } Result
        end

end
