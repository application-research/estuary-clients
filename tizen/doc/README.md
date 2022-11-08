# Documentation for Estuary API 0.0.0 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `swagger-codegen`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Estuary API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to https://api.estuary.techhttps://api.estuary.tech

### AdminManager
Method | HTTP request | Description
------------- | ------------- | -------------
*adminPeeringPeersDeleteSync* | *DELETE* /admin/peering/peers | Remove peers on Peering Service.
*adminPeeringPeersDeleteASync* | *DELETE* /admin/peering/peers | Remove peers on Peering Service.
*adminPeeringPeersGetSync* | *GET* /admin/peering/peers | List all Peering peers.
*adminPeeringPeersGetASync* | *GET* /admin/peering/peers | List all Peering peers.
*adminPeeringPeersPostSync* | *POST* /admin/peering/peers | Add peers on Peering Service.
*adminPeeringPeersPostASync* | *POST* /admin/peering/peers | Add peers on Peering Service.
*adminPeeringStartPostSync* | *POST* /admin/peering/start | Start Peering.
*adminPeeringStartPostASync* | *POST* /admin/peering/start | Start Peering.
*adminPeeringStatusGetSync* | *GET* /admin/peering/status | Check Peering Status.
*adminPeeringStatusGetASync* | *GET* /admin/peering/status | Check Peering Status.
*adminPeeringStopPostSync* | *POST* /admin/peering/stop | Stop Peering.
*adminPeeringStopPostASync* | *POST* /admin/peering/stop | Stop Peering.
*adminSystemConfigGetSync* | *GET* /admin/system/config | Get systems(estuary/shuttle) config.
*adminSystemConfigGetASync* | *GET* /admin/system/config | Get systems(estuary/shuttle) config.
*adminUsersGetSync* | *GET* /admin/users | Get all users.
*adminUsersGetASync* | *GET* /admin/users | Get all users.

### AutoretrieveManager
Method | HTTP request | Description
------------- | ------------- | -------------
*adminAutoretrieveInitPostSync* | *POST* /admin/autoretrieve/init | Register autoretrieve server.
*adminAutoretrieveInitPostASync* | *POST* /admin/autoretrieve/init | Register autoretrieve server.
*adminAutoretrieveListGetSync* | *GET* /admin/autoretrieve/list | List autoretrieve servers.
*adminAutoretrieveListGetASync* | *GET* /admin/autoretrieve/list | List autoretrieve servers.
*autoretrieveHeartbeatPostSync* | *POST* /autoretrieve/heartbeat | Marks autoretrieve server as up.
*autoretrieveHeartbeatPostASync* | *POST* /autoretrieve/heartbeat | Marks autoretrieve server as up.

### CollectionsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*collectionsColuuidCommitPostSync* | *POST* /collections/{coluuid}/commit | Produce a CID of the collection contents.
*collectionsColuuidCommitPostASync* | *POST* /collections/{coluuid}/commit | Produce a CID of the collection contents.
*collectionsColuuidContentsDeleteSync* | *DELETE* /collections/{coluuid}/contents | Deletes a content from a collection.
*collectionsColuuidContentsDeleteASync* | *DELETE* /collections/{coluuid}/contents | Deletes a content from a collection.
*collectionsColuuidDeleteSync* | *DELETE* /collections/{coluuid} | Deletes a collection.
*collectionsColuuidDeleteASync* | *DELETE* /collections/{coluuid} | Deletes a collection.
*collectionsColuuidGetSync* | *GET* /collections/{coluuid} | Get contents in a collection.
*collectionsColuuidGetASync* | *GET* /collections/{coluuid} | Get contents in a collection.
*collectionsColuuidPostSync* | *POST* /collections/{coluuid} | Add contents to a collection.
*collectionsColuuidPostASync* | *POST* /collections/{coluuid} | Add contents to a collection.
*collectionsFsAddPostSync* | *POST* /collections/fs/add | Add a file to a collection.
*collectionsFsAddPostASync* | *POST* /collections/fs/add | Add a file to a collection.
*collectionsGetSync* | *GET* /collections/ | List all collections.
*collectionsGetASync* | *GET* /collections/ | List all collections.
*collectionsPostSync* | *POST* /collections/ | Create a new collection.
*collectionsPostASync* | *POST* /collections/ | Create a new collection.

### ContentManager
Method | HTTP request | Description
------------- | ------------- | -------------
*contentAddCarPostSync* | *POST* /content/add-car | Add Car object.
*contentAddCarPostASync* | *POST* /content/add-car | Add Car object.
*contentAddIpfsPostSync* | *POST* /content/add-ipfs | Add IPFS object.
*contentAddIpfsPostASync* | *POST* /content/add-ipfs | Add IPFS object.
*contentAddPostSync* | *POST* /content/add | Add new content.
*contentAddPostASync* | *POST* /content/add | Add new content.
*contentAggregatedContentGetSync* | *GET* /content/aggregated/{content} | Get aggregated content stats.
*contentAggregatedContentGetASync* | *GET* /content/aggregated/{content} | Get aggregated content stats.
*contentAllDealsGetSync* | *GET* /content/all-deals | Get all deals for a user.
*contentAllDealsGetASync* | *GET* /content/all-deals | Get all deals for a user.
*contentBwUsageContentGetSync* | *GET* /content/bw-usage/{content} | Get content bandwidth.
*contentBwUsageContentGetASync* | *GET* /content/bw-usage/{content} | Get content bandwidth.
*contentCreatePostSync* | *POST* /content/create | Add a new content.
*contentCreatePostASync* | *POST* /content/create | Add a new content.
*contentDealsGetSync* | *GET* /content/deals | Content with deals.
*contentDealsGetASync* | *GET* /content/deals | Content with deals.
*contentEnsureReplicationDatacidGetSync* | *GET* /content/ensure-replication/{datacid} | Ensure Replication.
*contentEnsureReplicationDatacidGetASync* | *GET* /content/ensure-replication/{datacid} | Ensure Replication.
*contentFailuresContentGetSync* | *GET* /content/failures/{content} | List all failures for a content.
*contentFailuresContentGetASync* | *GET* /content/failures/{content} | List all failures for a content.
*contentIdGetSync* | *GET* /content/{id} | Content.
*contentIdGetASync* | *GET* /content/{id} | Content.
*contentImportdealPostSync* | *POST* /content/importdeal | Import a deal.
*contentImportdealPostASync* | *POST* /content/importdeal | Import a deal.
*contentListGetSync* | *GET* /content/list | List all pinned content.
*contentListGetASync* | *GET* /content/list | List all pinned content.
*contentReadContGetSync* | *GET* /content/read/{cont} | Read content.
*contentReadContGetASync* | *GET* /content/read/{cont} | Read content.
*contentStagingZonesGetSync* | *GET* /content/staging-zones | Get staging zone for user.
*contentStagingZonesGetASync* | *GET* /content/staging-zones | Get staging zone for user.
*contentStatsGetSync* | *GET* /content/stats | Get content statistics.
*contentStatsGetASync* | *GET* /content/stats | Get content statistics.
*contentStatusIdGetSync* | *GET* /content/status/{id} | Content Status.
*contentStatusIdGetASync* | *GET* /content/status/{id} | Content Status.

### DealsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*dealEstimatePostSync* | *POST* /deal/estimate | Estimate the cost of a deal.
*dealEstimatePostASync* | *POST* /deal/estimate | Estimate the cost of a deal.
*dealInfoDealidGetSync* | *GET* /deal/info/{dealid} | Get Deal Info.
*dealInfoDealidGetASync* | *GET* /deal/info/{dealid} | Get Deal Info.
*dealProposalPropcidGetSync* | *GET* /deal/proposal/{propcid} | Get Proposal.
*dealProposalPropcidGetASync* | *GET* /deal/proposal/{propcid} | Get Proposal.
*dealQueryMinerGetSync* | *GET* /deal/query/{miner} | Query Ask.
*dealQueryMinerGetASync* | *GET* /deal/query/{miner} | Query Ask.
*dealStatusByProposalPropcidGetSync* | *GET* /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid.
*dealStatusByProposalPropcidGetASync* | *GET* /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid.
*dealStatusMinerPropcidGetSync* | *GET* /deal/status/{miner}/{propcid} | Deal Status.
*dealStatusMinerPropcidGetASync* | *GET* /deal/status/{miner}/{propcid} | Deal Status.
*dealTransferInProgressGetSync* | *GET* /deal/transfer/in-progress | Transfer In Progress.
*dealTransferInProgressGetASync* | *GET* /deal/transfer/in-progress | Transfer In Progress.
*dealTransferStatusPostSync* | *POST* /deal/transfer/status | Transfer Status.
*dealTransferStatusPostASync* | *POST* /deal/transfer/status | Transfer Status.
*dealsFailuresGetSync* | *GET* /deals/failures | Get storage failures for user.
*dealsFailuresGetASync* | *GET* /deals/failures | Get storage failures for user.
*dealsMakeMinerPostSync* | *POST* /deals/make/{miner} | Make Deal.
*dealsMakeMinerPostASync* | *POST* /deals/make/{miner} | Make Deal.
*dealsStatusDealGetSync* | *GET* /deals/status/{deal} | Get Deal Status.
*dealsStatusDealGetASync* | *GET* /deals/status/{deal} | Get Deal Status.
*publicDealsFailuresGetSync* | *GET* /public/deals/failures | Get storage failures.
*publicDealsFailuresGetASync* | *GET* /public/deals/failures | Get storage failures.
*publicMinersStorageQueryMinerGetSync* | *GET* /public/miners/storage/query/{miner} | Query Ask.
*publicMinersStorageQueryMinerGetASync* | *GET* /public/miners/storage/query/{miner} | Query Ask.

### MetricsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*publicMetricsDealsOnChainGetSync* | *GET* /public/metrics/deals-on-chain | Get deal metrics.
*publicMetricsDealsOnChainGetASync* | *GET* /public/metrics/deals-on-chain | Get deal metrics.

### MinerManager
Method | HTTP request | Description
------------- | ------------- | -------------
*publicMinersDealsMinerGetSync* | *GET* /public/miners/deals/{miner} | Get all miners deals.
*publicMinersDealsMinerGetASync* | *GET* /public/miners/deals/{miner} | Get all miners deals.
*publicMinersStatsMinerGetSync* | *GET* /public/miners/stats/{miner} | Get miner stats.
*publicMinersStatsMinerGetASync* | *GET* /public/miners/stats/{miner} | Get miner stats.

### NetManager
Method | HTTP request | Description
------------- | ------------- | -------------
*netAddrsGetSync* | *GET* /net/addrs | Net Addrs.
*netAddrsGetASync* | *GET* /net/addrs | Net Addrs.
*publicMinersFailuresMinerGetSync* | *GET* /public/miners/failures/{miner} | Get all miners.
*publicMinersFailuresMinerGetASync* | *GET* /public/miners/failures/{miner} | Get all miners.
*publicMinersGetSync* | *GET* /public/miners | Get all miners.
*publicMinersGetASync* | *GET* /public/miners | Get all miners.
*publicNetAddrsGetSync* | *GET* /public/net/addrs | Net Addrs.
*publicNetAddrsGetASync* | *GET* /public/net/addrs | Net Addrs.
*publicNetPeersGetSync* | *GET* /public/net/peers | Net Peers.
*publicNetPeersGetASync* | *GET* /public/net/peers | Net Peers.

### PeeringManager
Method | HTTP request | Description
------------- | ------------- | -------------
*adminPeeringPeersDeleteSync* | *DELETE* /admin/peering/peers | Remove peers on Peering Service.
*adminPeeringPeersDeleteASync* | *DELETE* /admin/peering/peers | Remove peers on Peering Service.
*adminPeeringPeersGetSync* | *GET* /admin/peering/peers | List all Peering peers.
*adminPeeringPeersGetASync* | *GET* /admin/peering/peers | List all Peering peers.
*adminPeeringPeersPostSync* | *POST* /admin/peering/peers | Add peers on Peering Service.
*adminPeeringPeersPostASync* | *POST* /admin/peering/peers | Add peers on Peering Service.
*adminPeeringStartPostSync* | *POST* /admin/peering/start | Start Peering.
*adminPeeringStartPostASync* | *POST* /admin/peering/start | Start Peering.
*adminPeeringStatusGetSync* | *GET* /admin/peering/status | Check Peering Status.
*adminPeeringStatusGetASync* | *GET* /admin/peering/status | Check Peering Status.
*adminPeeringStopPostSync* | *POST* /admin/peering/stop | Stop Peering.
*adminPeeringStopPostASync* | *POST* /admin/peering/stop | Stop Peering.

### PeersManager
Method | HTTP request | Description
------------- | ------------- | -------------
*adminPeeringPeersDeleteSync* | *DELETE* /admin/peering/peers | Remove peers on Peering Service.
*adminPeeringPeersDeleteASync* | *DELETE* /admin/peering/peers | Remove peers on Peering Service.
*adminPeeringPeersGetSync* | *GET* /admin/peering/peers | List all Peering peers.
*adminPeeringPeersGetASync* | *GET* /admin/peering/peers | List all Peering peers.
*adminPeeringPeersPostSync* | *POST* /admin/peering/peers | Add peers on Peering Service.
*adminPeeringPeersPostASync* | *POST* /admin/peering/peers | Add peers on Peering Service.
*adminPeeringStartPostSync* | *POST* /admin/peering/start | Start Peering.
*adminPeeringStartPostASync* | *POST* /admin/peering/start | Start Peering.
*adminPeeringStatusGetSync* | *GET* /admin/peering/status | Check Peering Status.
*adminPeeringStatusGetASync* | *GET* /admin/peering/status | Check Peering Status.
*adminPeeringStopPostSync* | *POST* /admin/peering/stop | Stop Peering.
*adminPeeringStopPostASync* | *POST* /admin/peering/stop | Stop Peering.

### PinningManager
Method | HTTP request | Description
------------- | ------------- | -------------
*pinningPinsGetSync* | *GET* /pinning/pins | List all pin status objects.
*pinningPinsGetASync* | *GET* /pinning/pins | List all pin status objects.
*pinningPinsPinidDeleteSync* | *DELETE* /pinning/pins/{pinid} | Delete a pinned object.
*pinningPinsPinidDeleteASync* | *DELETE* /pinning/pins/{pinid} | Delete a pinned object.
*pinningPinsPinidGetSync* | *GET* /pinning/pins/{pinid} | Get a pin status object.
*pinningPinsPinidGetASync* | *GET* /pinning/pins/{pinid} | Get a pin status object.
*pinningPinsPinidPostSync* | *POST* /pinning/pins/{pinid} | Replace a pinned object.
*pinningPinsPinidPostASync* | *POST* /pinning/pins/{pinid} | Replace a pinned object.
*pinningPinsPostSync* | *POST* /pinning/pins | Add and pin object.
*pinningPinsPostASync* | *POST* /pinning/pins | Add and pin object.

### PublicManager
Method | HTTP request | Description
------------- | ------------- | -------------
*publicByCidCidGetSync* | *GET* /public/by-cid/{cid} | Get Content by Cid.
*publicByCidCidGetASync* | *GET* /public/by-cid/{cid} | Get Content by Cid.
*publicInfoGetSync* | *GET* /public/info | Get public node info.
*publicInfoGetASync* | *GET* /public/info | Get public node info.
*publicMetricsDealsOnChainGetSync* | *GET* /public/metrics/deals-on-chain | Get deal metrics.
*publicMetricsDealsOnChainGetASync* | *GET* /public/metrics/deals-on-chain | Get deal metrics.
*publicMinersDealsMinerGetSync* | *GET* /public/miners/deals/{miner} | Get all miners deals.
*publicMinersDealsMinerGetASync* | *GET* /public/miners/deals/{miner} | Get all miners deals.
*publicMinersFailuresMinerGetSync* | *GET* /public/miners/failures/{miner} | Get all miners.
*publicMinersFailuresMinerGetASync* | *GET* /public/miners/failures/{miner} | Get all miners.
*publicMinersGetSync* | *GET* /public/miners | Get all miners.
*publicMinersGetASync* | *GET* /public/miners | Get all miners.
*publicMinersStatsMinerGetSync* | *GET* /public/miners/stats/{miner} | Get miner stats.
*publicMinersStatsMinerGetASync* | *GET* /public/miners/stats/{miner} | Get miner stats.
*publicNetAddrsGetSync* | *GET* /public/net/addrs | Net Addrs.
*publicNetAddrsGetASync* | *GET* /public/net/addrs | Net Addrs.
*publicNetPeersGetSync* | *GET* /public/net/peers | Net Peers.
*publicNetPeersGetASync* | *GET* /public/net/peers | Net Peers.
*publicStatsGetSync* | *GET* /public/stats | Public stats.
*publicStatsGetASync* | *GET* /public/stats | Public stats.

### UserManager
Method | HTTP request | Description
------------- | ------------- | -------------
*userApiKeysGetSync* | *GET* /user/api-keys | Get API keys for a user.
*userApiKeysGetASync* | *GET* /user/api-keys | Get API keys for a user.
*userApiKeysKeyOrHashDeleteSync* | *DELETE* /user/api-keys/{key_or_hash} | Revoke a User API Key..
*userApiKeysKeyOrHashDeleteASync* | *DELETE* /user/api-keys/{key_or_hash} | Revoke a User API Key..
*userApiKeysPostSync* | *POST* /user/api-keys | Create API keys for a user.
*userApiKeysPostASync* | *POST* /user/api-keys | Create API keys for a user.
*userExportGetSync* | *GET* /user/export | Export user data.
*userExportGetASync* | *GET* /user/export | Export user data.
*userStatsGetSync* | *GET* /user/stats | Create API keys for a user.
*userStatsGetASync* | *GET* /user/stats | Create API keys for a user.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *Collections.Collection* | 
 *Main.ChannelIDParam* | 
 *Main.createCollectionBody* | 
 *Main.deleteContentFromCollectionBody* | 
 *Main.estimateDealBody* | 
 *Main.getApiKeysResp* | 
 *Main.importDealBody* | 
 *Types.IpfsPin* | 
 *Util.ContentAddIpfsBody* | 
 *Util.ContentAddResponse* | 
 *Util.ContentCreateBody* | 
 *Util.HttpError* | 

