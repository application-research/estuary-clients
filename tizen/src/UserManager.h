#ifndef _UserManager_H_
#define _UserManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Main.getApiKeysResp.h"
#include "Main.userStatsResponse.h"
#include "Util.HttpError.h"
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
	
	void(* handler)(std::list<Main.getApiKeysResp>, Error, void* )
	, void* userData);

/*! \brief Get API keys for a user. *Asynchronous*
 *
 * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysGetAsync(char * accessToken,
	
	void(* handler)(std::list<Main.getApiKeysResp>, Error, void* )
	, void* userData);


/*! \brief Revoke a User API Key.. *Synchronous*
 *
 * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
 * \param key Key *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysKeyDeleteSync(char * accessToken,
	std::string key, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Revoke a User API Key.. *Asynchronous*
 *
 * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
 * \param key Key *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysKeyDeleteAsync(char * accessToken,
	std::string key, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create API keys for a user. *Synchronous*
 *
 * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysPostSync(char * accessToken,
	
	void(* handler)(Main.getApiKeysResp, Error, void* )
	, void* userData);

/*! \brief Create API keys for a user. *Asynchronous*
 *
 * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userApiKeysPostAsync(char * accessToken,
	
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
	
	void(* handler)(Main.userStatsResponse, Error, void* )
	, void* userData);

/*! \brief Create API keys for a user. *Asynchronous*
 *
 * This endpoint is used to create API keys for a user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userStatsGetAsync(char * accessToken,
	
	void(* handler)(Main.userStatsResponse, Error, void* )
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
