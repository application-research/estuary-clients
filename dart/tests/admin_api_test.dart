import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for AdminApi
void main() {
  var instance = new AdminApi();

  group('tests for AdminApi', () {
    // Get all miners
    //
    // This endpoint returns all miners. Note: value may be cached
    //
    //Future<ApiMinerResp> adminMinersGet() async
    test('test adminMinersGet', () async {
      // TODO
    });

    // Remove peers on Peering Service
    //
    // This endpoint can be used to remove a Peer from the Peering Service
    //
    //Future<String> adminPeeringPeersDelete(List<String> body) async
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
    //Future<String> adminPeeringPeersPost(List<PeeringPeeringPeer> body) async
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

    // Get systems(estuary/shuttle) config
    //
    // This endpoint is used to get system configs.
    //
    //Future<String> adminSystemConfigGet() async
    test('test adminSystemConfigGet', () async {
      // TODO
    });

    // Get all users
    //
    // This endpoint is used to get all users.
    //
    //Future<String> adminUsersGet() async
    test('test adminUsersGet', () async {
      // TODO
    });

  });
}
