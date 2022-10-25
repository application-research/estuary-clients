import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';



part 'default_api.jretro.dart';

@GenApiClient()
class DefaultApi extends _$DefaultApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    DefaultApi({this.base, this.serializers});

    /// 
    ///
    /// 
    @PostReq(path: "/deal/transfer/status", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealTransferStatusPost(
    );


}
