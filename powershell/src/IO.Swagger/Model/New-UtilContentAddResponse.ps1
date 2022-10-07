function New-UtilContentAddResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${cid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${estuaryId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${providers},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${retrieval_url}
    )

    Process {
        'Creating object: IO.Swagger.Model.UtilContentAddResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName IO.Swagger.Model.UtilContentAddResponse -ArgumentList @(
            ${cid},
            ${estuaryId},
            ${providers},
            ${retrieval_url}
        )
    }
}
