/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package estuary-client

type UtilContentCreateBody struct {

	Coluuid string `json:"coluuid,omitempty"`

	Dir string `json:"dir,omitempty"`

	Location string `json:"location,omitempty"`

	Name string `json:"name,omitempty"`

	Root string `json:"root,omitempty"`

	Type_ int32 `json:"type,omitempty"`
}
