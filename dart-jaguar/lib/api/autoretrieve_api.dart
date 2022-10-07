import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';



part 'autoretrieve_api.jretro.dart';

@GenApiClient()
class AutoretrieveApi extends _$AutoretrieveApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    AutoretrieveApi({this.base, this.serializers});

    /// Register autoretrieve server
    ///
    /// This endpoint registers a new autoretrieve server
    @PostReq(path: "/admin/autoretrieve/init", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminAutoretrieveInitPost(
        
        @AsJson() String pubKey
    );

    /// List autoretrieve servers
    ///
    /// This endpoint lists all registered autoretrieve servers
    @GetReq(path: "/admin/autoretrieve/list", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminAutoretrieveListGet(
    );

    /// Marks autoretrieve server as up
    ///
    /// This endpoint updates the lastConnection field for autoretrieve
    @PostReq(path: "/autoretrieve/heartbeat", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> autoretrieveHeartbeatPost(
        
        @Header("token") String token
    );


}
