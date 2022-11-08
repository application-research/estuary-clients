import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/util_http_error.dart';


part 'net_api.jretro.dart';

@GenApiClient()
class NetApi extends _$NetApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    NetApi({this.base, this.serializers});

    /// Net Addrs
    ///
    /// This endpoint is used to get net addrs
    @GetReq(path: "/net/addrs", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> netAddrsGet(
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


}
