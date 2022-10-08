-module(estuary_client_util_content_add_ipfs_body).

-export([encode/1]).

-export_type([estuary_client_util_content_add_ipfs_body/0]).

-type estuary_client_util_content_add_ipfs_body() ::
    #{ 'coluuid' => binary(),
       'dir' => binary(),
       'filename' => binary(),
       'peers' => list(),
       'root' => binary()
     }.

encode(#{ 'coluuid' := Coluuid,
          'dir' := Dir,
          'filename' := Filename,
          'peers' := Peers,
          'root' := Root
        }) ->
    #{ 'coluuid' => Coluuid,
       'dir' => Dir,
       'filename' => Filename,
       'peers' => Peers,
       'root' => Root
     }.
