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
#pragma once

#include "SwaggerBaseModel.h"
#include "SwaggerDefaultApi.h"


namespace Swagger 
{

/* 

*/
class SWAGGER_API SwaggerDefaultApi::DealTransferStatusPostRequest : public Request
{
public:
    virtual ~DealTransferStatusPostRequest() {}
	void SetupHttpRequest(const TSharedRef<IHttpRequest>& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class SWAGGER_API SwaggerDefaultApi::DealTransferStatusPostResponse : public Response
{
public:
    virtual ~DealTransferStatusPostResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonObject) final;
    
    
};

}
