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
        'Creating object: IO.Swagger.Model.MainGetApiKeysResp' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName IO.Swagger.Model.MainGetApiKeysResp -ArgumentList @(
            ${expiry},
            ${token}
        )
    }
}
