-module(swagger_main_get_api_keys_resp).

-export([encode/1]).

-export_type([swagger_main_get_api_keys_resp/0]).

-type swagger_main_get_api_keys_resp() ::
    #{ 'expiry' => binary(),
       'token' => binary()
     }.

encode(#{ 'expiry' := Expiry,
          'token' := Token
        }) ->
    #{ 'expiry' => Expiry,
       'token' => Token
     }.
