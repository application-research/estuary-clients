-module(estuary-client_pinning_api).

-export([pinning_pins_get/1, pinning_pins_get/2,
         pinning_pins_pinid_delete/2, pinning_pins_pinid_delete/3,
         pinning_pins_pinid_get/2, pinning_pins_pinid_get/3,
         pinning_pins_pinid_post/6, pinning_pins_pinid_post/7,
         pinning_pins_post/2, pinning_pins_post/3]).

-define(BASE_URL, "/").

%% @doc List all pin status objects
%% This endpoint lists all pin status objects
-spec pinning_pins_get(ctx:ctx()) -> {ok, estuary-client_types_ipfs_list_pin_status_response:estuary-client_types_ipfs_list_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_get(Ctx) ->
    pinning_pins_get(Ctx, #{}).

-spec pinning_pins_get(ctx:ctx(), maps:map()) -> {ok, estuary-client_types_ipfs_list_pin_status_response:estuary-client_types_ipfs_list_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/pinning/pins"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a pinned object
%% This endpoint deletes a pinned object.
-spec pinning_pins_pinid_delete(ctx:ctx(), binary()) -> {ok, [], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_pinid_delete(Ctx, Pinid) ->
    pinning_pins_pinid_delete(Ctx, Pinid, #{}).

-spec pinning_pins_pinid_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_pinid_delete(Ctx, Pinid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/pinning/pins/", Pinid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a pin status object
%% This endpoint returns a pin status object.
-spec pinning_pins_pinid_get(ctx:ctx(), binary()) -> {ok, estuary-client_types_ipfs_pin_status_response:estuary-client_types_ipfs_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_pinid_get(Ctx, Pinid) ->
    pinning_pins_pinid_get(Ctx, Pinid, #{}).

-spec pinning_pins_pinid_get(ctx:ctx(), binary(), maps:map()) -> {ok, estuary-client_types_ipfs_pin_status_response:estuary-client_types_ipfs_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_pinid_get(Ctx, Pinid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/pinning/pins/", Pinid, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Replace a pinned object
%% This endpoint replaces a pinned object.
-spec pinning_pins_pinid_post(ctx:ctx(), binary(), binary()) -> {ok, estuary-client_types_ipfs_pin_status_response:estuary-client_types_ipfs_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_pinid_post(Ctx, Pinid, Cid) ->
    pinning_pins_pinid_post(Ctx, Pinid, Cid, #{}).

-spec pinning_pins_pinid_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, estuary-client_types_ipfs_pin_status_response:estuary-client_types_ipfs_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_pinid_post(Ctx, Pinid, Cid, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/pinning/pins/", Pinid, ""],
    QS = [],
    Headers = [],
    Body1 = CidNameOriginsMeta,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add and pin object
%% This endpoint adds a pin to the IPFS daemon.
-spec pinning_pins_post(ctx:ctx(), estuary-client_types_ipfs_pin:estuary-client_types_ipfs_pin()) -> {ok, estuary-client_types_ipfs_pin_status_response:estuary-client_types_ipfs_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_post(Ctx, Pin) ->
    pinning_pins_post(Ctx, Pin, #{}).

-spec pinning_pins_post(ctx:ctx(), estuary-client_types_ipfs_pin:estuary-client_types_ipfs_pin(), maps:map()) -> {ok, estuary-client_types_ipfs_pin_status_response:estuary-client_types_ipfs_pin_status_response(), estuary-client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), estuary-client_utils:response_info()}.
pinning_pins_post(Ctx, Pin, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/pinning/pins"],
    QS = [],
    Headers = [],
    Body1 = Pin,
    ContentTypeHeader = estuary-client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    estuary-client_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


