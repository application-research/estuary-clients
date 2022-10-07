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

#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "SWGObject.h"

#include "SWGMain.Collection.h"
#include "SWGMain.createCollectionBody.h"
#include "SWGMain.estimateDealBody.h"
#include "SWGMain.getApiKeysResp.h"
#include "SWGMain.importDealBody.h"
#include "SWGMain.userStatsResponse.h"
#include "SWGUtil.ContentAddIpfsBody.h"
#include "SWGUtil.ContentAddResponse.h"
#include "SWGUtil.HttpError.h"

namespace Swagger {

  inline void* create(QString type) {
    if(QString("SWGMain.Collection").compare(type) == 0) {
      return new SWGMain.Collection();
    }
    if(QString("SWGMain.createCollectionBody").compare(type) == 0) {
      return new SWGMain.createCollectionBody();
    }
    if(QString("SWGMain.estimateDealBody").compare(type) == 0) {
      return new SWGMain.estimateDealBody();
    }
    if(QString("SWGMain.getApiKeysResp").compare(type) == 0) {
      return new SWGMain.getApiKeysResp();
    }
    if(QString("SWGMain.importDealBody").compare(type) == 0) {
      return new SWGMain.importDealBody();
    }
    if(QString("SWGMain.userStatsResponse").compare(type) == 0) {
      return new SWGMain.userStatsResponse();
    }
    if(QString("SWGUtil.ContentAddIpfsBody").compare(type) == 0) {
      return new SWGUtil.ContentAddIpfsBody();
    }
    if(QString("SWGUtil.ContentAddResponse").compare(type) == 0) {
      return new SWGUtil.ContentAddResponse();
    }
    if(QString("SWGUtil.HttpError").compare(type) == 0) {
      return new SWGUtil.HttpError();
    }
    
    return nullptr;
  }

  inline void* create(QString json, QString type) {
    if(type.startsWith("QString")) {
      return new QString();
    }    
    auto val = static_cast<SWGObject*>(create(type));
    if(val != nullptr) {
      return val->fromJson(json);
    }
    return nullptr;
  }

}

#endif /* ModelFactory_H_ */