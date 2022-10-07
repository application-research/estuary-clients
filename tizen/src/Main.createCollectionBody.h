/*
 * Main.createCollectionBody.h
 *
 * 
 */

#ifndef _Main.createCollectionBody_H_
#define _Main.createCollectionBody_H_


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

class Main.createCollectionBody : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.createCollectionBody();
	Main.createCollectionBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.createCollectionBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string description;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.createCollectionBody_H_ */
