import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/util_content_add_ipfs_body.dart';
import 'package:swagger/model/util_content_add_response.dart';
import 'package:swagger/model/main_import_deal_body.dart';


part 'content_api.jretro.dart';

@GenApiClient()
class ContentApi extends _$ContentApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    ContentApi({this.base, this.serializers});

    /// Add Car object
    ///
    /// This endpoint is used to add a car object to the network. The object can be a file or a directory.
    @PostReq(path: "/content/add-car", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentAddCarPost(
        
        @QueryParam("filename") String filename, 
        
        @QueryParam("commp") String commp, 
        
        @QueryParam("size") String size
        ,
        @AsJson() String body, 
    );

    /// Add IPFS object
    ///
    /// This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
    @PostReq(path: "/content/add-ipfs", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentAddIpfsPost(
        
        @AsJson() UtilContentAddIpfsBody body
    );

    /// Add new content
    ///
    /// This endpoint is used to upload new content.
    @PostReq(path: "/content/add", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<UtilContentAddResponse> contentAddPost(
            @PathParam("coluuid") String coluuid, 
            @PathParam("dir") String dir
        ,
        @AsMultipartField() MultipartFile file
    );

    /// Get aggregated content stats
    ///
    /// This endpoint returns aggregated content stats
    @GetReq(path: "/content/aggregated/:content", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> contentAggregatedContentGet(
            @PathParam("content") String content
    );

    /// Get all deals for a user
    ///
    /// This endpoint is used to get all deals for a user
    @GetReq(path: "/content/all-deals", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentAllDealsGet(
        
        @QueryParam("begin") String begin, 
        
        @QueryParam("duration") String duration, 
        
        @QueryParam("all") String all
    );

    /// Get content bandwidth
    ///
    /// This endpoint returns content bandwidth
    @GetReq(path: "/content/bw-usage/:content", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentBwUsageContentGet(
            @PathParam("content") String content
    );

    /// Add a new content
    ///
    /// This endpoint adds a new content
    @PostReq(path: "/content/create", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentCreatePost(
        
        @AsJson() String body
    );

    /// Content with deals
    ///
    /// This endpoint lists all content with deals
    @GetReq(path: "/content/deals", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentDealsGet(
        
        @QueryParam("limit") int limit, 
        
        @QueryParam("offset") int offset
    );

    /// Ensure Replication
    ///
    /// This endpoint ensures that the content is replicated to the specified number of providers
    @GetReq(path: "/content/ensure-replication/:datacid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentEnsureReplicationDatacidGet(
            @PathParam("datacid") String datacid
    );

    /// List all failures for a content
    ///
    /// This endpoint returns all failures for a content
    @GetReq(path: "/content/failures/:content", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> contentFailuresContentGet(
            @PathParam("content") String content
    );

    /// Import a deal
    ///
    /// This endpoint imports a deal into the shuttle.
    @PostReq(path: "/content/importdeal", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentImportdealPost(
        
        @AsJson() MainImportDealBody body
    );

    /// List all pinned content
    ///
    /// This endpoint lists all content
    @GetReq(path: "/content/list", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<List<String>> contentListGet(
    );

    /// Read content
    ///
    /// This endpoint reads content from the blockstore
    @GetReq(path: "/content/read/:cont", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentReadContGet(
            @PathParam("cont") String cont
    );

    /// Get staging zone for user
    ///
    /// This endpoint is used to get staging zone for user.
    @GetReq(path: "/content/staging-zones", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentStagingZonesGet(
    );

    /// Get content statistics
    ///
    /// This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
    @GetReq(path: "/content/stats", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentStatsGet(
            @PathParam("limit") String limit
    );

    /// Content Status
    ///
    /// This endpoint returns the status of a content
    @GetReq(path: "/content/status/:id", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> contentStatusIdGet(
            @PathParam("id") int id
    );


}
