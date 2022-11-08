function New-TypesIpfsPinStatusResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${created},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${delegates},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String]]
        ${info},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[estuary-client.Model.TypesIpfsPin]]
        ${pin},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${requestid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${status}
    )

    Process {
        'Creating object: estuary-client.Model.TypesIpfsPinStatusResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.TypesIpfsPinStatusResponse -ArgumentList @(
            ${created},
            ${delegates},
            ${info},
            ${pin},
            ${requestid},
            ${status}
        )
    }
}
