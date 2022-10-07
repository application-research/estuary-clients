#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Main.createCollectionBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Main.createCollectionBody::Main.createCollectionBody()
{
	//__init();
}

Main.createCollectionBody::~Main.createCollectionBody()
{
	//__cleanup();
}

void
Main.createCollectionBody::__init()
{
	//
	//
	//description = std::string();
	//
	//
	//name = std::string();
	//
}

void
Main.createCollectionBody::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
Main.createCollectionBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

Main.createCollectionBody::Main.createCollectionBody(char* json)
{
	this->fromJson(json);
}

char*
Main.createCollectionBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Main.createCollectionBody::getDescription()
{
	return description;
}

void
Main.createCollectionBody::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Main.createCollectionBody::getName()
{
	return name;
}

void
Main.createCollectionBody::setName(std::string  name)
{
	this->name = name;
}


