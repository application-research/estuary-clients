-module(estuary-client_types_ipfs_pin).

-export([encode/1]).

-export_type([estuary-client_types_ipfs_pin/0]).

-type estuary-client_types_ipfs_pin() ::
    #{ 'cid' => binary(),
       'meta' => maps:map(),
       'name' => binary(),
       'origins' => list()
     }.

encode(#{ 'cid' := Cid,
          'meta' := Meta,
          'name' := Name,
          'origins' := Origins
        }) ->
    #{ 'cid' => Cid,
       'meta' => Meta,
       'name' => Name,
       'origins' => Origins
     }.
