#ifndef _NetManager_H_
#define _NetManager_H_

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
/** \addtogroup Net Net
 * \ingroup Operations
 *  @{
 */
class NetManager {
public:
	NetManager();
	virtual ~NetManager();

/*! \brief Net Addrs. *Synchronous*
 *
 * This endpoint is used to get net addrs
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool netAddrsGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Net Addrs. *Asynchronous*
 *
 * This endpoint is used to get net addrs
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool netAddrsGetAsync(char * accessToken,
	
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



	static std::string getBasePath()
	{
		return "https://api.estuary.tech";
	}
};
/** @}*/

}
}
#endif /* NetManager_H_ */
