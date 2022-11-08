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


#include "SWGMain.ChannelIDParam.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGMain.ChannelIDParam::SWGMain.ChannelIDParam(QString json) {
    init();
    this->fromJson(json);
}

SWGMain.ChannelIDParam::SWGMain.ChannelIDParam() {
    init();
}

SWGMain.ChannelIDParam::~SWGMain.ChannelIDParam() {
    this->cleanup();
}

void
SWGMain.ChannelIDParam::init() {
    id = 0;
    m_id_isSet = false;
    initiator = new QString("");
    m_initiator_isSet = false;
    responder = new QString("");
    m_responder_isSet = false;
}

void
SWGMain.ChannelIDParam::cleanup() {

    if(initiator != nullptr) { 
        delete initiator;
    }
    if(responder != nullptr) { 
        delete responder;
    }
}

SWGMain.ChannelIDParam*
SWGMain.ChannelIDParam::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMain.ChannelIDParam::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&id, pJson["id"], "qint32", "");
    
    ::Swagger::setValue(&initiator, pJson["initiator"], "QString", "QString");
    
    ::Swagger::setValue(&responder, pJson["responder"], "QString", "QString");
    
}

QString
SWGMain.ChannelIDParam::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGMain.ChannelIDParam::asJsonObject() {
    QJsonObject obj;
    if(m_id_isSet){
        obj.insert("id", QJsonValue(id));
    }
    if(initiator != nullptr && *initiator != QString("")){
        toJsonValue(QString("initiator"), initiator, obj, QString("QString"));
    }
    if(responder != nullptr && *responder != QString("")){
        toJsonValue(QString("responder"), responder, obj, QString("QString"));
    }

    return obj;
}

qint32
SWGMain.ChannelIDParam::getId() {
    return id;
}
void
SWGMain.ChannelIDParam::setId(qint32 id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString*
SWGMain.ChannelIDParam::getInitiator() {
    return initiator;
}
void
SWGMain.ChannelIDParam::setInitiator(QString* initiator) {
    this->initiator = initiator;
    this->m_initiator_isSet = true;
}

QString*
SWGMain.ChannelIDParam::getResponder() {
    return responder;
}
void
SWGMain.ChannelIDParam::setResponder(QString* responder) {
    this->responder = responder;
    this->m_responder_isSet = true;
}


bool
SWGMain.ChannelIDParam::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_id_isSet){ isObjectUpdated = true; break;}
        if(initiator != nullptr && *initiator != QString("")){ isObjectUpdated = true; break;}
        if(responder != nullptr && *responder != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

