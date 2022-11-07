package = "estuary-client"
version = "1.0.1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by Swagger Codegen",
	detailed = [[
This is the API for the Estuary application.]],
	homepage = "https://github.com/swagger-api/swagger-codegen",
	license = "Unlicense",
	maintainer = "Swagger Codegen contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["estuary-client.api.admin_api"] = "estuary-client/api/admin_api.lua";
		["estuary-client.api.autoretrieve_api"] = "estuary-client/api/autoretrieve_api.lua";
		["estuary-client.api.collections_api"] = "estuary-client/api/collections_api.lua";
		["estuary-client.api.content_api"] = "estuary-client/api/content_api.lua";
		["estuary-client.api.deals_api"] = "estuary-client/api/deals_api.lua";
		["estuary-client.api.metrics_api"] = "estuary-client/api/metrics_api.lua";
		["estuary-client.api.miner_api"] = "estuary-client/api/miner_api.lua";
		["estuary-client.api.net_api"] = "estuary-client/api/net_api.lua";
		["estuary-client.api.peering_api"] = "estuary-client/api/peering_api.lua";
		["estuary-client.api.peers_api"] = "estuary-client/api/peers_api.lua";
		["estuary-client.api.pinning_api"] = "estuary-client/api/pinning_api.lua";
		["estuary-client.api.public_api"] = "estuary-client/api/public_api.lua";
		["estuary-client.api.user_api"] = "estuary-client/api/user_api.lua";
		["estuary-client.model.collections_collection"] = "estuary-client/model/collections_collection.lua";
		["estuary-client.model.main_channel_id_param"] = "estuary-client/model/main_channel_id_param.lua";
		["estuary-client.model.main_create_collection_body"] = "estuary-client/model/main_create_collection_body.lua";
		["estuary-client.model.main_delete_content_from_collection_body"] = "estuary-client/model/main_delete_content_from_collection_body.lua";
		["estuary-client.model.main_estimate_deal_body"] = "estuary-client/model/main_estimate_deal_body.lua";
		["estuary-client.model.main_get_api_keys_resp"] = "estuary-client/model/main_get_api_keys_resp.lua";
		["estuary-client.model.main_import_deal_body"] = "estuary-client/model/main_import_deal_body.lua";
		["estuary-client.model.types_ipfs_pin"] = "estuary-client/model/types_ipfs_pin.lua";
		["estuary-client.model.util_content_add_ipfs_body"] = "estuary-client/model/util_content_add_ipfs_body.lua";
		["estuary-client.model.util_content_add_response"] = "estuary-client/model/util_content_add_response.lua";
		["estuary-client.model.util_content_create_body"] = "estuary-client/model/util_content_create_body.lua";
		["estuary-client.model.util_http_error"] = "estuary-client/model/util_http_error.lua";
	}
}
