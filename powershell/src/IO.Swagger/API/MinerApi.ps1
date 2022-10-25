function Invoke-MinerApiPublicMinersDealsMinerGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${miner},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${ignoreFailed}
    )

    Process {
        'Calling method: MinerApi-PublicMinersDealsMinerGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:MinerApi.PublicMinersDealsMinerGet(
            ${miner},
            ${ignoreFailed}
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

