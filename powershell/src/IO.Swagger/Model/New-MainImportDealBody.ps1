function New-MainImportDealBody {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${coluuid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32[]]]
        ${dealIDs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dir},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name}
    )

    Process {
        'Creating object: estuary-client.Model.MainImportDealBody' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.MainImportDealBody -ArgumentList @(
            ${coluuid},
            ${dealIDs},
            ${dir},
            ${name}
        )
    }
}
