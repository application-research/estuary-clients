#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Main.importDealBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Main.importDealBody::Main.importDealBody()
{
	//__init();
}

Main.importDealBody::~Main.importDealBody()
{
	//__cleanup();
}

void
Main.importDealBody::__init()
{
	//
	//
	//coluuid = std::string();
	//
	//new std::list()std::list> dealIDs;
	//
	//
	//
	//dir = std::string();
	//
	//
	//name = std::string();
	//
}

void
Main.importDealBody::__cleanup()
{
	//if(coluuid != NULL) {
	//
	//delete coluuid;
	//coluuid = NULL;
	//}
	//if(dealIDs != NULL) {
	//dealIDs.RemoveAll(true);
	//delete dealIDs;
	//dealIDs = NULL;
	//}
	//if(dir != NULL) {
	//
	//delete dir;
	//dir = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
Main.importDealBody::fromJson(char* jsonStr)
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
	const gchar *dealIDsKey = "dealIDs";
	node = json_object_get_member(pJsonObject, dealIDsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			dealIDs = new_list;
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

Main.importDealBody::Main.importDealBody(char* json)
{
	this->fromJson(json);
}

char*
Main.importDealBody::toJson()
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
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getDealIDs());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getDealIDs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *dealIDsKey = "dealIDs";
	json_object_set_member(pJsonObject, dealIDsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDir();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dirKey = "dir";
	json_object_set_member(pJsonObject, dirKey, node);
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
Main.importDealBody::getColuuid()
{
	return coluuid;
}

void
Main.importDealBody::setColuuid(std::string  coluuid)
{
	this->coluuid = coluuid;
}

std::list<int>
Main.importDealBody::getDealIDs()
{
	return dealIDs;
}

void
Main.importDealBody::setDealIDs(std::list <int> dealIDs)
{
	this->dealIDs = dealIDs;
}

std::string
Main.importDealBody::getDir()
{
	return dir;
}

void
Main.importDealBody::setDir(std::string  dir)
{
	this->dir = dir;
}

std::string
Main.importDealBody::getName()
{
	return name;
}

void
Main.importDealBody::setName(std::string  name)
{
	this->name = name;
}


