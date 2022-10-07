-module(swagger_user_api).

-export([user_api_keys_get/1, user_api_keys_get/2,
         user_api_keys_key_delete/2, user_api_keys_key_delete/3,
         user_api_keys_post/1, user_api_keys_post/2,
         user_export_get/1, user_export_get/2,
         user_stats_get/1, user_stats_get/2]).

-define(BASE_URL, "/").

%% @doc Get API keys for a user
%% This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
-spec user_api_keys_get(ctx:ctx()) -> {ok, [swagger_main_get_api_keys_resp:swagger_main_get_api_keys_resp()], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_api_keys_get(Ctx) ->
    user_api_keys_get(Ctx, #{}).

-spec user_api_keys_get(ctx:ctx(), maps:map()) -> {ok, [swagger_main_get_api_keys_resp:swagger_main_get_api_keys_resp()], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_api_keys_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/user/api-keys"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Revoke a User API Key.
%% This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
-spec user_api_keys_key_delete(ctx:ctx(), binary()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_api_keys_key_delete(Ctx, Key) ->
    user_api_keys_key_delete(Ctx, Key, #{}).

-spec user_api_keys_key_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_api_keys_key_delete(Ctx, Key, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/user/api-keys/", Key, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create API keys for a user
%% This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
-spec user_api_keys_post(ctx:ctx()) -> {ok, swagger_main_get_api_keys_resp:swagger_main_get_api_keys_resp(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_api_keys_post(Ctx) ->
    user_api_keys_post(Ctx, #{}).

-spec user_api_keys_post(ctx:ctx(), maps:map()) -> {ok, swagger_main_get_api_keys_resp:swagger_main_get_api_keys_resp(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_api_keys_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/user/api-keys"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export user data
%% This endpoint is used to get API keys for a user.
-spec user_export_get(ctx:ctx()) -> {ok, binary(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_export_get(Ctx) ->
    user_export_get(Ctx, #{}).

-spec user_export_get(ctx:ctx(), maps:map()) -> {ok, binary(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_export_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/user/export"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create API keys for a user
%% This endpoint is used to create API keys for a user.
-spec user_stats_get(ctx:ctx()) -> {ok, swagger_main_user_stats_response:swagger_main_user_stats_response(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_stats_get(Ctx) ->
    user_stats_get(Ctx, #{}).

-spec user_stats_get(ctx:ctx(), maps:map()) -> {ok, swagger_main_user_stats_response:swagger_main_user_stats_response(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
user_stats_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/user/stats"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


