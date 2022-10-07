#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Util.HttpError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Util.HttpError::Util.HttpError()
{
	//__init();
}

Util.HttpError::~Util.HttpError()
{
	//__cleanup();
}

void
Util.HttpError::__init()
{
	//
	//
	//code = null;
	//
	//
	//details = std::string();
	//
	//
	//reason = std::string();
	//
}

void
Util.HttpError::__cleanup()
{
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(details != NULL) {
	//
	//delete details;
	//details = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
Util.HttpError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&code, node, "int", "");
		} else {
			
		}
	}
	const gchar *detailsKey = "details";
	node = json_object_get_member(pJsonObject, detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&details, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reason, node, "std::string", "");
		} else {
			
		}
	}
}

Util.HttpError::Util.HttpError(char* json)
{
	this->fromJson(json);
}

char*
Util.HttpError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDetails();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *detailsKey = "details";
	json_object_set_member(pJsonObject, detailsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Util.HttpError::getCode()
{
	return code;
}

void
Util.HttpError::setCode(int  code)
{
	this->code = code;
}

std::string
Util.HttpError::getDetails()
{
	return details;
}

void
Util.HttpError::setDetails(std::string  details)
{
	this->details = details;
}

std::string
Util.HttpError::getReason()
{
	return reason;
}

void
Util.HttpError::setReason(std::string  reason)
{
	this->reason = reason;
}


