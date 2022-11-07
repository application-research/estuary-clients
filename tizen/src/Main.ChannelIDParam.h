/*
 * Main.ChannelIDParam.h
 *
 * 
 */

#ifndef _Main.ChannelIDParam_H_
#define _Main.ChannelIDParam_H_


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

class Main.ChannelIDParam : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.ChannelIDParam();
	Main.ChannelIDParam(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.ChannelIDParam();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getInitiator();

	/*! \brief Set 
	 */
	void setInitiator(std::string  initiator);
	/*! \brief Get 
	 */
	std::string getResponder();

	/*! \brief Set 
	 */
	void setResponder(std::string  responder);

private:
	int id;
	std::string initiator;
	std::string responder;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.ChannelIDParam_H_ */
