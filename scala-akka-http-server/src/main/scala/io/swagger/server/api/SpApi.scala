package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Miner.ClaimMinerBody
import io.swagger.server.model.Miner.MinerSetInfoParams
import io.swagger.server.model.Miner.SuspendMinerBody
import io.swagger.server.model.api.storageProviderResp
import io.swagger.server.model.github_com_application-research_estuary_api_v2.claimMsgResponse
import io.swagger.server.model.github_com_application-research_estuary_api_v2.claimResponse
import io.swagger.server.model.util.HttpError

class SpApi(
    spService: SpApiService,
    spMarshaller: SpApiMarshaller
) {
  import spMarshaller._

  lazy val route: Route =
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Miner.ClaimMinerBody]){ body =>
                  spService.storageProvidersClaimPost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { (sp) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  spService.storageProvidersClaimSpGet(sp = sp)
               
             
            }
         
        }
      }
    } ~
    path() { (sp) => 
      get {
        parameters("ignore-failed".as[String].?) { (ignoreFailed) =>
          
            formFields() { () =>
              
                
                  spService.storageProvidersDealsSpGet(sp = sp, ignoreFailed = ignoreFailed)
               
             
            }
         
        }
      }
    } ~
    path() { (sp) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  spService.storageProvidersFailuresSpGet(sp = sp)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  spService.storageProvidersGet()
               
             
            }
         
        }
      }
    } ~
    path() { (sp) => 
      put {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Miner.MinerSetInfoParams]){ body =>
                  spService.storageProvidersSetInfoSpPut(body = body, sp = sp)
                }
             
            }
         
        }
      }
    } ~
    path() { (sp) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  spService.storageProvidersStatsSpGet(sp = sp)
               
             
            }
         
        }
      }
    } ~
    path() { (sp) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Miner.SuspendMinerBody]){ body =>
                  spService.storageProvidersSuspendSpPost(body = body, sp = sp)
                }
             
            }
         
        }
      }
    } ~
    path() { (sp) => 
      put {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  spService.storageProvidersUnsuspendSpPut(sp = sp)
               
             
            }
         
        }
      }
    }
}

trait SpApiService {

  def storageProvidersClaimPost200(responsegithub_com_application-research_estuary_api_v2.claimResponse: github_com_application-research_estuary_api_v2.claimResponse)(implicit toEntityMarshallergithub_com_application-research_estuary_api_v2.claimResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v2.claimResponse]): Route =
    complete((200, responsegithub_com_application-research_estuary_api_v2.claimResponse))
  def storageProvidersClaimPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersClaimPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: github_com_application-research_estuary_api_v2.claimResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersClaimPost(body: Miner.ClaimMinerBody)
      (implicit toEntityMarshallergithub_com_application-research_estuary_api_v2.claimResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v2.claimResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersClaimSpGet200(responsegithub_com_application-research_estuary_api_v2.claimMsgResponse: github_com_application-research_estuary_api_v2.claimMsgResponse)(implicit toEntityMarshallergithub_com_application-research_estuary_api_v2.claimMsgResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v2.claimMsgResponse]): Route =
    complete((200, responsegithub_com_application-research_estuary_api_v2.claimMsgResponse))
  def storageProvidersClaimSpGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersClaimSpGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: github_com_application-research_estuary_api_v2.claimMsgResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersClaimSpGet(sp: String)
      (implicit toEntityMarshallergithub_com_application-research_estuary_api_v2.claimMsgResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v2.claimMsgResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersDealsSpGet200(responseString: String): Route =
    complete((200, responseString))
  def storageProvidersDealsSpGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersDealsSpGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersDealsSpGet(sp: String, ignoreFailed: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersFailuresSpGet200(responseString: String): Route =
    complete((200, responseString))
  def storageProvidersFailuresSpGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersFailuresSpGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersFailuresSpGet(sp: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersGet200(responseapi.storageProviderResparray: List[api.storageProviderResp])(implicit toEntityMarshallerapi.storageProviderResparray: ToEntityMarshaller[List[api.storageProviderResp]]): Route =
    complete((200, responseapi.storageProviderResparray))
  def storageProvidersGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[api.storageProviderResp]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersGet()
      (implicit toEntityMarshallerapi.storageProviderResparray: ToEntityMarshaller[List[api.storageProviderResp]], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersSetInfoSpPut200: Route =
    complete((200, "OK"))
  def storageProvidersSetInfoSpPut400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersSetInfoSpPut500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersSetInfoSpPut(body: Miner.MinerSetInfoParams, sp: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersStatsSpGet200(responseString: String): Route =
    complete((200, responseString))
  def storageProvidersStatsSpGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersStatsSpGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersStatsSpGet(sp: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersSuspendSpPost200(responseMapmap: Map[String, String]): Route =
    complete((200, responseMapmap))
  def storageProvidersSuspendSpPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersSuspendSpPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: Map[String, String]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersSuspendSpPost(body: Miner.SuspendMinerBody, sp: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def storageProvidersUnsuspendSpPut200: Route =
    complete((200, "OK"))
  def storageProvidersUnsuspendSpPut400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def storageProvidersUnsuspendSpPut500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def storageProvidersUnsuspendSpPut(sp: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait SpApiMarshaller {
  implicit def fromRequestUnmarshallerMiner.SuspendMinerBody: FromRequestUnmarshaller[Miner.SuspendMinerBody]

  implicit def fromRequestUnmarshallerMiner.ClaimMinerBody: FromRequestUnmarshaller[Miner.ClaimMinerBody]

  implicit def fromRequestUnmarshallerMiner.MinerSetInfoParams: FromRequestUnmarshaller[Miner.MinerSetInfoParams]


  implicit def toEntityMarshallergithub_com_application-research_estuary_api_v2.claimResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v2.claimResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallergithub_com_application-research_estuary_api_v2.claimMsgResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v2.claimMsgResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerapi.storageProviderResparray: ToEntityMarshaller[List[api.storageProviderResp]]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

