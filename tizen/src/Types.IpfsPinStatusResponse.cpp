#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Types.IpfsPinStatusResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Types.IpfsPinStatusResponse::Types.IpfsPinStatusResponse()
{
	//__init();
}

Types.IpfsPinStatusResponse::~Types.IpfsPinStatusResponse()
{
	//__cleanup();
}

void
Types.IpfsPinStatusResponse::__init()
{
	//
	//
	//created = std::string();
	//
	//new std::list()std::list> delegates;
	//
	//
	//
	//info = null;
	//
	//
	//pin = new Types.IpfsPin();
	//
	//
	//requestid = std::string();
	//
	//
	//status = std::string();
	//
}

void
Types.IpfsPinStatusResponse::__cleanup()
{
	//if(created != NULL) {
	//
	//delete created;
	//created = NULL;
	//}
	//if(delegates != NULL) {
	//delegates.RemoveAll(true);
	//delete delegates;
	//delegates = NULL;
	//}
	//if(info != NULL) {
	//
	//delete info;
	//info = NULL;
	//}
	//if(pin != NULL) {
	//
	//delete pin;
	//pin = NULL;
	//}
	//if(requestid != NULL) {
	//
	//delete requestid;
	//requestid = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
Types.IpfsPinStatusResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *createdKey = "created";
	node = json_object_get_member(pJsonObject, createdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *delegatesKey = "delegates";
	node = json_object_get_member(pJsonObject, delegatesKey);
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
			delegates = new_list;
		}
		
	}
	const gchar *infoKey = "info";
	node = json_object_get_member(pJsonObject, infoKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&info, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&info);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pinKey = "pin";
	node = json_object_get_member(pJsonObject, pinKey);
	if (node !=NULL) {
	

		if (isprimitive("Types.IpfsPin")) {
			jsonToValue(&pin, node, "Types.IpfsPin", "Types.IpfsPin");
		} else {
			
			Types.IpfsPin* obj = static_cast<Types.IpfsPin*> (&pin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestidKey = "requestid";
	node = json_object_get_member(pJsonObject, requestidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&requestid, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
}

Types.IpfsPinStatusResponse::Types.IpfsPinStatusResponse(char* json)
{
	this->fromJson(json);
}

char*
Types.IpfsPinStatusResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreated();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdKey = "created";
	json_object_set_member(pJsonObject, createdKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getDelegates());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getDelegates());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *delegatesKey = "delegates";
	json_object_set_member(pJsonObject, delegatesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInfo();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *infoKey = "info";
	json_object_set_member(pJsonObject, infoKey, node);
	if (isprimitive("Types.IpfsPin")) {
		Types.IpfsPin obj = getPin();
		node = converttoJson(&obj, "Types.IpfsPin", "");
	}
	else {
		
		Types.IpfsPin obj = static_cast<Types.IpfsPin> (getPin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pinKey = "pin";
	json_object_set_member(pJsonObject, pinKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRequestid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *requestidKey = "requestid";
	json_object_set_member(pJsonObject, requestidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Types.IpfsPinStatusResponse::getCreated()
{
	return created;
}

void
Types.IpfsPinStatusResponse::setCreated(std::string  created)
{
	this->created = created;
}

std::list<std::string>
Types.IpfsPinStatusResponse::getDelegates()
{
	return delegates;
}

void
Types.IpfsPinStatusResponse::setDelegates(std::list <std::string> delegates)
{
	this->delegates = delegates;
}

std::string
Types.IpfsPinStatusResponse::getInfo()
{
	return info;
}

void
Types.IpfsPinStatusResponse::setInfo(std::string  info)
{
	this->info = info;
}

Types.IpfsPin
Types.IpfsPinStatusResponse::getPin()
{
	return pin;
}

void
Types.IpfsPinStatusResponse::setPin(Types.IpfsPin  pin)
{
	this->pin = pin;
}

std::string
Types.IpfsPinStatusResponse::getRequestid()
{
	return requestid;
}

void
Types.IpfsPinStatusResponse::setRequestid(std::string  requestid)
{
	this->requestid = requestid;
}

std::string
Types.IpfsPinStatusResponse::getStatus()
{
	return status;
}

void
Types.IpfsPinStatusResponse::setStatus(std::string  status)
{
	this->status = status;
}


