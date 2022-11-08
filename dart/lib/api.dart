library swagger.api;

import 'dart:async';
import 'dart:convert';
import 'package:http/browser_client.dart';
import 'package:http/http.dart';

part 'api_client.dart';
part 'api_helper.dart';
part 'api_exception.dart';
part 'auth/authentication.dart';
part 'auth/api_key_auth.dart';
part 'auth/oauth.dart';
part 'auth/http_basic_auth.dart';

part 'api/admin_api.dart';
part 'api/autoretrieve_api.dart';
part 'api/collections_api.dart';
part 'api/content_api.dart';
part 'api/deals_api.dart';
part 'api/metrics_api.dart';
part 'api/miner_api.dart';
part 'api/net_api.dart';
part 'api/peering_api.dart';
part 'api/peers_api.dart';
part 'api/pinning_api.dart';
part 'api/public_api.dart';
part 'api/user_api.dart';

part 'model/collections_collection.dart';
part 'model/main_channel_id_param.dart';
part 'model/main_create_collection_body.dart';
part 'model/main_delete_content_from_collection_body.dart';
part 'model/main_estimate_deal_body.dart';
part 'model/main_get_api_keys_resp.dart';
part 'model/main_import_deal_body.dart';
part 'model/types_ipfs_list_pin_status_response.dart';
part 'model/types_ipfs_pin.dart';
part 'model/types_ipfs_pin_status_response.dart';
part 'model/util_content_add_ipfs_body.dart';
part 'model/util_content_add_response.dart';
part 'model/util_content_create_body.dart';
part 'model/util_http_error.dart';


ApiClient defaultApiClient = new ApiClient();
