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

/*
 * Main.getApiKeysResp.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Main.getApiKeysResp_H_
#define IO_SWAGGER_CLIENT_MODEL_Main.getApiKeysResp_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Main.getApiKeysResp
    : public ModelBase
{
public:
    Main.getApiKeysResp();
    virtual ~Main.getApiKeysResp();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Main.getApiKeysResp members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getExpiry() const;
    bool expiryIsSet() const;
    void unsetExpiry();
    void setExpiry(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getLabel() const;
    bool labelIsSet() const;
    void unsetLabel();
    void setLabel(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getToken() const;
    bool tokenIsSet() const;
    void unsetToken();
    void setToken(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTokenHash() const;
    bool tokenHashIsSet() const;
    void unsetTokenHash();
    void setTokenHash(utility::string_t value);

protected:
    utility::string_t m_Expiry;
    bool m_ExpiryIsSet;
    utility::string_t m_Label;
    bool m_LabelIsSet;
    utility::string_t m_Token;
    bool m_TokenIsSet;
    utility::string_t m_TokenHash;
    bool m_TokenHashIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Main.getApiKeysResp_H_ */
