import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for PeersApi
void main() {
  var instance = new PeersApi();

  group('tests for PeersApi', () {
    // Remove peers on Peering Service
    //
    // This endpoint can be used to remove a Peer from the Peering Service
    //
    //Future<String> adminPeeringPeersDelete(List<bool> body) async
    test('test adminPeeringPeersDelete', () async {
      // TODO
    });

    // List all Peering peers
    //
    // This endpoint can be used to list all peers on Peering Service
    //
    //Future<String> adminPeeringPeersGet() async
    test('test adminPeeringPeersGet', () async {
      // TODO
    });

    // Add peers on Peering Service
    //
    // This endpoint can be used to add a Peer from the Peering Service
    //
    //Future<String> adminPeeringPeersPost() async
    test('test adminPeeringPeersPost', () async {
      // TODO
    });

    // Start Peering
    //
    // This endpoint can be used to start the Peering Service
    //
    //Future<String> adminPeeringStartPost() async
    test('test adminPeeringStartPost', () async {
      // TODO
    });

    // Check Peering Status
    //
    // This endpoint can be used to check the Peering status
    //
    //Future<String> adminPeeringStatusGet() async
    test('test adminPeeringStatusGet', () async {
      // TODO
    });

    // Stop Peering
    //
    // This endpoint can be used to stop the Peering Service
    //
    //Future<String> adminPeeringStopPost() async
    test('test adminPeeringStopPost', () async {
      // TODO
    });

  });
}
