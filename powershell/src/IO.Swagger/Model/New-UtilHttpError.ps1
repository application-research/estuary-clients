function New-UtilHttpError {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${code},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${details},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${reason}
    )

    Process {
        'Creating object: estuary_client.Model.UtilHttpError' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary_client.Model.UtilHttpError -ArgumentList @(
            ${code},
            ${details},
            ${reason}
        )
    }
}
