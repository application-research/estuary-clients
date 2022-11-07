QT += network

HEADERS += \
# Models
    $${PWD}/SWGCollections.Collection.h \
    $${PWD}/SWGMain.ChannelIDParam.h \
    $${PWD}/SWGMain.createCollectionBody.h \
    $${PWD}/SWGMain.deleteContentFromCollectionBody.h \
    $${PWD}/SWGMain.estimateDealBody.h \
    $${PWD}/SWGMain.getApiKeysResp.h \
    $${PWD}/SWGMain.importDealBody.h \
    $${PWD}/SWGTypes.IpfsPin.h \
    $${PWD}/SWGUtil.ContentAddIpfsBody.h \
    $${PWD}/SWGUtil.ContentAddResponse.h \
    $${PWD}/SWGUtil.ContentCreateBody.h \
    $${PWD}/SWGUtil.HttpError.h \
# APIs
    $${PWD}/SWGAdminApi.h \
    $${PWD}/SWGAutoretrieveApi.h \
    $${PWD}/SWGCollectionsApi.h \
    $${PWD}/SWGContentApi.h \
    $${PWD}/SWGDealsApi.h \
    $${PWD}/SWGMetricsApi.h \
    $${PWD}/SWGMinerApi.h \
    $${PWD}/SWGNetApi.h \
    $${PWD}/SWGPeeringApi.h \
    $${PWD}/SWGPeersApi.h \
    $${PWD}/SWGPinningApi.h \
    $${PWD}/SWGPublicApi.h \
    $${PWD}/SWGUserApi.h \
# Others
    $${PWD}/SWGHelpers.h \
    $${PWD}/SWGHttpRequest.h \
    $${PWD}/SWGModelFactory.h \
    $${PWD}/SWGObject.h \
    $${PWD}/SWGQObjectWrapper.h

SOURCES += \
# Models
    $${PWD}/SWGCollections.Collection.cpp \
    $${PWD}/SWGMain.ChannelIDParam.cpp \
    $${PWD}/SWGMain.createCollectionBody.cpp \
    $${PWD}/SWGMain.deleteContentFromCollectionBody.cpp \
    $${PWD}/SWGMain.estimateDealBody.cpp \
    $${PWD}/SWGMain.getApiKeysResp.cpp \
    $${PWD}/SWGMain.importDealBody.cpp \
    $${PWD}/SWGTypes.IpfsPin.cpp \
    $${PWD}/SWGUtil.ContentAddIpfsBody.cpp \
    $${PWD}/SWGUtil.ContentAddResponse.cpp \
    $${PWD}/SWGUtil.ContentCreateBody.cpp \
    $${PWD}/SWGUtil.HttpError.cpp \
# APIs
    $${PWD}/SWGAdminApi.cpp \
    $${PWD}/SWGAutoretrieveApi.cpp \
    $${PWD}/SWGCollectionsApi.cpp \
    $${PWD}/SWGContentApi.cpp \
    $${PWD}/SWGDealsApi.cpp \
    $${PWD}/SWGMetricsApi.cpp \
    $${PWD}/SWGMinerApi.cpp \
    $${PWD}/SWGNetApi.cpp \
    $${PWD}/SWGPeeringApi.cpp \
    $${PWD}/SWGPeersApi.cpp \
    $${PWD}/SWGPinningApi.cpp \
    $${PWD}/SWGPublicApi.cpp \
    $${PWD}/SWGUserApi.cpp \
# Others
    $${PWD}/SWGHelpers.cpp \
    $${PWD}/SWGHttpRequest.cpp

