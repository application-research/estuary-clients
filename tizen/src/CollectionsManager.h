#ifndef _CollectionsManager_H_
#define _CollectionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Collections.Collection.h"
#include "Main.createCollectionBody.h"
#include "Main.deleteContentFromCollectionBody.h"
#include "Util.HttpError.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Collections Collections
 * \ingroup Operations
 *  @{
 */
class CollectionsManager {
public:
	CollectionsManager();
	virtual ~CollectionsManager();

/*! \brief Produce a CID of the collection contents. *Synchronous*
 *
 * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
 * \param coluuid coluuid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidCommitPostSync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Produce a CID of the collection contents. *Asynchronous*
 *
 * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
 * \param coluuid coluuid *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidCommitPostAsync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Deletes a content from a collection. *Synchronous*
 *
 * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
 * \param coluuid Collection ID *Required*
 * \param contentid Content ID *Required*
 * \param body Variable to use when filtering for files (must be either 'path' or 'content_id') *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidContentsDeleteSync(char * accessToken,
	std::string coluuid, std::string contentid, Main.deleteContentFromCollectionBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Deletes a content from a collection. *Asynchronous*
 *
 * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
 * \param coluuid Collection ID *Required*
 * \param contentid Content ID *Required*
 * \param body Variable to use when filtering for files (must be either 'path' or 'content_id') *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidContentsDeleteAsync(char * accessToken,
	std::string coluuid, std::string contentid, Main.deleteContentFromCollectionBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Deletes a collection. *Synchronous*
 *
 * This endpoint is used to delete an existing collection.
 * \param coluuid Collection ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidDeleteSync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Deletes a collection. *Asynchronous*
 *
 * This endpoint is used to delete an existing collection.
 * \param coluuid Collection ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidDeleteAsync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Get contents in a collection. *Synchronous*
 *
 * This endpoint is used to get contents in a collection. If no colpath query param is passed
 * \param coluuid coluuid *Required*
 * \param dir Directory
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidGetSync(char * accessToken,
	std::string coluuid, std::string dir, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Get contents in a collection. *Asynchronous*
 *
 * This endpoint is used to get contents in a collection. If no colpath query param is passed
 * \param coluuid coluuid *Required*
 * \param dir Directory
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidGetAsync(char * accessToken,
	std::string coluuid, std::string dir, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Add contents to a collection. *Synchronous*
 *
 * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
 * \param coluuid coluuid *Required*
 * \param contentIDs Content IDs to add to collection *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidPostSync(char * accessToken,
	std::string coluuid, std::list<> contentIDs, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Add contents to a collection. *Asynchronous*
 *
 * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
 * \param coluuid coluuid *Required*
 * \param contentIDs Content IDs to add to collection *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsColuuidPostAsync(char * accessToken,
	std::string coluuid, std::list<> contentIDs, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Add a file to a collection. *Synchronous*
 *
 * This endpoint adds a file to a collection
 * \param coluuid Collection ID *Required*
 * \param content Content *Required*
 * \param path Path to file *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsFsAddPostSync(char * accessToken,
	std::string coluuid, std::string content, std::string path, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Add a file to a collection. *Asynchronous*
 *
 * This endpoint adds a file to a collection
 * \param coluuid Collection ID *Required*
 * \param content Content *Required*
 * \param path Path to file *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsFsAddPostAsync(char * accessToken,
	std::string coluuid, std::string content, std::string path, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief List all collections. *Synchronous*
 *
 * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsGetSync(char * accessToken,
	
	void(* handler)(std::list<std::list>, Error, void* )
	, void* userData);

/*! \brief List all collections. *Asynchronous*
 *
 * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsGetAsync(char * accessToken,
	
	void(* handler)(std::list<std::list>, Error, void* )
	, void* userData);


/*! \brief Create a new collection. *Synchronous*
 *
 * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
 * \param body Collection name and description *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsPostSync(char * accessToken,
	Main.createCollectionBody body, 
	void(* handler)(Collections.Collection, Error, void* )
	, void* userData);

/*! \brief Create a new collection. *Asynchronous*
 *
 * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
 * \param body Collection name and description *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool collectionsPostAsync(char * accessToken,
	Main.createCollectionBody body, 
	void(* handler)(Collections.Collection, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.estuary.tech";
	}
};
/** @}*/

}
}
#endif /* CollectionsManager_H_ */
