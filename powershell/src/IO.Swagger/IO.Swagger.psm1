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

'Creating object: IO.Swagger.Api.AdminApi' | Write-Verbose
$Script:AdminApi= New-Object -TypeName IO.Swagger.Api.AdminApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.AutoretrieveApi' | Write-Verbose
$Script:AutoretrieveApi= New-Object -TypeName IO.Swagger.Api.AutoretrieveApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.CollectionsApi' | Write-Verbose
$Script:CollectionsApi= New-Object -TypeName IO.Swagger.Api.CollectionsApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.ContentApi' | Write-Verbose
$Script:ContentApi= New-Object -TypeName IO.Swagger.Api.ContentApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.DealsApi' | Write-Verbose
$Script:DealsApi= New-Object -TypeName IO.Swagger.Api.DealsApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.MetricsApi' | Write-Verbose
$Script:MetricsApi= New-Object -TypeName IO.Swagger.Api.MetricsApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.MinerApi' | Write-Verbose
$Script:MinerApi= New-Object -TypeName IO.Swagger.Api.MinerApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.NetApi' | Write-Verbose
$Script:NetApi= New-Object -TypeName IO.Swagger.Api.NetApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.PeeringApi' | Write-Verbose
$Script:PeeringApi= New-Object -TypeName IO.Swagger.Api.PeeringApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.PeersApi' | Write-Verbose
$Script:PeersApi= New-Object -TypeName IO.Swagger.Api.PeersApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.PinningApi' | Write-Verbose
$Script:PinningApi= New-Object -TypeName IO.Swagger.Api.PinningApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.PublicApi' | Write-Verbose
$Script:PublicApi= New-Object -TypeName IO.Swagger.Api.PublicApi -ArgumentList @($null)

'Creating object: IO.Swagger.Api.UserApi' | Write-Verbose
$Script:UserApi= New-Object -TypeName IO.Swagger.Api.UserApi -ArgumentList @($null)


#endregion
