/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package estuary-client

type PeeringPeeringPeer struct {

	Addrs []string `json:"Addrs,omitempty"`

	Connected bool `json:"Connected,omitempty"`

	ID string `json:"ID,omitempty"`
}
