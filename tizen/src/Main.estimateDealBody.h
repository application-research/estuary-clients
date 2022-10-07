/*
 * Main.estimateDealBody.h
 *
 * 
 */

#ifndef _Main.estimateDealBody_H_
#define _Main.estimateDealBody_H_


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

class Main.estimateDealBody : public Object {
public:
	/*! \brief Constructor.
	 */
	Main.estimateDealBody();
	Main.estimateDealBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Main.estimateDealBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getDurationBlks();

	/*! \brief Set 
	 */
	void setDurationBlks(int  durationBlks);
	/*! \brief Get 
	 */
	int getReplication();

	/*! \brief Set 
	 */
	void setReplication(int  replication);
	/*! \brief Get 
	 */
	int getSize();

	/*! \brief Set 
	 */
	void setSize(int  size);
	/*! \brief Get 
	 */
	bool getVerified();

	/*! \brief Set 
	 */
	void setVerified(bool  verified);

private:
	int durationBlks;
	int replication;
	int size;
	bool verified;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Main.estimateDealBody_H_ */
