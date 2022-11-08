/*
 * Main.getApiKeysResp.h
 *
 * 
 */

#ifndef _Main.getApiKeysResp_H_
#define _Main.getApiKeysResp_H_


#include <string>
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

class Main.getApiKeysResp : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.getApiKeysResp();
	Main.getApiKeysResp(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.getApiKeysResp();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getExpiry();

	/*! \brief Set 
	 */
	void setExpiry(std::string  expiry);
	/*! \brief Get 
	 */
	std::string getLabel();

	/*! \brief Set 
	 */
	void setLabel(std::string  label);
	/*! \brief Get 
	 */
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string  token);
	/*! \brief Get 
	 */
	std::string getTokenHash();

	/*! \brief Set 
	 */
	void setTokenHash(std::string  tokenHash);

private:
	std::string expiry;
	std::string label;
	std::string token;
	std::string tokenHash;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.getApiKeysResp_H_ */
