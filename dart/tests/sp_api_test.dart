import 'package:swagger/api.dart';
import 'package:test/test.dart';


/// tests for SpApi
void main() {
  var instance = new SpApi();

  group('tests for SpApi', () {
    // Claim Storage Provider
    //
    // This endpoint lets a user claim a storage provider
    //
    //Future<GithubComApplicationResearchEstuaryApiV2ClaimResponse> storageProvidersClaimPost(MinerClaimMinerBody body) async
    test('test storageProvidersClaimPost', () async {
      // TODO
    });

    // Get Claim Storage Provider
    //
    // This endpoint lets a user get the message in order to claim a storage provider
    //
    //Future<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> storageProvidersClaimSpGet(String sp) async
    test('test storageProvidersClaimSpGet', () async {
      // TODO
    });

    // Get all storage providers deals
    //
    // This endpoint returns all storage providers deals
    //
    //Future<String> storageProvidersDealsSpGet(String sp, { String ignoreFailed }) async
    test('test storageProvidersDealsSpGet', () async {
      // TODO
    });

    // Get all storage providers
    //
    // This endpoint returns all storage providers
    //
    //Future<String> storageProvidersFailuresSpGet(String sp) async
    test('test storageProvidersFailuresSpGet', () async {
      // TODO
    });

    // Get all storage providers
    //
    // This endpoint returns all storage providers
    //
    //Future<List<ApiStorageProviderResp>> storageProvidersGet() async
    test('test storageProvidersGet', () async {
      // TODO
    });

    // Set Storage Provider Info
    //
    // This endpoint lets a user set storage provider info.
    //
    //Future storageProvidersSetInfoSpPut(MinerMinerSetInfoParams body, String sp) async
    test('test storageProvidersSetInfoSpPut', () async {
      // TODO
    });

    // Get storage provider stats
    //
    // This endpoint returns storage provider stats
    //
    //Future<String> storageProvidersStatsSpGet(String sp) async
    test('test storageProvidersStatsSpGet', () async {
      // TODO
    });

    // Suspend Storage Provider
    //
    // This endpoint lets a user suspend a storage provider.
    //
    //Future<Map<String, String>> storageProvidersSuspendSpPost(MinerSuspendMinerBody body, String sp) async
    test('test storageProvidersSuspendSpPost', () async {
      // TODO
    });

    // Unuspend Storage Provider
    //
    // This endpoint lets a user unsuspend a Storage Provider.
    //
    //Future storageProvidersUnsuspendSpPut(String sp) async
    test('test storageProvidersUnsuspendSpPut', () async {
      // TODO
    });

  });
}
