#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "DealsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


DealsManager::DealsManager()
{

}

DealsManager::~DealsManager()
{

}

static gboolean __DealsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __DealsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__DealsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool dealEstimatePostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealEstimatePostHelper(char * accessToken,
	Main.estimateDealBody body, 
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

	if (isprimitive("Main.estimateDealBody")) {
		node = converttoJson(&body, "Main.estimateDealBody", "");
	}
	
	char *jsonStr =  body.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/deal/estimate");
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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealEstimatePostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealEstimatePostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealEstimatePostAsync(char * accessToken,
	Main.estimateDealBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealEstimatePostHelper(accessToken,
	body, 
	handler, userData, true);
}

bool DealsManager::dealEstimatePostSync(char * accessToken,
	Main.estimateDealBody body, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealEstimatePostHelper(accessToken,
	body, 
	handler, userData, false);
}

static bool dealInfoDealidGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealInfoDealidGetHelper(char * accessToken,
	int dealid, 
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

	string url("/deal/info/{dealid}");
	int pos;

	string s_dealid("{");
	s_dealid.append("dealid");
	s_dealid.append("}");
	pos = url.find(s_dealid);
	url.erase(pos, s_dealid.length());
	url.insert(pos, stringify(&dealid, "int"));

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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealInfoDealidGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealInfoDealidGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealInfoDealidGetAsync(char * accessToken,
	int dealid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealInfoDealidGetHelper(accessToken,
	dealid, 
	handler, userData, true);
}

bool DealsManager::dealInfoDealidGetSync(char * accessToken,
	int dealid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealInfoDealidGetHelper(accessToken,
	dealid, 
	handler, userData, false);
}

static bool dealProposalPropcidGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealProposalPropcidGetHelper(char * accessToken,
	std::string propcid, 
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

	string url("/deal/proposal/{propcid}");
	int pos;

	string s_propcid("{");
	s_propcid.append("propcid");
	s_propcid.append("}");
	pos = url.find(s_propcid);
	url.erase(pos, s_propcid.length());
	url.insert(pos, stringify(&propcid, "std::string"));

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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealProposalPropcidGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealProposalPropcidGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealProposalPropcidGetAsync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealProposalPropcidGetHelper(accessToken,
	propcid, 
	handler, userData, true);
}

bool DealsManager::dealProposalPropcidGetSync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealProposalPropcidGetHelper(accessToken,
	propcid, 
	handler, userData, false);
}

static bool dealQueryMinerGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealQueryMinerGetHelper(char * accessToken,
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

	string url("/deal/query/{miner}");
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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealQueryMinerGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealQueryMinerGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealQueryMinerGetAsync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealQueryMinerGetHelper(accessToken,
	miner, 
	handler, userData, true);
}

bool DealsManager::dealQueryMinerGetSync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealQueryMinerGetHelper(accessToken,
	miner, 
	handler, userData, false);
}

static bool dealStatusByProposalPropcidGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealStatusByProposalPropcidGetHelper(char * accessToken,
	std::string propcid, 
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

	string url("/deal/status-by-proposal/{propcid}");
	int pos;

	string s_propcid("{");
	s_propcid.append("propcid");
	s_propcid.append("}");
	pos = url.find(s_propcid);
	url.erase(pos, s_propcid.length());
	url.insert(pos, stringify(&propcid, "std::string"));

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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealStatusByProposalPropcidGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealStatusByProposalPropcidGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealStatusByProposalPropcidGetAsync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealStatusByProposalPropcidGetHelper(accessToken,
	propcid, 
	handler, userData, true);
}

bool DealsManager::dealStatusByProposalPropcidGetSync(char * accessToken,
	std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealStatusByProposalPropcidGetHelper(accessToken,
	propcid, 
	handler, userData, false);
}

static bool dealStatusMinerPropcidGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealStatusMinerPropcidGetHelper(char * accessToken,
	std::string miner, std::string propcid, 
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

	string url("/deal/status/{miner}/{propcid}");
	int pos;

	string s_miner("{");
	s_miner.append("miner");
	s_miner.append("}");
	pos = url.find(s_miner);
	url.erase(pos, s_miner.length());
	url.insert(pos, stringify(&miner, "std::string"));
	string s_propcid("{");
	s_propcid.append("propcid");
	s_propcid.append("}");
	pos = url.find(s_propcid);
	url.erase(pos, s_propcid.length());
	url.insert(pos, stringify(&propcid, "std::string"));

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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealStatusMinerPropcidGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealStatusMinerPropcidGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealStatusMinerPropcidGetAsync(char * accessToken,
	std::string miner, std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealStatusMinerPropcidGetHelper(accessToken,
	miner, propcid, 
	handler, userData, true);
}

bool DealsManager::dealStatusMinerPropcidGetSync(char * accessToken,
	std::string miner, std::string propcid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealStatusMinerPropcidGetHelper(accessToken,
	miner, propcid, 
	handler, userData, false);
}

static bool dealTransferInProgressGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealTransferInProgressGetHelper(char * accessToken,
	
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

	string url("/deal/transfer/in-progress");
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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealTransferInProgressGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealTransferInProgressGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealTransferInProgressGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealTransferInProgressGetHelper(accessToken,
	
	handler, userData, true);
}

bool DealsManager::dealTransferInProgressGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealTransferInProgressGetHelper(accessToken,
	
	handler, userData, false);
}

static bool dealTransferStatusPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealTransferStatusPostHelper(char * accessToken,
	Main.ChannelIDParam chanid, 
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

	if (isprimitive("Main.ChannelIDParam")) {
		node = converttoJson(&chanid, "Main.ChannelIDParam", "");
	}
	
	char *jsonStr =  chanid.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/deal/transfer/status");
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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealTransferStatusPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealTransferStatusPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealTransferStatusPostAsync(char * accessToken,
	Main.ChannelIDParam chanid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealTransferStatusPostHelper(accessToken,
	chanid, 
	handler, userData, true);
}

bool DealsManager::dealTransferStatusPostSync(char * accessToken,
	Main.ChannelIDParam chanid, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealTransferStatusPostHelper(accessToken,
	chanid, 
	handler, userData, false);
}

static bool dealsFailuresGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealsFailuresGetHelper(char * accessToken,
	
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

	string url("/deals/failures");
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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealsFailuresGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealsFailuresGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealsFailuresGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealsFailuresGetHelper(accessToken,
	
	handler, userData, true);
}

bool DealsManager::dealsFailuresGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealsFailuresGetHelper(accessToken,
	
	handler, userData, false);
}

static bool dealsMakeMinerPostProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealsMakeMinerPostHelper(char * accessToken,
	std::string miner, std::string dealRequest, 
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

	if (isprimitive("std::string")) {
		node = converttoJson(&dealRequest, "std::string", "");
	}
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/deals/make/{miner}");
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
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealsMakeMinerPostProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealsMakeMinerPostProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealsMakeMinerPostAsync(char * accessToken,
	std::string miner, std::string dealRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealsMakeMinerPostHelper(accessToken,
	miner, dealRequest, 
	handler, userData, true);
}

bool DealsManager::dealsMakeMinerPostSync(char * accessToken,
	std::string miner, std::string dealRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealsMakeMinerPostHelper(accessToken,
	miner, dealRequest, 
	handler, userData, false);
}

static bool dealsStatusDealGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool dealsStatusDealGetHelper(char * accessToken,
	int deal, 
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

	string url("/deals/status/{deal}");
	int pos;

	string s_deal("{");
	s_deal.append("deal");
	s_deal.append("}");
	pos = url.find(s_deal);
	url.erase(pos, s_deal.length());
	url.insert(pos, stringify(&deal, "int"));

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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = dealsStatusDealGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), dealsStatusDealGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::dealsStatusDealGetAsync(char * accessToken,
	int deal, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealsStatusDealGetHelper(accessToken,
	deal, 
	handler, userData, true);
}

bool DealsManager::dealsStatusDealGetSync(char * accessToken,
	int deal, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return dealsStatusDealGetHelper(accessToken,
	deal, 
	handler, userData, false);
}

static bool publicDealsFailuresGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool publicDealsFailuresGetHelper(char * accessToken,
	
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

	string url("/public/deals/failures");
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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = publicDealsFailuresGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), publicDealsFailuresGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::publicDealsFailuresGetAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicDealsFailuresGetHelper(accessToken,
	
	handler, userData, true);
}

bool DealsManager::publicDealsFailuresGetSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicDealsFailuresGetHelper(accessToken,
	
	handler, userData, false);
}

static bool publicMinersStorageQueryMinerGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool publicMinersStorageQueryMinerGetHelper(char * accessToken,
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

	string url("/public/miners/storage/query/{miner}");
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
		NetClient::easycurl(DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = publicMinersStorageQueryMinerGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DealsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), publicMinersStorageQueryMinerGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DealsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DealsManager::publicMinersStorageQueryMinerGetAsync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicMinersStorageQueryMinerGetHelper(accessToken,
	miner, 
	handler, userData, true);
}

bool DealsManager::publicMinersStorageQueryMinerGetSync(char * accessToken,
	std::string miner, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return publicMinersStorageQueryMinerGetHelper(accessToken,
	miner, 
	handler, userData, false);
}

