import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for NetApi
void main() {
  var instance = new NetApi();

  group('tests for NetApi', () {
    // Get all miners
    //
    // This endpoint returns all miners. Note: value may be cached
    //
    //Future<ApiMinerResp> adminMinersGet() async
    test('test adminMinersGet', () async {
      // TODO
    });

    // Get all miners
    //
    // This endpoint returns all miners
    //
    //Future<String> publicMinersFailuresMinerGet(String miner) async
    test('test publicMinersFailuresMinerGet', () async {
      // TODO
    });

    // Net Addrs
    //
    // This endpoint is used to get net addrs
    //
    //Future<List<String>> publicNetAddrsGet() async
    test('test publicNetAddrsGet', () async {
      // TODO
    });

    // Net Peers
    //
    // This endpoint is used to get net peers
    //
    //Future<List<String>> publicNetPeersGet() async
    test('test publicNetPeersGet', () async {
      // TODO
    });

  });
}
