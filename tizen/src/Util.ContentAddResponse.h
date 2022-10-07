/*
 * Util.ContentAddResponse.h
 *
 * 
 */

#ifndef _Util.ContentAddResponse_H_
#define _Util.ContentAddResponse_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Util.ContentAddResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	Util.ContentAddResponse();
	Util.ContentAddResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Util.ContentAddResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCid();

	/*! \brief Set 
	 */
	void setCid(std::string  cid);
	/*! \brief Get 
	 */
	int getEstuaryId();

	/*! \brief Set 
	 */
	void setEstuaryId(int  estuaryId);
	/*! \brief Get 
	 */
	std::list<std::string> getProviders();

	/*! \brief Set 
	 */
	void setProviders(std::list <std::string> providers);
	/*! \brief Get 
	 */
	std::string getRetrievalUrl();

	/*! \brief Set 
	 */
	void setRetrievalUrl(std::string  retrieval_url);

private:
	std::string cid;
	int estuaryId;
	std::list <std::string>providers;
	std::string retrieval_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Util.ContentAddResponse_H_ */
