-module(swagger_metrics_api).

-export([public_metrics_deals_on_chain_get/1, public_metrics_deals_on_chain_get/2]).

-define(BASE_URL, "/").

%% @doc Get deal metrics
%% This endpoint is used to get deal metrics
-spec public_metrics_deals_on_chain_get(ctx:ctx()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
public_metrics_deals_on_chain_get(Ctx) ->
    public_metrics_deals_on_chain_get(Ctx, #{}).

-spec public_metrics_deals_on_chain_get(ctx:ctx(), maps:map()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
public_metrics_deals_on_chain_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/metrics/deals-on-chain"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


