package = "estuary_client"
version = "1.0.0-1"
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
		["estuary_client.api.admin_api"] = "estuary_client/api/admin_api.lua";
		["estuary_client.api.autoretrieve_api"] = "estuary_client/api/autoretrieve_api.lua";
		["estuary_client.api.collections_api"] = "estuary_client/api/collections_api.lua";
		["estuary_client.api.content_api"] = "estuary_client/api/content_api.lua";
		["estuary_client.api.deals_api"] = "estuary_client/api/deals_api.lua";
		["estuary_client.api.metrics_api"] = "estuary_client/api/metrics_api.lua";
		["estuary_client.api.miner_api"] = "estuary_client/api/miner_api.lua";
		["estuary_client.api.net_api"] = "estuary_client/api/net_api.lua";
		["estuary_client.api.peering_api"] = "estuary_client/api/peering_api.lua";
		["estuary_client.api.peers_api"] = "estuary_client/api/peers_api.lua";
		["estuary_client.api.pinning_api"] = "estuary_client/api/pinning_api.lua";
		["estuary_client.api.public_api"] = "estuary_client/api/public_api.lua";
		["estuary_client.api.user_api"] = "estuary_client/api/user_api.lua";
		["estuary_client.model.main_collection"] = "estuary_client/model/main_collection.lua";
		["estuary_client.model.main_create_collection_body"] = "estuary_client/model/main_create_collection_body.lua";
		["estuary_client.model.main_estimate_deal_body"] = "estuary_client/model/main_estimate_deal_body.lua";
		["estuary_client.model.main_get_api_keys_resp"] = "estuary_client/model/main_get_api_keys_resp.lua";
		["estuary_client.model.main_import_deal_body"] = "estuary_client/model/main_import_deal_body.lua";
		["estuary_client.model.main_user_stats_response"] = "estuary_client/model/main_user_stats_response.lua";
		["estuary_client.model.util_content_add_ipfs_body"] = "estuary_client/model/util_content_add_ipfs_body.lua";
		["estuary_client.model.util_content_add_response"] = "estuary_client/model/util_content_add_response.lua";
		["estuary_client.model.util_http_error"] = "estuary_client/model/util_http_error.lua";
	}
}
