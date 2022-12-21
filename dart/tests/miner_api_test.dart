import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for MinerApi
void main() {
  var instance = new MinerApi();

  group('tests for MinerApi', () {
    // Get Claim Miner Message
    //
    // This endpoint lets a user get the message in order to claim a miner
    //
    //Future<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse> minerClaimMinerGet(String miner) async
    test('test minerClaimMinerGet', () async {
      // TODO
    });

    // Claim Miner
    //
    // This endpoint lets a user claim a miner
    //
    //Future<GithubComApplicationResearchEstuaryApiV1ClaimResponse> minerClaimPost(MinerClaimMinerBody body) async
    test('test minerClaimPost', () async {
      // TODO
    });

    // Set Miner Info
    //
    // This endpoint lets a user set miner info.
    //
    //Future<Map<String, String>> minerSetInfoMinerPut(MinerMinerSetInfoParams body, String miner) async
    test('test minerSetInfoMinerPut', () async {
      // TODO
    });

    // Suspend Miner
    //
    // This endpoint lets a user suspend a miner.
    //
    //Future<Map<String, String>> minerSuspendMinerPost(MinerSuspendMinerBody body, String miner) async
    test('test minerSuspendMinerPost', () async {
      // TODO
    });

    // Unuspend Miner
    //
    // This endpoint lets a user unsuspend a miner.
    //
    //Future<Map<String, String>> minerUnsuspendMinerPut(String miner) async
    test('test minerUnsuspendMinerPut', () async {
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

    // Get miner stats
    //
    // This endpoint returns miner stats
    //
    //Future<String> publicMinersStatsMinerGet(String miner) async
    test('test publicMinersStatsMinerGet', () async {
      // TODO
    });

  });
}
