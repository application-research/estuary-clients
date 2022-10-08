-module(estuary_client_main_collection).

-export([encode/1]).

-export_type([estuary_client_main_collection/0]).

-type estuary_client_main_collection() ::
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
