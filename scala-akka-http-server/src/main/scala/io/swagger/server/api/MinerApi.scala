package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Miner.ClaimMinerBody
import io.swagger.server.model.Miner.MinerSetInfoParams
import io.swagger.server.model.Miner.SuspendMinerBody
import io.swagger.server.model.api.claimMsgResponse
import io.swagger.server.model.api.claimResponse
import io.swagger.server.model.api.emptyResp
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

  def minerClaimMinerGet200(responseapi.claimMsgResponse: api.claimMsgResponse)(implicit toEntityMarshallerapi.claimMsgResponse: ToEntityMarshaller[api.claimMsgResponse]): Route =
    complete((200, responseapi.claimMsgResponse))
  def minerClaimMinerGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerClaimMinerGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: api.claimMsgResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerClaimMinerGet(miner: String)
      (implicit toEntityMarshallerapi.claimMsgResponse: ToEntityMarshaller[api.claimMsgResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerClaimPost200(responseapi.claimResponse: api.claimResponse)(implicit toEntityMarshallerapi.claimResponse: ToEntityMarshaller[api.claimResponse]): Route =
    complete((200, responseapi.claimResponse))
  def minerClaimPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerClaimPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: api.claimResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerClaimPost(body: Miner.ClaimMinerBody)
      (implicit toEntityMarshallerapi.claimResponse: ToEntityMarshaller[api.claimResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerSetInfoMinerPut200(responseapi.emptyResp: api.emptyResp)(implicit toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp]): Route =
    complete((200, responseapi.emptyResp))
  def minerSetInfoMinerPut400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerSetInfoMinerPut500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: api.emptyResp
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerSetInfoMinerPut(body: Miner.MinerSetInfoParams, miner: String)
      (implicit toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerSuspendMinerPost200(responseapi.emptyResp: api.emptyResp)(implicit toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp]): Route =
    complete((200, responseapi.emptyResp))
  def minerSuspendMinerPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerSuspendMinerPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: api.emptyResp
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerSuspendMinerPost(body: Miner.SuspendMinerBody, miner: String)
      (implicit toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def minerUnsuspendMinerPut200(responseapi.emptyResp: api.emptyResp)(implicit toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp]): Route =
    complete((200, responseapi.emptyResp))
  def minerUnsuspendMinerPut400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def minerUnsuspendMinerPut500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: api.emptyResp
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def minerUnsuspendMinerPut(miner: String)
      (implicit toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

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


  implicit def toEntityMarshallerapi.claimMsgResponse: ToEntityMarshaller[api.claimMsgResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerapi.claimResponse: ToEntityMarshaller[api.claimResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerapi.emptyResp: ToEntityMarshaller[api.emptyResp]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

