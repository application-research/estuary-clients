-module(estuary_client_main_import_deal_body).

-export([encode/1]).

-export_type([estuary_client_main_import_deal_body/0]).

-type estuary_client_main_import_deal_body() ::
    #{ 'coluuid' => binary(),
       'dealIDs' => list(),
       'dir' => binary(),
       'name' => binary()
     }.

encode(#{ 'coluuid' := Coluuid,
          'dealIDs' := DealIDs,
          'dir' := Dir,
          'name' := Name
        }) ->
    #{ 'coluuid' => Coluuid,
       'dealIDs' => DealIDs,
       'dir' => Dir,
       'name' => Name
     }.
