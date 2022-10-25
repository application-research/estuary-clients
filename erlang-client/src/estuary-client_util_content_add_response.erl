-module(estuary-client_util_content_add_response).

-export([encode/1]).

-export_type([estuary-client_util_content_add_response/0]).

-type estuary-client_util_content_add_response() ::
    #{ 'cid' => binary(),
       'estuaryId' => integer(),
       'providers' => list(),
       'retrieval_url' => binary()
     }.

encode(#{ 'cid' := Cid,
          'estuaryId' := EstuaryId,
          'providers' := Providers,
          'retrieval_url' := RetrievalUrl
        }) ->
    #{ 'cid' => Cid,
       'estuaryId' => EstuaryId,
       'providers' => Providers,
       'retrieval_url' => RetrievalUrl
     }.
