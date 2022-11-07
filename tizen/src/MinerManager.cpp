#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "MinerManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


MinerManager::MinerManager()
{

}

MinerManager::~MinerManager()
{

}

static gboolean __MinerManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __MinerManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__MinerManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool publicMinersDealsMinerGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool publicMinersDealsMinerGetHelper(char * accessToken,
	std::string miner, std::string ignoreFailed, 
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
	

	itemAtq = stringify(&ignoreFailed, "std::string");
	queryParams.insert(pair<string, string>("ignore-failed", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("ignore-failed");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/public/miners/deals/{miner}");
	int pos;

	string s_miner("{");
	s_miner.append("miner");
	s_miner.append("}");
	pos = url.find(s_miner);
	url.erase(pos, s_miner.length());
	url.insert(pos, stringify(&miner, "std::string"));

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
		NetClient::easycurl(MinerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = publicMinersDealsMinerGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MinerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), publicMinersDealsMinerGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MinerManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MinerManager::publicMinersDealsMinerGetAsync(char * accessToken,
	std::string miner, std::string ignoreFailed, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicMinersDealsMinerGetHelper(accessToken,
	miner, ignoreFailed, 
	handler, userData, true);
}

bool MinerManager::publicMinersDealsMinerGetSync(char * accessToken,
	std::string miner, std::string ignoreFailed, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicMinersDealsMinerGetHelper(accessToken,
	miner, ignoreFailed, 
	handler, userData, false);
}

static bool publicMinersStatsMinerGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool publicMinersStatsMinerGetHelper(char * accessToken,
	std::string miner, 
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

	string url("/public/miners/stats/{miner}");
	int pos;

	string s_miner("{");
	s_miner.append("miner");
	s_miner.append("}");
	pos = url.find(s_miner);
	url.erase(pos, s_miner.length());
	url.insert(pos, stringify(&miner, "std::string"));

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
		NetClient::easycurl(MinerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = publicMinersStatsMinerGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (MinerManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), publicMinersStatsMinerGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __MinerManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool MinerManager::publicMinersStatsMinerGetAsync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicMinersStatsMinerGetHelper(accessToken,
	miner, 
	handler, userData, true);
}

bool MinerManager::publicMinersStatsMinerGetSync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicMinersStatsMinerGetHelper(accessToken,
	miner, 
	handler, userData, false);
}

