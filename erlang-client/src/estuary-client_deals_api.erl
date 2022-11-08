-module(estuary-client_deals_api).

-export([deal_estimate_post/2, deal_estimate_post/3,
         deal_info_dealid_get/2, deal_info_dealid_get/3,
         deal_proposal_propcid_get/2, deal_proposal_propcid_get/3,
         deal_query_miner_get/2, deal_query_miner_get/3,
         deal_status_by_proposal_propcid_get/2, deal_status_by_proposal_propcid_get/3,
         deal_status_miner_propcid_get/3, deal_status_miner_propcid_get/4,
         deal_transfer_in_progress_get/1, deal_transfer_in_progress_get/2,
         deal_transfer_status_post/2, deal_transfer_status_post/3,
         deals_failures_get/1, deals_failures_get/2,
         deals_make_miner_post/3, deals_make_miner_post/4,
         deals_status_deal_get/2, deals_status_deal_get/3,
         public_deals_failures_get/1, public_deals_failures_get/2,
         public_miners_storage_query_miner_get/2, public_miners_storage_query_miner_get/3]).

-define(BASE_URL, "/").

%% @doc Estimate the cost of a deal
%% This endpoint estimates the cost of a deal
-spec deal_estimate_post(ctx:ctx(), estuary-client_main_estimate_deal_body:estuary-client_main_estimate_deal_body()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_estimate_post(Ctx, Body) ->
    deal_estimate_post(Ctx, Body, #{}).

-spec deal_estimate_post(ctx:ctx(), estuary-client_main_estimate_deal_body:estuary-client_main_estimate_deal_body(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_estimate_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/deal/estimate"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Deal Info
%% This endpoint returns the deal info for a deal
-spec deal_info_dealid_get(ctx:ctx(), integer()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_info_dealid_get(Ctx, Dealid) ->
    deal_info_dealid_get(Ctx, Dealid, #{}).

-spec deal_info_dealid_get(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_info_dealid_get(Ctx, Dealid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deal/info/", Dealid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Proposal
%% This endpoint returns the proposal for a deal
-spec deal_proposal_propcid_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_proposal_propcid_get(Ctx, Propcid) ->
    deal_proposal_propcid_get(Ctx, Propcid, #{}).

-spec deal_proposal_propcid_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_proposal_propcid_get(Ctx, Propcid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deal/proposal/", Propcid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Query Ask
%% This endpoint returns the ask for a given CID
-spec deal_query_miner_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_query_miner_get(Ctx, Miner) ->
    deal_query_miner_get(Ctx, Miner, #{}).

-spec deal_query_miner_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_query_miner_get(Ctx, Miner, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deal/query/", Miner, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Deal Status by PropCid
%% Get Deal Status by PropCid
-spec deal_status_by_proposal_propcid_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_status_by_proposal_propcid_get(Ctx, Propcid) ->
    deal_status_by_proposal_propcid_get(Ctx, Propcid, #{}).

-spec deal_status_by_proposal_propcid_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_status_by_proposal_propcid_get(Ctx, Propcid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deal/status-by-proposal/", Propcid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deal Status
%% This endpoint returns the status of a deal
-spec deal_status_miner_propcid_get(ctx:ctx(), binary(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_status_miner_propcid_get(Ctx, Miner, Propcid) ->
    deal_status_miner_propcid_get(Ctx, Miner, Propcid, #{}).

-spec deal_status_miner_propcid_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_status_miner_propcid_get(Ctx, Miner, Propcid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deal/status/", Miner, "/", Propcid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Transfer In Progress
%% This endpoint returns the in-progress transfers
-spec deal_transfer_in_progress_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_transfer_in_progress_get(Ctx) ->
    deal_transfer_in_progress_get(Ctx, #{}).

-spec deal_transfer_in_progress_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_transfer_in_progress_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deal/transfer/in-progress"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Transfer Status
%% This endpoint returns the status of a transfer
-spec deal_transfer_status_post(ctx:ctx(), estuary-client_main_channel_id_param:estuary-client_main_channel_id_param()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_transfer_status_post(Ctx, Chanid) ->
    deal_transfer_status_post(Ctx, Chanid, #{}).

-spec deal_transfer_status_post(ctx:ctx(), estuary-client_main_channel_id_param:estuary-client_main_channel_id_param(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deal_transfer_status_post(Ctx, Chanid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/deal/transfer/status"],
    QS = [],
    Headers = [],
    Body1 = Chanid,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get storage failures for user
%% This endpoint returns a list of storage failures for user
-spec deals_failures_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deals_failures_get(Ctx) ->
    deals_failures_get(Ctx, #{}).

-spec deals_failures_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deals_failures_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deals/failures"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Make Deal
%% This endpoint makes a deal for a given content and miner
-spec deals_make_miner_post(ctx:ctx(), binary(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deals_make_miner_post(Ctx, Miner, DealRequest) ->
    deals_make_miner_post(Ctx, Miner, DealRequest, #{}).

-spec deals_make_miner_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deals_make_miner_post(Ctx, Miner, DealRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/deals/make/", Miner, ""],
    QS = [],
    Headers = [],
    Body1 = DealRequest,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Deal Status
%% This endpoint returns the status of a deal
-spec deals_status_deal_get(ctx:ctx(), integer()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deals_status_deal_get(Ctx, Deal) ->
    deals_status_deal_get(Ctx, Deal, #{}).

-spec deals_status_deal_get(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
deals_status_deal_get(Ctx, Deal, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/deals/status/", Deal, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get storage failures
%% This endpoint returns a list of storage failures
-spec public_deals_failures_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_deals_failures_get(Ctx) ->
    public_deals_failures_get(Ctx, #{}).

-spec public_deals_failures_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_deals_failures_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/deals/failures"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Query Ask
%% This endpoint returns the ask for a given CID
-spec public_miners_storage_query_miner_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_storage_query_miner_get(Ctx, Miner) ->
    public_miners_storage_query_miner_get(Ctx, Miner, #{}).

-spec public_miners_storage_query_miner_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
public_miners_storage_query_miner_get(Ctx, Miner, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/public/miners/storage/query/", Miner, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


