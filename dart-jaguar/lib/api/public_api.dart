import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/util_http_error.dart';


part 'public_api.jretro.dart';

@GenApiClient()
class PublicApi extends _$PublicApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    PublicApi({this.base, this.serializers});

    /// Get Content by Cid
    ///
    /// This endpoint returns the content associated with a CID
    @GetReq(path: "/public/by-cid/:cid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicByCidCidGet(
            @PathParam("cid") String cid
    );

    /// Get public node info
    ///
    /// This endpoint returns information about the node
    @GetReq(path: "/public/info", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicInfoGet(
    );

    /// Get deal metrics
    ///
    /// This endpoint is used to get deal metrics
    @GetReq(path: "/public/metrics/deals-on-chain", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMetricsDealsOnChainGet(
    );

    /// Get all miners deals
    ///
    /// This endpoint returns all miners deals
    @GetReq(path: "/public/miners/deals/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMinersDealsMinerGet(
            @PathParam("miner") String miner
        ,
        @QueryParam("ignore-failed") String ignoreFailed
    );

    /// Get all miners
    ///
    /// This endpoint returns all miners
    @GetReq(path: "/public/miners/failures/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMinersFailuresMinerGet(
            @PathParam("miner") String miner
    );

    /// Get all miners
    ///
    /// This endpoint returns all miners
    @GetReq(path: "/public/miners", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMinersGet(
    );

    /// Get miner stats
    ///
    /// This endpoint returns miner stats
    @GetReq(path: "/public/miners/stats/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMinersStatsMinerGet(
            @PathParam("miner") String miner
    );

    /// Net Addrs
    ///
    /// This endpoint is used to get net addrs
    @GetReq(path: "/public/net/addrs", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<List<String>> publicNetAddrsGet(
    );

    /// Net Peers
    ///
    /// This endpoint is used to get net peers
    @GetReq(path: "/public/net/peers", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<List<String>> publicNetPeersGet(
    );

    /// Public stats
    ///
    /// This endpoint is used to get public stats.
    @GetReq(path: "/public/stats", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicStatsGet(
    );


}
