import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/collections_collection.dart';
import 'package:swagger/model/main_delete_content_from_collection_body.dart';
import 'package:swagger/model/main_create_collection_body.dart';
import 'package:swagger/model/util_http_error.dart';


part 'collections_api.jretro.dart';

@GenApiClient()
class CollectionsApi extends _$CollectionsApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    CollectionsApi({this.base, this.serializers});

    /// Produce a CID of the collection contents
    ///
    /// This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
    @PostReq(path: "/collections/:coluuid/commit", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> collectionsColuuidCommitPost(
            @PathParam("coluuid") String coluuid
    );

    /// Deletes a content from a collection
    ///
    /// This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
    @DeleteReq(path: "/collections/:coluuid/contents", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> collectionsColuuidContentsDelete(
            @PathParam("coluuid") String coluuid, 
            @PathParam("contentid") String contentid
        ,
        @AsJson() MainDeleteContentFromCollectionBody body
    );

    /// Deletes a collection
    ///
    /// This endpoint is used to delete an existing collection.
    @DeleteReq(path: "/collections/:coluuid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> collectionsColuuidDelete(
            @PathParam("coluuid") String coluuid
    );

    /// Get contents in a collection
    ///
    /// This endpoint is used to get contents in a collection. If no colpath query param is passed
    @GetReq(path: "/collections/:coluuid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> collectionsColuuidGet(
            @PathParam("coluuid") String coluuid
        ,
        @QueryParam("dir") String dir
    );

    /// Add contents to a collection
    ///
    /// This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
    @PostReq(path: "/collections/:coluuid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> collectionsColuuidPost(
            @PathParam("coluuid") String coluuid
        ,
        @AsJson() List<int> contentIDs
    );

    /// Add a file to a collection
    ///
    /// This endpoint adds a file to a collection
    @PostReq(path: "/collections/fs/add", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> collectionsFsAddPost(
        
        @QueryParam("coluuid") String coluuid, 
        
        @QueryParam("content") String content, 
        
        @QueryParam("path") String path
    );

    /// List all collections
    ///
    /// This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
    @GetReq(path: "/collections/", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<List<List<CollectionsCollection>>> collectionsGet(
    );

    /// Create a new collection
    ///
    /// This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
    @PostReq(path: "/collections/", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<CollectionsCollection> collectionsPost(
        
        @AsJson() MainCreateCollectionBody body
    );


}
