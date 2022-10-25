-module(estuary-client_util_content_create_body).

-export([encode/1]).

-export_type([estuary-client_util_content_create_body/0]).

-type estuary-client_util_content_create_body() ::
    #{ 'coluuid' => binary(),
       'dir' => binary(),
       'location' => binary(),
       'name' => binary(),
       'root' => binary(),
       'type' => integer()
     }.

encode(#{ 'coluuid' := Coluuid,
          'dir' := Dir,
          'location' := Location,
          'name' := Name,
          'root' := Root,
          'type' := Type
        }) ->
    #{ 'coluuid' => Coluuid,
       'dir' => Dir,
       'location' => Location,
       'name' => Name,
       'root' => Root,
       'type' => Type
     }.
