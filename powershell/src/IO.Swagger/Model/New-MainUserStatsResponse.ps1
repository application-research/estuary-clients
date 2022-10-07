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
        'Creating object: IO.Swagger.Model.MainUserStatsResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName IO.Swagger.Model.MainUserStatsResponse -ArgumentList @(
            ${numPins},
            ${totalSize}
        )
    }
}
