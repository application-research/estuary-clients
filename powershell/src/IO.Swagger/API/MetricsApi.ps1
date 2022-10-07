function Invoke-MetricsApiPublicMetricsDealsOnChainGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: MetricsApi-PublicMetricsDealsOnChainGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:MetricsApi.PublicMetricsDealsOnChainGet(
        )
    }
}

