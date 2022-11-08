/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.28.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



#include "Types.IpfsListPinStatusResponse.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Types.IpfsListPinStatusResponse::Types.IpfsListPinStatusResponse()
{
    m_Count = 0;
    m_CountIsSet = false;
    m_ResultsIsSet = false;
}

Types.IpfsListPinStatusResponse::~Types.IpfsListPinStatusResponse()
{
}

void Types.IpfsListPinStatusResponse::validate()
{
    // TODO: implement validation
}

web::json::value Types.IpfsListPinStatusResponse::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CountIsSet)
    {
        val[utility::conversions::to_string_t("count")] = ModelBase::toJson(m_Count);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Results )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("results")] = web::json::value::array(jsonArray);
        }
    }

    return val;
}

void Types.IpfsListPinStatusResponse::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("count")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("count")];
        if(!fieldValue.is_null())
        {
            setCount(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    {
        m_Results.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("results")))
        {
        for( auto& item : val[utility::conversions::to_string_t("results")].as_array() )
        {
            if(item.is_null())
            {
                m_Results.push_back( std::shared_ptr<Types.IpfsPinStatusResponse>(nullptr) );
            }
            else
            {
                std::shared_ptr<Types.IpfsPinStatusResponse> newItem(new Types.IpfsPinStatusResponse());
                newItem->fromJson(item);
                m_Results.push_back( newItem );
            }
        }
        }
    }
}

void Types.IpfsListPinStatusResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_CountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("count"), m_Count));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Results )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("results"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
}

void Types.IpfsListPinStatusResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("count")))
    {
        setCount(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("count"))));
    }
    {
        m_Results.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("results")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("results"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Results.push_back( std::shared_ptr<Types.IpfsPinStatusResponse>(nullptr) );
            }
            else
            {
                std::shared_ptr<Types.IpfsPinStatusResponse> newItem(new Types.IpfsPinStatusResponse());
                newItem->fromJson(item);
                m_Results.push_back( newItem );
            }
        }
        }
    }
}

int32_t Types.IpfsListPinStatusResponse::getCount() const
{
    return m_Count;
}


void Types.IpfsListPinStatusResponse::setCount(int32_t value)
{
    m_Count = value;
    m_CountIsSet = true;
}
bool Types.IpfsListPinStatusResponse::countIsSet() const
{
    return m_CountIsSet;
}

void Types.IpfsListPinStatusResponse::unsetCount()
{
    m_CountIsSet = false;
}

std::vector<std::shared_ptr<Types.IpfsPinStatusResponse>>& Types.IpfsListPinStatusResponse::getResults()
{
    return m_Results;
}

void Types.IpfsListPinStatusResponse::setResults(std::vector<std::shared_ptr<Types.IpfsPinStatusResponse>> value)
{
    m_Results = value;
    m_ResultsIsSet = true;
}
bool Types.IpfsListPinStatusResponse::resultsIsSet() const
{
    return m_ResultsIsSet;
}

void Types.IpfsListPinStatusResponse::unsetResults()
{
    m_ResultsIsSet = false;
}

}
}
}
}

