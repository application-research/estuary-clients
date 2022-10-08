-module(estuary_client_main_create_collection_body).

-export([encode/1]).

-export_type([estuary_client_main_create_collection_body/0]).

-type estuary_client_main_create_collection_body() ::
    #{ 'description' => binary(),
       'name' => binary()
     }.

encode(#{ 'description' := Description,
          'name' := Name
        }) ->
    #{ 'description' => Description,
       'name' => Name
     }.
