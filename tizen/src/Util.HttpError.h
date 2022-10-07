/*
 * Util.HttpError.h
 *
 * 
 */

#ifndef _Util.HttpError_H_
#define _Util.HttpError_H_


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

class Util.HttpError : public Object {
public:
	/*! \brief Constructor.
	 */
	Util.HttpError();
	Util.HttpError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Util.HttpError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getDetails();

	/*! \brief Set 
	 */
	void setDetails(std::string  details);
	/*! \brief Get 
	 */
	std::string getReason();

	/*! \brief Set 
	 */
	void setReason(std::string  reason);

private:
	int code;
	std::string details;
	std::string reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Util.HttpError_H_ */
