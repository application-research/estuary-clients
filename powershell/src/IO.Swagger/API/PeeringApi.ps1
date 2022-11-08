function Invoke-PeeringApiAdminPeeringPeersDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean[]]
        ${peerIds}
    )

    Process {
        'Calling method: PeeringApi-AdminPeeringPeersDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeeringApi.AdminPeeringPeersDelete(
            ${peerIds}
        )
    }
}

function Invoke-PeeringApiAdminPeeringPeersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeeringApi-AdminPeeringPeersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeeringApi.AdminPeeringPeersGet(
        )
    }
}

function Invoke-PeeringApiAdminPeeringPeersPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeeringApi-AdminPeeringPeersPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeeringApi.AdminPeeringPeersPost(
        )
    }
}

function Invoke-PeeringApiAdminPeeringStartPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeeringApi-AdminPeeringStartPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeeringApi.AdminPeeringStartPost(
        )
    }
}

function Invoke-PeeringApiAdminPeeringStatusGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeeringApi-AdminPeeringStatusGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeeringApi.AdminPeeringStatusGet(
        )
    }
}

function Invoke-PeeringApiAdminPeeringStopPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PeeringApi-AdminPeeringStopPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PeeringApi.AdminPeeringStopPost(
        )
    }
}

