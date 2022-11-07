function Invoke-DealsApiDealEstimatePost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [estuary-client.Model.MainEstimateDealBody]
        ${body}
    )

    Process {
        'Calling method: DealsApi-DealEstimatePost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealEstimatePost(
            ${body}
        )
    }
}

function Invoke-DealsApiDealInfoDealidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${dealid}
    )

    Process {
        'Calling method: DealsApi-DealInfoDealidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealInfoDealidGet(
            ${dealid}
        )
    }
}

function Invoke-DealsApiDealProposalPropcidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${propcid}
    )

    Process {
        'Calling method: DealsApi-DealProposalPropcidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealProposalPropcidGet(
            ${propcid}
        )
    }
}

function Invoke-DealsApiDealQueryMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: DealsApi-DealQueryMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealQueryMinerGet(
            ${miner}
        )
    }
}

function Invoke-DealsApiDealStatusByProposalPropcidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${propcid}
    )

    Process {
        'Calling method: DealsApi-DealStatusByProposalPropcidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealStatusByProposalPropcidGet(
            ${propcid}
        )
    }
}

function Invoke-DealsApiDealStatusMinerPropcidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${propcid}
    )

    Process {
        'Calling method: DealsApi-DealStatusMinerPropcidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealStatusMinerPropcidGet(
            ${miner},
            ${propcid}
        )
    }
}

function Invoke-DealsApiDealTransferInProgressGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: DealsApi-DealTransferInProgressGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealTransferInProgressGet(
        )
    }
}

function Invoke-DealsApiDealTransferStatusPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [estuary-client.Model.MainChannelIDParam]
        ${chanid}
    )

    Process {
        'Calling method: DealsApi-DealTransferStatusPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealTransferStatusPost(
            ${chanid}
        )
    }
}

function Invoke-DealsApiDealsFailuresGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: DealsApi-DealsFailuresGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealsFailuresGet(
        )
    }
}

function Invoke-DealsApiDealsMakeMinerPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${dealRequest}
    )

    Process {
        'Calling method: DealsApi-DealsMakeMinerPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealsMakeMinerPost(
            ${miner},
            ${dealRequest}
        )
    }
}

function Invoke-DealsApiDealsStatusDealGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${deal}
    )

    Process {
        'Calling method: DealsApi-DealsStatusDealGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.DealsStatusDealGet(
            ${deal}
        )
    }
}

function Invoke-DealsApiPublicDealsFailuresGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: DealsApi-PublicDealsFailuresGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.PublicDealsFailuresGet(
        )
    }
}

function Invoke-DealsApiPublicMinersStorageQueryMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: DealsApi-PublicMinersStorageQueryMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DealsApi.PublicMinersStorageQueryMinerGet(
            ${miner}
        )
    }
}

