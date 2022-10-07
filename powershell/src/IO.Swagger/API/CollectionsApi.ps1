function Invoke-CollectionsApiCollectionsColuuidCommitPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${coluuid}
    )

    Process {
        'Calling method: CollectionsApi-CollectionsColuuidCommitPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CollectionsApi.CollectionsColuuidCommitPost(
            ${coluuid}
        )
    }
}

function Invoke-CollectionsApiCollectionsColuuidDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${coluuid}
    )

    Process {
        'Calling method: CollectionsApi-CollectionsColuuidDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CollectionsApi.CollectionsColuuidDelete(
            ${coluuid}
        )
    }
}

function Invoke-CollectionsApiCollectionsColuuidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${coluuid},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${dir}
    )

    Process {
        'Calling method: CollectionsApi-CollectionsColuuidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CollectionsApi.CollectionsColuuidGet(
            ${coluuid},
            ${dir}
        )
    }
}

function Invoke-CollectionsApiCollectionsColuuidPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32[]]
        ${body}
    )

    Process {
        'Calling method: CollectionsApi-CollectionsColuuidPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CollectionsApi.CollectionsColuuidPost(
            ${body}
        )
    }
}

function Invoke-CollectionsApiCollectionsFsAddPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${coluuid},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${content},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${path}
    )

    Process {
        'Calling method: CollectionsApi-CollectionsFsAddPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CollectionsApi.CollectionsFsAddPost(
            ${coluuid},
            ${content},
            ${path}
        )
    }
}

function Invoke-CollectionsApiCollectionsGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${id}
    )

    Process {
        'Calling method: CollectionsApi-CollectionsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CollectionsApi.CollectionsGet(
            ${id}
        )
    }
}

function Invoke-CollectionsApiCollectionsPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [IO.Swagger.Model.MainCreateCollectionBody]
        ${body}
    )

    Process {
        'Calling method: CollectionsApi-CollectionsPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:CollectionsApi.CollectionsPost(
            ${body}
        )
    }
}

