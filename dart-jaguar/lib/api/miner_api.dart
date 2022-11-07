import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/util_http_error.dart';


part 'miner_api.jretro.dart';

@GenApiClient()
class MinerApi extends _$MinerApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    MinerApi({this.base, this.serializers});

    /// Get all miners deals
    ///
    /// This endpoint returns all miners deals
    @GetReq(path: "/public/miners/deals/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMinersDealsMinerGet(
            @PathParam("miner") String miner
        ,
        @QueryParam("ignore-failed") String ignoreFailed
    );

    /// Get miner stats
    ///
    /// This endpoint returns miner stats
    @GetReq(path: "/public/miners/stats/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMinersStatsMinerGet(
            @PathParam("miner") String miner
    );


}
