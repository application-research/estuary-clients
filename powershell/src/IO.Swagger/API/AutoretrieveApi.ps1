function Invoke-AutoretrieveApiAdminAutoretrieveInitPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${addresses},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${pubKey}
    )

    Process {
        'Calling method: AutoretrieveApi-AdminAutoretrieveInitPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AutoretrieveApi.AdminAutoretrieveInitPost(
            ${addresses},
            ${pubKey}
        )
    }
}

function Invoke-AutoretrieveApiAdminAutoretrieveListGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AutoretrieveApi-AdminAutoretrieveListGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AutoretrieveApi.AdminAutoretrieveListGet(
        )
    }
}

function Invoke-AutoretrieveApiAutoretrieveHeartbeatPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${token}
    )

    Process {
        'Calling method: AutoretrieveApi-AutoretrieveHeartbeatPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AutoretrieveApi.AutoretrieveHeartbeatPost(
            ${token}
        )
    }
}

