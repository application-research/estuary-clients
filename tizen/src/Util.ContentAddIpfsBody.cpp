#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Util.ContentAddIpfsBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Util.ContentAddIpfsBody::Util.ContentAddIpfsBody()
{
	//__init();
}

Util.ContentAddIpfsBody::~Util.ContentAddIpfsBody()
{
	//__cleanup();
}

void
Util.ContentAddIpfsBody::__init()
{
	//
	//
	//coluuid = std::string();
	//
	//
	//dir = std::string();
	//
	//
	//filename = std::string();
	//
	//new std::list()std::list> peers;
	//
	//
	//
	//root = std::string();
	//
}

void
Util.ContentAddIpfsBody::__cleanup()
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
	//if(filename != NULL) {
	//
	//delete filename;
	//filename = NULL;
	//}
	//if(peers != NULL) {
	//peers.RemoveAll(true);
	//delete peers;
	//peers = NULL;
	//}
	//if(root != NULL) {
	//
	//delete root;
	//root = NULL;
	//}
	//
}

void
Util.ContentAddIpfsBody::fromJson(char* jsonStr)
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
	const gchar *filenameKey = "filename";
	node = json_object_get_member(pJsonObject, filenameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filename, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *peersKey = "peers";
	node = json_object_get_member(pJsonObject, peersKey);
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
			peers = new_list;
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
}

Util.ContentAddIpfsBody::Util.ContentAddIpfsBody(char* json)
{
	this->fromJson(json);
}

char*
Util.ContentAddIpfsBody::toJson()
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
		std::string obj = getFilename();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *filenameKey = "filename";
	json_object_set_member(pJsonObject, filenameKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPeers());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPeers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *peersKey = "peers";
	json_object_set_member(pJsonObject, peersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRoot();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rootKey = "root";
	json_object_set_member(pJsonObject, rootKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Util.ContentAddIpfsBody::getColuuid()
{
	return coluuid;
}

void
Util.ContentAddIpfsBody::setColuuid(std::string  coluuid)
{
	this->coluuid = coluuid;
}

std::string
Util.ContentAddIpfsBody::getDir()
{
	return dir;
}

void
Util.ContentAddIpfsBody::setDir(std::string  dir)
{
	this->dir = dir;
}

std::string
Util.ContentAddIpfsBody::getFilename()
{
	return filename;
}

void
Util.ContentAddIpfsBody::setFilename(std::string  filename)
{
	this->filename = filename;
}

std::list<std::string>
Util.ContentAddIpfsBody::getPeers()
{
	return peers;
}

void
Util.ContentAddIpfsBody::setPeers(std::list <std::string> peers)
{
	this->peers = peers;
}

std::string
Util.ContentAddIpfsBody::getRoot()
{
	return root;
}

void
Util.ContentAddIpfsBody::setRoot(std::string  root)
{
	this->root = root;
}


