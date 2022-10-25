#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Collections.Collection.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Collections.Collection::Collections.Collection()
{
	//__init();
}

Collections.Collection::~Collections.Collection()
{
	//__cleanup();
}

void
Collections.Collection::__init()
{
	//
	//
	//cid = std::string();
	//
	//
	//createdAt = std::string();
	//
	//
	//description = std::string();
	//
	//
	//name = std::string();
	//
	//
	//userId = null;
	//
	//
	//uuid = std::string();
	//
}

void
Collections.Collection::__cleanup()
{
	//if(cid != NULL) {
	//
	//delete cid;
	//cid = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
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
	//if(userId != NULL) {
	//
	//delete userId;
	//userId = NULL;
	//}
	//if(uuid != NULL) {
	//
	//delete uuid;
	//uuid = NULL;
	//}
	//
}

void
Collections.Collection::fromJson(char* jsonStr)
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
	const gchar *createdAtKey = "createdAt";
	node = json_object_get_member(pJsonObject, createdAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&createdAt, node, "std::string", "");
		} else {
			
		}
	}
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
	const gchar *userIdKey = "userId";
	node = json_object_get_member(pJsonObject, userIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&userId, node, "int", "");
		} else {
			
		}
	}
	const gchar *uuidKey = "uuid";
	node = json_object_get_member(pJsonObject, uuidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&uuid, node, "std::string", "");
		} else {
			
		}
	}
}

Collections.Collection::Collections.Collection(char* json)
{
	this->fromJson(json);
}

char*
Collections.Collection::toJson()
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
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
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
	if (isprimitive("int")) {
		int obj = getUserId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *userIdKey = "userId";
	json_object_set_member(pJsonObject, userIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUuid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *uuidKey = "uuid";
	json_object_set_member(pJsonObject, uuidKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Collections.Collection::getCid()
{
	return cid;
}

void
Collections.Collection::setCid(std::string  cid)
{
	this->cid = cid;
}

std::string
Collections.Collection::getCreatedAt()
{
	return createdAt;
}

void
Collections.Collection::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
Collections.Collection::getDescription()
{
	return description;
}

void
Collections.Collection::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Collections.Collection::getName()
{
	return name;
}

void
Collections.Collection::setName(std::string  name)
{
	this->name = name;
}

int
Collections.Collection::getUserId()
{
	return userId;
}

void
Collections.Collection::setUserId(int  userId)
{
	this->userId = userId;
}

std::string
Collections.Collection::getUuid()
{
	return uuid;
}

void
Collections.Collection::setUuid(std::string  uuid)
{
	this->uuid = uuid;
}


