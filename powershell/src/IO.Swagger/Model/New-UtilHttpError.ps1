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
        'Creating object: estuary-client.Model.UtilHttpError' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.UtilHttpError -ArgumentList @(
            ${code},
            ${details},
            ${reason}
        )
    }
}
