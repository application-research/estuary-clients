function Invoke-ContentApiContentAddCarPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${body},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filename},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${commp},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${size}
    )

    Process {
        'Calling method: ContentApi-ContentAddCarPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAddCarPost(
            ${body},
            ${filename},
            ${commp},
            ${size}
        )
    }
}

function Invoke-ContentApiContentAddIpfsPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [estuary_client.Model.UtilContentAddIpfsBody]
        ${body}
    )

    Process {
        'Calling method: ContentApi-ContentAddIpfsPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAddIpfsPost(
            ${body}
        )
    }
}

function Invoke-ContentApiContentAddPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${file},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${coluuid},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${dir}
    )

    Process {
        'Calling method: ContentApi-ContentAddPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAddPost(
            ${file},
            ${coluuid},
            ${dir}
        )
    }
}

function Invoke-ContentApiContentAggregatedContentGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${content}
    )

    Process {
        'Calling method: ContentApi-ContentAggregatedContentGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAggregatedContentGet(
            ${content}
        )
    }
}

function Invoke-ContentApiContentAllDealsGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${begin},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${duration},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${all}
    )

    Process {
        'Calling method: ContentApi-ContentAllDealsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAllDealsGet(
            ${begin},
            ${duration},
            ${all}
        )
    }
}

function Invoke-ContentApiContentBwUsageContentGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${content}
    )

    Process {
        'Calling method: ContentApi-ContentBwUsageContentGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentBwUsageContentGet(
            ${content}
        )
    }
}

function Invoke-ContentApiContentCreatePost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${body}
    )

    Process {
        'Calling method: ContentApi-ContentCreatePost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentCreatePost(
            ${body}
        )
    }
}

function Invoke-ContentApiContentDealsGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${limit},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${offset}
    )

    Process {
        'Calling method: ContentApi-ContentDealsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentDealsGet(
            ${limit},
            ${offset}
        )
    }
}

function Invoke-ContentApiContentEnsureReplicationDatacidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${datacid}
    )

    Process {
        'Calling method: ContentApi-ContentEnsureReplicationDatacidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentEnsureReplicationDatacidGet(
            ${datacid}
        )
    }
}

function Invoke-ContentApiContentFailuresContentGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${content}
    )

    Process {
        'Calling method: ContentApi-ContentFailuresContentGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentFailuresContentGet(
            ${content}
        )
    }
}

function Invoke-ContentApiContentImportdealPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [estuary_client.Model.MainImportDealBody]
        ${body}
    )

    Process {
        'Calling method: ContentApi-ContentImportdealPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentImportdealPost(
            ${body}
        )
    }
}

function Invoke-ContentApiContentListGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: ContentApi-ContentListGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentListGet(
        )
    }
}

function Invoke-ContentApiContentReadContGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${cont}
    )

    Process {
        'Calling method: ContentApi-ContentReadContGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentReadContGet(
            ${cont}
        )
    }
}

function Invoke-ContentApiContentStagingZonesGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: ContentApi-ContentStagingZonesGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentStagingZonesGet(
        )
    }
}

function Invoke-ContentApiContentStatsGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${limit}
    )

    Process {
        'Calling method: ContentApi-ContentStatsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentStatsGet(
            ${limit}
        )
    }
}

function Invoke-ContentApiContentStatusIdGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${id}
    )

    Process {
        'Calling method: ContentApi-ContentStatusIdGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentStatusIdGet(
            ${id}
        )
    }
}

