-module(estuary-client_default_api).

-export([deal_transfer_status_post/1, deal_transfer_status_post/2]).

-define(BASE_URL, "/").

%% @doc 
%% 
-spec deal_transfer_status_post(ctx:ctx()) -> {ok, [], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_transfer_status_post(Ctx) ->
    deal_transfer_status_post(Ctx, #{}).

-spec deal_transfer_status_post(ctx:ctx(), maps:map()) -> {ok, [], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_transfer_status_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/deal/transfer/status"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


