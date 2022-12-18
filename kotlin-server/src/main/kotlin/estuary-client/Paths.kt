/**
* Estuary API
* This is the API for the Estuary application.
*
* OpenAPI spec version: 0.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package estuary-client

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpMethod
import io.ktor.locations.handle
import io.ktor.locations.location
import io.ktor.locations.Location
import io.ktor.util.pipeline.PipelineContext
import io.ktor.routing.Route
import io.ktor.routing.method
import io.swagger.server.models.*;


// NOTE: ktor-location@0.9.0 is missing extension for Route.delete. This includes it.
inline fun <reified T : Any> Route.delete(noinline body: suspend PipelineContext<Unit, ApplicationCall>.(T) -> Unit): Route {
    return location(T::class) {
        method(HttpMethod.Delete) {
            handle(body)
        }
    }
}

object Paths {
    /**
     * Remove peers on Peering Service
     * This endpoint can be used to remove a Peer from the Peering Service
     * @param body Peer ids 
     */
    @Location("/admin/peering/peers") class adminPeeringPeersDelete(val body: kotlin.Array<kotlin.String>)

    /**
     * List all Peering peers
     * This endpoint can be used to list all peers on Peering Service
     */
    @Location("/admin/peering/peers") class adminPeeringPeersGet()

    /**
     * Add peers on Peering Service
     * This endpoint can be used to add a Peer from the Peering Service
     * @param body Peering Peer array 
     */
    @Location("/admin/peering/peers") class adminPeeringPeersPost(val body: kotlin.Array<PeeringPeeringPeer>)

    /**
     * Start Peering
     * This endpoint can be used to start the Peering Service
     */
    @Location("/admin/peering/start") class adminPeeringStartPost()

    /**
     * Check Peering Status
     * This endpoint can be used to check the Peering status
     */
    @Location("/admin/peering/status") class adminPeeringStatusGet()

    /**
     * Stop Peering
     * This endpoint can be used to stop the Peering Service
     */
    @Location("/admin/peering/stop") class adminPeeringStopPost()

    /**
     * Get systems(estuary/shuttle) config
     * This endpoint is used to get system configs.
     */
    @Location("/admin/system/config") class adminSystemConfigGet()

    /**
     * Get all users
     * This endpoint is used to get all users.
     */
    @Location("/admin/users") class adminUsersGet()

    /**
     * Register autoretrieve server
     * This endpoint registers a new autoretrieve server
     * @param addresses  
     * @param pubKey  
     */
    @Location("/admin/autoretrieve/init") class adminAutoretrieveInitPost(val addresses: kotlin.String, val pubKey: kotlin.String)

    /**
     * List autoretrieve servers
     * This endpoint lists all registered autoretrieve servers
     */
    @Location("/admin/autoretrieve/list") class adminAutoretrieveListGet()

    /**
     * Marks autoretrieve server as up
     * This endpoint updates the lastConnection field for autoretrieve
     * @param token Autoretrieve&#x27;s auth token 
     */
    @Location("/autoretrieve/heartbeat") class autoretrieveHeartbeatPost(val token: kotlin.String)

    /**
     * Produce a CID of the collection contents
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     * @param coluuid coluuid 
     */
    @Location("/collections/{coluuid}/commit") class collectionsColuuidCommitPost(val coluuid: kotlin.String)

    /**
     * Deletes a content from a collection
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     * @param body Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;) 
     * @param coluuid Collection ID 
     */
    @Location("/collections/{coluuid}/contents") class collectionsColuuidContentsDelete(val body: ApideleteContentFromCollectionBody, val coluuid: kotlin.String)

    /**
     * Deletes a collection
     * This endpoint is used to delete an existing collection.
     * @param coluuid Collection ID 
     */
    @Location("/collections/{coluuid}") class collectionsColuuidDelete(val coluuid: kotlin.String)

    /**
     * Get contents in a collection
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     * @param coluuid coluuid 
     * @param dir Directory (optional)
     */
    @Location("/collections/{coluuid}") class collectionsColuuidGet(val coluuid: kotlin.String, val dir: kotlin.String)

    /**
     * Add contents to a collection
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     * @param body Content IDs to add to collection 
     * @param coluuid Collection UUID 
     * @param dir Directory (optional)
     */
    @Location("/collections/{coluuid}") class collectionsColuuidPost(val body: kotlin.Array<kotlin.Int>, val coluuid: kotlin.String, val dir: kotlin.String)

    /**
     * Add a file to a collection
     * This endpoint adds a file to a collection
     * @param coluuid Collection ID 
     * @param content Content 
     * @param path Path to file 
     */
    @Location("/collections/fs/add") class collectionsFsAddPost(val coluuid: kotlin.String, val content: kotlin.String, val path: kotlin.String)

    /**
     * List all collections
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     */
    @Location("/collections/") class collectionsGet()

    /**
     * Create a new collection
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     * @param body Collection name and description 
     */
    @Location("/collections/") class collectionsPost(val body: ApicreateCollectionBody)

    /**
     * Create an Estuary invite
     * This endpoint is used to create an estuary invite.
     * @param code Invite code to be created 
     */
    @Location("/admin/invites/{code}") class adminInvitesCodePost(val code: kotlin.String)

    /**
     * Get Estuary invites
     * This endpoint is used to list all estuary invites.
     */
    @Location("/admin/invites") class adminInvitesGet()

    /**
     * Add Car object
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     * @param body Car 
     * @param ignoreDupes Ignore Dupes (optional)
     * @param filename Filename (optional)
     */
    @Location("/content/add-car") class contentAddCarPost(val body: kotlin.String, val ignoreDupes: kotlin.String, val filename: kotlin.String)

    /**
     * Add IPFS object
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     * @param body IPFS Body 
     * @param ignoreDupes Ignore Dupes (optional)
     */
    @Location("/content/add-ipfs") class contentAddIpfsPost(val body: TypesIpfsPin, val ignoreDupes: kotlin.String)

    /**
     * Add new content
     * This endpoint is used to upload new content.
     * @param &#x60;data&#x60;  
     * @param filename  
     * @param coluuid Collection UUID (optional)
     * @param replication Replication value (optional)
     * @param ignoreDupes Ignore Dupes true/false (optional)
     * @param lazyProvide Lazy Provide true/false (optional)
     * @param dir Directory (optional)
     */
    @Location("/content/add") class contentAddPost(val &#x60;data&#x60;: kotlin.Array<kotlin.Byte>, val filename: kotlin.String, val coluuid: kotlin.String, val replication: kotlin.Int, val ignoreDupes: kotlin.String, val lazyProvide: kotlin.String, val dir: kotlin.String)

    /**
     * Get aggregated content stats
     * This endpoint returns aggregated content stats
     * @param content Content ID 
     */
    @Location("/content/aggregated/{content}") class contentAggregatedContentGet(val content: kotlin.String)

    /**
     * Get all deals for a user
     * This endpoint is used to get all deals for a user
     * @param begin Begin 
     * @param duration Duration 
     * @param all All 
     */
    @Location("/content/all-deals") class contentAllDealsGet(val begin: kotlin.String, val duration: kotlin.String, val all: kotlin.String)

    /**
     * Get content bandwidth
     * This endpoint returns content bandwidth
     * @param content Content ID 
     */
    @Location("/content/bw-usage/{content}") class contentBwUsageContentGet(val content: kotlin.String)

    /**
     * Get user contents
     * This endpoint is used to get user contents
     * @param limit limit 
     * @param offset offset 
     */
    @Location("/content/contents") class contentContentsGet(val limit: kotlin.String, val offset: kotlin.String)

    /**
     * Add a new content
     * This endpoint adds a new content
     * @param body Content 
     * @param ignoreDupes Ignore Dupes (optional)
     */
    @Location("/content/create") class contentCreatePost(val body: UtilContentCreateBody, val ignoreDupes: kotlin.String)

    /**
     * Content with deals
     * This endpoint lists all content with deals
     * @param limit Limit (optional)
     * @param offset Offset (optional)
     */
    @Location("/content/deals") class contentDealsGet(val limit: kotlin.Int, val offset: kotlin.Int)

    /**
     * Ensure Replication
     * This endpoint ensures that the content is replicated to the specified number of providers
     * @param datacid Data CID 
     */
    @Location("/content/ensure-replication/{datacid}") class contentEnsureReplicationDatacidGet(val datacid: kotlin.String)

    /**
     * List all failures for a content
     * This endpoint returns all failures for a content
     * @param content Content ID 
     */
    @Location("/content/failures/{content}") class contentFailuresContentGet(val content: kotlin.String)

    /**
     * Content
     * This endpoint returns a content by its ID
     * @param id Content ID 
     */
    @Location("/content/{id}") class contentIdGet(val id: kotlin.Int)

    /**
     * List all pinned content
     * This endpoint lists all content
     */
    @Location("/content/list") class contentListGet()

    /**
     * Get staging zone for user, excluding its contents
     * This endpoint is used to get staging zone for user, excluding its contents.
     */
    @Location("/content/staging-zones") class contentStagingZonesGet()

    /**
     * Get contents for a staging zone
     * This endpoint is used to get the contents for a staging zone
     * @param stagingZone Staging Zone Content ID 
     * @param limit limit 
     * @param offset offset 
     */
    @Location("/content/staging-zones/{stagingZone}/contents") class contentStagingZonesStagingZoneContentsGet(val stagingZone: kotlin.Int, val limit: kotlin.String, val offset: kotlin.String)

    /**
     * Get staging zone without its contents field populated
     * This endpoint is used to get a staging zone, excluding its contents.
     * @param stagingZone Staging Zone Content ID 
     */
    @Location("/content/staging-zones/{stagingZone}") class contentStagingZonesStagingZoneGet(val stagingZone: kotlin.Int)

    /**
     * Get content statistics
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
     * @param limit limit 
     * @param offset offset 
     */
    @Location("/content/stats") class contentStatsGet(val limit: kotlin.String, val offset: kotlin.String)

    /**
     * Content Status
     * This endpoint returns the status of a content
     * @param id Content ID 
     */
    @Location("/content/status/{id}") class contentStatusIdGet(val id: kotlin.Int)

    /**
     * Estimate the cost of a deal
     * This endpoint estimates the cost of a deal
     * @param body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks 
     */
    @Location("/deal/estimate") class dealEstimatePost(val body: ApiestimateDealBody)

    /**
     * Get Deal Info
     * This endpoint returns the deal info for a deal
     * @param dealid Deal ID 
     */
    @Location("/deal/info/{dealid}") class dealInfoDealidGet(val dealid: kotlin.Int)

    /**
     * Get Proposal
     * This endpoint returns the proposal for a deal
     * @param propcid Proposal CID 
     */
    @Location("/deal/proposal/{propcid}") class dealProposalPropcidGet(val propcid: kotlin.String)

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param miner CID 
     */
    @Location("/deal/query/{miner}") class dealQueryMinerGet(val miner: kotlin.String)

    /**
     * Get Deal Status by PropCid
     * Get Deal Status by PropCid
     * @param propcid PropCid 
     */
    @Location("/deal/status-by-proposal/{propcid}") class dealStatusByProposalPropcidGet(val propcid: kotlin.String)

    /**
     * Deal Status
     * This endpoint returns the status of a deal
     * @param miner Miner 
     * @param propcid Proposal CID 
     */
    @Location("/deal/status/{miner}/{propcid}") class dealStatusMinerPropcidGet(val miner: kotlin.String, val propcid: kotlin.String)

    /**
     * Transfer In Progress
     * This endpoint returns the in-progress transfers
     */
    @Location("/deal/transfer/in-progress") class dealTransferInProgressGet()

    /**
     * Transfer Status
     * This endpoint returns the status of a transfer
     * @param body Channel ID 
     */
    @Location("/deal/transfer/status") class dealTransferStatusPost(val body: ApiChannelIDParam)

    /**
     * Get storage failures for user
     * This endpoint returns a list of storage failures for user
     */
    @Location("/deals/failures") class dealsFailuresGet()

    /**
     * Make Deal
     * This endpoint makes a deal for a given content and miner
     * @param body Deal Request 
     * @param miner Miner 
     */
    @Location("/deals/make/{miner}") class dealsMakeMinerPost(val body: kotlin.String, val miner: kotlin.String)

    /**
     * Get Deal Status
     * This endpoint returns the status of a deal
     * @param deal Deal ID 
     */
    @Location("/deals/status/{deal}") class dealsStatusDealGet(val deal: kotlin.Int)

    /**
     * Get storage failures
     * This endpoint returns a list of storage failures
     */
    @Location("/public/deals/failures") class publicDealsFailuresGet()

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param miner CID 
     */
    @Location("/public/miners/storage/query/{miner}") class publicMinersStorageQueryMinerGet(val miner: kotlin.String)

    /**
     * Fetch viewer details
     * This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.
     */
    @Location("/viewer") class viewerGet()

    /**
     * Get deal metrics
     * This endpoint is used to get deal metrics
     */
    @Location("/public/metrics/deals-on-chain") class publicMetricsDealsOnChainGet()

    /**
     * Get Claim Miner Message
     * This endpoint lets a user get the message in order to claim a miner
     * @param miner Miner claim message 
     */
    @Location("/miner/claim/{miner}") class minerClaimMinerGet(val miner: kotlin.String)

    /**
     * Claim Miner
     * This endpoint lets a user claim a miner
     * @param body Claim Miner Body 
     */
    @Location("/miner/claim") class minerClaimPost(val body: MinerClaimMinerBody)

    /**
     * Set Miner Info
     * This endpoint lets a user set miner info.
     * @param body Miner set info params 
     * @param miner Miner to set info for 
     */
    @Location("/miner/set-info/{miner}") class minerSetInfoMinerPut(val body: MinerMinerSetInfoParams, val miner: kotlin.String)

    /**
     * Suspend Miner
     * This endpoint lets a user suspend a miner.
     * @param body Suspend Miner Body 
     * @param miner Miner to suspend 
     */
    @Location("/miner/suspend/{miner}") class minerSuspendMinerPost(val body: MinerSuspendMinerBody, val miner: kotlin.String)

    /**
     * Unuspend Miner
     * This endpoint lets a user unsuspend a miner.
     * @param miner Miner to unsuspend 
     */
    @Location("/miner/unsuspend/{miner}") class minerUnsuspendMinerPut(val miner: kotlin.String)

    /**
     * Get all miners deals
     * This endpoint returns all miners deals
     * @param miner Filter by miner 
     * @param ignoreFailed Ignore Failed (optional)
     */
    @Location("/public/miners/deals/{miner}") class publicMinersDealsMinerGet(val miner: kotlin.String, val ignoreFailed: kotlin.String)

    /**
     * Get miner stats
     * This endpoint returns miner stats
     * @param miner Filter by miner 
     */
    @Location("/public/miners/stats/{miner}") class publicMinersStatsMinerGet(val miner: kotlin.String)

    /**
     * Get all miners
     * This endpoint returns all miners
     * @param miner Filter by miner 
     */
    @Location("/public/miners/failures/{miner}") class publicMinersFailuresMinerGet(val miner: kotlin.String)

    /**
     * Get all miners
     * This endpoint returns all miners
     */
    @Location("/public/miners") class publicMinersGet()

    /**
     * Net Addrs
     * This endpoint is used to get net addrs
     */
    @Location("/public/net/addrs") class publicNetAddrsGet()

    /**
     * Net Peers
     * This endpoint is used to get net peers
     */
    @Location("/public/net/peers") class publicNetPeersGet()

    /**
     * List all pin status objects
     * This endpoint lists all pin status objects
     */
    @Location("/pinning/pins") class pinningPinsGet()

    /**
     * Delete a pinned object
     * This endpoint deletes a pinned object.
     * @param pinid Pin ID 
     */
    @Location("/pinning/pins/{pinid}") class pinningPinsPinidDelete(val pinid: kotlin.String)

    /**
     * Get a pin status object
     * This endpoint returns a pin status object.
     * @param pinid cid 
     */
    @Location("/pinning/pins/{pinid}") class pinningPinsPinidGet(val pinid: kotlin.String)

    /**
     * Replace a pinned object
     * This endpoint replaces a pinned object.
     * @param body New pin 
     * @param pinid Pin ID to be replaced 
     */
    @Location("/pinning/pins/{pinid}") class pinningPinsPinidPost(val body: TypesIpfsPin, val pinid: kotlin.String)

    /**
     * Add and pin object
     * This endpoint adds a pin to the IPFS daemon.
     * @param body Pin Body {cid:cid, name:name} 
     */
    @Location("/pinning/pins") class pinningPinsPost(val body: TypesIpfsPin)

    /**
     * Get Full Content by Cid
     * This endpoint returns the content associated with a CID
     * @param cid Cid 
     */
    @Location("/get/{cid}") class getCidGet(val cid: kotlin.String)

    /**
     * Get Content by Cid
     * This endpoint returns the content record associated with a CID
     * @param cid Cid 
     */
    @Location("/public/by-cid/{cid}") class publicByCidCidGet(val cid: kotlin.String)

    /**
     * Get public node info
     * This endpoint returns information about the node
     */
    @Location("/public/info") class publicInfoGet()

    /**
     * Get deal metrics
     * This endpoint is used to get deal metrics
     */
    @Location("/public/metrics/deals-on-chain") class publicMetricsDealsOnChainGet()

    /**
     * Get all miners deals
     * This endpoint returns all miners deals
     * @param miner Filter by miner 
     * @param ignoreFailed Ignore Failed (optional)
     */
    @Location("/public/miners/deals/{miner}") class publicMinersDealsMinerGet(val miner: kotlin.String, val ignoreFailed: kotlin.String)

    /**
     * Get all miners
     * This endpoint returns all miners
     * @param miner Filter by miner 
     */
    @Location("/public/miners/failures/{miner}") class publicMinersFailuresMinerGet(val miner: kotlin.String)

    /**
     * Get all miners
     * This endpoint returns all miners
     */
    @Location("/public/miners") class publicMinersGet()

    /**
     * Get miner stats
     * This endpoint returns miner stats
     * @param miner Filter by miner 
     */
    @Location("/public/miners/stats/{miner}") class publicMinersStatsMinerGet(val miner: kotlin.String)

    /**
     * Net Addrs
     * This endpoint is used to get net addrs
     */
    @Location("/public/net/addrs") class publicNetAddrsGet()

    /**
     * Net Peers
     * This endpoint is used to get net peers
     */
    @Location("/public/net/peers") class publicNetPeersGet()

    /**
     * Public stats
     * This endpoint is used to get public stats.
     */
    @Location("/public/stats") class publicStatsGet()

    /**
     * Get API keys for a user
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     */
    @Location("/user/api-keys") class userApiKeysGet()

    /**
     * Revoke a User API Key.
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#x27;s assigned to the user. Revoked API keys are completely deleted and are not recoverable.
     * @param keyOrHash Key or Hash 
     */
    @Location("/user/api-keys/{keyOrHash}") class userApiKeysKeyOrHashDelete(val keyOrHash: kotlin.String)

    /**
     * Create API keys for a user
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     * @param expiry Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h (optional)
     * @param perms Permissions -- currently unused (optional)
     */
    @Location("/user/api-keys") class userApiKeysPost(val expiry: kotlin.String, val perms: kotlin.String)

    /**
     * Export user data
     * This endpoint is used to get API keys for a user.
     */
    @Location("/user/export") class userExportGet()

    /**
     * Get stats for the current user
     * This endpoint is used to get stats for the current user.
     */
    @Location("/user/stats") class userStatsGet()

}
