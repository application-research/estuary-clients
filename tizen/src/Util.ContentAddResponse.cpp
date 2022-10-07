#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Util.ContentAddResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Util.ContentAddResponse::Util.ContentAddResponse()
{
	//__init();
}

Util.ContentAddResponse::~Util.ContentAddResponse()
{
	//__cleanup();
}

void
Util.ContentAddResponse::__init()
{
	//
	//
	//cid = std::string();
	//
	//
	//estuaryId = null;
	//
	//new std::list()std::list> providers;
	//
	//
	//
	//retrieval_url = std::string();
	//
}

void
Util.ContentAddResponse::__cleanup()
{
	//if(cid != NULL) {
	//
	//delete cid;
	//cid = NULL;
	//}
	//if(estuaryId != NULL) {
	//
	//delete estuaryId;
	//estuaryId = NULL;
	//}
	//if(providers != NULL) {
	//providers.RemoveAll(true);
	//delete providers;
	//providers = NULL;
	//}
	//if(retrieval_url != NULL) {
	//
	//delete retrieval_url;
	//retrieval_url = NULL;
	//}
	//
}

void
Util.ContentAddResponse::fromJson(char* jsonStr)
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
	const gchar *estuaryIdKey = "estuaryId";
	node = json_object_get_member(pJsonObject, estuaryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&estuaryId, node, "int", "");
		} else {
			
		}
	}
	const gchar *providersKey = "providers";
	node = json_object_get_member(pJsonObject, providersKey);
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
			providers = new_list;
		}
		
	}
	const gchar *retrieval_urlKey = "retrieval_url";
	node = json_object_get_member(pJsonObject, retrieval_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&retrieval_url, node, "std::string", "");
		} else {
			
		}
	}
}

Util.ContentAddResponse::Util.ContentAddResponse(char* json)
{
	this->fromJson(json);
}

char*
Util.ContentAddResponse::toJson()
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
	if (isprimitive("int")) {
		int obj = getEstuaryId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *estuaryIdKey = "estuaryId";
	json_object_set_member(pJsonObject, estuaryIdKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProviders());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProviders());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *providersKey = "providers";
	json_object_set_member(pJsonObject, providersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRetrievalUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *retrieval_urlKey = "retrieval_url";
	json_object_set_member(pJsonObject, retrieval_urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Util.ContentAddResponse::getCid()
{
	return cid;
}

void
Util.ContentAddResponse::setCid(std::string  cid)
{
	this->cid = cid;
}

int
Util.ContentAddResponse::getEstuaryId()
{
	return estuaryId;
}

void
Util.ContentAddResponse::setEstuaryId(int  estuaryId)
{
	this->estuaryId = estuaryId;
}

std::list<std::string>
Util.ContentAddResponse::getProviders()
{
	return providers;
}

void
Util.ContentAddResponse::setProviders(std::list <std::string> providers)
{
	this->providers = providers;
}

std::string
Util.ContentAddResponse::getRetrievalUrl()
{
	return retrieval_url;
}

void
Util.ContentAddResponse::setRetrievalUrl(std::string  retrieval_url)
{
	this->retrieval_url = retrieval_url;
}


