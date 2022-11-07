function New-MainChannelIDParam {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${initiator},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${responder}
    )

    Process {
        'Creating object: estuary-client.Model.MainChannelIDParam' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.MainChannelIDParam -ArgumentList @(
            ${id},
            ${initiator},
            ${responder}
        )
    }
}
