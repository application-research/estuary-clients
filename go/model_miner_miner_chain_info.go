/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package estuary_client

type MinerMinerChainInfo struct {
	Addresses []string `json:"addresses,omitempty"`
	Owner string `json:"owner,omitempty"`
	PeerId string `json:"peerId,omitempty"`
	Worker string `json:"worker,omitempty"`
}