import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/main_user_stats_response.dart';
import 'package:swagger/model/main_get_api_keys_resp.dart';
import 'package:swagger/model/util_http_error.dart';


part 'user_api.jretro.dart';

@GenApiClient()
class UserApi extends _$UserApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    UserApi({this.base, this.serializers});

    /// Get API keys for a user
    ///
    /// This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
    @GetReq(path: "/user/api-keys", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<List<MainGetApiKeysResp>> userApiKeysGet(
    );

    /// Revoke a User API Key.
    ///
    /// This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
    @DeleteReq(path: "/user/api-keys/:key", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> userApiKeysKeyDelete(
            @PathParam("key") String key
    );

    /// Create API keys for a user
    ///
    /// This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
    @PostReq(path: "/user/api-keys", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<MainGetApiKeysResp> userApiKeysPost(
    );

    /// Export user data
    ///
    /// This endpoint is used to get API keys for a user.
    @GetReq(path: "/user/export", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> userExportGet(
    );

    /// Create API keys for a user
    ///
    /// This endpoint is used to create API keys for a user.
    @GetReq(path: "/user/stats", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<MainUserStatsResponse> userStatsGet(
    );


}
