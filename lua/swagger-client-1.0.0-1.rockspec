package = "swagger-client"
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
		["swagger-client.api.admin_api"] = "swagger-client/api/admin_api.lua";
		["swagger-client.api.autoretrieve_api"] = "swagger-client/api/autoretrieve_api.lua";
		["swagger-client.api.collections_api"] = "swagger-client/api/collections_api.lua";
		["swagger-client.api.content_api"] = "swagger-client/api/content_api.lua";
		["swagger-client.api.deals_api"] = "swagger-client/api/deals_api.lua";
		["swagger-client.api.metrics_api"] = "swagger-client/api/metrics_api.lua";
		["swagger-client.api.miner_api"] = "swagger-client/api/miner_api.lua";
		["swagger-client.api.net_api"] = "swagger-client/api/net_api.lua";
		["swagger-client.api.peering_api"] = "swagger-client/api/peering_api.lua";
		["swagger-client.api.peers_api"] = "swagger-client/api/peers_api.lua";
		["swagger-client.api.pinning_api"] = "swagger-client/api/pinning_api.lua";
		["swagger-client.api.public_api"] = "swagger-client/api/public_api.lua";
		["swagger-client.api.user_api"] = "swagger-client/api/user_api.lua";
		["swagger-client.model.main_collection"] = "swagger-client/model/main_collection.lua";
		["swagger-client.model.main_create_collection_body"] = "swagger-client/model/main_create_collection_body.lua";
		["swagger-client.model.main_estimate_deal_body"] = "swagger-client/model/main_estimate_deal_body.lua";
		["swagger-client.model.main_get_api_keys_resp"] = "swagger-client/model/main_get_api_keys_resp.lua";
		["swagger-client.model.main_import_deal_body"] = "swagger-client/model/main_import_deal_body.lua";
		["swagger-client.model.main_user_stats_response"] = "swagger-client/model/main_user_stats_response.lua";
		["swagger-client.model.util_content_add_ipfs_body"] = "swagger-client/model/util_content_add_ipfs_body.lua";
		["swagger-client.model.util_content_add_response"] = "swagger-client/model/util_content_add_response.lua";
		["swagger-client.model.util_http_error"] = "swagger-client/model/util_http_error.lua";
	}
}
