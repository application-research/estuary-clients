#ifndef _ContentManager_H_
#define _ContentManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Main.importDealBody.h"
#include "Util.ContentAddIpfsBody.h"
#include "Util.ContentAddResponse.h"
#include "Util.ContentCreateBody.h"
#include "Util.HttpError.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Content Content
 * \ingroup Operations
 *  @{
 */
class ContentManager {
public:
	ContentManager();
	virtual ~ContentManager();

/*! \brief Add Car object. *Synchronous*
 *
 * This endpoint is used to add a car object to the network. The object can be a file or a directory.
 * \param body Car *Required*
 * \param ignoreDupes Ignore Dupes
 * \param filename Filename
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAddCarPostSync(char * accessToken,
	std::string body, std::string ignoreDupes, std::string filename, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Add Car object. *Asynchronous*
 *
 * This endpoint is used to add a car object to the network. The object can be a file or a directory.
 * \param body Car *Required*
 * \param ignoreDupes Ignore Dupes
 * \param filename Filename
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAddCarPostAsync(char * accessToken,
	std::string body, std::string ignoreDupes, std::string filename, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Add IPFS object. *Synchronous*
 *
 * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
 * \param body IPFS Body *Required*
 * \param ignoreDupes Ignore Dupes
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAddIpfsPostSync(char * accessToken,
	Util.ContentAddIpfsBody body, std::string ignoreDupes, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Add IPFS object. *Asynchronous*
 *
 * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
 * \param body IPFS Body *Required*
 * \param ignoreDupes Ignore Dupes
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAddIpfsPostAsync(char * accessToken,
	Util.ContentAddIpfsBody body, std::string ignoreDupes, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Add new content. *Synchronous*
 *
 * This endpoint is used to upload new content.
 * \param data File to upload *Required*
 * \param filename Filenam to use for upload
 * \param coluuid Collection UUID
 * \param replication Replication value
 * \param ignoreDupes Ignore Dupes true/false
 * \param lazyProvide Lazy Provide true/false
 * \param dir Directory
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAddPostSync(char * accessToken,
	std::string data, std::string filename, std::string coluuid, int replication, std::string ignoreDupes, std::string lazyProvide, std::string dir, 
	void(* handler)(Util.ContentAddResponse, Error, void* )
	, void* userData);

/*! \brief Add new content. *Asynchronous*
 *
 * This endpoint is used to upload new content.
 * \param data File to upload *Required*
 * \param filename Filenam to use for upload
 * \param coluuid Collection UUID
 * \param replication Replication value
 * \param ignoreDupes Ignore Dupes true/false
 * \param lazyProvide Lazy Provide true/false
 * \param dir Directory
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAddPostAsync(char * accessToken,
	std::string data, std::string filename, std::string coluuid, int replication, std::string ignoreDupes, std::string lazyProvide, std::string dir, 
	void(* handler)(Util.ContentAddResponse, Error, void* )
	, void* userData);


/*! \brief Get aggregated content stats. *Synchronous*
 *
 * This endpoint returns aggregated content stats
 * \param content Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAggregatedContentGetSync(char * accessToken,
	std::string content, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get aggregated content stats. *Asynchronous*
 *
 * This endpoint returns aggregated content stats
 * \param content Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAggregatedContentGetAsync(char * accessToken,
	std::string content, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get all deals for a user. *Synchronous*
 *
 * This endpoint is used to get all deals for a user
 * \param begin Begin *Required*
 * \param duration Duration *Required*
 * \param all All *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAllDealsGetSync(char * accessToken,
	std::string begin, std::string duration, std::string all, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get all deals for a user. *Asynchronous*
 *
 * This endpoint is used to get all deals for a user
 * \param begin Begin *Required*
 * \param duration Duration *Required*
 * \param all All *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentAllDealsGetAsync(char * accessToken,
	std::string begin, std::string duration, std::string all, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get content bandwidth. *Synchronous*
 *
 * This endpoint returns content bandwidth
 * \param content Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentBwUsageContentGetSync(char * accessToken,
	std::string content, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get content bandwidth. *Asynchronous*
 *
 * This endpoint returns content bandwidth
 * \param content Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentBwUsageContentGetAsync(char * accessToken,
	std::string content, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Add a new content. *Synchronous*
 *
 * This endpoint adds a new content
 * \param req Content *Required*
 * \param ignoreDupes Ignore Dupes
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentCreatePostSync(char * accessToken,
	Util.ContentCreateBody req, std::string ignoreDupes, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Add a new content. *Asynchronous*
 *
 * This endpoint adds a new content
 * \param req Content *Required*
 * \param ignoreDupes Ignore Dupes
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentCreatePostAsync(char * accessToken,
	Util.ContentCreateBody req, std::string ignoreDupes, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Content with deals. *Synchronous*
 *
 * This endpoint lists all content with deals
 * \param limit Limit
 * \param offset Offset
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentDealsGetSync(char * accessToken,
	int limit, int offset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Content with deals. *Asynchronous*
 *
 * This endpoint lists all content with deals
 * \param limit Limit
 * \param offset Offset
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentDealsGetAsync(char * accessToken,
	int limit, int offset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Ensure Replication. *Synchronous*
 *
 * This endpoint ensures that the content is replicated to the specified number of providers
 * \param datacid Data CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentEnsureReplicationDatacidGetSync(char * accessToken,
	std::string datacid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Ensure Replication. *Asynchronous*
 *
 * This endpoint ensures that the content is replicated to the specified number of providers
 * \param datacid Data CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentEnsureReplicationDatacidGetAsync(char * accessToken,
	std::string datacid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief List all failures for a content. *Synchronous*
 *
 * This endpoint returns all failures for a content
 * \param content Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentFailuresContentGetSync(char * accessToken,
	std::string content, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief List all failures for a content. *Asynchronous*
 *
 * This endpoint returns all failures for a content
 * \param content Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentFailuresContentGetAsync(char * accessToken,
	std::string content, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Content. *Synchronous*
 *
 * This endpoint returns a content by its ID
 * \param id Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentIdGetSync(char * accessToken,
	int id, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Content. *Asynchronous*
 *
 * This endpoint returns a content by its ID
 * \param id Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentIdGetAsync(char * accessToken,
	int id, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Import a deal. *Synchronous*
 *
 * This endpoint imports a deal into the shuttle.
 * \param body Import a deal *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentImportdealPostSync(char * accessToken,
	Main.importDealBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Import a deal. *Asynchronous*
 *
 * This endpoint imports a deal into the shuttle.
 * \param body Import a deal *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentImportdealPostAsync(char * accessToken,
	Main.importDealBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief List all pinned content. *Synchronous*
 *
 * This endpoint lists all content
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentListGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief List all pinned content. *Asynchronous*
 *
 * This endpoint lists all content
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentListGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Read content. *Synchronous*
 *
 * This endpoint reads content from the blockstore
 * \param cont CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentReadContGetSync(char * accessToken,
	std::string cont, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Read content. *Asynchronous*
 *
 * This endpoint reads content from the blockstore
 * \param cont CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentReadContGetAsync(char * accessToken,
	std::string cont, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get staging zone for user. *Synchronous*
 *
 * This endpoint is used to get staging zone for user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentStagingZonesGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get staging zone for user. *Asynchronous*
 *
 * This endpoint is used to get staging zone for user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentStagingZonesGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get content statistics. *Synchronous*
 *
 * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
 * \param limit limit *Required*
 * \param offset offset *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentStatsGetSync(char * accessToken,
	std::string limit, std::string offset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get content statistics. *Asynchronous*
 *
 * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
 * \param limit limit *Required*
 * \param offset offset *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentStatsGetAsync(char * accessToken,
	std::string limit, std::string offset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Content Status. *Synchronous*
 *
 * This endpoint returns the status of a content
 * \param id Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentStatusIdGetSync(char * accessToken,
	int id, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Content Status. *Asynchronous*
 *
 * This endpoint returns the status of a content
 * \param id Content ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contentStatusIdGetAsync(char * accessToken,
	int id, 
	void(* handler)(std::string, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.estuary.tech";
	}
};
/** @}*/

}
}
#endif /* ContentManager_H_ */
