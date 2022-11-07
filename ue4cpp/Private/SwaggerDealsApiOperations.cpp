/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
#include "SwaggerDealsApiOperations.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace Swagger 
{

FString SwaggerDealsApi::DealEstimatePostRequest::ComputePath() const
{
	FString Path(TEXT("/deal/estimate"));
	return Path;
}

void SwaggerDealsApi::DealEstimatePostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, Body);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (body) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealEstimatePostResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealEstimatePostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealInfoDealidGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("dealid"), ToStringFormatArg(Dealid) } };

	FString Path = FString::Format(TEXT("/deal/info/{dealid}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::DealInfoDealidGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealInfoDealidGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealInfoDealidGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealProposalPropcidGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("propcid"), ToStringFormatArg(Propcid) } };

	FString Path = FString::Format(TEXT("/deal/proposal/{propcid}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::DealProposalPropcidGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealProposalPropcidGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealProposalPropcidGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealQueryMinerGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("miner"), ToStringFormatArg(Miner) } };

	FString Path = FString::Format(TEXT("/deal/query/{miner}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::DealQueryMinerGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealQueryMinerGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealQueryMinerGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealStatusByProposalPropcidGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("propcid"), ToStringFormatArg(Propcid) } };

	FString Path = FString::Format(TEXT("/deal/status-by-proposal/{propcid}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::DealStatusByProposalPropcidGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealStatusByProposalPropcidGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealStatusByProposalPropcidGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealStatusMinerPropcidGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("miner"), ToStringFormatArg(Miner) },
	{ TEXT("propcid"), ToStringFormatArg(Propcid) } };

	FString Path = FString::Format(TEXT("/deal/status/{miner}/{propcid}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::DealStatusMinerPropcidGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealStatusMinerPropcidGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealStatusMinerPropcidGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealTransferInProgressGetRequest::ComputePath() const
{
	FString Path(TEXT("/deal/transfer/in-progress"));
	return Path;
}

void SwaggerDealsApi::DealTransferInProgressGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealTransferInProgressGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealTransferInProgressGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealTransferStatusPostRequest::ComputePath() const
{
	FString Path(TEXT("/deal/transfer/status"));
	return Path;
}

void SwaggerDealsApi::DealTransferStatusPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, Chanid);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (chanid) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (chanid) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealTransferStatusPostResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealTransferStatusPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealsFailuresGetRequest::ComputePath() const
{
	FString Path(TEXT("/deals/failures"));
	return Path;
}

void SwaggerDealsApi::DealsFailuresGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealsFailuresGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealsFailuresGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealsMakeMinerPostRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("miner"), ToStringFormatArg(Miner) } };

	FString Path = FString::Format(TEXT("/deals/make/{miner}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::DealsMakeMinerPostRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, DealRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (dealRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogSwagger, Error, TEXT("Body parameter (dealRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealsMakeMinerPostResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealsMakeMinerPostResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::DealsStatusDealGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("deal"), ToStringFormatArg(Deal) } };

	FString Path = FString::Format(TEXT("/deals/status/{deal}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::DealsStatusDealGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::DealsStatusDealGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::DealsStatusDealGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::PublicDealsFailuresGetRequest::ComputePath() const
{
	FString Path(TEXT("/public/deals/failures"));
	return Path;
}

void SwaggerDealsApi::PublicDealsFailuresGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::PublicDealsFailuresGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::PublicDealsFailuresGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString SwaggerDealsApi::PublicMinersStorageQueryMinerGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("miner"), ToStringFormatArg(Miner) } };

	FString Path = FString::Format(TEXT("/public/miners/storage/query/{miner}"), PathParams);
	
	return Path;
}

void SwaggerDealsApi::PublicMinersStorageQueryMinerGetRequest::SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogSwagger, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void SwaggerDealsApi::PublicMinersStorageQueryMinerGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
	default:
		SetResponseString(TEXT("OK"));
		break;
	case 400:
		SetResponseString(TEXT("Bad Request"));
		break;
	case 500:
		SetResponseString(TEXT("Internal Server Error"));
		break;
	}
}

bool SwaggerDealsApi::PublicMinersStorageQueryMinerGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
