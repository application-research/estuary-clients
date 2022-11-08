-module(estuary-client_main_channel_id_param).

-export([encode/1]).

-export_type([estuary-client_main_channel_id_param/0]).

-type estuary-client_main_channel_id_param() ::
    #{ 'id' => integer(),
       'initiator' => binary(),
       'responder' => binary()
     }.

encode(#{ 'id' := Id,
          'initiator' := Initiator,
          'responder' := Responder
        }) ->
    #{ 'id' => Id,
       'initiator' => Initiator,
       'responder' => Responder
     }.
