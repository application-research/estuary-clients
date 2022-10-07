-module(swagger_collections_api).

-export([collections_coluuid_commit_post/2, collections_coluuid_commit_post/3,
         collections_coluuid_delete/2, collections_coluuid_delete/3,
         collections_coluuid_get/2, collections_coluuid_get/3,
         collections_coluuid_post/2, collections_coluuid_post/3,
         collections_fs_add_post/4, collections_fs_add_post/5,
         collections_get/2, collections_get/3,
         collections_post/2, collections_post/3]).

-define(BASE_URL, "/").

%% @doc Produce a CID of the collection contents
%% This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
-spec collections_coluuid_commit_post(ctx:ctx(), binary()) -> {ok, binary(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_commit_post(Ctx, Coluuid) ->
    collections_coluuid_commit_post(Ctx, Coluuid, #{}).

-spec collections_coluuid_commit_post(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_commit_post(Ctx, Coluuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/", Coluuid, "/commit"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deletes a collection
%% This endpoint is used to delete an existing collection.
-spec collections_coluuid_delete(ctx:ctx(), binary()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_delete(Ctx, Coluuid) ->
    collections_coluuid_delete(Ctx, Coluuid, #{}).

-spec collections_coluuid_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_delete(Ctx, Coluuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/collections/", Coluuid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get contents in a collection
%% This endpoint is used to get contents in a collection. If no colpath query param is passed
-spec collections_coluuid_get(ctx:ctx(), binary()) -> {ok, binary(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_get(Ctx, Coluuid) ->
    collections_coluuid_get(Ctx, Coluuid, #{}).

-spec collections_coluuid_get(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_get(Ctx, Coluuid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/collections/", Coluuid, ""],
    QS = lists:flatten([{<<"coluuid">>, Coluuid}])++swagger_utils:optional_params([, 'dir'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add contents to a collection
%% This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
-spec collections_coluuid_post(ctx:ctx(), list()) -> {ok, maps:map(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_post(Ctx, Body) ->
    collections_coluuid_post(Ctx, Body, #{}).

-spec collections_coluuid_post(ctx:ctx(), list(), maps:map()) -> {ok, maps:map(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_coluuid_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/", Coluuid, ""],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = swagger_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add a file to a collection
%% This endpoint adds a file to a collection
-spec collections_fs_add_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_fs_add_post(Ctx, Coluuid, Content, Path) ->
    collections_fs_add_post(Ctx, Coluuid, Content, Path, #{}).

-spec collections_fs_add_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_fs_add_post(Ctx, Coluuid, Content, Path, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/fs/add"],
    QS = lists:flatten([{<<"coluuid">>, Coluuid}, {<<"content">>, Content}, {<<"path">>, Path}])++swagger_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List all collections
%% This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
-spec collections_get(ctx:ctx(), integer()) -> {ok, [swagger_main_collection:swagger_main_collection()], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_get(Ctx, Id) ->
    collections_get(Ctx, Id, #{}).

-spec collections_get(ctx:ctx(), integer(), maps:map()) -> {ok, [swagger_main_collection:swagger_main_collection()], swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/collections/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a new collection
%% This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
-spec collections_post(ctx:ctx(), swagger_main_create_collection_body:swagger_main_create_collection_body()) -> {ok, swagger_main_collection:swagger_main_collection(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_post(Ctx, Body) ->
    collections_post(Ctx, Body, #{}).

-spec collections_post(ctx:ctx(), swagger_main_create_collection_body:swagger_main_create_collection_body(), maps:map()) -> {ok, swagger_main_collection:swagger_main_collection(), swagger_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), swagger_utils:response_info()}.
collections_post(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/collections/"],
    QS = [],
    Headers = [],
    Body1 = Body,
    ContentTypeHeader = swagger_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    swagger_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


