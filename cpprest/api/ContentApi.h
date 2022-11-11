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
 * ContentApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_ContentApi_H_
#define IO_SWAGGER_CLIENT_API_ContentApi_H_


#include "../ApiClient.h"

#include "HttpContent.h"
#include "Main.importDealBody.h"
#include "Util.ContentAddIpfsBody.h"
#include "Util.ContentAddResponse.h"
#include "Util.ContentCreateBody.h"
#include "Util.HttpError.h"
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  ContentApi
{
public:
    ContentApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~ContentApi();
    /// <summary>
    /// Add Car object
    /// </summary>
    /// <remarks>
    /// This endpoint is used to add a car object to the network. The object can be a file or a directory.
    /// </remarks>
    /// <param name="body">Car</param>
    /// <param name="ignoreDupes">Ignore Dupes (optional)</param>
    /// <param name="filename">Filename (optional)</param>
    pplx::task<utility::string_t> contentAddCarPost(
        utility::string_t body,
        boost::optional<utility::string_t> ignoreDupes,
        boost::optional<utility::string_t> filename
    );
    /// <summary>
    /// Add IPFS object
    /// </summary>
    /// <remarks>
    /// This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
    /// </remarks>
    /// <param name="body">IPFS Body</param>
    /// <param name="ignoreDupes">Ignore Dupes (optional)</param>
    pplx::task<utility::string_t> contentAddIpfsPost(
        std::shared_ptr<Util.ContentAddIpfsBody> body,
        boost::optional<utility::string_t> ignoreDupes
    );
    /// <summary>
    /// Add new content
    /// </summary>
    /// <remarks>
    /// This endpoint is used to upload new content.
    /// </remarks>
    /// <param name="data">File to upload</param>
    /// <param name="filename">Filenam to use for upload (optional)</param>
    /// <param name="coluuid">Collection UUID (optional)</param>
    /// <param name="replication">Replication value (optional)</param>
    /// <param name="ignoreDupes">Ignore Dupes true/false (optional)</param>
    /// <param name="lazyProvide">Lazy Provide true/false (optional)</param>
    /// <param name="dir">Directory (optional)</param>
    pplx::task<std::shared_ptr<Util.ContentAddResponse>> contentAddPost(
        std::shared_ptr<HttpContent> data,
        boost::optional<utility::string_t> filename,
        boost::optional<utility::string_t> coluuid,
        boost::optional<int32_t> replication,
        boost::optional<utility::string_t> ignoreDupes,
        boost::optional<utility::string_t> lazyProvide,
        boost::optional<utility::string_t> dir
    );
    /// <summary>
    /// Get aggregated content stats
    /// </summary>
    /// <remarks>
    /// This endpoint returns aggregated content stats
    /// </remarks>
    /// <param name="content">Content ID</param>
    pplx::task<utility::string_t> contentAggregatedContentGet(
        utility::string_t content
    );
    /// <summary>
    /// Get all deals for a user
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get all deals for a user
    /// </remarks>
    /// <param name="begin">Begin</param>
    /// <param name="duration">Duration</param>
    /// <param name="all">All</param>
    pplx::task<utility::string_t> contentAllDealsGet(
        utility::string_t begin,
        utility::string_t duration,
        utility::string_t all
    );
    /// <summary>
    /// Get content bandwidth
    /// </summary>
    /// <remarks>
    /// This endpoint returns content bandwidth
    /// </remarks>
    /// <param name="content">Content ID</param>
    pplx::task<utility::string_t> contentBwUsageContentGet(
        utility::string_t content
    );
    /// <summary>
    /// Add a new content
    /// </summary>
    /// <remarks>
    /// This endpoint adds a new content
    /// </remarks>
    /// <param name="req">Content</param>
    /// <param name="ignoreDupes">Ignore Dupes (optional)</param>
    pplx::task<utility::string_t> contentCreatePost(
        std::shared_ptr<Util.ContentCreateBody> req,
        boost::optional<utility::string_t> ignoreDupes
    );
    /// <summary>
    /// Content with deals
    /// </summary>
    /// <remarks>
    /// This endpoint lists all content with deals
    /// </remarks>
    /// <param name="limit">Limit (optional)</param>
    /// <param name="offset">Offset (optional)</param>
    pplx::task<utility::string_t> contentDealsGet(
        boost::optional<int32_t> limit,
        boost::optional<int32_t> offset
    );
    /// <summary>
    /// Ensure Replication
    /// </summary>
    /// <remarks>
    /// This endpoint ensures that the content is replicated to the specified number of providers
    /// </remarks>
    /// <param name="datacid">Data CID</param>
    pplx::task<utility::string_t> contentEnsureReplicationDatacidGet(
        utility::string_t datacid
    );
    /// <summary>
    /// List all failures for a content
    /// </summary>
    /// <remarks>
    /// This endpoint returns all failures for a content
    /// </remarks>
    /// <param name="content">Content ID</param>
    pplx::task<utility::string_t> contentFailuresContentGet(
        utility::string_t content
    );
    /// <summary>
    /// Content
    /// </summary>
    /// <remarks>
    /// This endpoint returns a content by its ID
    /// </remarks>
    /// <param name="id">Content ID</param>
    pplx::task<utility::string_t> contentIdGet(
        int32_t id
    );
    /// <summary>
    /// Import a deal
    /// </summary>
    /// <remarks>
    /// This endpoint imports a deal into the shuttle.
    /// </remarks>
    /// <param name="body">Import a deal</param>
    pplx::task<utility::string_t> contentImportdealPost(
        std::shared_ptr<Main.importDealBody> body
    );
    /// <summary>
    /// List all pinned content
    /// </summary>
    /// <remarks>
    /// This endpoint lists all content
    /// </remarks>
    pplx::task<utility::string_t> contentListGet(
    );
    /// <summary>
    /// Read content
    /// </summary>
    /// <remarks>
    /// This endpoint reads content from the blockstore
    /// </remarks>
    /// <param name="cont">CID</param>
    pplx::task<utility::string_t> contentReadContGet(
        utility::string_t cont
    );
    /// <summary>
    /// Get staging zone for user
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get staging zone for user.
    /// </remarks>
    pplx::task<utility::string_t> contentStagingZonesGet(
    );
    /// <summary>
    /// Get content statistics
    /// </summary>
    /// <remarks>
    /// This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
    /// </remarks>
    /// <param name="limit">limit</param>
    /// <param name="offset">offset</param>
    pplx::task<utility::string_t> contentStatsGet(
        utility::string_t limit,
        utility::string_t offset
    );
    /// <summary>
    /// Content Status
    /// </summary>
    /// <remarks>
    /// This endpoint returns the status of a content
    /// </remarks>
    /// <param name="id">Content ID</param>
    pplx::task<utility::string_t> contentStatusIdGet(
        int32_t id
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_ContentApi_H_ */

