#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Util.ContentCreateBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Util.ContentCreateBody::Util.ContentCreateBody()
{
	//__init();
}

Util.ContentCreateBody::~Util.ContentCreateBody()
{
	//__cleanup();
}

void
Util.ContentCreateBody::__init()
{
	//
	//
	//coluuid = std::string();
	//
	//
	//dir = std::string();
	//
	//
	//location = std::string();
	//
	//
	//name = std::string();
	//
	//
	//root = std::string();
	//
	//
	//type = null;
	//
}

void
Util.ContentCreateBody::__cleanup()
{
	//if(coluuid != NULL) {
	//
	//delete coluuid;
	//coluuid = NULL;
	//}
	//if(dir != NULL) {
	//
	//delete dir;
	//dir = NULL;
	//}
	//if(location != NULL) {
	//
	//delete location;
	//location = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(root != NULL) {
	//
	//delete root;
	//root = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
Util.ContentCreateBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *coluuidKey = "coluuid";
	node = json_object_get_member(pJsonObject, coluuidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&coluuid, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dirKey = "dir";
	node = json_object_get_member(pJsonObject, dirKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dir, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&location, node, "std::string", "");
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
	const gchar *rootKey = "root";
	node = json_object_get_member(pJsonObject, rootKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&root, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&type, node, "int", "");
		} else {
			
		}
	}
}

Util.ContentCreateBody::Util.ContentCreateBody(char* json)
{
	this->fromJson(json);
}

char*
Util.ContentCreateBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getColuuid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *coluuidKey = "coluuid";
	json_object_set_member(pJsonObject, coluuidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDir();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dirKey = "dir";
	json_object_set_member(pJsonObject, dirKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRoot();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rootKey = "root";
	json_object_set_member(pJsonObject, rootKey, node);
	if (isprimitive("int")) {
		int obj = getType();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Util.ContentCreateBody::getColuuid()
{
	return coluuid;
}

void
Util.ContentCreateBody::setColuuid(std::string  coluuid)
{
	this->coluuid = coluuid;
}

std::string
Util.ContentCreateBody::getDir()
{
	return dir;
}

void
Util.ContentCreateBody::setDir(std::string  dir)
{
	this->dir = dir;
}

std::string
Util.ContentCreateBody::getLocation()
{
	return location;
}

void
Util.ContentCreateBody::setLocation(std::string  location)
{
	this->location = location;
}

std::string
Util.ContentCreateBody::getName()
{
	return name;
}

void
Util.ContentCreateBody::setName(std::string  name)
{
	this->name = name;
}

std::string
Util.ContentCreateBody::getRoot()
{
	return root;
}

void
Util.ContentCreateBody::setRoot(std::string  root)
{
	this->root = root;
}

int
Util.ContentCreateBody::getType()
{
	return type;
}

void
Util.ContentCreateBody::setType(int  type)
{
	this->type = type;
}


