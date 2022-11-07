#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Types.IpfsPin.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Types.IpfsPin::Types.IpfsPin()
{
	//__init();
}

Types.IpfsPin::~Types.IpfsPin()
{
	//__cleanup();
}

void
Types.IpfsPin::__init()
{
	//
	//
	//cid = std::string();
	//
	//
	//meta = null;
	//
	//
	//name = std::string();
	//
	//new std::list()std::list> origins;
	//
	//
}

void
Types.IpfsPin::__cleanup()
{
	//if(cid != NULL) {
	//
	//delete cid;
	//cid = NULL;
	//}
	//if(meta != NULL) {
	//
	//delete meta;
	//meta = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(origins != NULL) {
	//origins.RemoveAll(true);
	//delete origins;
	//origins = NULL;
	//}
	//
}

void
Types.IpfsPin::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cidKey = "cid";
	node = json_object_get_member(pJsonObject, cidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cid, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *metaKey = "meta";
	node = json_object_get_member(pJsonObject, metaKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&meta, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&meta);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *originsKey = "origins";
	node = json_object_get_member(pJsonObject, originsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			origins = new_list;
		}
		
	}
}

Types.IpfsPin::Types.IpfsPin(char* json)
{
	this->fromJson(json);
}

char*
Types.IpfsPin::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cidKey = "cid";
	json_object_set_member(pJsonObject, cidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMeta();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMeta());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metaKey = "meta";
	json_object_set_member(pJsonObject, metaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getOrigins());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getOrigins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *originsKey = "origins";
	json_object_set_member(pJsonObject, originsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Types.IpfsPin::getCid()
{
	return cid;
}

void
Types.IpfsPin::setCid(std::string  cid)
{
	this->cid = cid;
}

std::string
Types.IpfsPin::getMeta()
{
	return meta;
}

void
Types.IpfsPin::setMeta(std::string  meta)
{
	this->meta = meta;
}

std::string
Types.IpfsPin::getName()
{
	return name;
}

void
Types.IpfsPin::setName(std::string  name)
{
	this->name = name;
}

std::list<std::string>
Types.IpfsPin::getOrigins()
{
	return origins;
}

void
Types.IpfsPin::setOrigins(std::list <std::string> origins)
{
	this->origins = origins;
}


