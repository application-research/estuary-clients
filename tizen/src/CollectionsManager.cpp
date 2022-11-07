#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CollectionsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CollectionsManager::CollectionsManager()
{

}

CollectionsManager::~CollectionsManager()
{

}

static gboolean __CollectionsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CollectionsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CollectionsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool collectionsColuuidCommitPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsColuuidCommitPostHelper(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/collections/{coluuid}/commit");
	int pos;

	string s_coluuid("{");
	s_coluuid.append("coluuid");
	s_coluuid.append("}");
	pos = url.find(s_coluuid);
	url.erase(pos, s_coluuid.length());
	url.insert(pos, stringify(&coluuid, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsColuuidCommitPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsColuuidCommitPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsColuuidCommitPostAsync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidCommitPostHelper(accessToken,
	coluuid, 
	handler, userData, true);
}

bool CollectionsManager::collectionsColuuidCommitPostSync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidCommitPostHelper(accessToken,
	coluuid, 
	handler, userData, false);
}

static bool collectionsColuuidContentsDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsColuuidContentsDeleteHelper(char * accessToken,
	std::string coluuid, std::string contentid, Main.deleteContentFromCollectionBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Main.deleteContentFromCollectionBody")) {
		node = converttoJson(&body, "Main.deleteContentFromCollectionBody", "");
	}
	
	char *jsonStr =  body.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/collections/{coluuid}/contents");
	int pos;

	string s_coluuid("{");
	s_coluuid.append("coluuid");
	s_coluuid.append("}");
	pos = url.find(s_coluuid);
	url.erase(pos, s_coluuid.length());
	url.insert(pos, stringify(&coluuid, "std::string"));
	string s_contentid("{");
	s_contentid.append("contentid");
	s_contentid.append("}");
	pos = url.find(s_contentid);
	url.erase(pos, s_contentid.length());
	url.insert(pos, stringify(&contentid, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsColuuidContentsDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsColuuidContentsDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsColuuidContentsDeleteAsync(char * accessToken,
	std::string coluuid, std::string contentid, Main.deleteContentFromCollectionBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidContentsDeleteHelper(accessToken,
	coluuid, contentid, body, 
	handler, userData, true);
}

bool CollectionsManager::collectionsColuuidContentsDeleteSync(char * accessToken,
	std::string coluuid, std::string contentid, Main.deleteContentFromCollectionBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidContentsDeleteHelper(accessToken,
	coluuid, contentid, body, 
	handler, userData, false);
}

static bool collectionsColuuidDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsColuuidDeleteHelper(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/collections/{coluuid}");
	int pos;

	string s_coluuid("{");
	s_coluuid.append("coluuid");
	s_coluuid.append("}");
	pos = url.find(s_coluuid);
	url.erase(pos, s_coluuid.length());
	url.insert(pos, stringify(&coluuid, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsColuuidDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsColuuidDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsColuuidDeleteAsync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidDeleteHelper(accessToken,
	coluuid, 
	handler, userData, true);
}

bool CollectionsManager::collectionsColuuidDeleteSync(char * accessToken,
	std::string coluuid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidDeleteHelper(accessToken,
	coluuid, 
	handler, userData, false);
}

static bool collectionsColuuidGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsColuuidGetHelper(char * accessToken,
	std::string coluuid, std::string dir, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&dir, "std::string");
	queryParams.insert(pair<string, string>("dir", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("dir");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/collections/{coluuid}");
	int pos;

	string s_coluuid("{");
	s_coluuid.append("coluuid");
	s_coluuid.append("}");
	pos = url.find(s_coluuid);
	url.erase(pos, s_coluuid.length());
	url.insert(pos, stringify(&coluuid, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsColuuidGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsColuuidGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsColuuidGetAsync(char * accessToken,
	std::string coluuid, std::string dir, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidGetHelper(accessToken,
	coluuid, dir, 
	handler, userData, true);
}

bool CollectionsManager::collectionsColuuidGetSync(char * accessToken,
	std::string coluuid, std::string dir, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidGetHelper(accessToken,
	coluuid, dir, 
	handler, userData, false);
}

static bool collectionsColuuidPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsColuuidPostHelper(char * accessToken,
	std::string coluuid, std::list<> contentIDs, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;
	//TODO: Map Container
	if (isprimitive("")) {
		node = converttoJson(&contentIDs, "", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<>::iterator bodyIter = contentIDs.begin(); bodyIter != contentIDs.end(); ++bodyIter) {
			 itemAt = (*bodyIter);
			char *jsonStr =  itemAt.toJson();
			JsonNode *node_temp = json_from_string(jsonStr, NULL);
			g_free(static_cast<gpointer>(jsonStr));
			json_array_add_element(json_array, node_temp);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
	}
	




	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/collections/{coluuid}");
	int pos;

	string s_coluuid("{");
	s_coluuid.append("coluuid");
	s_coluuid.append("}");
	pos = url.find(s_coluuid);
	url.erase(pos, s_coluuid.length());
	url.insert(pos, stringify(&coluuid, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsColuuidPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsColuuidPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsColuuidPostAsync(char * accessToken,
	std::string coluuid, std::list<> contentIDs, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidPostHelper(accessToken,
	coluuid, contentIDs, 
	handler, userData, true);
}

bool CollectionsManager::collectionsColuuidPostSync(char * accessToken,
	std::string coluuid, std::list<> contentIDs, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsColuuidPostHelper(accessToken,
	coluuid, contentIDs, 
	handler, userData, false);
}

static bool collectionsFsAddPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsFsAddPostHelper(char * accessToken,
	std::string coluuid, std::string content, std::string path, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&coluuid, "std::string");
	queryParams.insert(pair<string, string>("coluuid", itemAtq));


	itemAtq = stringify(&content, "std::string");
	queryParams.insert(pair<string, string>("content", itemAtq));


	itemAtq = stringify(&path, "std::string");
	queryParams.insert(pair<string, string>("path", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/collections/fs/add");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsFsAddPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsFsAddPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsFsAddPostAsync(char * accessToken,
	std::string coluuid, std::string content, std::string path, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsFsAddPostHelper(accessToken,
	coluuid, content, path, 
	handler, userData, true);
}

bool CollectionsManager::collectionsFsAddPostSync(char * accessToken,
	std::string coluuid, std::string content, std::string path, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return collectionsFsAddPostHelper(accessToken,
	coluuid, content, path, 
	handler, userData, false);
}

static bool collectionsGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::list>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::list>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::list> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::list singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsGetHelper(char * accessToken,
	
	void(* handler)(std::list<std::list>, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/collections/");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsGetAsync(char * accessToken,
	
	void(* handler)(std::list<std::list>, Error, void* )
	, void* userData)
{
	return collectionsGetHelper(accessToken,
	
	handler, userData, true);
}

bool CollectionsManager::collectionsGetSync(char * accessToken,
	
	void(* handler)(std::list<std::list>, Error, void* )
	, void* userData)
{
	return collectionsGetHelper(accessToken,
	
	handler, userData, false);
}

static bool collectionsPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Collections.Collection, Error, void* )
	= reinterpret_cast<void(*)(Collections.Collection, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Collections.Collection out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Collections.Collection")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Collections.Collection", "Collections.Collection");
			json_node_free(pJson);

			if ("Collections.Collection" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool collectionsPostHelper(char * accessToken,
	Main.createCollectionBody body, 
	void(* handler)(Collections.Collection, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Main.createCollectionBody")) {
		node = converttoJson(&body, "Main.createCollectionBody", "");
	}
	
	char *jsonStr =  body.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/collections/");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = collectionsPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CollectionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), collectionsPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CollectionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CollectionsManager::collectionsPostAsync(char * accessToken,
	Main.createCollectionBody body, 
	void(* handler)(Collections.Collection, Error, void* )
	, void* userData)
{
	return collectionsPostHelper(accessToken,
	body, 
	handler, userData, true);
}

bool CollectionsManager::collectionsPostSync(char * accessToken,
	Main.createCollectionBody body, 
	void(* handler)(Collections.Collection, Error, void* )
	, void* userData)
{
	return collectionsPostHelper(accessToken,
	body, 
	handler, userData, false);
}

