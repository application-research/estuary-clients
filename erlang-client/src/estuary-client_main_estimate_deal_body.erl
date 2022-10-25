-module(estuary-client_main_estimate_deal_body).

-export([encode/1]).

-export_type([estuary-client_main_estimate_deal_body/0]).

-type estuary-client_main_estimate_deal_body() ::
    #{ 'durationBlks' => integer(),
       'replication' => integer(),
       'size' => integer(),
       'verified' => boolean()
     }.

encode(#{ 'durationBlks' := DurationBlks,
          'replication' := Replication,
          'size' := Size,
          'verified' := Verified
        }) ->
    #{ 'durationBlks' => DurationBlks,
       'replication' => Replication,
       'size' => Size,
       'verified' => Verified
     }.
