/*
 * Types.IpfsListPinStatusResponse.h
 *
 * 
 */

#ifndef _Types.IpfsListPinStatusResponse_H_
#define _Types.IpfsListPinStatusResponse_H_


#include <string>
#include "Types.IpfsPinStatusResponse.h"
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

class Types.IpfsListPinStatusResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	Types.IpfsListPinStatusResponse();
	Types.IpfsListPinStatusResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Types.IpfsListPinStatusResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCount();

	/*! \brief Set 
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	std::list<Types.IpfsPinStatusResponse> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <Types.IpfsPinStatusResponse> results);

private:
	int count;
	std::list <Types.IpfsPinStatusResponse>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Types.IpfsListPinStatusResponse_H_ */
