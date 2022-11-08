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


#include "SWGTypes.IpfsListPinStatusResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGTypes.IpfsListPinStatusResponse::SWGTypes.IpfsListPinStatusResponse(QString json) {
    init();
    this->fromJson(json);
}

SWGTypes.IpfsListPinStatusResponse::SWGTypes.IpfsListPinStatusResponse() {
    init();
}

SWGTypes.IpfsListPinStatusResponse::~SWGTypes.IpfsListPinStatusResponse() {
    this->cleanup();
}

void
SWGTypes.IpfsListPinStatusResponse::init() {
    count = 0;
    m_count_isSet = false;
    results = new QList<SWGTypes.IpfsPinStatusResponse*>();
    m_results_isSet = false;
}

void
SWGTypes.IpfsListPinStatusResponse::cleanup() {

    if(results != nullptr) { 
        auto arr = results;
        for(auto o: *arr) { 
            delete o;
        }
        delete results;
    }
}

SWGTypes.IpfsListPinStatusResponse*
SWGTypes.IpfsListPinStatusResponse::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTypes.IpfsListPinStatusResponse::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&count, pJson["count"], "qint32", "");
    
    
    ::Swagger::setValue(&results, pJson["results"], "QList", "SWGTypes.IpfsPinStatusResponse");
}

QString
SWGTypes.IpfsListPinStatusResponse::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGTypes.IpfsListPinStatusResponse::asJsonObject() {
    QJsonObject obj;
    if(m_count_isSet){
        obj.insert("count", QJsonValue(count));
    }
    if(results->size() > 0){
        toJsonArray((QList<void*>*)results, obj, "results", "SWGTypes.IpfsPinStatusResponse");
    }

    return obj;
}

qint32
SWGTypes.IpfsListPinStatusResponse::getCount() {
    return count;
}
void
SWGTypes.IpfsListPinStatusResponse::setCount(qint32 count) {
    this->count = count;
    this->m_count_isSet = true;
}

QList<SWGTypes.IpfsPinStatusResponse*>*
SWGTypes.IpfsListPinStatusResponse::getResults() {
    return results;
}
void
SWGTypes.IpfsListPinStatusResponse::setResults(QList<SWGTypes.IpfsPinStatusResponse*>* results) {
    this->results = results;
    this->m_results_isSet = true;
}


bool
SWGTypes.IpfsListPinStatusResponse::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_count_isSet){ isObjectUpdated = true; break;}
        if(results->size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
