-module(swagger_main_create_collection_body).

-export([encode/1]).

-export_type([swagger_main_create_collection_body/0]).

-type swagger_main_create_collection_body() ::
    #{ 'description' => binary(),
       'name' => binary()
     }.

encode(#{ 'description' := Description,
          'name' := Name
        }) ->
    #{ 'description' => Description,
       'name' => Name
     }.
