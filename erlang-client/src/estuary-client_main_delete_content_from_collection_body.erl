-module(estuary-client_main_delete_content_from_collection_body).

-export([encode/1]).

-export_type([estuary-client_main_delete_content_from_collection_body/0]).

-type estuary-client_main_delete_content_from_collection_body() ::
    #{ 'by' => binary(),
       'value' => binary()
     }.

encode(#{ 'by' := By,
          'value' := Value
        }) ->
    #{ 'by' => By,
       'value' => Value
     }.
