/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package estuary_client

type MinerClaimMinerBody struct {
	Claim string `json:"claim,omitempty"`
	Miner *AddressAddress `json:"miner,omitempty"`
	Name string `json:"name,omitempty"`
}
