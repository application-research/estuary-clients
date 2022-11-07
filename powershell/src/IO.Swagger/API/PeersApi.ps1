function Invoke-PeersApiAdminPeeringPeersDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean[]]
        ${peerIds}
    )

    Process {
        'Calling method: PeersApi-AdminPeeringPeersDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeersApi.AdminPeeringPeersDelete(
            ${peerIds}
        )
    }
}

function Invoke-PeersApiAdminPeeringPeersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeersApi-AdminPeeringPeersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeersApi.AdminPeeringPeersGet(
        )
    }
}

function Invoke-PeersApiAdminPeeringPeersPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeersApi-AdminPeeringPeersPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeersApi.AdminPeeringPeersPost(
        )
    }
}

function Invoke-PeersApiAdminPeeringStartPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeersApi-AdminPeeringStartPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeersApi.AdminPeeringStartPost(
        )
    }
}

function Invoke-PeersApiAdminPeeringStatusGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeersApi-AdminPeeringStatusGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeersApi.AdminPeeringStatusGet(
        )
    }
}

function Invoke-PeersApiAdminPeeringStopPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeersApi-AdminPeeringStopPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeersApi.AdminPeeringStopPost(
        )
    }
}

