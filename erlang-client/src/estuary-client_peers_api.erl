-module(estuary-client_peers_api).

-export([admin_peering_peers_delete/2, admin_peering_peers_delete/3,
         admin_peering_peers_get/1, admin_peering_peers_get/2,
         admin_peering_peers_post/1, admin_peering_peers_post/2,
         admin_peering_start_post/1, admin_peering_start_post/2,
         admin_peering_status_get/1, admin_peering_status_get/2,
         admin_peering_stop_post/1, admin_peering_stop_post/2]).

-define(BASE_URL, "/").

%% @doc Remove peers on Peering Service
%% This endpoint can be used to remove a Peer from the Peering Service
-spec admin_peering_peers_delete(ctx:ctx(), list()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_peers_delete(Ctx, PeerIds) ->
    admin_peering_peers_delete(Ctx, PeerIds, #{}).

-spec admin_peering_peers_delete(ctx:ctx(), list(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_peers_delete(Ctx, PeerIds, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/admin/peering/peers"],
    QS = [],
    Headers = [],
    Body1 = PeerIds,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List all Peering peers
%% This endpoint can be used to list all peers on Peering Service
-spec admin_peering_peers_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_peers_get(Ctx) ->
    admin_peering_peers_get(Ctx, #{}).

-spec admin_peering_peers_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_peers_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/admin/peering/peers"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add peers on Peering Service
%% This endpoint can be used to add a Peer from the Peering Service
-spec admin_peering_peers_post(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_peers_post(Ctx) ->
    admin_peering_peers_post(Ctx, #{}).

-spec admin_peering_peers_post(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_peers_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/admin/peering/peers"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Start Peering
%% This endpoint can be used to start the Peering Service
-spec admin_peering_start_post(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_start_post(Ctx) ->
    admin_peering_start_post(Ctx, #{}).

-spec admin_peering_start_post(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_start_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/admin/peering/start"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Check Peering Status
%% This endpoint can be used to check the Peering status
-spec admin_peering_status_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_status_get(Ctx) ->
    admin_peering_status_get(Ctx, #{}).

-spec admin_peering_status_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_status_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/admin/peering/status"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Stop Peering
%% This endpoint can be used to stop the Peering Service
-spec admin_peering_stop_post(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_stop_post(Ctx) ->
    admin_peering_stop_post(Ctx, #{}).

-spec admin_peering_stop_post(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
admin_peering_stop_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/admin/peering/stop"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


