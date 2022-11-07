note
    description: "API tests for DEALS_API"
    date: "$Date$"
    revision: "$Revision$"


class DEALS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_deal_estimate_post
            -- Estimate the cost of a deal
            -- 
            -- This endpoint estimates the cost of a deal 
        local
            l_response: STRING_32
            l_body: MAIN_ESTIMATE_DEAL_BODY
        do
            -- TODO: Initialize required params.
            -- l_body
                      
            -- l_response := api.deal_estimate_post(l_body)
            assert ("not_implemented", False)
        end
    
    test_deal_info_dealid_get
            -- Get Deal Info
            -- 
            -- This endpoint returns the deal info for a deal 
        local
            l_response: STRING_32
            l_dealid: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_dealid
                      
            -- l_response := api.deal_info_dealid_get(l_dealid)
            assert ("not_implemented", False)
        end
    
    test_deal_proposal_propcid_get
            -- Get Proposal
            -- 
            -- This endpoint returns the proposal for a deal 
        local
            l_response: STRING_32
            l_propcid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_propcid
                      
            -- l_response := api.deal_proposal_propcid_get(l_propcid)
            assert ("not_implemented", False)
        end
    
    test_deal_query_miner_get
            -- Query Ask
            -- 
            -- This endpoint returns the ask for a given CID 
        local
            l_response: STRING_32
            l_miner: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_miner
                      
            -- l_response := api.deal_query_miner_get(l_miner)
            assert ("not_implemented", False)
        end
    
    test_deal_status_by_proposal_propcid_get
            -- Get Deal Status by PropCid
            -- 
            -- Get Deal Status by PropCid 
        local
            l_response: STRING_32
            l_propcid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_propcid
                      
            -- l_response := api.deal_status_by_proposal_propcid_get(l_propcid)
            assert ("not_implemented", False)
        end
    
    test_deal_status_miner_propcid_get
            -- Deal Status
            -- 
            -- This endpoint returns the status of a deal 
        local
            l_response: STRING_32
            l_miner: STRING_32
            l_propcid: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_miner
            -- l_propcid
                      
            -- l_response := api.deal_status_miner_propcid_get(l_miner, l_propcid)
            assert ("not_implemented", False)
        end
    
    test_deal_transfer_in_progress_get
            -- Transfer In Progress
            -- 
            -- This endpoint returns the in-progress transfers 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.deal_transfer_in_progress_get
            assert ("not_implemented", False)
        end
    
    test_deal_transfer_status_post
            -- Transfer Status
            -- 
            -- This endpoint returns the status of a transfer 
        local
            l_response: STRING_32
            l_chanid: MAIN_CHANNEL_ID_PARAM
        do
            -- TODO: Initialize required params.
            -- l_chanid
                      
            -- l_response := api.deal_transfer_status_post(l_chanid)
            assert ("not_implemented", False)
        end
    
    test_deals_failures_get
            -- Get storage failures for user
            -- 
            -- This endpoint returns a list of storage failures for user 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.deals_failures_get
            assert ("not_implemented", False)
        end
    
    test_deals_make_miner_post
            -- Make Deal
            -- 
            -- This endpoint makes a deal for a given content and miner 
        local
            l_response: STRING_32
            l_miner: STRING_32
            l_deal_request: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_miner
            -- l_deal_request
                      
            -- l_response := api.deals_make_miner_post(l_miner, l_deal_request)
            assert ("not_implemented", False)
        end
    
    test_deals_status_deal_get
            -- Get Deal Status
            -- 
            -- This endpoint returns the status of a deal 
        local
            l_response: STRING_32
            l_deal: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_deal
                      
            -- l_response := api.deals_status_deal_get(l_deal)
            assert ("not_implemented", False)
        end
    
    test_public_deals_failures_get
            -- Get storage failures
            -- 
            -- This endpoint returns a list of storage failures 
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.public_deals_failures_get
            assert ("not_implemented", False)
        end
    
    test_public_miners_storage_query_miner_get
            -- Query Ask
            -- 
            -- This endpoint returns the ask for a given CID 
        local
            l_response: STRING_32
            l_miner: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_miner
                      
            -- l_response := api.public_miners_storage_query_miner_get(l_miner)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEALS_API
            -- Create an object instance of `DEALS_API'.
        once            
            create { DEALS_API } Result
        end

end
