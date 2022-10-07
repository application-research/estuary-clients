#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Main.estimateDealBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Main.estimateDealBody::Main.estimateDealBody()
{
	//__init();
}

Main.estimateDealBody::~Main.estimateDealBody()
{
	//__cleanup();
}

void
Main.estimateDealBody::__init()
{
	//
	//
	//durationBlks = null;
	//
	//
	//replication = null;
	//
	//
	//size = null;
	//
	//
	//verified = bool(false);
	//
}

void
Main.estimateDealBody::__cleanup()
{
	//if(durationBlks != NULL) {
	//
	//delete durationBlks;
	//durationBlks = NULL;
	//}
	//if(replication != NULL) {
	//
	//delete replication;
	//replication = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(verified != NULL) {
	//
	//delete verified;
	//verified = NULL;
	//}
	//
}

void
Main.estimateDealBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *durationBlksKey = "durationBlks";
	node = json_object_get_member(pJsonObject, durationBlksKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&durationBlks, node, "int", "");
		} else {
			
		}
	}
	const gchar *replicationKey = "replication";
	node = json_object_get_member(pJsonObject, replicationKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&replication, node, "int", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&size, node, "int", "");
		} else {
			
		}
	}
	const gchar *verifiedKey = "verified";
	node = json_object_get_member(pJsonObject, verifiedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&verified, node, "bool", "");
		} else {
			
		}
	}
}

Main.estimateDealBody::Main.estimateDealBody(char* json)
{
	this->fromJson(json);
}

char*
Main.estimateDealBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getDurationBlks();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *durationBlksKey = "durationBlks";
	json_object_set_member(pJsonObject, durationBlksKey, node);
	if (isprimitive("int")) {
		int obj = getReplication();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *replicationKey = "replication";
	json_object_set_member(pJsonObject, replicationKey, node);
	if (isprimitive("int")) {
		int obj = getSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("bool")) {
		bool obj = getVerified();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *verifiedKey = "verified";
	json_object_set_member(pJsonObject, verifiedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Main.estimateDealBody::getDurationBlks()
{
	return durationBlks;
}

void
Main.estimateDealBody::setDurationBlks(int  durationBlks)
{
	this->durationBlks = durationBlks;
}

int
Main.estimateDealBody::getReplication()
{
	return replication;
}

void
Main.estimateDealBody::setReplication(int  replication)
{
	this->replication = replication;
}

int
Main.estimateDealBody::getSize()
{
	return size;
}

void
Main.estimateDealBody::setSize(int  size)
{
	this->size = size;
}

bool
Main.estimateDealBody::getVerified()
{
	return verified;
}

void
Main.estimateDealBody::setVerified(bool  verified)
{
	this->verified = verified;
}


