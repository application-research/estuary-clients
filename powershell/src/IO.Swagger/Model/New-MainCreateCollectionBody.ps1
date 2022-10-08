function New-MainCreateCollectionBody {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name}
    )

    Process {
        'Creating object: estuary_client.Model.MainCreateCollectionBody' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary_client.Model.MainCreateCollectionBody -ArgumentList @(
            ${description},
            ${name}
        )
    }
}
