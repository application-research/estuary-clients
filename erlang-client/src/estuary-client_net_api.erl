-module(estuary-client_net_api).

-export([net_addrs_get/1, net_addrs_get/2,
         public_miners_failures_miner_get/2, public_miners_failures_miner_get/3,
         public_miners_get/1, public_miners_get/2,
         public_net_addrs_get/1, public_net_addrs_get/2,
         public_net_peers_get/1, public_net_peers_get/2]).

-define(BASE_URL, "/").

%% @doc Net Addrs
%% This endpoint is used to get net addrs
-spec net_addrs_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
net_addrs_get(Ctx) ->
    net_addrs_get(Ctx, #{}).

-spec net_addrs_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
net_addrs_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/net/addrs"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all miners
%% This endpoint returns all miners
-spec public_miners_failures_miner_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_failures_miner_get(Ctx, Miner) ->
    public_miners_failures_miner_get(Ctx, Miner, #{}).

-spec public_miners_failures_miner_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_failures_miner_get(Ctx, Miner, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/miners/failures/", Miner, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all miners
%% This endpoint returns all miners
-spec public_miners_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_get(Ctx) ->
    public_miners_get(Ctx, #{}).

-spec public_miners_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/miners"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Net Addrs
%% This endpoint is used to get net addrs
-spec public_net_addrs_get(ctx:ctx()) -> {ok, [binary()], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_net_addrs_get(Ctx) ->
    public_net_addrs_get(Ctx, #{}).

-spec public_net_addrs_get(ctx:ctx(), maps:map()) -> {ok, [binary()], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_net_addrs_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/net/addrs"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Net Peers
%% This endpoint is used to get net peers
-spec public_net_peers_get(ctx:ctx()) -> {ok, [binary()], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_net_peers_get(Ctx) ->
    public_net_peers_get(Ctx, #{}).

-spec public_net_peers_get(ctx:ctx(), maps:map()) -> {ok, [binary()], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_net_peers_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/net/peers"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


