-module(estuary-client_types_ipfs_list_pin_status_response).

-export([encode/1]).

-export_type([estuary-client_types_ipfs_list_pin_status_response/0]).

-type estuary-client_types_ipfs_list_pin_status_response() ::
    #{ 'count' => integer(),
       'results' => list()
     }.

encode(#{ 'count' := Count,
          'results' := Results
        }) ->
    #{ 'count' => Count,
       'results' => Results
     }.
