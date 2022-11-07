#ifndef _PublicManager_H_
#define _PublicManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Util.HttpError.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Public Public
 * \ingroup Operations
 *  @{
 */
class PublicManager {
public:
	PublicManager();
	virtual ~PublicManager();

/*! \brief Get Content by Cid. *Synchronous*
 *
 * This endpoint returns the content associated with a CID
 * \param cid Cid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicByCidCidGetSync(char * accessToken,
	std::string cid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get Content by Cid. *Asynchronous*
 *
 * This endpoint returns the content associated with a CID
 * \param cid Cid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicByCidCidGetAsync(char * accessToken,
	std::string cid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get public node info. *Synchronous*
 *
 * This endpoint returns information about the node
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicInfoGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get public node info. *Asynchronous*
 *
 * This endpoint returns information about the node
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicInfoGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get deal metrics. *Synchronous*
 *
 * This endpoint is used to get deal metrics
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMetricsDealsOnChainGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get deal metrics. *Asynchronous*
 *
 * This endpoint is used to get deal metrics
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMetricsDealsOnChainGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get all miners deals. *Synchronous*
 *
 * This endpoint returns all miners deals
 * \param miner Filter by miner *Required*
 * \param ignoreFailed Ignore Failed
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersDealsMinerGetSync(char * accessToken,
	std::string miner, std::string ignoreFailed, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get all miners deals. *Asynchronous*
 *
 * This endpoint returns all miners deals
 * \param miner Filter by miner *Required*
 * \param ignoreFailed Ignore Failed
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersDealsMinerGetAsync(char * accessToken,
	std::string miner, std::string ignoreFailed, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get all miners. *Synchronous*
 *
 * This endpoint returns all miners
 * \param miner Filter by miner *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersFailuresMinerGetSync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get all miners. *Asynchronous*
 *
 * This endpoint returns all miners
 * \param miner Filter by miner *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersFailuresMinerGetAsync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get all miners. *Synchronous*
 *
 * This endpoint returns all miners
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get all miners. *Asynchronous*
 *
 * This endpoint returns all miners
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get miner stats. *Synchronous*
 *
 * This endpoint returns miner stats
 * \param miner Filter by miner *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersStatsMinerGetSync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get miner stats. *Asynchronous*
 *
 * This endpoint returns miner stats
 * \param miner Filter by miner *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersStatsMinerGetAsync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Net Addrs. *Synchronous*
 *
 * This endpoint is used to get net addrs
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicNetAddrsGetSync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief Net Addrs. *Asynchronous*
 *
 * This endpoint is used to get net addrs
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicNetAddrsGetAsync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);


/*! \brief Net Peers. *Synchronous*
 *
 * This endpoint is used to get net peers
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicNetPeersGetSync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief Net Peers. *Asynchronous*
 *
 * This endpoint is used to get net peers
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicNetPeersGetAsync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);


/*! \brief Public stats. *Synchronous*
 *
 * This endpoint is used to get public stats.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicStatsGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Public stats. *Asynchronous*
 *
 * This endpoint is used to get public stats.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicStatsGetAsync(char * accessToken,
	
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
#endif /* PublicManager_H_ */
