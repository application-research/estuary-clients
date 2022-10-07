#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Main.userStatsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Main.userStatsResponse::Main.userStatsResponse()
{
	//__init();
}

Main.userStatsResponse::~Main.userStatsResponse()
{
	//__cleanup();
}

void
Main.userStatsResponse::__init()
{
	//
	//
	//numPins = null;
	//
	//
	//totalSize = null;
	//
}

void
Main.userStatsResponse::__cleanup()
{
	//if(numPins != NULL) {
	//
	//delete numPins;
	//numPins = NULL;
	//}
	//if(totalSize != NULL) {
	//
	//delete totalSize;
	//totalSize = NULL;
	//}
	//
}

void
Main.userStatsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *numPinsKey = "numPins";
	node = json_object_get_member(pJsonObject, numPinsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&numPins, node, "int", "");
		} else {
			
		}
	}
	const gchar *totalSizeKey = "totalSize";
	node = json_object_get_member(pJsonObject, totalSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&totalSize, node, "int", "");
		} else {
			
		}
	}
}

Main.userStatsResponse::Main.userStatsResponse(char* json)
{
	this->fromJson(json);
}

char*
Main.userStatsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getNumPins();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *numPinsKey = "numPins";
	json_object_set_member(pJsonObject, numPinsKey, node);
	if (isprimitive("int")) {
		int obj = getTotalSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalSizeKey = "totalSize";
	json_object_set_member(pJsonObject, totalSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Main.userStatsResponse::getNumPins()
{
	return numPins;
}

void
Main.userStatsResponse::setNumPins(int  numPins)
{
	this->numPins = numPins;
}

int
Main.userStatsResponse::getTotalSize()
{
	return totalSize;
}

void
Main.userStatsResponse::setTotalSize(int  totalSize)
{
	this->totalSize = totalSize;
}


