/*
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * API version: 0.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package estuary-client

type types.PinningStatus string

// List of types.PinningStatus
const (
	PINNING TypesPinningStatus = "pinning"
	PINNED TypesPinningStatus = "pinned"
	FAILED TypesPinningStatus = "failed"
	QUEUED TypesPinningStatus = "queued"
)
