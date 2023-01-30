import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for PinningApi
void main() {
  var instance = new PinningApi();

  group('tests for PinningApi', () {
    // List all pin status objects
    //
    // This endpoint lists all pin status objects
    //
    //Future<PinnerIpfsListPinStatusResponse> pinningPinsGet() async
    test('test pinningPinsGet', () async {
      // TODO
    });

    // Delete a pinned object
    //
    // This endpoint deletes a pinned object.
    //
    //Future pinningPinsPinidDelete(String pinid) async
    test('test pinningPinsPinidDelete', () async {
      // TODO
    });

    // Get a pin status object
    //
    // This endpoint returns a pin status object.
    //
    //Future<PinnerIpfsPinStatusResponse> pinningPinsPinidGet(String pinid) async
    test('test pinningPinsPinidGet', () async {
      // TODO
    });

    // Replace a pinned object
    //
    // This endpoint replaces a pinned object.
    //
    //Future<PinnerIpfsPinStatusResponse> pinningPinsPinidPost(PinnerIpfsPin body, String pinid) async
    test('test pinningPinsPinidPost', () async {
      // TODO
    });

    // Add and pin object
    //
    // This endpoint adds a pin to the IPFS daemon.
    //
    //Future<PinnerIpfsPinStatusResponse> pinningPinsPost(PinnerIpfsPin body, { String ignoreDupes, String overwrite }) async
    test('test pinningPinsPost', () async {
      // TODO
    });

  });
}
