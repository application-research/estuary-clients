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


#include "SWGMain.getApiKeysResp.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGMain.getApiKeysResp::SWGMain.getApiKeysResp(QString json) {
    init();
    this->fromJson(json);
}

SWGMain.getApiKeysResp::SWGMain.getApiKeysResp() {
    init();
}

SWGMain.getApiKeysResp::~SWGMain.getApiKeysResp() {
    this->cleanup();
}

void
SWGMain.getApiKeysResp::init() {
    expiry = new QString("");
    m_expiry_isSet = false;
    token = new QString("");
    m_token_isSet = false;
}

void
SWGMain.getApiKeysResp::cleanup() {
    if(expiry != nullptr) { 
        delete expiry;
    }
    if(token != nullptr) { 
        delete token;
    }
}

SWGMain.getApiKeysResp*
SWGMain.getApiKeysResp::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMain.getApiKeysResp::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&expiry, pJson["expiry"], "QString", "QString");
    
    ::Swagger::setValue(&token, pJson["token"], "QString", "QString");
    
}

QString
SWGMain.getApiKeysResp::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGMain.getApiKeysResp::asJsonObject() {
    QJsonObject obj;
    if(expiry != nullptr && *expiry != QString("")){
        toJsonValue(QString("expiry"), expiry, obj, QString("QString"));
    }
    if(token != nullptr && *token != QString("")){
        toJsonValue(QString("token"), token, obj, QString("QString"));
    }

    return obj;
}

QString*
SWGMain.getApiKeysResp::getExpiry() {
    return expiry;
}
void
SWGMain.getApiKeysResp::setExpiry(QString* expiry) {
    this->expiry = expiry;
    this->m_expiry_isSet = true;
}

QString*
SWGMain.getApiKeysResp::getToken() {
    return token;
}
void
SWGMain.getApiKeysResp::setToken(QString* token) {
    this->token = token;
    this->m_token_isSet = true;
}


bool
SWGMain.getApiKeysResp::isSet(){
    bool isObjectUpdated = false;
    do{
        if(expiry != nullptr && *expiry != QString("")){ isObjectUpdated = true; break;}
        if(token != nullptr && *token != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
