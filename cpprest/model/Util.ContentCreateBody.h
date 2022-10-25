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
 * Util.ContentCreateBody.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Util.ContentCreateBody_H_
#define IO_SWAGGER_CLIENT_MODEL_Util.ContentCreateBody_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Util.ContentCreateBody
    : public ModelBase
{
public:
    Util.ContentCreateBody();
    virtual ~Util.ContentCreateBody();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Util.ContentCreateBody members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getColuuid() const;
    bool coluuidIsSet() const;
    void unsetColuuid();
    void setColuuid(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getDir() const;
    bool dirIsSet() const;
    void unsetDir();
    void setDir(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getLocation() const;
    bool locationIsSet() const;
    void unsetLocation();
    void setLocation(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();
    void setName(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getRoot() const;
    bool rootIsSet() const;
    void unsetRoot();
    void setRoot(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getType() const;
    bool typeIsSet() const;
    void unsetType();
    void setType(int32_t value);

protected:
    utility::string_t m_Coluuid;
    bool m_ColuuidIsSet;
    utility::string_t m_Dir;
    bool m_DirIsSet;
    utility::string_t m_Location;
    bool m_LocationIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_Root;
    bool m_RootIsSet;
    int32_t m_Type;
    bool m_TypeIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Util.ContentCreateBody_H_ */
