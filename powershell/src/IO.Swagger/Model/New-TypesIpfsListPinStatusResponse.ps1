function New-TypesIpfsListPinStatusResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${count},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[estuary-client.Model.TypesIpfsPinStatusResponse[]]]
        ${results}
    )

    Process {
        'Creating object: estuary-client.Model.TypesIpfsListPinStatusResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.TypesIpfsListPinStatusResponse -ArgumentList @(
            ${count},
            ${results}
        )
    }
}
