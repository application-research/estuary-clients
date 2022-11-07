# Estuary API API Client

This is the API for the Estuary application.

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)


If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```


## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
   $ sfdx force:source:push
   ```
3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

    ```bash
    $ sfdx sfdx force:apex:test:run
    ```
5. Retrieve the job id from the console and check the test results.

  ```bash
  $ sfdx force:apex:test:report -i theJobId
  ```


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();


Map<String, Object> params = new Map<String, Object>{
    'peerIds' => new List<Boolean>{true}
};

try {
    // cross your fingers
    String result = api.adminPeeringPeersDelete(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.estuary.tech*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SwagAdminApi* | [**adminPeeringPeersDelete**](docs/SwagAdminApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*SwagAdminApi* | [**adminPeeringPeersGet**](docs/SwagAdminApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
*SwagAdminApi* | [**adminPeeringPeersPost**](docs/SwagAdminApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
*SwagAdminApi* | [**adminPeeringStartPost**](docs/SwagAdminApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
*SwagAdminApi* | [**adminPeeringStatusGet**](docs/SwagAdminApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
*SwagAdminApi* | [**adminPeeringStopPost**](docs/SwagAdminApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
*SwagAdminApi* | [**adminSystemConfigGet**](docs/SwagAdminApi.md#adminSystemConfigGet) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
*SwagAdminApi* | [**adminUsersGet**](docs/SwagAdminApi.md#adminUsersGet) | **GET** /admin/users | Get all users
*SwagAutoretrieveApi* | [**adminAutoretrieveInitPost**](docs/SwagAutoretrieveApi.md#adminAutoretrieveInitPost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
*SwagAutoretrieveApi* | [**adminAutoretrieveListGet**](docs/SwagAutoretrieveApi.md#adminAutoretrieveListGet) | **GET** /admin/autoretrieve/list | List autoretrieve servers
*SwagAutoretrieveApi* | [**autoretrieveHeartbeatPost**](docs/SwagAutoretrieveApi.md#autoretrieveHeartbeatPost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up
*SwagCollectionsApi* | [**collectionsColuuidCommitPost**](docs/SwagCollectionsApi.md#collectionsColuuidCommitPost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
*SwagCollectionsApi* | [**collectionsColuuidContentsDelete**](docs/SwagCollectionsApi.md#collectionsColuuidContentsDelete) | **DELETE** /collections/{coluuid}/contents | Deletes a content from a collection
*SwagCollectionsApi* | [**collectionsColuuidDelete**](docs/SwagCollectionsApi.md#collectionsColuuidDelete) | **DELETE** /collections/{coluuid} | Deletes a collection
*SwagCollectionsApi* | [**collectionsColuuidGet**](docs/SwagCollectionsApi.md#collectionsColuuidGet) | **GET** /collections/{coluuid} | Get contents in a collection
*SwagCollectionsApi* | [**collectionsColuuidPost**](docs/SwagCollectionsApi.md#collectionsColuuidPost) | **POST** /collections/{coluuid} | Add contents to a collection
*SwagCollectionsApi* | [**collectionsFsAddPost**](docs/SwagCollectionsApi.md#collectionsFsAddPost) | **POST** /collections/fs/add | Add a file to a collection
*SwagCollectionsApi* | [**collectionsGet**](docs/SwagCollectionsApi.md#collectionsGet) | **GET** /collections/ | List all collections
*SwagCollectionsApi* | [**collectionsPost**](docs/SwagCollectionsApi.md#collectionsPost) | **POST** /collections/ | Create a new collection
*SwagContentApi* | [**contentAddCarPost**](docs/SwagContentApi.md#contentAddCarPost) | **POST** /content/add-car | Add Car object
*SwagContentApi* | [**contentAddIpfsPost**](docs/SwagContentApi.md#contentAddIpfsPost) | **POST** /content/add-ipfs | Add IPFS object
*SwagContentApi* | [**contentAddPost**](docs/SwagContentApi.md#contentAddPost) | **POST** /content/add | Add new content
*SwagContentApi* | [**contentAggregatedContentGet**](docs/SwagContentApi.md#contentAggregatedContentGet) | **GET** /content/aggregated/{content} | Get aggregated content stats
*SwagContentApi* | [**contentAllDealsGet**](docs/SwagContentApi.md#contentAllDealsGet) | **GET** /content/all-deals | Get all deals for a user
*SwagContentApi* | [**contentBwUsageContentGet**](docs/SwagContentApi.md#contentBwUsageContentGet) | **GET** /content/bw-usage/{content} | Get content bandwidth
*SwagContentApi* | [**contentCreatePost**](docs/SwagContentApi.md#contentCreatePost) | **POST** /content/create | Add a new content
*SwagContentApi* | [**contentDealsGet**](docs/SwagContentApi.md#contentDealsGet) | **GET** /content/deals | Content with deals
*SwagContentApi* | [**contentEnsureReplicationDatacidGet**](docs/SwagContentApi.md#contentEnsureReplicationDatacidGet) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
*SwagContentApi* | [**contentFailuresContentGet**](docs/SwagContentApi.md#contentFailuresContentGet) | **GET** /content/failures/{content} | List all failures for a content
*SwagContentApi* | [**contentIdGet**](docs/SwagContentApi.md#contentIdGet) | **GET** /content/{id} | Content
*SwagContentApi* | [**contentImportdealPost**](docs/SwagContentApi.md#contentImportdealPost) | **POST** /content/importdeal | Import a deal
*SwagContentApi* | [**contentListGet**](docs/SwagContentApi.md#contentListGet) | **GET** /content/list | List all pinned content
*SwagContentApi* | [**contentReadContGet**](docs/SwagContentApi.md#contentReadContGet) | **GET** /content/read/{cont} | Read content
*SwagContentApi* | [**contentStagingZonesGet**](docs/SwagContentApi.md#contentStagingZonesGet) | **GET** /content/staging-zones | Get staging zone for user
*SwagContentApi* | [**contentStatsGet**](docs/SwagContentApi.md#contentStatsGet) | **GET** /content/stats | Get content statistics
*SwagContentApi* | [**contentStatusIdGet**](docs/SwagContentApi.md#contentStatusIdGet) | **GET** /content/status/{id} | Content Status
*SwagDealsApi* | [**dealEstimatePost**](docs/SwagDealsApi.md#dealEstimatePost) | **POST** /deal/estimate | Estimate the cost of a deal
*SwagDealsApi* | [**dealInfoDealidGet**](docs/SwagDealsApi.md#dealInfoDealidGet) | **GET** /deal/info/{dealid} | Get Deal Info
*SwagDealsApi* | [**dealProposalPropcidGet**](docs/SwagDealsApi.md#dealProposalPropcidGet) | **GET** /deal/proposal/{propcid} | Get Proposal
*SwagDealsApi* | [**dealQueryMinerGet**](docs/SwagDealsApi.md#dealQueryMinerGet) | **GET** /deal/query/{miner} | Query Ask
*SwagDealsApi* | [**dealStatusByProposalPropcidGet**](docs/SwagDealsApi.md#dealStatusByProposalPropcidGet) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
*SwagDealsApi* | [**dealStatusMinerPropcidGet**](docs/SwagDealsApi.md#dealStatusMinerPropcidGet) | **GET** /deal/status/{miner}/{propcid} | Deal Status
*SwagDealsApi* | [**dealTransferInProgressGet**](docs/SwagDealsApi.md#dealTransferInProgressGet) | **GET** /deal/transfer/in-progress | Transfer In Progress
*SwagDealsApi* | [**dealTransferStatusPost**](docs/SwagDealsApi.md#dealTransferStatusPost) | **POST** /deal/transfer/status | Transfer Status
*SwagDealsApi* | [**dealsFailuresGet**](docs/SwagDealsApi.md#dealsFailuresGet) | **GET** /deals/failures | Get storage failures for user
*SwagDealsApi* | [**dealsMakeMinerPost**](docs/SwagDealsApi.md#dealsMakeMinerPost) | **POST** /deals/make/{miner} | Make Deal
*SwagDealsApi* | [**dealsStatusDealGet**](docs/SwagDealsApi.md#dealsStatusDealGet) | **GET** /deals/status/{deal} | Get Deal Status
*SwagDealsApi* | [**publicDealsFailuresGet**](docs/SwagDealsApi.md#publicDealsFailuresGet) | **GET** /public/deals/failures | Get storage failures
*SwagDealsApi* | [**publicMinersStorageQueryMinerGet**](docs/SwagDealsApi.md#publicMinersStorageQueryMinerGet) | **GET** /public/miners/storage/query/{miner} | Query Ask
*SwagMetricsApi* | [**publicMetricsDealsOnChainGet**](docs/SwagMetricsApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics
*SwagMinerApi* | [**publicMinersDealsMinerGet**](docs/SwagMinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
*SwagMinerApi* | [**publicMinersStatsMinerGet**](docs/SwagMinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats
*SwagNetApi* | [**netAddrsGet**](docs/SwagNetApi.md#netAddrsGet) | **GET** /net/addrs | Net Addrs
*SwagNetApi* | [**publicMinersFailuresMinerGet**](docs/SwagNetApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
*SwagNetApi* | [**publicMinersGet**](docs/SwagNetApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
*SwagNetApi* | [**publicNetAddrsGet**](docs/SwagNetApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
*SwagNetApi* | [**publicNetPeersGet**](docs/SwagNetApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers
*SwagPeeringApi* | [**adminPeeringPeersDelete**](docs/SwagPeeringApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*SwagPeeringApi* | [**adminPeeringPeersGet**](docs/SwagPeeringApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
*SwagPeeringApi* | [**adminPeeringPeersPost**](docs/SwagPeeringApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
*SwagPeeringApi* | [**adminPeeringStartPost**](docs/SwagPeeringApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
*SwagPeeringApi* | [**adminPeeringStatusGet**](docs/SwagPeeringApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
*SwagPeeringApi* | [**adminPeeringStopPost**](docs/SwagPeeringApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
*SwagPeersApi* | [**adminPeeringPeersDelete**](docs/SwagPeersApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*SwagPeersApi* | [**adminPeeringPeersGet**](docs/SwagPeersApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
*SwagPeersApi* | [**adminPeeringPeersPost**](docs/SwagPeersApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
*SwagPeersApi* | [**adminPeeringStartPost**](docs/SwagPeersApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
*SwagPeersApi* | [**adminPeeringStatusGet**](docs/SwagPeersApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
*SwagPeersApi* | [**adminPeeringStopPost**](docs/SwagPeersApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
*SwagPinningApi* | [**pinningPinsGet**](docs/SwagPinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
*SwagPinningApi* | [**pinningPinsPinidDelete**](docs/SwagPinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
*SwagPinningApi* | [**pinningPinsPinidGet**](docs/SwagPinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
*SwagPinningApi* | [**pinningPinsPinidPost**](docs/SwagPinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
*SwagPinningApi* | [**pinningPinsPost**](docs/SwagPinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object
*SwagPublicApi* | [**publicByCidCidGet**](docs/SwagPublicApi.md#publicByCidCidGet) | **GET** /public/by-cid/{cid} | Get Content by Cid
*SwagPublicApi* | [**publicInfoGet**](docs/SwagPublicApi.md#publicInfoGet) | **GET** /public/info | Get public node info
*SwagPublicApi* | [**publicMetricsDealsOnChainGet**](docs/SwagPublicApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics
*SwagPublicApi* | [**publicMinersDealsMinerGet**](docs/SwagPublicApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
*SwagPublicApi* | [**publicMinersFailuresMinerGet**](docs/SwagPublicApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
*SwagPublicApi* | [**publicMinersGet**](docs/SwagPublicApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
*SwagPublicApi* | [**publicMinersStatsMinerGet**](docs/SwagPublicApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats
*SwagPublicApi* | [**publicNetAddrsGet**](docs/SwagPublicApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
*SwagPublicApi* | [**publicNetPeersGet**](docs/SwagPublicApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers
*SwagPublicApi* | [**publicStatsGet**](docs/SwagPublicApi.md#publicStatsGet) | **GET** /public/stats | Public stats
*SwagUserApi* | [**userApiKeysGet**](docs/SwagUserApi.md#userApiKeysGet) | **GET** /user/api-keys | Get API keys for a user
*SwagUserApi* | [**userApiKeysKeyDelete**](docs/SwagUserApi.md#userApiKeysKeyDelete) | **DELETE** /user/api-keys/{key} | Revoke a User API Key.
*SwagUserApi* | [**userApiKeysPost**](docs/SwagUserApi.md#userApiKeysPost) | **POST** /user/api-keys | Create API keys for a user
*SwagUserApi* | [**userExportGet**](docs/SwagUserApi.md#userExportGet) | **GET** /user/export | Export user data
*SwagUserApi* | [**userStatsGet**](docs/SwagUserApi.md#userStatsGet) | **GET** /user/stats | Create API keys for a user


## Documentation for Models

 - [SwagCollectionsCollection](docs/SwagCollectionsCollection.md)
 - [SwagMainChannelIDParam](docs/SwagMainChannelIDParam.md)
 - [SwagMainCreateCollectionBody](docs/SwagMainCreateCollectionBody.md)
 - [SwagMainDeleteContentFromCollectionB](docs/SwagMainDeleteContentFromCollectionB.md)
 - [SwagMainEstimateDealBody](docs/SwagMainEstimateDealBody.md)
 - [SwagMainGetApiKeysResp](docs/SwagMainGetApiKeysResp.md)
 - [SwagMainImportDealBody](docs/SwagMainImportDealBody.md)
 - [SwagTypesIpfsPin](docs/SwagTypesIpfsPin.md)
 - [SwagUtilContentAddIpfsBody](docs/SwagUtilContentAddIpfsBody.md)
 - [SwagUtilContentAddResponse](docs/SwagUtilContentAddResponse.md)
 - [SwagUtilContentCreateBody](docs/SwagUtilContentCreateBody.md)
 - [SwagUtilHttpError](docs/SwagUtilHttpError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author



