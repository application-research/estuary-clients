# This file is auto-generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'estuary-client MinerApi' {
    Context 'MinerApi' {
        It 'Invoke-MinerApiPublicMinersDealsMinerGet' {
            $ret = Invoke-PetApiGetPetById -miner "TEST_VALUE" -ignoreFailed "TEST_VALUE"
            #$ret | Should BeOfType estuary-client.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'MinerApi' {
        It 'Invoke-MinerApiPublicMinersStatsMinerGet' {
            $ret = Invoke-PetApiGetPetById -miner "TEST_VALUE"
            #$ret | Should BeOfType estuary-client.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
