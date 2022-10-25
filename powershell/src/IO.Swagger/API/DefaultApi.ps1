function Invoke-DefaultApiDealTransferStatusPost {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: DefaultApi-DealTransferStatusPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.DealTransferStatusPost(
        )
    }
}

