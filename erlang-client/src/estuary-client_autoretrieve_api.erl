-module(estuary-client_autoretrieve_api).

-export([admin_autoretrieve_init_post/3, admin_autoretrieve_init_post/4,
         admin_autoretrieve_list_get/1, admin_autoretrieve_list_get/2,
         autoretrieve_heartbeat_post/2, autoretrieve_heartbeat_post/3]).

-define(BASE_URL, "/").

%% @doc Register autoretrieve server
%% This endpoint registers a new autoretrieve server
-spec admin_autoretrieve_init_post(ctx:ctx(), binary(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_autoretrieve_init_post(Ctx, Addresses, PubKey) ->
    admin_autoretrieve_init_post(Ctx, Addresses, PubKey, #{}).

-spec admin_autoretrieve_init_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_autoretrieve_init_post(Ctx, Addresses, PubKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/admin/autoretrieve/init"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"addresses">>, Addresses}, {<<"pubKey">>, PubKey}]++estuary-client_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List autoretrieve servers
%% This endpoint lists all registered autoretrieve servers
-spec admin_autoretrieve_list_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_autoretrieve_list_get(Ctx) ->
    admin_autoretrieve_list_get(Ctx, #{}).

-spec admin_autoretrieve_list_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_autoretrieve_list_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/admin/autoretrieve/list"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Marks autoretrieve server as up
%% This endpoint updates the lastConnection field for autoretrieve
-spec autoretrieve_heartbeat_post(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
autoretrieve_heartbeat_post(Ctx, Token) ->
    autoretrieve_heartbeat_post(Ctx, Token, #{}).

-spec autoretrieve_heartbeat_post(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
autoretrieve_heartbeat_post(Ctx, Token, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/autoretrieve/heartbeat"],
    QS = [],
    Headers = [{<<"token">>, Token}]++estuary-client_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


