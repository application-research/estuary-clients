# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AdminApi;

public class AdminApiExample {

    public static void main(String[] args) {
        AdminApi apiInstance = new AdminApi();
        try {
            apiInstance.adminPeeringPeersDelete();
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminPeeringPeersDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.estuary.tech*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminPeeringPeersDelete**](docs/AdminApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*AdminApi* | [**adminPeeringPeersGet**](docs/AdminApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
*AdminApi* | [**adminPeeringPeersPost**](docs/AdminApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
*AdminApi* | [**adminPeeringStartPost**](docs/AdminApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
*AdminApi* | [**adminPeeringStatusGet**](docs/AdminApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
*AdminApi* | [**adminPeeringStopPost**](docs/AdminApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
*AdminApi* | [**adminSystemConfigGet**](docs/AdminApi.md#adminSystemConfigGet) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
*AdminApi* | [**adminUsersGet**](docs/AdminApi.md#adminUsersGet) | **GET** /admin/users | Get all users
*AutoretrieveApi* | [**adminAutoretrieveInitPost**](docs/AutoretrieveApi.md#adminAutoretrieveInitPost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
*AutoretrieveApi* | [**adminAutoretrieveListGet**](docs/AutoretrieveApi.md#adminAutoretrieveListGet) | **GET** /admin/autoretrieve/list | List autoretrieve servers
*AutoretrieveApi* | [**autoretrieveHeartbeatPost**](docs/AutoretrieveApi.md#autoretrieveHeartbeatPost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up
*CollectionsApi* | [**collectionsColuuidCommitPost**](docs/CollectionsApi.md#collectionsColuuidCommitPost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
*CollectionsApi* | [**collectionsColuuidDelete**](docs/CollectionsApi.md#collectionsColuuidDelete) | **DELETE** /collections/{coluuid} | Deletes a collection
*CollectionsApi* | [**collectionsColuuidGet**](docs/CollectionsApi.md#collectionsColuuidGet) | **GET** /collections/{coluuid} | Get contents in a collection
*CollectionsApi* | [**collectionsColuuidPost**](docs/CollectionsApi.md#collectionsColuuidPost) | **POST** /collections/{coluuid} | Add contents to a collection
*CollectionsApi* | [**collectionsFsAddPost**](docs/CollectionsApi.md#collectionsFsAddPost) | **POST** /collections/fs/add | Add a file to a collection
*CollectionsApi* | [**collectionsGet**](docs/CollectionsApi.md#collectionsGet) | **GET** /collections/ | List all collections
*CollectionsApi* | [**collectionsPost**](docs/CollectionsApi.md#collectionsPost) | **POST** /collections/ | Create a new collection
*ContentApi* | [**contentAddCarPost**](docs/ContentApi.md#contentAddCarPost) | **POST** /content/add-car | Add Car object
*ContentApi* | [**contentAddIpfsPost**](docs/ContentApi.md#contentAddIpfsPost) | **POST** /content/add-ipfs | Add IPFS object
*ContentApi* | [**contentAddPost**](docs/ContentApi.md#contentAddPost) | **POST** /content/add | Add new content
*ContentApi* | [**contentAggregatedContentGet**](docs/ContentApi.md#contentAggregatedContentGet) | **GET** /content/aggregated/{content} | Get aggregated content stats
*ContentApi* | [**contentAllDealsGet**](docs/ContentApi.md#contentAllDealsGet) | **GET** /content/all-deals | Get all deals for a user
*ContentApi* | [**contentBwUsageContentGet**](docs/ContentApi.md#contentBwUsageContentGet) | **GET** /content/bw-usage/{content} | Get content bandwidth
*ContentApi* | [**contentCreatePost**](docs/ContentApi.md#contentCreatePost) | **POST** /content/create | Add a new content
*ContentApi* | [**contentDealsGet**](docs/ContentApi.md#contentDealsGet) | **GET** /content/deals | Content with deals
*ContentApi* | [**contentEnsureReplicationDatacidGet**](docs/ContentApi.md#contentEnsureReplicationDatacidGet) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
*ContentApi* | [**contentFailuresContentGet**](docs/ContentApi.md#contentFailuresContentGet) | **GET** /content/failures/{content} | List all failures for a content
*ContentApi* | [**contentImportdealPost**](docs/ContentApi.md#contentImportdealPost) | **POST** /content/importdeal | Import a deal
*ContentApi* | [**contentListGet**](docs/ContentApi.md#contentListGet) | **GET** /content/list | List all pinned content
*ContentApi* | [**contentReadContGet**](docs/ContentApi.md#contentReadContGet) | **GET** /content/read/{cont} | Read content
*ContentApi* | [**contentStagingZonesGet**](docs/ContentApi.md#contentStagingZonesGet) | **GET** /content/staging-zones | Get staging zone for user
*ContentApi* | [**contentStatsGet**](docs/ContentApi.md#contentStatsGet) | **GET** /content/stats | Get content statistics
*ContentApi* | [**contentStatusIdGet**](docs/ContentApi.md#contentStatusIdGet) | **GET** /content/status/{id} | Content Status
*DealsApi* | [**dealEstimatePost**](docs/DealsApi.md#dealEstimatePost) | **POST** /deal/estimate | Estimate the cost of a deal
*DealsApi* | [**dealInfoDealidGet**](docs/DealsApi.md#dealInfoDealidGet) | **GET** /deal/info/{dealid} | Get Deal Info
*DealsApi* | [**dealProposalPropcidGet**](docs/DealsApi.md#dealProposalPropcidGet) | **GET** /deal/proposal/{propcid} | Get Proposal
*DealsApi* | [**dealQueryMinerGet**](docs/DealsApi.md#dealQueryMinerGet) | **GET** /deal/query/{miner} | Query Ask
*DealsApi* | [**dealStatusByProposalPropcidGet**](docs/DealsApi.md#dealStatusByProposalPropcidGet) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
*DealsApi* | [**dealStatusMinerPropcidGet**](docs/DealsApi.md#dealStatusMinerPropcidGet) | **GET** /deal/status/{miner}/{propcid} | Deal Status
*DealsApi* | [**dealTransferInProgressGet**](docs/DealsApi.md#dealTransferInProgressGet) | **GET** /deal/transfer/in-progress | Transfer In Progress
*DealsApi* | [**dealTransferStatusPost**](docs/DealsApi.md#dealTransferStatusPost) | **POST** /deal/transfer/status | Transfer Status
*DealsApi* | [**dealsFailuresGet**](docs/DealsApi.md#dealsFailuresGet) | **GET** /deals/failures | Get storage failures for user
*DealsApi* | [**dealsMakeMinerPost**](docs/DealsApi.md#dealsMakeMinerPost) | **POST** /deals/make/{miner} | Make Deal
*DealsApi* | [**dealsStatusDealGet**](docs/DealsApi.md#dealsStatusDealGet) | **GET** /deals/status/{deal} | Get Deal Status
*DealsApi* | [**publicDealsFailuresGet**](docs/DealsApi.md#publicDealsFailuresGet) | **GET** /public/deals/failures | Get storage failures
*DealsApi* | [**publicMinersStorageQueryMinerGet**](docs/DealsApi.md#publicMinersStorageQueryMinerGet) | **GET** /public/miners/storage/query/{miner} | Query Ask
*MetricsApi* | [**publicMetricsDealsOnChainGet**](docs/MetricsApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics
*MinerApi* | [**publicMinersDealsMinerGet**](docs/MinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
*MinerApi* | [**publicMinersStatsMinerGet**](docs/MinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats
*NetApi* | [**netAddrsGet**](docs/NetApi.md#netAddrsGet) | **GET** /net/addrs | Net Addrs
*NetApi* | [**publicMinersFailuresMinerGet**](docs/NetApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
*NetApi* | [**publicMinersGet**](docs/NetApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
*NetApi* | [**publicNetAddrsGet**](docs/NetApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
*NetApi* | [**publicNetPeersGet**](docs/NetApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers
*PeeringApi* | [**adminPeeringPeersDelete**](docs/PeeringApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*PeeringApi* | [**adminPeeringPeersGet**](docs/PeeringApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
*PeeringApi* | [**adminPeeringPeersPost**](docs/PeeringApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
*PeeringApi* | [**adminPeeringStartPost**](docs/PeeringApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
*PeeringApi* | [**adminPeeringStatusGet**](docs/PeeringApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
*PeeringApi* | [**adminPeeringStopPost**](docs/PeeringApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
*PeersApi* | [**adminPeeringPeersDelete**](docs/PeersApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
*PeersApi* | [**adminPeeringPeersGet**](docs/PeersApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
*PeersApi* | [**adminPeeringPeersPost**](docs/PeersApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
*PeersApi* | [**adminPeeringStartPost**](docs/PeersApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
*PeersApi* | [**adminPeeringStatusGet**](docs/PeersApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
*PeersApi* | [**adminPeeringStopPost**](docs/PeersApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
*PinningApi* | [**pinningPinsGet**](docs/PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
*PinningApi* | [**pinningPinsPinidDelete**](docs/PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
*PinningApi* | [**pinningPinsPinidGet**](docs/PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
*PinningApi* | [**pinningPinsPinidPost**](docs/PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
*PinningApi* | [**pinningPinsPost**](docs/PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object
*PublicApi* | [**publicByCidCidGet**](docs/PublicApi.md#publicByCidCidGet) | **GET** /public/by-cid/{cid} | Get Content by Cid
*PublicApi* | [**publicInfoGet**](docs/PublicApi.md#publicInfoGet) | **GET** /public/info | Get public node info
*PublicApi* | [**publicMetricsDealsOnChainGet**](docs/PublicApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics
*PublicApi* | [**publicMinersDealsMinerGet**](docs/PublicApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
*PublicApi* | [**publicMinersFailuresMinerGet**](docs/PublicApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
*PublicApi* | [**publicMinersGet**](docs/PublicApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
*PublicApi* | [**publicMinersStatsMinerGet**](docs/PublicApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats
*PublicApi* | [**publicNetAddrsGet**](docs/PublicApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
*PublicApi* | [**publicNetPeersGet**](docs/PublicApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers
*PublicApi* | [**publicStatsGet**](docs/PublicApi.md#publicStatsGet) | **GET** /public/stats | Public stats
*UserApi* | [**userApiKeysGet**](docs/UserApi.md#userApiKeysGet) | **GET** /user/api-keys | Get API keys for a user
*UserApi* | [**userApiKeysKeyDelete**](docs/UserApi.md#userApiKeysKeyDelete) | **DELETE** /user/api-keys/{key} | Revoke a User API Key.
*UserApi* | [**userApiKeysPost**](docs/UserApi.md#userApiKeysPost) | **POST** /user/api-keys | Create API keys for a user
*UserApi* | [**userExportGet**](docs/UserApi.md#userExportGet) | **GET** /user/export | Export user data
*UserApi* | [**userStatsGet**](docs/UserApi.md#userStatsGet) | **GET** /user/stats | Create API keys for a user


## Documentation for Models

 - [MainCollection](docs/MainCollection.md)
 - [MainCreateCollectionBody](docs/MainCreateCollectionBody.md)
 - [MainEstimateDealBody](docs/MainEstimateDealBody.md)
 - [MainGetApiKeysResp](docs/MainGetApiKeysResp.md)
 - [MainImportDealBody](docs/MainImportDealBody.md)
 - [MainUserStatsResponse](docs/MainUserStatsResponse.md)
 - [UtilContentAddIpfsBody](docs/UtilContentAddIpfsBody.md)
 - [UtilContentAddResponse](docs/UtilContentAddResponse.md)
 - [UtilHttpError](docs/UtilHttpError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



