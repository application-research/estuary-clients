/*
 * Types.IpfsPin.h
 *
 * 
 */

#ifndef _Types.IpfsPin_H_
#define _Types.IpfsPin_H_


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

class Types.IpfsPin : public Object {
public:
	/*! \brief Constructor.
	 */
	Types.IpfsPin();
	Types.IpfsPin(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Types.IpfsPin();

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
	std::string getMeta();

	/*! \brief Set 
	 */
	void setMeta(std::string  meta);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<std::string> getOrigins();

	/*! \brief Set 
	 */
	void setOrigins(std::list <std::string> origins);

private:
	std::string cid;
	std::string meta;
	std::string name;
	std::list <std::string>origins;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Types.IpfsPin_H_ */
