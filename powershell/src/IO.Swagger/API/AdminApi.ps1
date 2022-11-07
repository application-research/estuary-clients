function Invoke-AdminApiAdminPeeringPeersDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean[]]
        ${peerIds}
    )

    Process {
        'Calling method: AdminApi-AdminPeeringPeersDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminPeeringPeersDelete(
            ${peerIds}
        )
    }
}

function Invoke-AdminApiAdminPeeringPeersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AdminApi-AdminPeeringPeersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminPeeringPeersGet(
        )
    }
}

function Invoke-AdminApiAdminPeeringPeersPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AdminApi-AdminPeeringPeersPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminPeeringPeersPost(
        )
    }
}

function Invoke-AdminApiAdminPeeringStartPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AdminApi-AdminPeeringStartPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminPeeringStartPost(
        )
    }
}

function Invoke-AdminApiAdminPeeringStatusGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AdminApi-AdminPeeringStatusGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminPeeringStatusGet(
        )
    }
}

function Invoke-AdminApiAdminPeeringStopPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AdminApi-AdminPeeringStopPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminPeeringStopPost(
        )
    }
}

function Invoke-AdminApiAdminSystemConfigGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AdminApi-AdminSystemConfigGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminSystemConfigGet(
        )
    }
}

function Invoke-AdminApiAdminUsersGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: AdminApi-AdminUsersGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AdminApi.AdminUsersGet(
        )
    }
}

