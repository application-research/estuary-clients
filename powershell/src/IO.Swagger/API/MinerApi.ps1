function Invoke-MinerApiPublicMinersDealsMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: MinerApi-PublicMinersDealsMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:MinerApi.PublicMinersDealsMinerGet(
            ${miner}
        )
    }
}

function Invoke-MinerApiPublicMinersStatsMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner}
    )

    Process {
        'Calling method: MinerApi-PublicMinersStatsMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:MinerApi.PublicMinersStatsMinerGet(
            ${miner}
        )
    }
}

