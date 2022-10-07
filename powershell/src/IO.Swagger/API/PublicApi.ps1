function Invoke-PublicApiPublicByCidCidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${cid}
    )

    Process {
        'Calling method: PublicApi-PublicByCidCidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicByCidCidGet(
            ${cid}
        )
    }
}

function Invoke-PublicApiPublicInfoGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PublicApi-PublicInfoGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicInfoGet(
        )
    }
}

function Invoke-PublicApiPublicMetricsDealsOnChainGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PublicApi-PublicMetricsDealsOnChainGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicMetricsDealsOnChainGet(
        )
    }
}

function Invoke-PublicApiPublicMinersDealsMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: PublicApi-PublicMinersDealsMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicMinersDealsMinerGet(
            ${miner}
        )
    }
}

function Invoke-PublicApiPublicMinersFailuresMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: PublicApi-PublicMinersFailuresMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicMinersFailuresMinerGet(
            ${miner}
        )
    }
}

function Invoke-PublicApiPublicMinersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PublicApi-PublicMinersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicMinersGet(
        )
    }
}

function Invoke-PublicApiPublicMinersStatsMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: PublicApi-PublicMinersStatsMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicMinersStatsMinerGet(
            ${miner}
        )
    }
}

function Invoke-PublicApiPublicNetAddrsGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PublicApi-PublicNetAddrsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicNetAddrsGet(
        )
    }
}

function Invoke-PublicApiPublicNetPeersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PublicApi-PublicNetPeersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicNetPeersGet(
        )
    }
}

function Invoke-PublicApiPublicStatsGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PublicApi-PublicStatsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PublicApi.PublicStatsGet(
        )
    }
}

