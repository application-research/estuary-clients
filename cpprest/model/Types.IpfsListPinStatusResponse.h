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
 * Types.IpfsListPinStatusResponse.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Types.IpfsListPinStatusResponse_H_
#define IO_SWAGGER_CLIENT_MODEL_Types.IpfsListPinStatusResponse_H_


#include "../ModelBase.h"

#include "Types.IpfsPinStatusResponse.h"
#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Types.IpfsListPinStatusResponse
    : public ModelBase
{
public:
    Types.IpfsListPinStatusResponse();
    virtual ~Types.IpfsListPinStatusResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Types.IpfsListPinStatusResponse members

    /// <summary>
    /// 
    /// </summary>
    int32_t getCount() const;
    bool countIsSet() const;
    void unsetCount();
    void setCount(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<Types.IpfsPinStatusResponse>>& getResults();
    bool resultsIsSet() const;
    void unsetResults();
    void setResults(std::vector<std::shared_ptr<Types.IpfsPinStatusResponse>> value);

protected:
    int32_t m_Count;
    bool m_CountIsSet;
    std::vector<std::shared_ptr<Types.IpfsPinStatusResponse>> m_Results;
    bool m_ResultsIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Types.IpfsListPinStatusResponse_H_ */
