package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Miner.ClaimMinerBody
import io.swagger.server.model.Miner.MinerSetInfoParams
import io.swagger.server.model.Miner.SuspendMinerBody
import io.swagger.server.model.github_com_application-research_estuary_api_v1.claimMsgResponse
import io.swagger.server.model.github_com_application-research_estuary_api_v1.claimResponse
import io.swagger.server.model.util.HttpError

class MinerApi(
    minerService: MinerApiService,
    minerMarshaller: MinerApiMarshaller
) {
  import minerMarshaller._

  lazy val route: Route =
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  minerService.minerClaimMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Miner.ClaimMinerBody]){ body =>
                  minerService.minerClaimPost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      put {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Miner.MinerSetInfoParams]){ body =>
                  minerService.minerSetInfoMinerPut(body = body, miner = miner)
                }
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Miner.SuspendMinerBody]){ body =>
                  minerService.minerSuspendMinerPost(body = body, miner = miner)
                }
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      put {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  minerService.minerUnsuspendMinerPut(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters("ignore-failed".as[String].?) { (ignoreFailed) =>
          
            formFields() { () =>
              
                
                  minerService.publicMinersDealsMinerGet(miner = miner, ignoreFailed = ignoreFailed)
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  minerService.publicMinersStatsMinerGet(miner = miner)
               
             
            }
         
        }
      }
    }
}

trait MinerApiService {

  def minerClaimMinerGet200(responsegithub_com_application-research_estuary_api_v1.claimMsgResponse: github_com_application-research_estuary_api_v1.claimMsgResponse)(implicit toEntityMarshallergithub_com_application-research_estuary_api_v1.claimMsgResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v1.claimMsgResponse]): Route =
    complete((200, responsegithub_com_application-research_estuary_api_v1.claimMsgResponse))
  def minerClaimMinerGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerClaimMinerGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: github_com_application-research_estuary_api_v1.claimMsgResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerClaimMinerGet(miner: String)
      (implicit toEntityMarshallergithub_com_application-research_estuary_api_v1.claimMsgResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v1.claimMsgResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerClaimPost200(responsegithub_com_application-research_estuary_api_v1.claimResponse: github_com_application-research_estuary_api_v1.claimResponse)(implicit toEntityMarshallergithub_com_application-research_estuary_api_v1.claimResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v1.claimResponse]): Route =
    complete((200, responsegithub_com_application-research_estuary_api_v1.claimResponse))
  def minerClaimPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerClaimPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: github_com_application-research_estuary_api_v1.claimResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerClaimPost(body: Miner.ClaimMinerBody)
      (implicit toEntityMarshallergithub_com_application-research_estuary_api_v1.claimResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v1.claimResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerSetInfoMinerPut200(responseMapmap: Map[String, String]): Route =
    complete((200, responseMapmap))
  def minerSetInfoMinerPut400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerSetInfoMinerPut500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: Map[String, String]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerSetInfoMinerPut(body: Miner.MinerSetInfoParams, miner: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerSuspendMinerPost200(responseMapmap: Map[String, String]): Route =
    complete((200, responseMapmap))
  def minerSuspendMinerPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerSuspendMinerPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: Map[String, String]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerSuspendMinerPost(body: Miner.SuspendMinerBody, miner: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerUnsuspendMinerPut200(responseMapmap: Map[String, String]): Route =
    complete((200, responseMapmap))
  def minerUnsuspendMinerPut400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerUnsuspendMinerPut500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: Map[String, String]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerUnsuspendMinerPut(miner: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def publicMinersDealsMinerGet200(responseString: String): Route =
    complete((200, responseString))
  def publicMinersDealsMinerGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def publicMinersDealsMinerGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def publicMinersDealsMinerGet(miner: String, ignoreFailed: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def publicMinersStatsMinerGet200(responseString: String): Route =
    complete((200, responseString))
  def publicMinersStatsMinerGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def publicMinersStatsMinerGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def publicMinersStatsMinerGet(miner: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait MinerApiMarshaller {
  implicit def fromRequestUnmarshallerMiner.SuspendMinerBody: FromRequestUnmarshaller[Miner.SuspendMinerBody]

  implicit def fromRequestUnmarshallerMiner.ClaimMinerBody: FromRequestUnmarshaller[Miner.ClaimMinerBody]

  implicit def fromRequestUnmarshallerMiner.MinerSetInfoParams: FromRequestUnmarshaller[Miner.MinerSetInfoParams]


  implicit def toEntityMarshallergithub_com_application-research_estuary_api_v1.claimMsgResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v1.claimMsgResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallergithub_com_application-research_estuary_api_v1.claimResponse: ToEntityMarshaller[github_com_application-research_estuary_api_v1.claimResponse]

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

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

