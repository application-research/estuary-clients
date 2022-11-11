/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.29.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * ModelBase.h
 *
 * This is the base class for all model classes
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_ModelBase_H_
#define IO_SWAGGER_CLIENT_MODEL_ModelBase_H_


#include "HttpContent.h"
#include "MultipartFormData.h"

#include <cpprest/details/basic_types.h>
#include <cpprest/json.h>

#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

class  ModelBase
{
public:
    ModelBase();
    virtual ~ModelBase();

    virtual void validate() = 0;

    virtual web::json::value toJson() const = 0;
    virtual void fromJson(web::json::value& json) = 0;

    virtual void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const = 0;
    virtual void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) = 0;

    static web::json::value toJson( const utility::string_t& value );
    static web::json::value toJson( const utility::datetime& value );
    static web::json::value toJson( std::shared_ptr<HttpContent> value );
    static web::json::value toJson( std::shared_ptr<ModelBase> value );
    static web::json::value toJson( int32_t value );
    static web::json::value toJson( int64_t value );
    static web::json::value toJson( double value );
    static web::json::value toJson( bool value );
    template<class T>
    static web::json::value toJson(const std::vector<T>& value);

    static int64_t int64_tFromJson(web::json::value& val);
    static int32_t int32_tFromJson(web::json::value& val);
    static float floatFromJson(web::json::value& val);
    static utility::string_t stringFromJson(web::json::value& val);
    static utility::datetime dateFromJson(web::json::value& val);
    static double doubleFromJson(web::json::value& val);
    static bool boolFromJson(web::json::value& val);
    static std::shared_ptr<HttpContent> fileFromJson(web::json::value& val);

    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::string_t& value, const utility::string_t& contentType = utility::conversions::to_string_t(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::datetime& value, const utility::string_t& contentType = utility::conversions::to_string_t(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, std::shared_ptr<HttpContent> value );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const web::json::value& value, const utility::string_t& contentType = utility::conversions::to_string_t("application/json") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int32_t value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int64_t value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, double value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    template <class T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::vector<T>& value, const utility::string_t& contentType = utility::conversions::to_string_t("") );

    static int64_t int64_tFromHttpContent(std::shared_ptr<HttpContent> val);
    static int32_t int32_tFromHttpContent(std::shared_ptr<HttpContent> val);
    static float floatFromHttpContent(std::shared_ptr<HttpContent> val);
    static utility::string_t stringFromHttpContent(std::shared_ptr<HttpContent> val);
    static utility::datetime dateFromHttpContent(std::shared_ptr<HttpContent> val);
    static bool boolFromHttpContent(std::shared_ptr<HttpContent> val);
    static double doubleFromHttpContent(std::shared_ptr<HttpContent> val);
    static web::json::value valueFromHttpContent(std::shared_ptr<HttpContent> val);


    static utility::string_t toBase64( utility::string_t value );
    static utility::string_t toBase64( std::shared_ptr<std::istream> value );
    static std::shared_ptr<std::istream> fromBase64( const utility::string_t& encoded );
};

template<class T>
web::json::value ModelBase::toJson(const std::vector<T>& value) {
    std::vector<web::json::value> ret;
    for (auto& x : value) {
        ret.push_back(toJson(x));
    }

    return web::json::value::array(ret);
}

template <class T>
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const std::vector<T>& value, const utility::string_t& contentType ) {
    web::json::value json_array = ModelBase::toJson(value);
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(json_array.serialize()) ) ) );
    return content;
}

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_ModelBase_H_ */
