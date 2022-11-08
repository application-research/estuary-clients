/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package estuary-client

type TypesIpfsPin struct {
	Cid string `json:"cid,omitempty"`
	Meta interface{} `json:"meta,omitempty"`
	Name string `json:"name,omitempty"`
	Origins []string `json:"origins,omitempty"`
}
