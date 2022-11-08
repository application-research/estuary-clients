-module(estuary-client_content_api).

-export([content_add_car_post/2, content_add_car_post/3,
         content_add_ipfs_post/2, content_add_ipfs_post/3,
         content_add_post/2, content_add_post/3,
         content_aggregated_content_get/2, content_aggregated_content_get/3,
         content_all_deals_get/4, content_all_deals_get/5,
         content_bw_usage_content_get/2, content_bw_usage_content_get/3,
         content_create_post/2, content_create_post/3,
         content_deals_get/1, content_deals_get/2,
         content_ensure_replication_datacid_get/2, content_ensure_replication_datacid_get/3,
         content_failures_content_get/2, content_failures_content_get/3,
         content_id_get/2, content_id_get/3,
         content_importdeal_post/2, content_importdeal_post/3,
         content_list_get/1, content_list_get/2,
         content_read_cont_get/2, content_read_cont_get/3,
         content_staging_zones_get/1, content_staging_zones_get/2,
         content_stats_get/3, content_stats_get/4,
         content_status_id_get/2, content_status_id_get/3]).

-define(BASE_URL, "/").

%% @doc Add Car object
%% This endpoint is used to add a car object to the network. The object can be a file or a directory.
-spec content_add_car_post(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_add_car_post(Ctx, Body) ->
    content_add_car_post(Ctx, Body, #{}).

-spec content_add_car_post(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_add_car_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/add-car"],
    QS = lists:flatten([])++estuary-client_utils:optional_params(['ignore-dupes', 'filename'], _OptionalParams),
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add IPFS object
%% This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
-spec content_add_ipfs_post(ctx:ctx(), estuary-client_util_content_add_ipfs_body:estuary-client_util_content_add_ipfs_body()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_add_ipfs_post(Ctx, Body) ->
    content_add_ipfs_post(Ctx, Body, #{}).

-spec content_add_ipfs_post(ctx:ctx(), estuary-client_util_content_add_ipfs_body:estuary-client_util_content_add_ipfs_body(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_add_ipfs_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/add-ipfs"],
    QS = lists:flatten([])++estuary-client_utils:optional_params(['ignore-dupes'], _OptionalParams),
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add new content
%% This endpoint is used to upload new content.
-spec content_add_post(ctx:ctx(), binary()) -> {ok, estuary-client_util_content_add_response:estuary-client_util_content_add_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_add_post(Ctx, Data) ->
    content_add_post(Ctx, Data, #{}).

-spec content_add_post(ctx:ctx(), binary(), maps:map()) -> {ok, estuary-client_util_content_add_response:estuary-client_util_content_add_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_add_post(Ctx, Data, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/add"],
    QS = lists:flatten([])++estuary-client_utils:optional_params(['coluuid', 'replication', 'ignore-dupes', 'lazy-provide', 'dir'], _OptionalParams),
    Headers = [],
    Body1 = {form, [{<<"data">>, Data}]++estuary-client_utils:optional_params([, 'filename'], _OptionalParams)},
    ContentTypeHeader = estuary-client_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get aggregated content stats
%% This endpoint returns aggregated content stats
-spec content_aggregated_content_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_aggregated_content_get(Ctx, Content) ->
    content_aggregated_content_get(Ctx, Content, #{}).

-spec content_aggregated_content_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_aggregated_content_get(Ctx, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/aggregated/", Content, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all deals for a user
%% This endpoint is used to get all deals for a user
-spec content_all_deals_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_all_deals_get(Ctx, Begin_, Duration, All) ->
    content_all_deals_get(Ctx, Begin_, Duration, All, #{}).

-spec content_all_deals_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_all_deals_get(Ctx, Begin_, Duration, All, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/all-deals"],
    QS = lists:flatten([{<<"begin">>, Begin_}, {<<"duration">>, Duration}, {<<"all">>, All}])++estuary-client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get content bandwidth
%% This endpoint returns content bandwidth
-spec content_bw_usage_content_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_bw_usage_content_get(Ctx, Content) ->
    content_bw_usage_content_get(Ctx, Content, #{}).

-spec content_bw_usage_content_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_bw_usage_content_get(Ctx, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/bw-usage/", Content, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add a new content
%% This endpoint adds a new content
-spec content_create_post(ctx:ctx(), estuary-client_util_content_create_body:estuary-client_util_content_create_body()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_create_post(Ctx, Req) ->
    content_create_post(Ctx, Req, #{}).

-spec content_create_post(ctx:ctx(), estuary-client_util_content_create_body:estuary-client_util_content_create_body(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_create_post(Ctx, Req, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/create"],
    QS = lists:flatten([])++estuary-client_utils:optional_params(['ignore-dupes'], _OptionalParams),
    Headers = [],
    Body1 = Req,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Content with deals
%% This endpoint lists all content with deals
-spec content_deals_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_deals_get(Ctx) ->
    content_deals_get(Ctx, #{}).

-spec content_deals_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_deals_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/deals"],
    QS = lists:flatten([])++estuary-client_utils:optional_params(['limit', 'offset'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Ensure Replication
%% This endpoint ensures that the content is replicated to the specified number of providers
-spec content_ensure_replication_datacid_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_ensure_replication_datacid_get(Ctx, Datacid) ->
    content_ensure_replication_datacid_get(Ctx, Datacid, #{}).

-spec content_ensure_replication_datacid_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_ensure_replication_datacid_get(Ctx, Datacid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/ensure-replication/", Datacid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List all failures for a content
%% This endpoint returns all failures for a content
-spec content_failures_content_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_failures_content_get(Ctx, Content) ->
    content_failures_content_get(Ctx, Content, #{}).

-spec content_failures_content_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_failures_content_get(Ctx, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/failures/", Content, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Content
%% This endpoint returns a content by its ID
-spec content_id_get(ctx:ctx(), integer()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_id_get(Ctx, Id) ->
    content_id_get(Ctx, Id, #{}).

-spec content_id_get(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_id_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/", Id, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Import a deal
%% This endpoint imports a deal into the shuttle.
-spec content_importdeal_post(ctx:ctx(), estuary-client_main_import_deal_body:estuary-client_main_import_deal_body()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_importdeal_post(Ctx, Body) ->
    content_importdeal_post(Ctx, Body, #{}).

-spec content_importdeal_post(ctx:ctx(), estuary-client_main_import_deal_body:estuary-client_main_import_deal_body(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_importdeal_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/importdeal"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List all pinned content
%% This endpoint lists all content
-spec content_list_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_list_get(Ctx) ->
    content_list_get(Ctx, #{}).

-spec content_list_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_list_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/list"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Read content
%% This endpoint reads content from the blockstore
-spec content_read_cont_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_read_cont_get(Ctx, Cont) ->
    content_read_cont_get(Ctx, Cont, #{}).

-spec content_read_cont_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_read_cont_get(Ctx, Cont, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/read/", Cont, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get staging zone for user
%% This endpoint is used to get staging zone for user.
-spec content_staging_zones_get(ctx:ctx()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_staging_zones_get(Ctx) ->
    content_staging_zones_get(Ctx, #{}).

-spec content_staging_zones_get(ctx:ctx(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_staging_zones_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/staging-zones"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get content statistics
%% This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
-spec content_stats_get(ctx:ctx(), binary(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_stats_get(Ctx, Limit, Offset) ->
    content_stats_get(Ctx, Limit, Offset, #{}).

-spec content_stats_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_stats_get(Ctx, Limit, Offset, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/stats"],
    QS = lists:flatten([{<<"limit">>, Limit}, {<<"offset">>, Offset}])++estuary-client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Content Status
%% This endpoint returns the status of a content
-spec content_status_id_get(ctx:ctx(), integer()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_status_id_get(Ctx, Id) ->
    content_status_id_get(Ctx, Id, #{}).

-spec content_status_id_get(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
content_status_id_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/status/", Id, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


