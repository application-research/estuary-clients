function New-UtilContentCreateBody {
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
        ${location},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${root},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${type}
    )

    Process {
        'Creating object: estuary-client.Model.UtilContentCreateBody' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName estuary-client.Model.UtilContentCreateBody -ArgumentList @(
            ${coluuid},
            ${dir},
            ${location},
            ${name},
            ${root},
            ${type}
        )
    }
}
