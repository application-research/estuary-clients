#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Types.IpfsListPinStatusResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Types.IpfsListPinStatusResponse::Types.IpfsListPinStatusResponse()
{
	//__init();
}

Types.IpfsListPinStatusResponse::~Types.IpfsListPinStatusResponse()
{
	//__cleanup();
}

void
Types.IpfsListPinStatusResponse::__init()
{
	//
	//
	//count = null;
	//
	//new std::list()std::list> results;
	//
	//
}

void
Types.IpfsListPinStatusResponse::__cleanup()
{
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(results != NULL) {
	//results.RemoveAll(true);
	//delete results;
	//results = NULL;
	//}
	//
}

void
Types.IpfsListPinStatusResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count, node, "int", "");
		} else {
			
		}
	}
	const gchar *resultsKey = "results";
	node = json_object_get_member(pJsonObject, resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Types.IpfsPinStatusResponse> new_list;
			Types.IpfsPinStatusResponse inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Types.IpfsPinStatusResponse")) {
					jsonToValue(&inst, temp_json, "Types.IpfsPinStatusResponse", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			results = new_list;
		}
		
	}
}

Types.IpfsListPinStatusResponse::Types.IpfsListPinStatusResponse(char* json)
{
	this->fromJson(json);
}

char*
Types.IpfsListPinStatusResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("Types.IpfsPinStatusResponse")) {
		list<Types.IpfsPinStatusResponse> new_list = static_cast<list <Types.IpfsPinStatusResponse> > (getResults());
		node = converttoJson(&new_list, "Types.IpfsPinStatusResponse", "array");
	} else {
		node = json_node_alloc();
		list<Types.IpfsPinStatusResponse> new_list = static_cast<list <Types.IpfsPinStatusResponse> > (getResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Types.IpfsPinStatusResponse>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Types.IpfsPinStatusResponse obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultsKey = "results";
	json_object_set_member(pJsonObject, resultsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Types.IpfsListPinStatusResponse::getCount()
{
	return count;
}

void
Types.IpfsListPinStatusResponse::setCount(int  count)
{
	this->count = count;
}

std::list<Types.IpfsPinStatusResponse>
Types.IpfsListPinStatusResponse::getResults()
{
	return results;
}

void
Types.IpfsListPinStatusResponse::setResults(std::list <Types.IpfsPinStatusResponse> results)
{
	this->results = results;
}


