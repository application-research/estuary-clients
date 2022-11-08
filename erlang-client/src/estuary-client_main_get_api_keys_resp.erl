-module(estuary-client_main_get_api_keys_resp).

-export([encode/1]).

-export_type([estuary-client_main_get_api_keys_resp/0]).

-type estuary-client_main_get_api_keys_resp() ::
    #{ 'expiry' => binary(),
       'label' => binary(),
       'token' => binary(),
       'tokenHash' => binary()
     }.

encode(#{ 'expiry' := Expiry,
          'label' := Label,
          'token' := Token,
          'tokenHash' := TokenHash
        }) ->
    #{ 'expiry' => Expiry,
       'label' => Label,
       'token' => Token,
       'tokenHash' => TokenHash
     }.
