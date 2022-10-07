# Go API client for swagger

This is the API for the Estuary application.

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  By using the [swagger-spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: 0.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.GoClientCodegen
For more information, please visit [https://docs.estuary.tech/feedback](https://docs.estuary.tech/feedback)

## Installation
Put the package under your project folder and add the following in import:
```golang
import "./swagger"
```

## Documentation for API Endpoints

All URIs are relative to *https://api.estuary.tech*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**AdminPeeringPeersDelete**](docs/AdminApi.md#adminpeeringpeersdelete) | **Delete** /admin/peering/peers | Remove peers on Peering Service
*AdminApi* | [**AdminPeeringPeersGet**](docs/AdminApi.md#adminpeeringpeersget) | **Get** /admin/peering/peers | List all Peering peers
*AdminApi* | [**AdminPeeringPeersPost**](docs/AdminApi.md#adminpeeringpeerspost) | **Post** /admin/peering/peers | Add peers on Peering Service
*AdminApi* | [**AdminPeeringStartPost**](docs/AdminApi.md#adminpeeringstartpost) | **Post** /admin/peering/start | Start Peering
*AdminApi* | [**AdminPeeringStatusGet**](docs/AdminApi.md#adminpeeringstatusget) | **Get** /admin/peering/status | Check Peering Status
*AdminApi* | [**AdminPeeringStopPost**](docs/AdminApi.md#adminpeeringstoppost) | **Post** /admin/peering/stop | Stop Peering
*AdminApi* | [**AdminSystemConfigGet**](docs/AdminApi.md#adminsystemconfigget) | **Get** /admin/system/config | Get systems(estuary/shuttle) config
*AdminApi* | [**AdminUsersGet**](docs/AdminApi.md#adminusersget) | **Get** /admin/users | Get all users
*AutoretrieveApi* | [**AdminAutoretrieveInitPost**](docs/AutoretrieveApi.md#adminautoretrieveinitpost) | **Post** /admin/autoretrieve/init | Register autoretrieve server
*AutoretrieveApi* | [**AdminAutoretrieveListGet**](docs/AutoretrieveApi.md#adminautoretrievelistget) | **Get** /admin/autoretrieve/list | List autoretrieve servers
*AutoretrieveApi* | [**AutoretrieveHeartbeatPost**](docs/AutoretrieveApi.md#autoretrieveheartbeatpost) | **Post** /autoretrieve/heartbeat | Marks autoretrieve server as up
*CollectionsApi* | [**CollectionsColuuidCommitPost**](docs/CollectionsApi.md#collectionscoluuidcommitpost) | **Post** /collections/{coluuid}/commit | Produce a CID of the collection contents
*CollectionsApi* | [**CollectionsColuuidDelete**](docs/CollectionsApi.md#collectionscoluuiddelete) | **Delete** /collections/{coluuid} | Deletes a collection
*CollectionsApi* | [**CollectionsColuuidGet**](docs/CollectionsApi.md#collectionscoluuidget) | **Get** /collections/{coluuid} | Get contents in a collection
*CollectionsApi* | [**CollectionsColuuidPost**](docs/CollectionsApi.md#collectionscoluuidpost) | **Post** /collections/{coluuid} | Add contents to a collection
*CollectionsApi* | [**CollectionsFsAddPost**](docs/CollectionsApi.md#collectionsfsaddpost) | **Post** /collections/fs/add | Add a file to a collection
*CollectionsApi* | [**CollectionsGet**](docs/CollectionsApi.md#collectionsget) | **Get** /collections/ | List all collections
*CollectionsApi* | [**CollectionsPost**](docs/CollectionsApi.md#collectionspost) | **Post** /collections/ | Create a new collection
*ContentApi* | [**ContentAddCarPost**](docs/ContentApi.md#contentaddcarpost) | **Post** /content/add-car | Add Car object
*ContentApi* | [**ContentAddIpfsPost**](docs/ContentApi.md#contentaddipfspost) | **Post** /content/add-ipfs | Add IPFS object
*ContentApi* | [**ContentAddPost**](docs/ContentApi.md#contentaddpost) | **Post** /content/add | Add new content
*ContentApi* | [**ContentAggregatedContentGet**](docs/ContentApi.md#contentaggregatedcontentget) | **Get** /content/aggregated/{content} | Get aggregated content stats
*ContentApi* | [**ContentAllDealsGet**](docs/ContentApi.md#contentalldealsget) | **Get** /content/all-deals | Get all deals for a user
*ContentApi* | [**ContentBwUsageContentGet**](docs/ContentApi.md#contentbwusagecontentget) | **Get** /content/bw-usage/{content} | Get content bandwidth
*ContentApi* | [**ContentCreatePost**](docs/ContentApi.md#contentcreatepost) | **Post** /content/create | Add a new content
*ContentApi* | [**ContentDealsGet**](docs/ContentApi.md#contentdealsget) | **Get** /content/deals | Content with deals
*ContentApi* | [**ContentEnsureReplicationDatacidGet**](docs/ContentApi.md#contentensurereplicationdatacidget) | **Get** /content/ensure-replication/{datacid} | Ensure Replication
*ContentApi* | [**ContentFailuresContentGet**](docs/ContentApi.md#contentfailurescontentget) | **Get** /content/failures/{content} | List all failures for a content
*ContentApi* | [**ContentImportdealPost**](docs/ContentApi.md#contentimportdealpost) | **Post** /content/importdeal | Import a deal
*ContentApi* | [**ContentListGet**](docs/ContentApi.md#contentlistget) | **Get** /content/list | List all pinned content
*ContentApi* | [**ContentReadContGet**](docs/ContentApi.md#contentreadcontget) | **Get** /content/read/{cont} | Read content
*ContentApi* | [**ContentStagingZonesGet**](docs/ContentApi.md#contentstagingzonesget) | **Get** /content/staging-zones | Get staging zone for user
*ContentApi* | [**ContentStatsGet**](docs/ContentApi.md#contentstatsget) | **Get** /content/stats | Get content statistics
*ContentApi* | [**ContentStatusIdGet**](docs/ContentApi.md#contentstatusidget) | **Get** /content/status/{id} | Content Status
*DealsApi* | [**DealEstimatePost**](docs/DealsApi.md#dealestimatepost) | **Post** /deal/estimate | Estimate the cost of a deal
*DealsApi* | [**DealInfoDealidGet**](docs/DealsApi.md#dealinfodealidget) | **Get** /deal/info/{dealid} | Get Deal Info
*DealsApi* | [**DealProposalPropcidGet**](docs/DealsApi.md#dealproposalpropcidget) | **Get** /deal/proposal/{propcid} | Get Proposal
*DealsApi* | [**DealQueryMinerGet**](docs/DealsApi.md#dealqueryminerget) | **Get** /deal/query/{miner} | Query Ask
*DealsApi* | [**DealStatusByProposalPropcidGet**](docs/DealsApi.md#dealstatusbyproposalpropcidget) | **Get** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
*DealsApi* | [**DealStatusMinerPropcidGet**](docs/DealsApi.md#dealstatusminerpropcidget) | **Get** /deal/status/{miner}/{propcid} | Deal Status
*DealsApi* | [**DealTransferInProgressGet**](docs/DealsApi.md#dealtransferinprogressget) | **Get** /deal/transfer/in-progress | Transfer In Progress
*DealsApi* | [**DealTransferStatusPost**](docs/DealsApi.md#dealtransferstatuspost) | **Post** /deal/transfer/status | Transfer Status
*DealsApi* | [**DealsFailuresGet**](docs/DealsApi.md#dealsfailuresget) | **Get** /deals/failures | Get storage failures for user
*DealsApi* | [**DealsMakeMinerPost**](docs/DealsApi.md#dealsmakeminerpost) | **Post** /deals/make/{miner} | Make Deal
*DealsApi* | [**DealsStatusDealGet**](docs/DealsApi.md#dealsstatusdealget) | **Get** /deals/status/{deal} | Get Deal Status
*DealsApi* | [**PublicDealsFailuresGet**](docs/DealsApi.md#publicdealsfailuresget) | **Get** /public/deals/failures | Get storage failures
*DealsApi* | [**PublicMinersStorageQueryMinerGet**](docs/DealsApi.md#publicminersstoragequeryminerget) | **Get** /public/miners/storage/query/{miner} | Query Ask
*MetricsApi* | [**PublicMetricsDealsOnChainGet**](docs/MetricsApi.md#publicmetricsdealsonchainget) | **Get** /public/metrics/deals-on-chain | Get deal metrics
*MinerApi* | [**PublicMinersDealsMinerGet**](docs/MinerApi.md#publicminersdealsminerget) | **Get** /public/miners/deals/{miner} | Get all miners deals
*MinerApi* | [**PublicMinersStatsMinerGet**](docs/MinerApi.md#publicminersstatsminerget) | **Get** /public/miners/stats/{miner} | Get miner stats
*NetApi* | [**NetAddrsGet**](docs/NetApi.md#netaddrsget) | **Get** /net/addrs | Net Addrs
*NetApi* | [**PublicMinersFailuresMinerGet**](docs/NetApi.md#publicminersfailuresminerget) | **Get** /public/miners/failures/{miner} | Get all miners
*NetApi* | [**PublicMinersGet**](docs/NetApi.md#publicminersget) | **Get** /public/miners | Get all miners
*NetApi* | [**PublicNetAddrsGet**](docs/NetApi.md#publicnetaddrsget) | **Get** /public/net/addrs | Net Addrs
*NetApi* | [**PublicNetPeersGet**](docs/NetApi.md#publicnetpeersget) | **Get** /public/net/peers | Net Peers
*PeeringApi* | [**AdminPeeringPeersDelete**](docs/PeeringApi.md#adminpeeringpeersdelete) | **Delete** /admin/peering/peers | Remove peers on Peering Service
*PeeringApi* | [**AdminPeeringPeersGet**](docs/PeeringApi.md#adminpeeringpeersget) | **Get** /admin/peering/peers | List all Peering peers
*PeeringApi* | [**AdminPeeringPeersPost**](docs/PeeringApi.md#adminpeeringpeerspost) | **Post** /admin/peering/peers | Add peers on Peering Service
*PeeringApi* | [**AdminPeeringStartPost**](docs/PeeringApi.md#adminpeeringstartpost) | **Post** /admin/peering/start | Start Peering
*PeeringApi* | [**AdminPeeringStatusGet**](docs/PeeringApi.md#adminpeeringstatusget) | **Get** /admin/peering/status | Check Peering Status
*PeeringApi* | [**AdminPeeringStopPost**](docs/PeeringApi.md#adminpeeringstoppost) | **Post** /admin/peering/stop | Stop Peering
*PeersApi* | [**AdminPeeringPeersDelete**](docs/PeersApi.md#adminpeeringpeersdelete) | **Delete** /admin/peering/peers | Remove peers on Peering Service
*PeersApi* | [**AdminPeeringPeersGet**](docs/PeersApi.md#adminpeeringpeersget) | **Get** /admin/peering/peers | List all Peering peers
*PeersApi* | [**AdminPeeringPeersPost**](docs/PeersApi.md#adminpeeringpeerspost) | **Post** /admin/peering/peers | Add peers on Peering Service
*PeersApi* | [**AdminPeeringStartPost**](docs/PeersApi.md#adminpeeringstartpost) | **Post** /admin/peering/start | Start Peering
*PeersApi* | [**AdminPeeringStatusGet**](docs/PeersApi.md#adminpeeringstatusget) | **Get** /admin/peering/status | Check Peering Status
*PeersApi* | [**AdminPeeringStopPost**](docs/PeersApi.md#adminpeeringstoppost) | **Post** /admin/peering/stop | Stop Peering
*PinningApi* | [**PinningPinsGet**](docs/PinningApi.md#pinningpinsget) | **Get** /pinning/pins | List all pin status objects
*PinningApi* | [**PinningPinsPinidDelete**](docs/PinningApi.md#pinningpinspiniddelete) | **Delete** /pinning/pins/{pinid} | Delete a pinned object
*PinningApi* | [**PinningPinsPinidGet**](docs/PinningApi.md#pinningpinspinidget) | **Get** /pinning/pins/{pinid} | Get a pin status object
*PinningApi* | [**PinningPinsPinidPost**](docs/PinningApi.md#pinningpinspinidpost) | **Post** /pinning/pins/{pinid} | Replace a pinned object
*PinningApi* | [**PinningPinsPost**](docs/PinningApi.md#pinningpinspost) | **Post** /pinning/pins | Add and pin object
*PublicApi* | [**PublicByCidCidGet**](docs/PublicApi.md#publicbycidcidget) | **Get** /public/by-cid/{cid} | Get Content by Cid
*PublicApi* | [**PublicInfoGet**](docs/PublicApi.md#publicinfoget) | **Get** /public/info | Get public node info
*PublicApi* | [**PublicMetricsDealsOnChainGet**](docs/PublicApi.md#publicmetricsdealsonchainget) | **Get** /public/metrics/deals-on-chain | Get deal metrics
*PublicApi* | [**PublicMinersDealsMinerGet**](docs/PublicApi.md#publicminersdealsminerget) | **Get** /public/miners/deals/{miner} | Get all miners deals
*PublicApi* | [**PublicMinersFailuresMinerGet**](docs/PublicApi.md#publicminersfailuresminerget) | **Get** /public/miners/failures/{miner} | Get all miners
*PublicApi* | [**PublicMinersGet**](docs/PublicApi.md#publicminersget) | **Get** /public/miners | Get all miners
*PublicApi* | [**PublicMinersStatsMinerGet**](docs/PublicApi.md#publicminersstatsminerget) | **Get** /public/miners/stats/{miner} | Get miner stats
*PublicApi* | [**PublicNetAddrsGet**](docs/PublicApi.md#publicnetaddrsget) | **Get** /public/net/addrs | Net Addrs
*PublicApi* | [**PublicNetPeersGet**](docs/PublicApi.md#publicnetpeersget) | **Get** /public/net/peers | Net Peers
*PublicApi* | [**PublicStatsGet**](docs/PublicApi.md#publicstatsget) | **Get** /public/stats | Public stats
*UserApi* | [**UserApiKeysGet**](docs/UserApi.md#userapikeysget) | **Get** /user/api-keys | Get API keys for a user
*UserApi* | [**UserApiKeysKeyDelete**](docs/UserApi.md#userapikeyskeydelete) | **Delete** /user/api-keys/{key} | Revoke a User API Key.
*UserApi* | [**UserApiKeysPost**](docs/UserApi.md#userapikeyspost) | **Post** /user/api-keys | Create API keys for a user
*UserApi* | [**UserExportGet**](docs/UserApi.md#userexportget) | **Get** /user/export | Export user data
*UserApi* | [**UserStatsGet**](docs/UserApi.md#userstatsget) | **Get** /user/stats | Create API keys for a user


## Documentation For Models

 - [MainCollection](docs/MainCollection.md)
 - [MainCreateCollectionBody](docs/MainCreateCollectionBody.md)
 - [MainEstimateDealBody](docs/MainEstimateDealBody.md)
 - [MainGetApiKeysResp](docs/MainGetApiKeysResp.md)
 - [MainImportDealBody](docs/MainImportDealBody.md)
 - [MainUserStatsResponse](docs/MainUserStatsResponse.md)
 - [UtilContentAddIpfsBody](docs/UtilContentAddIpfsBody.md)
 - [UtilContentAddResponse](docs/UtilContentAddResponse.md)
 - [UtilHttpError](docs/UtilHttpError.md)


## Documentation For Authorization

## bearerAuth
- **Type**: API key 

Example
```golang
auth := context.WithValue(context.Background(), sw.ContextAPIKey, sw.APIKey{
	Key: "APIKEY",
	Prefix: "Bearer", // Omit if not necessary.
})
r, err := client.Service.Operation(auth, args)
```

## Author


