-module(swagger_main_import_deal_body).

-export([encode/1]).

-export_type([swagger_main_import_deal_body/0]).

-type swagger_main_import_deal_body() ::
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
