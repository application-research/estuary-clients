import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for CollectionsApi
void main() {
  var instance = new CollectionsApi();

  group('tests for CollectionsApi', () {
    // Produce a CID of the collection contents
    //
    // This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
    //
    //Future<String> collectionsColuuidCommitPost(String coluuid) async
    test('test collectionsColuuidCommitPost', () async {
      // TODO
    });

    // Deletes a content from a collection
    //
    // This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
    //
    //Future<String> collectionsColuuidContentsDelete(MainDeleteContentFromCollectionBody body, String coluuid, String contentid) async
    test('test collectionsColuuidContentsDelete', () async {
      // TODO
    });

    // Deletes a collection
    //
    // This endpoint is used to delete an existing collection.
    //
    //Future<String> collectionsColuuidDelete(String coluuid) async
    test('test collectionsColuuidDelete', () async {
      // TODO
    });

    // Get contents in a collection
    //
    // This endpoint is used to get contents in a collection. If no colpath query param is passed
    //
    //Future<String> collectionsColuuidGet(String coluuid, { String dir }) async
    test('test collectionsColuuidGet', () async {
      // TODO
    });

    // Add contents to a collection
    //
    // This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
    //
    //Future<String> collectionsColuuidPost(List<int> body, String coluuid) async
    test('test collectionsColuuidPost', () async {
      // TODO
    });

    // Add a file to a collection
    //
    // This endpoint adds a file to a collection
    //
    //Future<String> collectionsFsAddPost(String coluuid, String content, String path) async
    test('test collectionsFsAddPost', () async {
      // TODO
    });

    // List all collections
    //
    // This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
    //
    //Future<List<List<CollectionsCollection>>> collectionsGet() async
    test('test collectionsGet', () async {
      // TODO
    });

    // Create a new collection
    //
    // This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
    //
    //Future<CollectionsCollection> collectionsPost(MainCreateCollectionBody body) async
    test('test collectionsPost', () async {
      // TODO
    });

  });
}
