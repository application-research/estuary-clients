import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/util_http_error.dart';


part 'metrics_api.jretro.dart';

@GenApiClient()
class MetricsApi extends _$MetricsApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    MetricsApi({this.base, this.serializers});

    /// Get deal metrics
    ///
    /// This endpoint is used to get deal metrics
    @GetReq(path: "/public/metrics/deals-on-chain", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMetricsDealsOnChainGet(
    );


}
