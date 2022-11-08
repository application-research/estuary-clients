#ifndef _PinningManager_H_
#define _PinningManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Types.IpfsListPinStatusResponse.h"
#include "Types.IpfsPin.h"
#include "Types.IpfsPinStatusResponse.h"
#include "Util.HttpError.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Pinning Pinning
 * \ingroup Operations
 *  @{
 */
class PinningManager {
public:
	PinningManager();
	virtual ~PinningManager();

/*! \brief List all pin status objects. *Synchronous*
 *
 * This endpoint lists all pin status objects
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsGetSync(char * accessToken,
	
	void(* handler)(Types.IpfsListPinStatusResponse, Error, void* )
	, void* userData);

/*! \brief List all pin status objects. *Asynchronous*
 *
 * This endpoint lists all pin status objects
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsGetAsync(char * accessToken,
	
	void(* handler)(Types.IpfsListPinStatusResponse, Error, void* )
	, void* userData);


/*! \brief Delete a pinned object. *Synchronous*
 *
 * This endpoint deletes a pinned object.
 * \param pinid Pin ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPinidDeleteSync(char * accessToken,
	std::string pinid, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete a pinned object. *Asynchronous*
 *
 * This endpoint deletes a pinned object.
 * \param pinid Pin ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPinidDeleteAsync(char * accessToken,
	std::string pinid, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get a pin status object. *Synchronous*
 *
 * This endpoint returns a pin status object.
 * \param pinid cid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPinidGetSync(char * accessToken,
	std::string pinid, 
	void(* handler)(Types.IpfsPinStatusResponse, Error, void* )
	, void* userData);

/*! \brief Get a pin status object. *Asynchronous*
 *
 * This endpoint returns a pin status object.
 * \param pinid cid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPinidGetAsync(char * accessToken,
	std::string pinid, 
	void(* handler)(Types.IpfsPinStatusResponse, Error, void* )
	, void* userData);


/*! \brief Replace a pinned object. *Synchronous*
 *
 * This endpoint replaces a pinned object.
 * \param pinid Pin ID *Required*
 * \param cid CID of new pin *Required*
 * \param name Name (filename) of new pin
 * \param origins Origins of new pin
 * \param meta Meta information of new pin
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPinidPostSync(char * accessToken,
	std::string pinid, std::string cid, std::string name, std::string origins, std::string meta, 
	void(* handler)(Types.IpfsPinStatusResponse, Error, void* )
	, void* userData);

/*! \brief Replace a pinned object. *Asynchronous*
 *
 * This endpoint replaces a pinned object.
 * \param pinid Pin ID *Required*
 * \param cid CID of new pin *Required*
 * \param name Name (filename) of new pin
 * \param origins Origins of new pin
 * \param meta Meta information of new pin
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPinidPostAsync(char * accessToken,
	std::string pinid, std::string cid, std::string name, std::string origins, std::string meta, 
	void(* handler)(Types.IpfsPinStatusResponse, Error, void* )
	, void* userData);


/*! \brief Add and pin object. *Synchronous*
 *
 * This endpoint adds a pin to the IPFS daemon.
 * \param pin Pin Body {cid:cid, name:name} *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPostSync(char * accessToken,
	Types.IpfsPin pin, 
	void(* handler)(Types.IpfsPinStatusResponse, Error, void* )
	, void* userData);

/*! \brief Add and pin object. *Asynchronous*
 *
 * This endpoint adds a pin to the IPFS daemon.
 * \param pin Pin Body {cid:cid, name:name} *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pinningPinsPostAsync(char * accessToken,
	Types.IpfsPin pin, 
	void(* handler)(Types.IpfsPinStatusResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.estuary.tech";
	}
};
/** @}*/

}
}
#endif /* PinningManager_H_ */
