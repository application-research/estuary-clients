# estuary-client - Kotlin client library for Estuary API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *//api.estuary.tech/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminPeeringPeersDelete**](docs/AdminApi.md#adminpeeringpeersdelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*AdminApi* | [**adminPeeringPeersGet**](docs/AdminApi.md#adminpeeringpeersget) | **GET** /admin/peering/peers | List all Peering peers
*AdminApi* | [**adminPeeringPeersPost**](docs/AdminApi.md#adminpeeringpeerspost) | **POST** /admin/peering/peers | Add peers on Peering Service
*AdminApi* | [**adminPeeringStartPost**](docs/AdminApi.md#adminpeeringstartpost) | **POST** /admin/peering/start | Start Peering
*AdminApi* | [**adminPeeringStatusGet**](docs/AdminApi.md#adminpeeringstatusget) | **GET** /admin/peering/status | Check Peering Status
*AdminApi* | [**adminPeeringStopPost**](docs/AdminApi.md#adminpeeringstoppost) | **POST** /admin/peering/stop | Stop Peering
*AdminApi* | [**adminSystemConfigGet**](docs/AdminApi.md#adminsystemconfigget) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
*AdminApi* | [**adminUsersGet**](docs/AdminApi.md#adminusersget) | **GET** /admin/users | Get all users
*AutoretrieveApi* | [**adminAutoretrieveInitPost**](docs/AutoretrieveApi.md#adminautoretrieveinitpost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
*AutoretrieveApi* | [**adminAutoretrieveListGet**](docs/AutoretrieveApi.md#adminautoretrievelistget) | **GET** /admin/autoretrieve/list | List autoretrieve servers
*AutoretrieveApi* | [**autoretrieveHeartbeatPost**](docs/AutoretrieveApi.md#autoretrieveheartbeatpost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up
*CollectionsApi* | [**collectionsColuuidCommitPost**](docs/CollectionsApi.md#collectionscoluuidcommitpost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
*CollectionsApi* | [**collectionsColuuidContentsDelete**](docs/CollectionsApi.md#collectionscoluuidcontentsdelete) | **DELETE** /collections/{coluuid}/contents | Deletes a content from a collection
*CollectionsApi* | [**collectionsColuuidDelete**](docs/CollectionsApi.md#collectionscoluuiddelete) | **DELETE** /collections/{coluuid} | Deletes a collection
*CollectionsApi* | [**collectionsColuuidGet**](docs/CollectionsApi.md#collectionscoluuidget) | **GET** /collections/{coluuid} | Get contents in a collection
*CollectionsApi* | [**collectionsColuuidPost**](docs/CollectionsApi.md#collectionscoluuidpost) | **POST** /collections/{coluuid} | Add contents to a collection
*CollectionsApi* | [**collectionsFsAddPost**](docs/CollectionsApi.md#collectionsfsaddpost) | **POST** /collections/fs/add | Add a file to a collection
*CollectionsApi* | [**collectionsGet**](docs/CollectionsApi.md#collectionsget) | **GET** /collections/ | List all collections
*CollectionsApi* | [**collectionsPost**](docs/CollectionsApi.md#collectionspost) | **POST** /collections/ | Create a new collection
*ContentApi* | [**adminInvitesCodePost**](docs/ContentApi.md#admininvitescodepost) | **POST** /admin/invites/{code} | Create an Estuary invite
*ContentApi* | [**adminInvitesGet**](docs/ContentApi.md#admininvitesget) | **GET** /admin/invites | Get Estuary invites
*ContentApi* | [**contentAddCarPost**](docs/ContentApi.md#contentaddcarpost) | **POST** /content/add-car | Add Car object
*ContentApi* | [**contentAddIpfsPost**](docs/ContentApi.md#contentaddipfspost) | **POST** /content/add-ipfs | Add IPFS object
*ContentApi* | [**contentAddPost**](docs/ContentApi.md#contentaddpost) | **POST** /content/add | Add new content
*ContentApi* | [**contentAggregatedContentGet**](docs/ContentApi.md#contentaggregatedcontentget) | **GET** /content/aggregated/{content} | Get aggregated content stats
*ContentApi* | [**contentAllDealsGet**](docs/ContentApi.md#contentalldealsget) | **GET** /content/all-deals | Get all deals for a user
*ContentApi* | [**contentBwUsageContentGet**](docs/ContentApi.md#contentbwusagecontentget) | **GET** /content/bw-usage/{content} | Get content bandwidth
*ContentApi* | [**contentContentsGet**](docs/ContentApi.md#contentcontentsget) | **GET** /content/contents | Get user contents
*ContentApi* | [**contentCreatePost**](docs/ContentApi.md#contentcreatepost) | **POST** /content/create | Add a new content
*ContentApi* | [**contentDealsGet**](docs/ContentApi.md#contentdealsget) | **GET** /content/deals | Content with deals
*ContentApi* | [**contentEnsureReplicationDatacidGet**](docs/ContentApi.md#contentensurereplicationdatacidget) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
*ContentApi* | [**contentFailuresContentGet**](docs/ContentApi.md#contentfailurescontentget) | **GET** /content/failures/{content} | List all failures for a content
*ContentApi* | [**contentIdGet**](docs/ContentApi.md#contentidget) | **GET** /content/{id} | Content
*ContentApi* | [**contentListGet**](docs/ContentApi.md#contentlistget) | **GET** /content/list | List all pinned content
*ContentApi* | [**contentStagingZonesGet**](docs/ContentApi.md#contentstagingzonesget) | **GET** /content/staging-zones | Get staging zone for user, excluding its contents
*ContentApi* | [**contentStagingZonesStagingZoneContentsGet**](docs/ContentApi.md#contentstagingzonesstagingzonecontentsget) | **GET** /content/staging-zones/{staging_zone}/contents | Get contents for a staging zone
*ContentApi* | [**contentStagingZonesStagingZoneGet**](docs/ContentApi.md#contentstagingzonesstagingzoneget) | **GET** /content/staging-zones/{staging_zone} | Get staging zone without its contents field populated
*ContentApi* | [**contentStatsGet**](docs/ContentApi.md#contentstatsget) | **GET** /content/stats | Get content statistics
*ContentApi* | [**contentStatusIdGet**](docs/ContentApi.md#contentstatusidget) | **GET** /content/status/{id} | Content Status
*DealsApi* | [**dealEstimatePost**](docs/DealsApi.md#dealestimatepost) | **POST** /deal/estimate | Estimate the cost of a deal
*DealsApi* | [**dealInfoDealidGet**](docs/DealsApi.md#dealinfodealidget) | **GET** /deal/info/{dealid} | Get Deal Info
*DealsApi* | [**dealProposalPropcidGet**](docs/DealsApi.md#dealproposalpropcidget) | **GET** /deal/proposal/{propcid} | Get Proposal
*DealsApi* | [**dealQueryMinerGet**](docs/DealsApi.md#dealqueryminerget) | **GET** /deal/query/{miner} | Query Ask
*DealsApi* | [**dealStatusByProposalPropcidGet**](docs/DealsApi.md#dealstatusbyproposalpropcidget) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
*DealsApi* | [**dealStatusMinerPropcidGet**](docs/DealsApi.md#dealstatusminerpropcidget) | **GET** /deal/status/{miner}/{propcid} | Deal Status
*DealsApi* | [**dealTransferInProgressGet**](docs/DealsApi.md#dealtransferinprogressget) | **GET** /deal/transfer/in-progress | Transfer In Progress
*DealsApi* | [**dealTransferStatusPost**](docs/DealsApi.md#dealtransferstatuspost) | **POST** /deal/transfer/status | Transfer Status
*DealsApi* | [**dealsFailuresGet**](docs/DealsApi.md#dealsfailuresget) | **GET** /deals/failures | Get storage failures for user
*DealsApi* | [**dealsMakeMinerPost**](docs/DealsApi.md#dealsmakeminerpost) | **POST** /deals/make/{miner} | Make Deal
*DealsApi* | [**dealsStatusDealGet**](docs/DealsApi.md#dealsstatusdealget) | **GET** /deals/status/{deal} | Get Deal Status
*DealsApi* | [**publicDealsFailuresGet**](docs/DealsApi.md#publicdealsfailuresget) | **GET** /public/deals/failures | Get storage failures
*DealsApi* | [**publicMinersStorageQueryMinerGet**](docs/DealsApi.md#publicminersstoragequeryminerget) | **GET** /public/miners/storage/query/{miner} | Query Ask
*DealsApi* | [**storageProvidersStorageQueryCidGet**](docs/DealsApi.md#storageprovidersstoragequerycidget) | **GET** /storage-providers/storage/query/{cid} | Query Ask
*DefaultApi* | [**viewerGet**](docs/DefaultApi.md#viewerget) | **GET** /viewer | Fetch viewer details
*MetricsApi* | [**publicMetricsDealsOnChainGet**](docs/MetricsApi.md#publicmetricsdealsonchainget) | **GET** /public/metrics/deals-on-chain | Get deal metrics
*MinerApi* | [**minerClaimMinerGet**](docs/MinerApi.md#minerclaimminerget) | **GET** /miner/claim/{miner} | Get Claim Miner Message
*MinerApi* | [**minerClaimPost**](docs/MinerApi.md#minerclaimpost) | **POST** /miner/claim | Claim Miner
*MinerApi* | [**minerSetInfoMinerPut**](docs/MinerApi.md#minersetinfominerput) | **PUT** /miner/set-info/{miner} | Set Miner Info
*MinerApi* | [**minerSuspendMinerPost**](docs/MinerApi.md#minersuspendminerpost) | **POST** /miner/suspend/{miner} | Suspend Miner
*MinerApi* | [**minerUnsuspendMinerPut**](docs/MinerApi.md#minerunsuspendminerput) | **PUT** /miner/unsuspend/{miner} | Unuspend Miner
*MinerApi* | [**publicMinersDealsMinerGet**](docs/MinerApi.md#publicminersdealsminerget) | **GET** /public/miners/deals/{miner} | Get all miners deals
*MinerApi* | [**publicMinersStatsMinerGet**](docs/MinerApi.md#publicminersstatsminerget) | **GET** /public/miners/stats/{miner} | Get miner stats
*NetApi* | [**publicMinersFailuresMinerGet**](docs/NetApi.md#publicminersfailuresminerget) | **GET** /public/miners/failures/{miner} | Get all miners
*NetApi* | [**publicMinersGet**](docs/NetApi.md#publicminersget) | **GET** /public/miners | Get all miners
*NetApi* | [**publicNetAddrsGet**](docs/NetApi.md#publicnetaddrsget) | **GET** /public/net/addrs | Net Addrs
*NetApi* | [**publicNetPeersGet**](docs/NetApi.md#publicnetpeersget) | **GET** /public/net/peers | Net Peers
*PinningApi* | [**pinningPinsGet**](docs/PinningApi.md#pinningpinsget) | **GET** /pinning/pins | List all pin status objects
*PinningApi* | [**pinningPinsPinidDelete**](docs/PinningApi.md#pinningpinspiniddelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
*PinningApi* | [**pinningPinsPinidGet**](docs/PinningApi.md#pinningpinspinidget) | **GET** /pinning/pins/{pinid} | Get a pin status object
*PinningApi* | [**pinningPinsPinidPost**](docs/PinningApi.md#pinningpinspinidpost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
*PinningApi* | [**pinningPinsPost**](docs/PinningApi.md#pinningpinspost) | **POST** /pinning/pins | Add and pin object
*PublicApi* | [**getCidGet**](docs/PublicApi.md#getcidget) | **GET** /get/{cid} | Get Full Content by Cid
*PublicApi* | [**publicByCidCidGet**](docs/PublicApi.md#publicbycidcidget) | **GET** /public/by-cid/{cid} | Get Content by Cid
*PublicApi* | [**publicInfoGet**](docs/PublicApi.md#publicinfoget) | **GET** /public/info | Get public node info
*PublicApi* | [**publicMetricsDealsOnChainGet**](docs/PublicApi.md#publicmetricsdealsonchainget) | **GET** /public/metrics/deals-on-chain | Get deal metrics
*PublicApi* | [**publicMinersDealsMinerGet**](docs/PublicApi.md#publicminersdealsminerget) | **GET** /public/miners/deals/{miner} | Get all miners deals
*PublicApi* | [**publicMinersFailuresMinerGet**](docs/PublicApi.md#publicminersfailuresminerget) | **GET** /public/miners/failures/{miner} | Get all miners
*PublicApi* | [**publicMinersGet**](docs/PublicApi.md#publicminersget) | **GET** /public/miners | Get all miners
*PublicApi* | [**publicMinersStatsMinerGet**](docs/PublicApi.md#publicminersstatsminerget) | **GET** /public/miners/stats/{miner} | Get miner stats
*PublicApi* | [**publicNetAddrsGet**](docs/PublicApi.md#publicnetaddrsget) | **GET** /public/net/addrs | Net Addrs
*PublicApi* | [**publicNetPeersGet**](docs/PublicApi.md#publicnetpeersget) | **GET** /public/net/peers | Net Peers
*PublicApi* | [**publicStatsGet**](docs/PublicApi.md#publicstatsget) | **GET** /public/stats | Public stats
*SpApi* | [**storageProvidersClaimPost**](docs/SpApi.md#storageprovidersclaimpost) | **POST** /storage-providers/claim | Claim Storage Provider
*SpApi* | [**storageProvidersClaimSpGet**](docs/SpApi.md#storageprovidersclaimspget) | **GET** /storage-providers/claim/{sp} | Get Claim Storage Provider
*SpApi* | [**storageProvidersDealsSpGet**](docs/SpApi.md#storageprovidersdealsspget) | **GET** /storage-providers/deals/{sp} | Get all storage providers deals
*SpApi* | [**storageProvidersFailuresSpGet**](docs/SpApi.md#storageprovidersfailuresspget) | **GET** /storage-providers/failures/{sp} | Get all storage providers
*SpApi* | [**storageProvidersGet**](docs/SpApi.md#storageprovidersget) | **GET** /storage-providers | Get all storage providers
*SpApi* | [**storageProvidersSetInfoSpPut**](docs/SpApi.md#storageproviderssetinfospput) | **PUT** /storage-providers/set-info/{sp} | Set Storage Provider Info
*SpApi* | [**storageProvidersStatsSpGet**](docs/SpApi.md#storageprovidersstatsspget) | **GET** /storage-providers/stats/{sp} | Get storage provider stats
*SpApi* | [**storageProvidersSuspendSpPost**](docs/SpApi.md#storageproviderssuspendsppost) | **POST** /storage-providers/suspend/{sp} | Suspend Storage Provider
*SpApi* | [**storageProvidersUnsuspendSpPut**](docs/SpApi.md#storageprovidersunsuspendspput) | **PUT** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider
*UserApi* | [**userApiKeysGet**](docs/UserApi.md#userapikeysget) | **GET** /user/api-keys | Get API keys for a user
*UserApi* | [**userApiKeysKeyOrHashDelete**](docs/UserApi.md#userapikeyskeyorhashdelete) | **DELETE** /user/api-keys/{key_or_hash} | Revoke a User API Key.
*UserApi* | [**userApiKeysPost**](docs/UserApi.md#userapikeyspost) | **POST** /user/api-keys | Create API keys for a user
*UserApi* | [**userExportGet**](docs/UserApi.md#userexportget) | **GET** /user/export | Export user data
*UserApi* | [**userStatsGet**](docs/UserApi.md#userstatsget) | **GET** /user/stats | Get stats for the current user

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.AddressAddress](docs/AddressAddress.md)
 - [io.swagger.client.models.ApiChannelIDParam](docs/ApiChannelIDParam.md)
 - [io.swagger.client.models.ApicreateCollectionBody](docs/ApicreateCollectionBody.md)
 - [io.swagger.client.models.ApideleteContentFromCollectionBody](docs/ApideleteContentFromCollectionBody.md)
 - [io.swagger.client.models.ApiestimateDealBody](docs/ApiestimateDealBody.md)
 - [io.swagger.client.models.ApigetApiKeysResp](docs/ApigetApiKeysResp.md)
 - [io.swagger.client.models.ApipublicNodeInfo](docs/ApipublicNodeInfo.md)
 - [io.swagger.client.models.ApistorageProviderResp](docs/ApistorageProviderResp.md)
 - [io.swagger.client.models.AutoretrieveInitBody](docs/AutoretrieveInitBody.md)
 - [io.swagger.client.models.CidCid](docs/CidCid.md)
 - [io.swagger.client.models.CollectionsCidType](docs/CollectionsCidType.md)
 - [io.swagger.client.models.CollectionsCollection](docs/CollectionsCollection.md)
 - [io.swagger.client.models.CollectionsCollectionListResponse](docs/CollectionsCollectionListResponse.md)
 - [io.swagger.client.models.ContentAddBody](docs/ContentAddBody.md)
 - [io.swagger.client.models.GithubComApplicationResearchEstuaryApiV1claimMsgResponse](docs/GithubComApplicationResearchEstuaryApiV1claimMsgResponse.md)
 - [io.swagger.client.models.GithubComApplicationResearchEstuaryApiV1claimResponse](docs/GithubComApplicationResearchEstuaryApiV1claimResponse.md)
 - [io.swagger.client.models.GithubComApplicationResearchEstuaryApiV2claimMsgResponse](docs/GithubComApplicationResearchEstuaryApiV2claimMsgResponse.md)
 - [io.swagger.client.models.GithubComApplicationResearchEstuaryApiV2claimResponse](docs/GithubComApplicationResearchEstuaryApiV2claimResponse.md)
 - [io.swagger.client.models.MinerClaimMinerBody](docs/MinerClaimMinerBody.md)
 - [io.swagger.client.models.MinerMinerSetInfoParams](docs/MinerMinerSetInfoParams.md)
 - [io.swagger.client.models.MinerSuspendMinerBody](docs/MinerSuspendMinerBody.md)
 - [io.swagger.client.models.PeeringPeeringPeer](docs/PeeringPeeringPeer.md)
 - [io.swagger.client.models.TypesIpfsListPinStatusResponse](docs/TypesIpfsListPinStatusResponse.md)
 - [io.swagger.client.models.TypesIpfsPin](docs/TypesIpfsPin.md)
 - [io.swagger.client.models.TypesIpfsPinStatusResponse](docs/TypesIpfsPinStatusResponse.md)
 - [io.swagger.client.models.TypesPinningStatus](docs/TypesPinningStatus.md)
 - [io.swagger.client.models.UtilContentAddResponse](docs/UtilContentAddResponse.md)
 - [io.swagger.client.models.UtilContentCreateBody](docs/UtilContentCreateBody.md)
 - [io.swagger.client.models.UtilContentType](docs/UtilContentType.md)
 - [io.swagger.client.models.UtilDbCID](docs/UtilDbCID.md)
 - [io.swagger.client.models.UtilHttpError](docs/UtilHttpError.md)
 - [io.swagger.client.models.UtilUserSettings](docs/UtilUserSettings.md)
 - [io.swagger.client.models.UtilViewerResponse](docs/UtilViewerResponse.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearerAuth"></a>
### bearerAuth


