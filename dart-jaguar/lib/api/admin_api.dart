import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';



part 'admin_api.jretro.dart';

@GenApiClient()
class AdminApi extends _$AdminApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    AdminApi({this.base, this.serializers});

    /// Remove peers on Peering Service
    ///
    /// This endpoint can be used to remove a Peer from the Peering Service
    @DeleteReq(path: "/admin/peering/peers", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminPeeringPeersDelete(
        
        @AsJson() List<String> body
    );

    /// List all Peering peers
    ///
    /// This endpoint can be used to list all peers on Peering Service
    @GetReq(path: "/admin/peering/peers", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminPeeringPeersGet(
    );

    /// Add peers on Peering Service
    ///
    /// This endpoint can be used to add a Peer from the Peering Service
    @PostReq(path: "/admin/peering/peers", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminPeeringPeersPost(
    );

    /// Start Peering
    ///
    /// This endpoint can be used to start the Peering Service
    @PostReq(path: "/admin/peering/start", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminPeeringStartPost(
    );

    /// Check Peering Status
    ///
    /// This endpoint can be used to check the Peering status
    @GetReq(path: "/admin/peering/status", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminPeeringStatusGet(
    );

    /// Stop Peering
    ///
    /// This endpoint can be used to stop the Peering Service
    @PostReq(path: "/admin/peering/stop", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminPeeringStopPost(
    );

    /// Get systems(estuary/shuttle) config
    ///
    /// This endpoint is used to get system configs.
    @GetReq(path: "/admin/system/config", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminSystemConfigGet(
    );

    /// Get all users
    ///
    /// This endpoint is used to get all users.
    @GetReq(path: "/admin/users", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> adminUsersGet(
    );


}
