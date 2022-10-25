#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Main.deleteContentFromCollectionBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Main.deleteContentFromCollectionBody::Main.deleteContentFromCollectionBody()
{
	//__init();
}

Main.deleteContentFromCollectionBody::~Main.deleteContentFromCollectionBody()
{
	//__cleanup();
}

void
Main.deleteContentFromCollectionBody::__init()
{
	//
	//
	//by = std::string();
	//
	//
	//value = std::string();
	//
}

void
Main.deleteContentFromCollectionBody::__cleanup()
{
	//if(by != NULL) {
	//
	//delete by;
	//by = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
Main.deleteContentFromCollectionBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *byKey = "by";
	node = json_object_get_member(pJsonObject, byKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&by, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

Main.deleteContentFromCollectionBody::Main.deleteContentFromCollectionBody(char* json)
{
	this->fromJson(json);
}

char*
Main.deleteContentFromCollectionBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBy();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *byKey = "by";
	json_object_set_member(pJsonObject, byKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Main.deleteContentFromCollectionBody::getBy()
{
	return by;
}

void
Main.deleteContentFromCollectionBody::setBy(std::string  by)
{
	this->by = by;
}

std::string
Main.deleteContentFromCollectionBody::getValue()
{
	return value;
}

void
Main.deleteContentFromCollectionBody::setValue(std::string  value)
{
	this->value = value;
}


