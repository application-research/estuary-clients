-module(estuary-client_types_ipfs_pin_status_response).

-export([encode/1]).

-export_type([estuary-client_types_ipfs_pin_status_response/0]).

-type estuary-client_types_ipfs_pin_status_response() ::
    #{ 'created' => binary(),
       'delegates' => list(),
       'info' => maps:map(),
       'pin' => estuary-client_types_ipfs_pin:estuary-client_types_ipfs_pin(),
       'requestid' => binary(),
       'status' => binary()
     }.

encode(#{ 'created' := Created,
          'delegates' := Delegates,
          'info' := Info,
          'pin' := Pin,
          'requestid' := Requestid,
          'status' := Status
        }) ->
    #{ 'created' => Created,
       'delegates' => Delegates,
       'info' => Info,
       'pin' => Pin,
       'requestid' => Requestid,
       'status' => Status
     }.
