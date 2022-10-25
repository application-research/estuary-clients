-module(estuary-client_collections_collection).

-export([encode/1]).

-export_type([estuary-client_collections_collection/0]).

-type estuary-client_collections_collection() ::
    #{ 'cid' => binary(),
       'createdAt' => binary(),
       'description' => binary(),
       'name' => binary(),
       'userId' => integer(),
       'uuid' => binary()
     }.

encode(#{ 'cid' := Cid,
          'createdAt' := CreatedAt,
          'description' := Description,
          'name' := Name,
          'userId' := UserId,
          'uuid' := Uuid
        }) ->
    #{ 'cid' => Cid,
       'createdAt' => CreatedAt,
       'description' => Description,
       'name' => Name,
       'userId' => UserId,
       'uuid' => Uuid
     }.
