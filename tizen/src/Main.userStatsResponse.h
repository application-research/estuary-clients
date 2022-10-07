/*
 * Main.userStatsResponse.h
 *
 * 
 */

#ifndef _Main.userStatsResponse_H_
#define _Main.userStatsResponse_H_


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

class Main.userStatsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.userStatsResponse();
	Main.userStatsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.userStatsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getNumPins();

	/*! \brief Set 
	 */
	void setNumPins(int  numPins);
	/*! \brief Get 
	 */
	int getTotalSize();

	/*! \brief Set 
	 */
	void setTotalSize(int  totalSize);

private:
	int numPins;
	int totalSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.userStatsResponse_H_ */
