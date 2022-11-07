#ifndef _DealsManager_H_
#define _DealsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Main.ChannelIDParam.h"
#include "Main.estimateDealBody.h"
#include "Util.HttpError.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Deals Deals
 * \ingroup Operations
 *  @{
 */
class DealsManager {
public:
	DealsManager();
	virtual ~DealsManager();

/*! \brief Estimate the cost of a deal. *Synchronous*
 *
 * This endpoint estimates the cost of a deal
 * \param body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealEstimatePostSync(char * accessToken,
	Main.estimateDealBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Estimate the cost of a deal. *Asynchronous*
 *
 * This endpoint estimates the cost of a deal
 * \param body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealEstimatePostAsync(char * accessToken,
	Main.estimateDealBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get Deal Info. *Synchronous*
 *
 * This endpoint returns the deal info for a deal
 * \param dealid Deal ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealInfoDealidGetSync(char * accessToken,
	int dealid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get Deal Info. *Asynchronous*
 *
 * This endpoint returns the deal info for a deal
 * \param dealid Deal ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealInfoDealidGetAsync(char * accessToken,
	int dealid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get Proposal. *Synchronous*
 *
 * This endpoint returns the proposal for a deal
 * \param propcid Proposal CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealProposalPropcidGetSync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get Proposal. *Asynchronous*
 *
 * This endpoint returns the proposal for a deal
 * \param propcid Proposal CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealProposalPropcidGetAsync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Query Ask. *Synchronous*
 *
 * This endpoint returns the ask for a given CID
 * \param miner CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealQueryMinerGetSync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Query Ask. *Asynchronous*
 *
 * This endpoint returns the ask for a given CID
 * \param miner CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealQueryMinerGetAsync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get Deal Status by PropCid. *Synchronous*
 *
 * Get Deal Status by PropCid
 * \param propcid PropCid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealStatusByProposalPropcidGetSync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get Deal Status by PropCid. *Asynchronous*
 *
 * Get Deal Status by PropCid
 * \param propcid PropCid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealStatusByProposalPropcidGetAsync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Deal Status. *Synchronous*
 *
 * This endpoint returns the status of a deal
 * \param miner Miner *Required*
 * \param propcid Proposal CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealStatusMinerPropcidGetSync(char * accessToken,
	std::string miner, std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Deal Status. *Asynchronous*
 *
 * This endpoint returns the status of a deal
 * \param miner Miner *Required*
 * \param propcid Proposal CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealStatusMinerPropcidGetAsync(char * accessToken,
	std::string miner, std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Transfer In Progress. *Synchronous*
 *
 * This endpoint returns the in-progress transfers
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealTransferInProgressGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Transfer In Progress. *Asynchronous*
 *
 * This endpoint returns the in-progress transfers
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealTransferInProgressGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Transfer Status. *Synchronous*
 *
 * This endpoint returns the status of a transfer
 * \param chanid Channel ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealTransferStatusPostSync(char * accessToken,
	Main.ChannelIDParam chanid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Transfer Status. *Asynchronous*
 *
 * This endpoint returns the status of a transfer
 * \param chanid Channel ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealTransferStatusPostAsync(char * accessToken,
	Main.ChannelIDParam chanid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get storage failures for user. *Synchronous*
 *
 * This endpoint returns a list of storage failures for user
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealsFailuresGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get storage failures for user. *Asynchronous*
 *
 * This endpoint returns a list of storage failures for user
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealsFailuresGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Make Deal. *Synchronous*
 *
 * This endpoint makes a deal for a given content and miner
 * \param miner Miner *Required*
 * \param dealRequest Deal Request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealsMakeMinerPostSync(char * accessToken,
	std::string miner, std::string dealRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Make Deal. *Asynchronous*
 *
 * This endpoint makes a deal for a given content and miner
 * \param miner Miner *Required*
 * \param dealRequest Deal Request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealsMakeMinerPostAsync(char * accessToken,
	std::string miner, std::string dealRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get Deal Status. *Synchronous*
 *
 * This endpoint returns the status of a deal
 * \param deal Deal ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealsStatusDealGetSync(char * accessToken,
	int deal, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get Deal Status. *Asynchronous*
 *
 * This endpoint returns the status of a deal
 * \param deal Deal ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool dealsStatusDealGetAsync(char * accessToken,
	int deal, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get storage failures. *Synchronous*
 *
 * This endpoint returns a list of storage failures
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicDealsFailuresGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get storage failures. *Asynchronous*
 *
 * This endpoint returns a list of storage failures
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicDealsFailuresGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Query Ask. *Synchronous*
 *
 * This endpoint returns the ask for a given CID
 * \param miner CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersStorageQueryMinerGetSync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Query Ask. *Asynchronous*
 *
 * This endpoint returns the ask for a given CID
 * \param miner CID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool publicMinersStorageQueryMinerGetAsync(char * accessToken,
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
#endif /* DealsManager_H_ */
