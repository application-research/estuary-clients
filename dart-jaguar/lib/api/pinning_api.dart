import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/types_ipfs_pin.dart';
import 'package:swagger/model/types_ipfs_list_pin_status_response.dart';
import 'package:swagger/model/types_ipfs_pin_status_response.dart';
import 'package:swagger/model/util_http_error.dart';


part 'pinning_api.jretro.dart';

@GenApiClient()
class PinningApi extends _$PinningApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    PinningApi({this.base, this.serializers});

    /// List all pin status objects
    ///
    /// This endpoint lists all pin status objects
    @GetReq(path: "/pinning/pins", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<TypesIpfsListPinStatusResponse> pinningPinsGet(
    );

    /// Delete a pinned object
    ///
    /// This endpoint deletes a pinned object.
    @DeleteReq(path: "/pinning/pins/:pinid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> pinningPinsPinidDelete(
            @PathParam("pinid") String pinid
    );

    /// Get a pin status object
    ///
    /// This endpoint returns a pin status object.
    @GetReq(path: "/pinning/pins/:pinid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<TypesIpfsPinStatusResponse> pinningPinsPinidGet(
            @PathParam("pinid") String pinid
    );

    /// Replace a pinned object
    ///
    /// This endpoint replaces a pinned object.
    @PostReq(path: "/pinning/pins/:pinid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<TypesIpfsPinStatusResponse> pinningPinsPinidPost(
            @PathParam("pinid") String pinid
        ,
        @AsJson() String meta
    );

    /// Add and pin object
    ///
    /// This endpoint adds a pin to the IPFS daemon.
    @PostReq(path: "/pinning/pins", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<TypesIpfsPinStatusResponse> pinningPinsPost(
        
        @AsJson() TypesIpfsPin pin
    );


}
