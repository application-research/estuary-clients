/*
 * Main.importDealBody.h
 *
 * 
 */

#ifndef _Main.importDealBody_H_
#define _Main.importDealBody_H_


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

class Main.importDealBody : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.importDealBody();
	Main.importDealBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.importDealBody();

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
	std::list<int> getDealIDs();

	/*! \brief Set 
	 */
	void setDealIDs(std::list <int> dealIDs);
	/*! \brief Get 
	 */
	std::string getDir();

	/*! \brief Set 
	 */
	void setDir(std::string  dir);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string coluuid;
	std::list <int>dealIDs;
	std::string dir;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.importDealBody_H_ */
