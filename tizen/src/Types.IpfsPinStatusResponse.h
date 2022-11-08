/*
 * Types.IpfsPinStatusResponse.h
 *
 * 
 */

#ifndef _Types.IpfsPinStatusResponse_H_
#define _Types.IpfsPinStatusResponse_H_


#include <string>
#include "Types.IpfsPin.h"
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

class Types.IpfsPinStatusResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	Types.IpfsPinStatusResponse();
	Types.IpfsPinStatusResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Types.IpfsPinStatusResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCreated();

	/*! \brief Set 
	 */
	void setCreated(std::string  created);
	/*! \brief Get 
	 */
	std::list<std::string> getDelegates();

	/*! \brief Set 
	 */
	void setDelegates(std::list <std::string> delegates);
	/*! \brief Get 
	 */
	std::string getInfo();

	/*! \brief Set 
	 */
	void setInfo(std::string  info);
	/*! \brief Get 
	 */
	Types.IpfsPin getPin();

	/*! \brief Set 
	 */
	void setPin(Types.IpfsPin  pin);
	/*! \brief Get 
	 */
	std::string getRequestid();

	/*! \brief Set 
	 */
	void setRequestid(std::string  requestid);
	/*! \brief Get 
	 */
	std::string getStatus();

	/*! \brief Set 
	 */
	void setStatus(std::string  status);

private:
	std::string created;
	std::list <std::string>delegates;
	std::string info;
	Types.IpfsPin pin;
	std::string requestid;
	std::string status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Types.IpfsPinStatusResponse_H_ */
