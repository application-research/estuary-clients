function New-MainGetApiKeysResp {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${expiry},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${token}
    )

    Process {
        'Creating object: estuary-client.Model.MainGetApiKeysResp' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.MainGetApiKeysResp -ArgumentList @(
            ${expiry},
            ${token}
        )
    }
}
