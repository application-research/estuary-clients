-module(swagger_util_http_error).

-export([encode/1]).

-export_type([swagger_util_http_error/0]).

-type swagger_util_http_error() ::
    #{ 'code' => integer(),
       'details' => binary(),
       'reason' => binary()
     }.

encode(#{ 'code' := Code,
          'details' := Details,
          'reason' := Reason
        }) ->
    #{ 'code' => Code,
       'details' => Details,
       'reason' => Reason
     }.
