-module(estuary-client_main_user_stats_response).

-export([encode/1]).

-export_type([estuary-client_main_user_stats_response/0]).

-type estuary-client_main_user_stats_response() ::
    #{ 'numPins' => integer(),
       'totalSize' => integer()
     }.

encode(#{ 'numPins' := NumPins,
          'totalSize' := TotalSize
        }) ->
    #{ 'numPins' => NumPins,
       'totalSize' => TotalSize
     }.
