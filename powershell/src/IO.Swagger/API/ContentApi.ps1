function Invoke-ContentApiContentAddCarPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${body},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${ignoreDupes},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filename}
    )

    Process {
        'Calling method: ContentApi-ContentAddCarPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAddCarPost(
            ${body},
            ${ignoreDupes},
            ${filename}
        )
    }
}

function Invoke-ContentApiContentAddIpfsPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [estuary-client.Model.UtilContentAddIpfsBody]
        ${body},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${ignoreDupes}
    )

    Process {
        'Calling method: ContentApi-ContentAddIpfsPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAddIpfsPost(
            ${body},
            ${ignoreDupes}
        )
    }
}

function Invoke-ContentApiContentAddPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${data},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${filename},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${coluuid},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${replication},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${ignoreDupes},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${lazyProvide},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${dir}
    )

    Process {
        'Calling method: ContentApi-ContentAddPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentAddPost(
            ${data},
            ${filename},
            ${coluuid},
            ${replication},
            ${ignoreDupes},
            ${lazyProvide},
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
        [estuary-client.Model.UtilContentCreateBody]
        ${req},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${ignoreDupes}
    )

    Process {
        'Calling method: ContentApi-ContentCreatePost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentCreatePost(
            ${req},
            ${ignoreDupes}
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

function Invoke-ContentApiContentIdGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${id}
    )

    Process {
        'Calling method: ContentApi-ContentIdGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentIdGet(
            ${id}
        )
    }
}

function Invoke-ContentApiContentImportdealPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [estuary-client.Model.MainImportDealBody]
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
        ${limit},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${offset}
    )

    Process {
        'Calling method: ContentApi-ContentStatsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ContentApi.ContentStatsGet(
            ${limit},
            ${offset}
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

