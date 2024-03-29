/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package estuary_client

type ApiMinerResp struct {
	Addr *AddressAddress `json:"addr,omitempty"`
	ChainInfo *MinerMinerChainInfo `json:"chain_info,omitempty"`
	Name string `json:"name,omitempty"`
	Suspended bool `json:"suspended,omitempty"`
	SuspendedReason string `json:"suspendedReason,omitempty"`
	Version string `json:"version,omitempty"`
}
