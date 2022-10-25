function New-MainDeleteContentFromCollectionBody {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${by},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${value}
    )

    Process {
        'Creating object: estuary-client.Model.MainDeleteContentFromCollectionBody' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.MainDeleteContentFromCollectionBody -ArgumentList @(
            ${by},
            ${value}
        )
    }
}
