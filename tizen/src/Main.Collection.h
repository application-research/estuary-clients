/*
 * Main.Collection.h
 *
 * 
 */

#ifndef _Main.Collection_H_
#define _Main.Collection_H_


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

class Main.Collection : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.Collection();
	Main.Collection(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.Collection();

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
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  createdAt);
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
	/*! \brief Get 
	 */
	int getUserId();

	/*! \brief Set 
	 */
	void setUserId(int  userId);
	/*! \brief Get 
	 */
	std::string getUuid();

	/*! \brief Set 
	 */
	void setUuid(std::string  uuid);

private:
	std::string cid;
	std::string createdAt;
	std::string description;
	std::string name;
	int userId;
	std::string uuid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.Collection_H_ */
