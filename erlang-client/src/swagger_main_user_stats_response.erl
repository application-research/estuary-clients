-module(swagger_main_user_stats_response).

-export([encode/1]).

-export_type([swagger_main_user_stats_response/0]).

-type swagger_main_user_stats_response() ::
    #{ 'numPins' => integer(),
       'totalSize' => integer()
     }.

encode(#{ 'numPins' := NumPins,
          'totalSize' := TotalSize
        }) ->
    #{ 'numPins' => NumPins,
       'totalSize' => TotalSize
     }.
