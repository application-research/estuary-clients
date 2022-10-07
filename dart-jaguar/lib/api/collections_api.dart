import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/main_collection.dart';
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

    /// Deletes a collection
    ///
    /// This endpoint is used to delete an existing collection.
    @DeleteReq(path: "/collections/:coluuid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> collectionsColuuidDelete(
            @PathParam("coluuid") String coluuid
    );

    /// Get contents in a collection
    ///
    /// This endpoint is used to get contents in a collection. If no colpath query param is passed
    @GetReq(path: "/collections/:coluuid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> collectionsColuuidGet(
        
        @QueryParam("coluuid") String coluuid, 
        
        @QueryParam("dir") String dir
    );

    /// Add contents to a collection
    ///
    /// This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
    @PostReq(path: "/collections/:coluuid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<Map<String, String>> collectionsColuuidPost(
        
        @AsJson() List<int> body
    );

    /// Add a file to a collection
    ///
    /// This endpoint adds a file to a collection
    @PostReq(path: "/collections/fs/add", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> collectionsFsAddPost(
        
        @QueryParam("coluuid") String coluuid, 
        
        @QueryParam("content") String content, 
        
        @QueryParam("path") String path
    );

    /// List all collections
    ///
    /// This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
    @GetReq(path: "/collections/", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<List<MainCollection>> collectionsGet(
            @PathParam("id") int id
    );

    /// Create a new collection
    ///
    /// This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
    @PostReq(path: "/collections/", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<MainCollection> collectionsPost(
        
        @AsJson() MainCreateCollectionBody body
    );


}
