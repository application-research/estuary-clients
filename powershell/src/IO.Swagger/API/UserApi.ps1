function Invoke-UserApiUserApiKeysGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: UserApi-UserApiKeysGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UserApi.UserApiKeysGet(
        )
    }
}

function Invoke-UserApiUserApiKeysKeyDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${key}
    )

    Process {
        'Calling method: UserApi-UserApiKeysKeyDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UserApi.UserApiKeysKeyDelete(
            ${key}
        )
    }
}

function Invoke-UserApiUserApiKeysPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${expiry},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${perms}
    )

    Process {
        'Calling method: UserApi-UserApiKeysPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UserApi.UserApiKeysPost(
            ${expiry},
            ${perms}
        )
    }
}

function Invoke-UserApiUserExportGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: UserApi-UserExportGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UserApi.UserExportGet(
        )
    }
}

function Invoke-UserApiUserStatsGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: UserApi-UserStatsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:UserApi.UserStatsGet(
        )
    }
}

