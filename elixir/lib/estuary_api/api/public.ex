# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule EstuaryAPI.Api.Public do
  @moduledoc """
  API calls for all endpoints tagged `Public`.
  """

  alias EstuaryAPI.Connection
  import EstuaryAPI.RequestBuilder


  @doc """
  Get Content by Cid
  This endpoint returns the content associated with a CID

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - cid (String.t): Cid
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_by_cid_cid_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_by_cid_cid_get(connection, cid, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/by-cid/#{cid}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get public node info
  This endpoint returns information about the node

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_info_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_info_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/info")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get deal metrics
  This endpoint is used to get deal metrics

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_metrics_deals_on_chain_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_metrics_deals_on_chain_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/metrics/deals-on-chain")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get all miners deals
  This endpoint returns all miners deals

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - miner (String.t): Filter by miner
  - opts (KeywordList): [optional] Optional parameters
    - :ignore_failed (String.t): Ignore Failed

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_miners_deals_miner_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_miners_deals_miner_get(connection, miner, opts \\ []) do
    optional_params = %{
      :"ignore-failed" => :query
    }
    %{}
    |> method(:get)
    |> url("/public/miners/deals/#{miner}")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get all miners
  This endpoint returns all miners

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - miner (String.t): Filter by miner
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_miners_failures_miner_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_miners_failures_miner_get(connection, miner, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/miners/failures/#{miner}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get all miners
  This endpoint returns all miners

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_miners_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_miners_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/miners")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Get miner stats
  This endpoint returns miner stats

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - miner (String.t): Filter by miner
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_miners_stats_miner_get(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_miners_stats_miner_get(connection, miner, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/miners/stats/#{miner}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end

  @doc """
  Net Addrs
  This endpoint is used to get net addrs

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, [%String{}, ...]} on success
  {:error, info} on failure
  """
  @spec public_net_addrs_get(Tesla.Env.client, keyword()) :: {:ok, list(String.t)} | {:error, Tesla.Env.t}
  def public_net_addrs_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/net/addrs")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode([%EstuaryAPI.Model.String{}])
  end

  @doc """
  Net Peers
  This endpoint is used to get net peers

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, [%String{}, ...]} on success
  {:error, info} on failure
  """
  @spec public_net_peers_get(Tesla.Env.client, keyword()) :: {:ok, list(String.t)} | {:error, Tesla.Env.t}
  def public_net_peers_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/net/peers")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode([%EstuaryAPI.Model.String{}])
  end

  @doc """
  Public stats
  This endpoint is used to get public stats.

  ## Parameters

  - connection (EstuaryAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters

  ## Returns

  {:ok, %{}} on success
  {:error, info} on failure
  """
  @spec public_stats_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def public_stats_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/public/stats")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(false)
  end
end
