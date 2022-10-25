function New-MainUserStatsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${numPins},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalSize}
    )

    Process {
        'Creating object: estuary-client.Model.MainUserStatsResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.MainUserStatsResponse -ArgumentList @(
            ${numPins},
            ${totalSize}
        )
    }
}
