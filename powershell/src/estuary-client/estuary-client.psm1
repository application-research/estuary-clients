#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: estuary-client.Api.AdminApi' | Write-Verbose
$Script:AdminApi= New-Object -TypeName estuary-client.Api.AdminApi -ArgumentList @($null)

'Creating object: estuary-client.Api.AutoretrieveApi' | Write-Verbose
$Script:AutoretrieveApi= New-Object -TypeName estuary-client.Api.AutoretrieveApi -ArgumentList @($null)

'Creating object: estuary-client.Api.CollectionsApi' | Write-Verbose
$Script:CollectionsApi= New-Object -TypeName estuary-client.Api.CollectionsApi -ArgumentList @($null)

'Creating object: estuary-client.Api.ContentApi' | Write-Verbose
$Script:ContentApi= New-Object -TypeName estuary-client.Api.ContentApi -ArgumentList @($null)

'Creating object: estuary-client.Api.DealsApi' | Write-Verbose
$Script:DealsApi= New-Object -TypeName estuary-client.Api.DealsApi -ArgumentList @($null)

'Creating object: estuary-client.Api.MetricsApi' | Write-Verbose
$Script:MetricsApi= New-Object -TypeName estuary-client.Api.MetricsApi -ArgumentList @($null)

'Creating object: estuary-client.Api.MinerApi' | Write-Verbose
$Script:MinerApi= New-Object -TypeName estuary-client.Api.MinerApi -ArgumentList @($null)

'Creating object: estuary-client.Api.NetApi' | Write-Verbose
$Script:NetApi= New-Object -TypeName estuary-client.Api.NetApi -ArgumentList @($null)

'Creating object: estuary-client.Api.PeeringApi' | Write-Verbose
$Script:PeeringApi= New-Object -TypeName estuary-client.Api.PeeringApi -ArgumentList @($null)

'Creating object: estuary-client.Api.PeersApi' | Write-Verbose
$Script:PeersApi= New-Object -TypeName estuary-client.Api.PeersApi -ArgumentList @($null)

'Creating object: estuary-client.Api.PinningApi' | Write-Verbose
$Script:PinningApi= New-Object -TypeName estuary-client.Api.PinningApi -ArgumentList @($null)

'Creating object: estuary-client.Api.PublicApi' | Write-Verbose
$Script:PublicApi= New-Object -TypeName estuary-client.Api.PublicApi -ArgumentList @($null)

'Creating object: estuary-client.Api.UserApi' | Write-Verbose
$Script:UserApi= New-Object -TypeName estuary-client.Api.UserApi -ArgumentList @($null)


#endregion
