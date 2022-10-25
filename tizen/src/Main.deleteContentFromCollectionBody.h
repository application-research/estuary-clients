/*
 * Main.deleteContentFromCollectionBody.h
 *
 * 
 */

#ifndef _Main.deleteContentFromCollectionBody_H_
#define _Main.deleteContentFromCollectionBody_H_


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

class Main.deleteContentFromCollectionBody : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.deleteContentFromCollectionBody();
	Main.deleteContentFromCollectionBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.deleteContentFromCollectionBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getBy();

	/*! \brief Set 
	 */
	void setBy(std::string  by);
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);

private:
	std::string by;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.deleteContentFromCollectionBody_H_ */
