function Invoke-PinningApiPinningPinsGet {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: PinningApi-PinningPinsGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PinningApi.PinningPinsGet(
        )
    }
}

function Invoke-PinningApiPinningPinsPinidDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${pinid}
    )

    Process {
        'Calling method: PinningApi-PinningPinsPinidDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PinningApi.PinningPinsPinidDelete(
            ${pinid}
        )
    }
}

function Invoke-PinningApiPinningPinsPinidGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${pinid}
    )

    Process {
        'Calling method: PinningApi-PinningPinsPinidGet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PinningApi.PinningPinsPinidGet(
            ${pinid}
        )
    }
}

function Invoke-PinningApiPinningPinsPinidPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${pinid},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${cid},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${name},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${origins},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${meta}
    )

    Process {
        'Calling method: PinningApi-PinningPinsPinidPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PinningApi.PinningPinsPinidPost(
            ${pinid},
            ${cid},
            ${name},
            ${origins},
            ${meta}
        )
    }
}

function Invoke-PinningApiPinningPinsPost {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [estuary-client.Model.TypesIpfsPin]
        ${pin}
    )

    Process {
        'Calling method: PinningApi-PinningPinsPost' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PinningApi.PinningPinsPost(
            ${pin}
        )
    }
}

