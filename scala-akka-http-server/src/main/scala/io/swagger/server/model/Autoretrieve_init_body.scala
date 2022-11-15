package io.swagger.server.model


/**
 * @param addresses Autoretrieve's comma-separated list of addresses
 * @param pubKey Autoretrieve's public key
 */
case class Autoretrieve_init_body (
  addresses: String,
  pubKey: String
)

