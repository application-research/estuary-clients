function New-UtilContentAddIpfsBody {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${coluuid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dir},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${filename},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${peers},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${root}
    )

    Process {
        'Creating object: estuary-client.Model.UtilContentAddIpfsBody' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.UtilContentAddIpfsBody -ArgumentList @(
            ${coluuid},
            ${dir},
            ${filename},
            ${peers},
            ${root}
        )
    }
}
