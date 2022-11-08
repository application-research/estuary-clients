# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule EstuaryAPI.Api.Pinning do
  @moduledoc """
  API calls for all endpoints tagged `Pinning`.
  """

  alias EstuaryAPI.Connection
  import EstuaryAPI.RequestBuilder


  @doc """
  List all pin status objects
  This endpoint lists all pin status objects

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %EstuaryAPI.Model.String.t{}} on success
  {:error, info} on failure
  """
  @spec pinning_pins_get(Tesla.Env.client, keyword()) :: {:ok, String.t} | {:error, Tesla.Env.t}
  def pinning_pins_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/pinning/pins")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Delete a pinned object
  This endpoint deletes a pinned object.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - pinid (String.t): Pin ID
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %EstuaryAPI.Model.String.t{}} on success
  {:error, info} on failure
  """
  @spec pinning_pins_pinid_delete(Tesla.Env.client, String.t, keyword()) :: {:ok, String.t} | {:error, Tesla.Env.t}
  def pinning_pins_pinid_delete(connection, pinid, _opts \\ []) do
    %{}
    |> method(:delete)
    |> url("/pinning/pins/#{pinid}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get a pin status object
  This endpoint returns a pin status object.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - pinid (String.t): cid
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %EstuaryAPI.Model.String.t{}} on success
  {:error, info} on failure
  """
  @spec pinning_pins_pinid_get(Tesla.Env.client, String.t, keyword()) :: {:ok, String.t} | {:error, Tesla.Env.t}
  def pinning_pins_pinid_get(connection, pinid, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/pinning/pins/#{pinid}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Replace a pinned object
  This endpoint replaces a pinned object.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - pinid (String.t): Pin ID
  - cid (String.t): CID of new pin
  - opts (KeywordList): [optional] Optional parameters
    - :name (String.t): Name (filename) of new pin
    - :origins (String.t): Origins of new pin
    - :meta (String.t): Meta information of new pin

  ## Returns

  {:ok, %EstuaryAPI.Model.String.t{}} on success
  {:error, info} on failure
  """
  @spec pinning_pins_pinid_post(Tesla.Env.client, String.t, String.t, keyword()) :: {:ok, String.t} | {:error, Tesla.Env.t}
  def pinning_pins_pinid_post(connection, pinid, cid, opts \\ []) do
    optional_params = %{
      :"name" => :body,
      :"origins" => :body,
      :"meta" => :body
    }
    %{}
    |> method(:post)
    |> url("/pinning/pins/#{pinid}")
    |> add_param(:body, :"cid", cid)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Add and pin object
  This endpoint adds a pin to the IPFS daemon.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - pin (TypesIpfsPin): Pin Body {cid:cid, name:name}
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %EstuaryAPI.Model.String.t{}} on success
  {:error, info} on failure
  """
  @spec pinning_pins_post(Tesla.Env.client, EstuaryAPI.Model.TypesIpfsPin.t, keyword()) :: {:ok, String.t} | {:error, Tesla.Env.t}
  def pinning_pins_post(connection, pin, _opts \\ []) do
    %{}
    |> method(:post)
    |> url("/pinning/pins")
    |> add_param(:body, :"pin", pin)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end
end
