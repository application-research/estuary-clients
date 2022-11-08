#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Main.ChannelIDParam.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Main.ChannelIDParam::Main.ChannelIDParam()
{
	//__init();
}

Main.ChannelIDParam::~Main.ChannelIDParam()
{
	//__cleanup();
}

void
Main.ChannelIDParam::__init()
{
	//
	//
	//id = null;
	//
	//
	//initiator = std::string();
	//
	//
	//responder = std::string();
	//
}

void
Main.ChannelIDParam::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(initiator != NULL) {
	//
	//delete initiator;
	//initiator = NULL;
	//}
	//if(responder != NULL) {
	//
	//delete responder;
	//responder = NULL;
	//}
	//
}

void
Main.ChannelIDParam::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *initiatorKey = "initiator";
	node = json_object_get_member(pJsonObject, initiatorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&initiator, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *responderKey = "responder";
	node = json_object_get_member(pJsonObject, responderKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&responder, node, "std::string", "");
		} else {
			
		}
	}
}

Main.ChannelIDParam::Main.ChannelIDParam(char* json)
{
	this->fromJson(json);
}

char*
Main.ChannelIDParam::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInitiator();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *initiatorKey = "initiator";
	json_object_set_member(pJsonObject, initiatorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getResponder();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *responderKey = "responder";
	json_object_set_member(pJsonObject, responderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Main.ChannelIDParam::getId()
{
	return id;
}

void
Main.ChannelIDParam::setId(int  id)
{
	this->id = id;
}

std::string
Main.ChannelIDParam::getInitiator()
{
	return initiator;
}

void
Main.ChannelIDParam::setInitiator(std::string  initiator)
{
	this->initiator = initiator;
}

std::string
Main.ChannelIDParam::getResponder()
{
	return responder;
}

void
Main.ChannelIDParam::setResponder(std::string  responder)
{
	this->responder = responder;
}


