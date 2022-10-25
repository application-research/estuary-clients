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

#ifndef _SWG_SWGCollectionsApi_H_
#define _SWG_SWGCollectionsApi_H_

#include "SWGHttpRequest.h"

#include <QList>
#include <QString>
#include "SWGCollections.Collection.h"
#include "SWGMain.createCollectionBody.h"
#include "SWGMain.deleteContentFromCollectionBody.h"
#include "SWGUtil.HttpError.h"

#include <QObject>

namespace Swagger {

class SWGCollectionsApi: public QObject {
    Q_OBJECT

public:
    SWGCollectionsApi();
    SWGCollectionsApi(QString host, QString basePath);
    ~SWGCollectionsApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void collectionsColuuidCommitPost(QString* coluuid);
    void collectionsColuuidContentsDelete(QString* coluuid, QString* contentid, SWGMain.deleteContentFromCollectionBody& body);
    void collectionsColuuidDelete(QString* coluuid);
    void collectionsColuuidGet(QString* coluuid, QString* dir);
    void collectionsColuuidPost(QString* coluuid, QList<qint32>*& content_i_ds);
    void collectionsFsAddPost(QString* coluuid, QString* content, QString* path);
    void collectionsGet();
    void collectionsPost(SWGMain.createCollectionBody& body);
    
private:
    void collectionsColuuidCommitPostCallback (SWGHttpRequestWorker * worker);
    void collectionsColuuidContentsDeleteCallback (SWGHttpRequestWorker * worker);
    void collectionsColuuidDeleteCallback (SWGHttpRequestWorker * worker);
    void collectionsColuuidGetCallback (SWGHttpRequestWorker * worker);
    void collectionsColuuidPostCallback (SWGHttpRequestWorker * worker);
    void collectionsFsAddPostCallback (SWGHttpRequestWorker * worker);
    void collectionsGetCallback (SWGHttpRequestWorker * worker);
    void collectionsPostCallback (SWGHttpRequestWorker * worker);
    
signals:
    void collectionsColuuidCommitPostSignal(QString* summary);
    void collectionsColuuidContentsDeleteSignal(QString* summary);
    void collectionsColuuidDeleteSignal();
    void collectionsColuuidGetSignal(QString* summary);
    void collectionsColuuidPostSignal(QMap<QString, QString*>* summary);
    void collectionsFsAddPostSignal();
    void collectionsGetSignal(QList<SWGCollections.Collection*>* summary);
    void collectionsPostSignal(SWGCollections.Collection* summary);
    
    void collectionsColuuidCommitPostSignalE(QString* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidContentsDeleteSignalE(QString* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidDeleteSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidGetSignalE(QString* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidPostSignalE(QMap<QString, QString*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsFsAddPostSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsGetSignalE(QList<SWGCollections.Collection*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsPostSignalE(SWGCollections.Collection* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void collectionsColuuidCommitPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidContentsDeleteSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidDeleteSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsColuuidPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsFsAddPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsGetSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void collectionsPostSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
