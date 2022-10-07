/*
 * Util.ContentAddIpfsBody.h
 *
 * 
 */

#ifndef _Util.ContentAddIpfsBody_H_
#define _Util.ContentAddIpfsBody_H_


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

class Util.ContentAddIpfsBody : public Object {
public:
	/*! \brief Constructor.
	 */
	Util.ContentAddIpfsBody();
	Util.ContentAddIpfsBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Util.ContentAddIpfsBody();

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
	std::string getFilename();

	/*! \brief Set 
	 */
	void setFilename(std::string  filename);
	/*! \brief Get 
	 */
	std::list<std::string> getPeers();

	/*! \brief Set 
	 */
	void setPeers(std::list <std::string> peers);
	/*! \brief Get 
	 */
	std::string getRoot();

	/*! \brief Set 
	 */
	void setRoot(std::string  root);

private:
	std::string coluuid;
	std::string dir;
	std::string filename;
	std::list <std::string>peers;
	std::string root;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Util.ContentAddIpfsBody_H_ */
