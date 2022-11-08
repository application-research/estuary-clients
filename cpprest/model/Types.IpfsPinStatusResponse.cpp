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



#include "Types.IpfsPinStatusResponse.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Types.IpfsPinStatusResponse::Types.IpfsPinStatusResponse()
{
    m_Created = utility::conversions::to_string_t("");
    m_CreatedIsSet = false;
    m_DelegatesIsSet = false;
    m_InfoIsSet = false;
    m_PinIsSet = false;
    m_Requestid = utility::conversions::to_string_t("");
    m_RequestidIsSet = false;
    m_Status = utility::conversions::to_string_t("");
    m_StatusIsSet = false;
}

Types.IpfsPinStatusResponse::~Types.IpfsPinStatusResponse()
{
}

void Types.IpfsPinStatusResponse::validate()
{
    // TODO: implement validation
}

web::json::value Types.IpfsPinStatusResponse::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CreatedIsSet)
    {
        val[utility::conversions::to_string_t("created")] = ModelBase::toJson(m_Created);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Delegates )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("delegates")] = web::json::value::array(jsonArray);
        }
    }
    if(m_InfoIsSet)
    {
        val[utility::conversions::to_string_t("info")] = ModelBase::toJson(m_Info);
    }
    if(m_PinIsSet)
    {
        val[utility::conversions::to_string_t("pin")] = ModelBase::toJson(m_Pin);
    }
    if(m_RequestidIsSet)
    {
        val[utility::conversions::to_string_t("requestid")] = ModelBase::toJson(m_Requestid);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t("status")] = ModelBase::toJson(m_Status);
    }

    return val;
}

void Types.IpfsPinStatusResponse::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("created")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("created")];
        if(!fieldValue.is_null())
        {
            setCreated(ModelBase::stringFromJson(fieldValue));
        }
    }
    {
        m_Delegates.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("delegates")))
        {
        for( auto& item : val[utility::conversions::to_string_t("delegates")].as_array() )
        {
            m_Delegates.push_back(ModelBase::stringFromJson(item));
        }
        }
    }
    if(val.has_field(utility::conversions::to_string_t("info")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("info")];
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromJson(fieldValue);
            setInfo( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("pin")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("pin")];
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Types.IpfsPin> newItem(new Types.IpfsPin());
            newItem->fromJson(fieldValue);
            setPin( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("requestid")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("requestid")];
        if(!fieldValue.is_null())
        {
            setRequestid(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("status")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("status")];
        if(!fieldValue.is_null())
        {
            setStatus(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void Types.IpfsPinStatusResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_CreatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("created"), m_Created));
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Delegates )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("delegates"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_InfoIsSet)
    {
        if (m_Info.get())
        {
            m_Info->toMultipart(multipart, utility::conversions::to_string_t("info."));
        }
        
    }
    if(m_PinIsSet)
    {
        if (m_Pin.get())
        {
            m_Pin->toMultipart(multipart, utility::conversions::to_string_t("pin."));
        }
        
    }
    if(m_RequestidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("requestid"), m_Requestid));
        
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("status"), m_Status));
        
    }
}

void Types.IpfsPinStatusResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("created")))
    {
        setCreated(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("created"))));
    }
    {
        m_Delegates.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("delegates")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("delegates"))));
        for( auto& item : jsonArray.as_array() )
        {
            m_Delegates.push_back(ModelBase::stringFromJson(item));
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("info")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("info")))
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("info."));
            setInfo( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("pin")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("pin")))
        {
            std::shared_ptr<Types.IpfsPin> newItem(new Types.IpfsPin());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("pin."));
            setPin( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("requestid")))
    {
        setRequestid(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("requestid"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("status")))
    {
        setStatus(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("status"))));
    }
}

utility::string_t Types.IpfsPinStatusResponse::getCreated() const
{
    return m_Created;
}


void Types.IpfsPinStatusResponse::setCreated(utility::string_t value)
{
    m_Created = value;
    m_CreatedIsSet = true;
}
bool Types.IpfsPinStatusResponse::createdIsSet() const
{
    return m_CreatedIsSet;
}

void Types.IpfsPinStatusResponse::unsetCreated()
{
    m_CreatedIsSet = false;
}

std::vector<utility::string_t>& Types.IpfsPinStatusResponse::getDelegates()
{
    return m_Delegates;
}

void Types.IpfsPinStatusResponse::setDelegates(std::vector<utility::string_t> value)
{
    m_Delegates = value;
    m_DelegatesIsSet = true;
}
bool Types.IpfsPinStatusResponse::delegatesIsSet() const
{
    return m_DelegatesIsSet;
}

void Types.IpfsPinStatusResponse::unsetDelegates()
{
    m_DelegatesIsSet = false;
}

std::shared_ptr<Object> Types.IpfsPinStatusResponse::getInfo() const
{
    return m_Info;
}


void Types.IpfsPinStatusResponse::setInfo(std::shared_ptr<Object> value)
{
    m_Info = value;
    m_InfoIsSet = true;
}
bool Types.IpfsPinStatusResponse::infoIsSet() const
{
    return m_InfoIsSet;
}

void Types.IpfsPinStatusResponse::unsetInfo()
{
    m_InfoIsSet = false;
}

std::shared_ptr<Types.IpfsPin> Types.IpfsPinStatusResponse::getPin() const
{
    return m_Pin;
}


void Types.IpfsPinStatusResponse::setPin(std::shared_ptr<Types.IpfsPin> value)
{
    m_Pin = value;
    m_PinIsSet = true;
}
bool Types.IpfsPinStatusResponse::pinIsSet() const
{
    return m_PinIsSet;
}

void Types.IpfsPinStatusResponse::unsetPin()
{
    m_PinIsSet = false;
}

utility::string_t Types.IpfsPinStatusResponse::getRequestid() const
{
    return m_Requestid;
}


void Types.IpfsPinStatusResponse::setRequestid(utility::string_t value)
{
    m_Requestid = value;
    m_RequestidIsSet = true;
}
bool Types.IpfsPinStatusResponse::requestidIsSet() const
{
    return m_RequestidIsSet;
}

void Types.IpfsPinStatusResponse::unsetRequestid()
{
    m_RequestidIsSet = false;
}

utility::string_t Types.IpfsPinStatusResponse::getStatus() const
{
    return m_Status;
}


void Types.IpfsPinStatusResponse::setStatus(utility::string_t value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool Types.IpfsPinStatusResponse::statusIsSet() const
{
    return m_StatusIsSet;
}

void Types.IpfsPinStatusResponse::unsetStatus()
{
    m_StatusIsSet = false;
}

}
}
}
}
