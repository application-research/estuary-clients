/*
 * Util.ContentCreateBody.h
 *
 * 
 */

#ifndef _Util.ContentCreateBody_H_
#define _Util.ContentCreateBody_H_


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

class Util.ContentCreateBody : public Object {
public:
	/*! \brief Constructor.
	 */
	Util.ContentCreateBody();
	Util.ContentCreateBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Util.ContentCreateBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getColuuid();

	/*! \brief Set 
	 */
	void setColuuid(std::string  coluuid);
	/*! \brief Get 
	 */
	std::string getDir();

	/*! \brief Set 
	 */
	void setDir(std::string  dir);
	/*! \brief Get 
	 */
	std::string getLocation();

	/*! \brief Set 
	 */
	void setLocation(std::string  location);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getRoot();

	/*! \brief Set 
	 */
	void setRoot(std::string  root);
	/*! \brief Get 
	 */
	int getType();

	/*! \brief Set 
	 */
	void setType(int  type);

private:
	std::string coluuid;
	std::string dir;
	std::string location;
	std::string name;
	std::string root;
	int type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Util.ContentCreateBody_H_ */
