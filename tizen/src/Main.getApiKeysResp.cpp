#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Main.getApiKeysResp.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Main.getApiKeysResp::Main.getApiKeysResp()
{
	//__init();
}

Main.getApiKeysResp::~Main.getApiKeysResp()
{
	//__cleanup();
}

void
Main.getApiKeysResp::__init()
{
	//
	//
	//expiry = std::string();
	//
	//
	//token = std::string();
	//
}

void
Main.getApiKeysResp::__cleanup()
{
	//if(expiry != NULL) {
	//
	//delete expiry;
	//expiry = NULL;
	//}
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//
}

void
Main.getApiKeysResp::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *expiryKey = "expiry";
	node = json_object_get_member(pJsonObject, expiryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&expiry, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tokenKey = "token";
	node = json_object_get_member(pJsonObject, tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token, node, "std::string", "");
		} else {
			
		}
	}
}

Main.getApiKeysResp::Main.getApiKeysResp(char* json)
{
	this->fromJson(json);
}

char*
Main.getApiKeysResp::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getExpiry();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *expiryKey = "expiry";
	json_object_set_member(pJsonObject, expiryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tokenKey = "token";
	json_object_set_member(pJsonObject, tokenKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Main.getApiKeysResp::getExpiry()
{
	return expiry;
}

void
Main.getApiKeysResp::setExpiry(std::string  expiry)
{
	this->expiry = expiry;
}

std::string
Main.getApiKeysResp::getToken()
{
	return token;
}

void
Main.getApiKeysResp::setToken(std::string  token)
{
	this->token = token;
}


