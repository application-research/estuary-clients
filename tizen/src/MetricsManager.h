#ifndef _MetricsManager_H_
#define _MetricsManager_H_

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
/** \addtogroup Metrics Metrics
 * \ingroup Operations
 *  @{
 */
class MetricsManager {
public:
	MetricsManager();
	virtual ~MetricsManager();

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



	static std::string getBasePath()
	{
		return "https://api.estuary.tech";
	}
};
/** @}*/

}
}
#endif /* MetricsManager_H_ */
