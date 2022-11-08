#ifndef _MinerManager_H_
#define _MinerManager_H_

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
/** \addtogroup Miner Miner
 * \ingroup Operations
 *  @{
 */
class MinerManager {
public:
	MinerManager();
	virtual ~MinerManager();

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



	static std::string getBasePath()
	{
		return "https://api.estuary.tech";
	}
};
/** @}*/

}
}
#endif /* MinerManager_H_ */
