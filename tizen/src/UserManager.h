#ifndef _UserManager_H_
#define _UserManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Main.getApiKeysResp.h"
#include "Util.HttpError.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup User User
 * \ingroup Operations
 *  @{
 */
class UserManager {
public:
	UserManager();
	virtual ~UserManager();

/*! \brief Get API keys for a user. *Synchronous*
 *
 * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysGetSync(char * accessToken,
	
	void(* handler)(std::list<std::list>, Error, void* )
	, void* userData);

/*! \brief Get API keys for a user. *Asynchronous*
 *
 * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysGetAsync(char * accessToken,
	
	void(* handler)(std::list<std::list>, Error, void* )
	, void* userData);


/*! \brief Revoke a User API Key.. *Synchronous*
 *
 * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable.
 * \param keyOrHash Key or Hash *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysKeyOrHashDeleteSync(char * accessToken,
	std::string keyOrHash, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Revoke a User API Key.. *Asynchronous*
 *
 * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable.
 * \param keyOrHash Key or Hash *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysKeyOrHashDeleteAsync(char * accessToken,
	std::string keyOrHash, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Create API keys for a user. *Synchronous*
 *
 * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
 * \param expiry Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
 * \param perms Permissions -- currently unused
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysPostSync(char * accessToken,
	std::string expiry, std::string perms, 
	void(* handler)(Main.getApiKeysResp, Error, void* )
	, void* userData);

/*! \brief Create API keys for a user. *Asynchronous*
 *
 * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
 * \param expiry Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
 * \param perms Permissions -- currently unused
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysPostAsync(char * accessToken,
	std::string expiry, std::string perms, 
	void(* handler)(Main.getApiKeysResp, Error, void* )
	, void* userData);


/*! \brief Export user data. *Synchronous*
 *
 * This endpoint is used to get API keys for a user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userExportGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Export user data. *Asynchronous*
 *
 * This endpoint is used to get API keys for a user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userExportGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Create API keys for a user. *Synchronous*
 *
 * This endpoint is used to create API keys for a user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userStatsGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Create API keys for a user. *Asynchronous*
 *
 * This endpoint is used to create API keys for a user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userStatsGetAsync(char * accessToken,
	
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
#endif /* UserManager_H_ */
