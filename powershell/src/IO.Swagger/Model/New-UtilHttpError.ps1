function New-UtilHttpError {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${code},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${details},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${reason}
    )

    Process {
        'Creating object: IO.Swagger.Model.UtilHttpError' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName IO.Swagger.Model.UtilHttpError -ArgumentList @(
            ${code},
            ${details},
            ${reason}
        )
    }
}
