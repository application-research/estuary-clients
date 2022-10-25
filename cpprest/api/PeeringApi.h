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
 * PeeringApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_PeeringApi_H_
#define IO_SWAGGER_CLIENT_API_PeeringApi_H_


#include "../ApiClient.h"

#include <vector>
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  PeeringApi
{
public:
    PeeringApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~PeeringApi();
    /// <summary>
    /// Remove peers on Peering Service
    /// </summary>
    /// <remarks>
    /// This endpoint can be used to remove a Peer from the Peering Service
    /// </remarks>
    /// <param name="body">Peer ids</param>
    pplx::task<void> adminPeeringPeersDelete(
        std::vector<utility::string_t> body
    );
    /// <summary>
    /// List all Peering peers
    /// </summary>
    /// <remarks>
    /// This endpoint can be used to list all peers on Peering Service
    /// </remarks>
    pplx::task<void> adminPeeringPeersGet(
    );
    /// <summary>
    /// Add peers on Peering Service
    /// </summary>
    /// <remarks>
    /// This endpoint can be used to add a Peer from the Peering Service
    /// </remarks>
    pplx::task<void> adminPeeringPeersPost(
    );
    /// <summary>
    /// Start Peering
    /// </summary>
    /// <remarks>
    /// This endpoint can be used to start the Peering Service
    /// </remarks>
    pplx::task<void> adminPeeringStartPost(
    );
    /// <summary>
    /// Check Peering Status
    /// </summary>
    /// <remarks>
    /// This endpoint can be used to check the Peering status
    /// </remarks>
    pplx::task<void> adminPeeringStatusGet(
    );
    /// <summary>
    /// Stop Peering
    /// </summary>
    /// <remarks>
    /// This endpoint can be used to stop the Peering Service
    /// </remarks>
    pplx::task<void> adminPeeringStopPost(
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_PeeringApi_H_ */

