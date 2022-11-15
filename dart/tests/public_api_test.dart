import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for PublicApi
void main() {
  var instance = new PublicApi();

  group('tests for PublicApi', () {
    // Get Content by Cid
    //
    // This endpoint returns the content associated with a CID
    //
    //Future<String> publicByCidCidGet(String cid) async
    test('test publicByCidCidGet', () async {
      // TODO
    });

    // Get public node info
    //
    // This endpoint returns information about the node
    //
    //Future<String> publicInfoGet() async
    test('test publicInfoGet', () async {
      // TODO
    });

    // Get deal metrics
    //
    // This endpoint is used to get deal metrics
    //
    //Future<String> publicMetricsDealsOnChainGet() async
    test('test publicMetricsDealsOnChainGet', () async {
      // TODO
    });

    // Get all miners deals
    //
    // This endpoint returns all miners deals
    //
    //Future<String> publicMinersDealsMinerGet(String miner, { String ignoreFailed }) async
    test('test publicMinersDealsMinerGet', () async {
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

    // Get all miners
    //
    // This endpoint returns all miners
    //
    //Future<String> publicMinersGet() async
    test('test publicMinersGet', () async {
      // TODO
    });

    // Get miner stats
    //
    // This endpoint returns miner stats
    //
    //Future<String> publicMinersStatsMinerGet(String miner) async
    test('test publicMinersStatsMinerGet', () async {
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

    // Public stats
    //
    // This endpoint is used to get public stats.
    //
    //Future<String> publicStatsGet() async
    test('test publicStatsGet', () async {
      // TODO
    });

  });
}
