-module(estuary-client_collections_api).

-export([collections_coluuid_commit_post/2, collections_coluuid_commit_post/3,
         collections_coluuid_contents_delete/4, collections_coluuid_contents_delete/5,
         collections_coluuid_delete/2, collections_coluuid_delete/3,
         collections_coluuid_get/2, collections_coluuid_get/3,
         collections_coluuid_post/3, collections_coluuid_post/4,
         collections_fs_add_post/4, collections_fs_add_post/5,
         collections_get/1, collections_get/2,
         collections_post/2, collections_post/3]).

-define(BASE_URL, "/").

%% @doc Produce a CID of the collection contents
%% This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
-spec collections_coluuid_commit_post(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_commit_post(Ctx, Coluuid) ->
    collections_coluuid_commit_post(Ctx, Coluuid, #{}).

-spec collections_coluuid_commit_post(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_commit_post(Ctx, Coluuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/", Coluuid, "/commit"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deletes a content from a collection
%% This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
-spec collections_coluuid_contents_delete(ctx:ctx(), binary(), binary(), estuary-client_main_delete_content_from_collection_body:estuary-client_main_delete_content_from_collection_body()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_contents_delete(Ctx, Coluuid, Contentid, Body) ->
    collections_coluuid_contents_delete(Ctx, Coluuid, Contentid, Body, #{}).

-spec collections_coluuid_contents_delete(ctx:ctx(), binary(), binary(), estuary-client_main_delete_content_from_collection_body:estuary-client_main_delete_content_from_collection_body(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_contents_delete(Ctx, Coluuid, Contentid, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/collections/", Coluuid, "/contents"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deletes a collection
%% This endpoint is used to delete an existing collection.
-spec collections_coluuid_delete(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_delete(Ctx, Coluuid) ->
    collections_coluuid_delete(Ctx, Coluuid, #{}).

-spec collections_coluuid_delete(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_delete(Ctx, Coluuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/collections/", Coluuid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get contents in a collection
%% This endpoint is used to get contents in a collection. If no colpath query param is passed
-spec collections_coluuid_get(ctx:ctx(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_get(Ctx, Coluuid) ->
    collections_coluuid_get(Ctx, Coluuid, #{}).

-spec collections_coluuid_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_get(Ctx, Coluuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/collections/", Coluuid, ""],
    QS = lists:flatten([])++estuary-client_utils:optional_params(['dir'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add contents to a collection
%% This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
-spec collections_coluuid_post(ctx:ctx(), binary(), list()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_post(Ctx, Coluuid, ContentIDs) ->
    collections_coluuid_post(Ctx, Coluuid, ContentIDs, #{}).

-spec collections_coluuid_post(ctx:ctx(), binary(), list(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_coluuid_post(Ctx, Coluuid, ContentIDs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/", Coluuid, ""],
    QS = [],
    Headers = [],
    Body1 = ContentIDs,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add a file to a collection
%% This endpoint adds a file to a collection
-spec collections_fs_add_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_fs_add_post(Ctx, Coluuid, Content, Path) ->
    collections_fs_add_post(Ctx, Coluuid, Content, Path, #{}).

-spec collections_fs_add_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, binary(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_fs_add_post(Ctx, Coluuid, Content, Path, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/fs/add"],
    QS = lists:flatten([{<<"coluuid">>, Coluuid}, {<<"content">>, Content}, {<<"path">>, Path}])++estuary-client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List all collections
%% This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
-spec collections_get(ctx:ctx()) -> {ok, [list()], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_get(Ctx) ->
    collections_get(Ctx, #{}).

-spec collections_get(ctx:ctx(), maps:map()) -> {ok, [list()], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/collections/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a new collection
%% This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
-spec collections_post(ctx:ctx(), estuary-client_main_create_collection_body:estuary-client_main_create_collection_body()) -> {ok, estuary-client_collections_collection:estuary-client_collections_collection(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_post(Ctx, Body) ->
    collections_post(Ctx, Body, #{}).

-spec collections_post(ctx:ctx(), estuary-client_main_create_collection_body:estuary-client_main_create_collection_body(), maps:map()) -> {ok, estuary-client_collections_collection:estuary-client_collections_collection(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
collections_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


