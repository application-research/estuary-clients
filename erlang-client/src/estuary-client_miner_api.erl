-module(estuary-client_miner_api).

-export([public_miners_deals_miner_get/2, public_miners_deals_miner_get/3,
         public_miners_stats_miner_get/2, public_miners_stats_miner_get/3]).

-define(BASE_URL, "/").

%% @doc Get all miners deals
%% This endpoint returns all miners deals
-spec public_miners_deals_miner_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_deals_miner_get(Ctx, Miner) ->
    public_miners_deals_miner_get(Ctx, Miner, #{}).

-spec public_miners_deals_miner_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_deals_miner_get(Ctx, Miner, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/miners/deals/", Miner, ""],
    QS = lists:flatten([])++estuary-client_utils:optional_params(['ignore-failed'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get miner stats
%% This endpoint returns miner stats
-spec public_miners_stats_miner_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_stats_miner_get(Ctx, Miner) ->
    public_miners_stats_miner_get(Ctx, Miner, #{}).

-spec public_miners_stats_miner_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_stats_miner_get(Ctx, Miner, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/miners/stats/", Miner, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


