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

/*
 * SWGUtil.ContentCreateBody.h
 *
 * 
 */

#ifndef SWGUtil.ContentCreateBody_H_
#define SWGUtil.ContentCreateBody_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGUtil.ContentCreateBody: public SWGObject {
public:
    SWGUtil.ContentCreateBody();
    SWGUtil.ContentCreateBody(QString json);
    ~SWGUtil.ContentCreateBody();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGUtil.ContentCreateBody* fromJson(QString jsonString) override;

    QString* getColuuid();
    void setColuuid(QString* coluuid);

    QString* getDir();
    void setDir(QString* dir);

    QString* getLocation();
    void setLocation(QString* location);

    QString* getName();
    void setName(QString* name);

    QString* getRoot();
    void setRoot(QString* root);

    qint32 getType();
    void setType(qint32 type);


    virtual bool isSet() override;

private:
    QString* coluuid;
    bool m_coluuid_isSet;

    QString* dir;
    bool m_dir_isSet;

    QString* location;
    bool m_location_isSet;

    QString* name;
    bool m_name_isSet;

    QString* root;
    bool m_root_isSet;

    qint32 type;
    bool m_type_isSet;

};

}

#endif /* SWGUtil.ContentCreateBody_H_ */
