#ifndef _AutoretrieveManager_H_
#define _AutoretrieveManager_H_

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
/** \addtogroup Autoretrieve Autoretrieve
 * \ingroup Operations
 *  @{
 */
class AutoretrieveManager {
public:
	AutoretrieveManager();
	virtual ~AutoretrieveManager();

/*! \brief Register autoretrieve server. *Synchronous*
 *
 * This endpoint registers a new autoretrieve server
 * \param addresses Autoretrieve's comma-separated list of addresses *Required*
 * \param pubKey Autoretrieve's public key *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminAutoretrieveInitPostSync(char * accessToken,
	std::string addresses, std::string pubKey, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Register autoretrieve server. *Asynchronous*
 *
 * This endpoint registers a new autoretrieve server
 * \param addresses Autoretrieve's comma-separated list of addresses *Required*
 * \param pubKey Autoretrieve's public key *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminAutoretrieveInitPostAsync(char * accessToken,
	std::string addresses, std::string pubKey, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief List autoretrieve servers. *Synchronous*
 *
 * This endpoint lists all registered autoretrieve servers
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminAutoretrieveListGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief List autoretrieve servers. *Asynchronous*
 *
 * This endpoint lists all registered autoretrieve servers
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminAutoretrieveListGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Marks autoretrieve server as up. *Synchronous*
 *
 * This endpoint updates the lastConnection field for autoretrieve
 * \param token Autoretrieve's auth token *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool autoretrieveHeartbeatPostSync(char * accessToken,
	std::string token, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Marks autoretrieve server as up. *Asynchronous*
 *
 * This endpoint updates the lastConnection field for autoretrieve
 * \param token Autoretrieve's auth token *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool autoretrieveHeartbeatPostAsync(char * accessToken,
	std::string token, 
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
#endif /* AutoretrieveManager_H_ */
