function Invoke-NetApiNetAddrsGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: NetApi-NetAddrsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NetApi.NetAddrsGet(
        )
    }
}

function Invoke-NetApiPublicMinersFailuresMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: NetApi-PublicMinersFailuresMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NetApi.PublicMinersFailuresMinerGet(
            ${miner}
        )
    }
}

function Invoke-NetApiPublicMinersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: NetApi-PublicMinersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NetApi.PublicMinersGet(
        )
    }
}

function Invoke-NetApiPublicNetAddrsGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: NetApi-PublicNetAddrsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NetApi.PublicNetAddrsGet(
        )
    }
}

function Invoke-NetApiPublicNetPeersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: NetApi-PublicNetPeersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:NetApi.PublicNetPeersGet(
        )
    }
}

