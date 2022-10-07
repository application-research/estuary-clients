mod main_collection;
pub use self::main_collection::MainCollection;
mod main_create_collection_body;
pub use self::main_create_collection_body::MainCreateCollectionBody;
mod main_estimate_deal_body;
pub use self::main_estimate_deal_body::MainEstimateDealBody;
mod main_get_api_keys_resp;
pub use self::main_get_api_keys_resp::MainGetApiKeysResp;
mod main_import_deal_body;
pub use self::main_import_deal_body::MainImportDealBody;
mod main_user_stats_response;
pub use self::main_user_stats_response::MainUserStatsResponse;
mod util_content_add_ipfs_body;
pub use self::util_content_add_ipfs_body::UtilContentAddIpfsBody;
mod util_content_add_response;
pub use self::util_content_add_response::UtilContentAddResponse;
mod util_http_error;
pub use self::util_http_error::UtilHttpError;

// TODO(farcaller): sort out files
pub struct File;
