note
    description: "API tests for PINNING_API"
    date: "$Date$"
    revision: "$Revision$"


class PINNING_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_pinning_pins_get
            -- List all pin status objects
            -- 
            -- This endpoint lists all pin status objects 
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.pinning_pins_get
            assert ("not_implemented", False)
        end
    
    test_pinning_pins_pinid_delete
            -- Delete a pinned object
            -- 
            -- This endpoint deletes a pinned object. 
        local
            l_pinid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pinid
                      
            -- api.pinning_pins_pinid_delete(l_pinid)
            assert ("not_implemented", False)
        end
    
    test_pinning_pins_pinid_get
            -- Get a pin status object
            -- 
            -- This endpoint returns a pin status object. 
        local
            l_pinid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pinid
                      
            -- api.pinning_pins_pinid_get(l_pinid)
            assert ("not_implemented", False)
        end
    
    test_pinning_pins_pinid_post
            -- Replace a pinned object
            -- 
            -- This endpoint replaces a pinned object. 
        local
            l_pinid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pinid
                      
            -- api.pinning_pins_pinid_post(l_pinid)
            assert ("not_implemented", False)
        end
    
    test_pinning_pins_post
            -- Add and pin object
            -- 
            -- This endpoint adds a pin to the IPFS daemon. 
        local
            l_cid: STRING_32
            l_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_cid
            -- l_name
                      
            -- api.pinning_pins_post(l_cid, l_name)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PINNING_API
            -- Create an object instance of `PINNING_API'.
        once            
            create { PINNING_API } Result
        end

end
