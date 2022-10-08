-module(estuary_client_content_api).

-export([content_add_car_post/2, content_add_car_post/3,
         content_add_ipfs_post/2, content_add_ipfs_post/3,
         content_add_post/4, content_add_post/5,
         content_aggregated_content_get/2, content_aggregated_content_get/3,
         content_all_deals_get/4, content_all_deals_get/5,
         content_bw_usage_content_get/2, content_bw_usage_content_get/3,
         content_create_post/2, content_create_post/3,
         content_deals_get/1, content_deals_get/2,
         content_ensure_replication_datacid_get/2, content_ensure_replication_datacid_get/3,
         content_failures_content_get/2, content_failures_content_get/3,
         content_importdeal_post/2, content_importdeal_post/3,
         content_list_get/1, content_list_get/2,
         content_read_cont_get/2, content_read_cont_get/3,
         content_staging_zones_get/1, content_staging_zones_get/2,
         content_stats_get/2, content_stats_get/3,
         content_status_id_get/2, content_status_id_get/3]).

-define(BASE_URL, "/").

%% @doc Add Car object
%% This endpoint is used to add a car object to the network. The object can be a file or a directory.
-spec content_add_car_post(ctx:ctx(), binary()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_add_car_post(Ctx, Body) ->
    content_add_car_post(Ctx, Body, #{}).

-spec content_add_car_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_add_car_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/add-car"],
    QS = lists:flatten([])++estuary_client_utils:optional_params(['filename', 'commp', 'size'], _OptionalParams),
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add IPFS object
%% This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
-spec content_add_ipfs_post(ctx:ctx(), estuary_client_util_content_add_ipfs_body:estuary_client_util_content_add_ipfs_body()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_add_ipfs_post(Ctx, Body) ->
    content_add_ipfs_post(Ctx, Body, #{}).

-spec content_add_ipfs_post(ctx:ctx(), estuary_client_util_content_add_ipfs_body:estuary_client_util_content_add_ipfs_body(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_add_ipfs_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/add-ipfs"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add new content
%% This endpoint is used to upload new content.
-spec content_add_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, estuary_client_util_content_add_response:estuary_client_util_content_add_response(), estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_add_post(Ctx, File, Coluuid, Dir) ->
    content_add_post(Ctx, File, Coluuid, Dir, #{}).

-spec content_add_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, estuary_client_util_content_add_response:estuary_client_util_content_add_response(), estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_add_post(Ctx, File, Coluuid, Dir, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/add"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"file">>, File}]++estuary_client_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = estuary_client_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get aggregated content stats
%% This endpoint returns aggregated content stats
-spec content_aggregated_content_get(ctx:ctx(), binary()) -> {ok, binary(), estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_aggregated_content_get(Ctx, Content) ->
    content_aggregated_content_get(Ctx, Content, #{}).

-spec content_aggregated_content_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_aggregated_content_get(Ctx, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/aggregated/", Content, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get all deals for a user
%% This endpoint is used to get all deals for a user
-spec content_all_deals_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_all_deals_get(Ctx, Begin_, Duration, All) ->
    content_all_deals_get(Ctx, Begin_, Duration, All, #{}).

-spec content_all_deals_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_all_deals_get(Ctx, Begin_, Duration, All, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/all-deals"],
    QS = lists:flatten([{<<"begin">>, Begin_}, {<<"duration">>, Duration}, {<<"all">>, All}])++estuary_client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get content bandwidth
%% This endpoint returns content bandwidth
-spec content_bw_usage_content_get(ctx:ctx(), binary()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_bw_usage_content_get(Ctx, Content) ->
    content_bw_usage_content_get(Ctx, Content, #{}).

-spec content_bw_usage_content_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_bw_usage_content_get(Ctx, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/bw-usage/", Content, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add a new content
%% This endpoint adds a new content
-spec content_create_post(ctx:ctx(), binary()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_create_post(Ctx, Body) ->
    content_create_post(Ctx, Body, #{}).

-spec content_create_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_create_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/create"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Content with deals
%% This endpoint lists all content with deals
-spec content_deals_get(ctx:ctx()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_deals_get(Ctx) ->
    content_deals_get(Ctx, #{}).

-spec content_deals_get(ctx:ctx(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_deals_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/deals"],
    QS = lists:flatten([])++estuary_client_utils:optional_params(['limit', 'offset'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Ensure Replication
%% This endpoint ensures that the content is replicated to the specified number of providers
-spec content_ensure_replication_datacid_get(ctx:ctx(), binary()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_ensure_replication_datacid_get(Ctx, Datacid) ->
    content_ensure_replication_datacid_get(Ctx, Datacid, #{}).

-spec content_ensure_replication_datacid_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_ensure_replication_datacid_get(Ctx, Datacid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/ensure-replication/", Datacid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List all failures for a content
%% This endpoint returns all failures for a content
-spec content_failures_content_get(ctx:ctx(), binary()) -> {ok, binary(), estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_failures_content_get(Ctx, Content) ->
    content_failures_content_get(Ctx, Content, #{}).

-spec content_failures_content_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_failures_content_get(Ctx, Content, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/failures/", Content, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Import a deal
%% This endpoint imports a deal into the shuttle.
-spec content_importdeal_post(ctx:ctx(), estuary_client_main_import_deal_body:estuary_client_main_import_deal_body()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_importdeal_post(Ctx, Body) ->
    content_importdeal_post(Ctx, Body, #{}).

-spec content_importdeal_post(ctx:ctx(), estuary_client_main_import_deal_body:estuary_client_main_import_deal_body(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_importdeal_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/content/importdeal"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List all pinned content
%% This endpoint lists all content
-spec content_list_get(ctx:ctx()) -> {ok, [binary()], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_list_get(Ctx) ->
    content_list_get(Ctx, #{}).

-spec content_list_get(ctx:ctx(), maps:map()) -> {ok, [binary()], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_list_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/list"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Read content
%% This endpoint reads content from the blockstore
-spec content_read_cont_get(ctx:ctx(), binary()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_read_cont_get(Ctx, Cont) ->
    content_read_cont_get(Ctx, Cont, #{}).

-spec content_read_cont_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_read_cont_get(Ctx, Cont, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/read/", Cont, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get staging zone for user
%% This endpoint is used to get staging zone for user.
-spec content_staging_zones_get(ctx:ctx()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_staging_zones_get(Ctx) ->
    content_staging_zones_get(Ctx, #{}).

-spec content_staging_zones_get(ctx:ctx(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_staging_zones_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/staging-zones"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get content statistics
%% This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
-spec content_stats_get(ctx:ctx(), binary()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_stats_get(Ctx, Limit) ->
    content_stats_get(Ctx, Limit, #{}).

-spec content_stats_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_stats_get(Ctx, Limit, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/stats"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Content Status
%% This endpoint returns the status of a content
-spec content_status_id_get(ctx:ctx(), integer()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_status_id_get(Ctx, Id) ->
    content_status_id_get(Ctx, Id, #{}).

-spec content_status_id_get(ctx:ctx(), integer(), maps:map()) -> {ok, [], estuary_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary_client_utils:response_info()}.
content_status_id_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/content/status/", Id, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary_client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


