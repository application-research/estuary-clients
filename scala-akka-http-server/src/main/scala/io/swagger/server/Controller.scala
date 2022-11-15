package io.swagger.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import io.swagger.server.api.AdminApi
import io.swagger.server.api.AutoretrieveApi
import io.swagger.server.api.CollectionsApi
import io.swagger.server.api.ContentApi
import io.swagger.server.api.DealsApi
import io.swagger.server.api.MetricsApi
import io.swagger.server.api.MinerApi
import io.swagger.server.api.NetApi
import io.swagger.server.api.PeeringApi
import io.swagger.server.api.PeersApi
import io.swagger.server.api.PinningApi
import io.swagger.server.api.PublicApi
import io.swagger.server.api.UserApi
import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(admin: AdminApi, autoretrieve: AutoretrieveApi, collections: CollectionsApi, content: ContentApi, deals: DealsApi, metrics: MetricsApi, miner: MinerApi, net: NetApi, peering: PeeringApi, peers: PeersApi, pinning: PinningApi, public: PublicApi, user: UserApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = admin.route ~ autoretrieve.route ~ collections.route ~ content.route ~ deals.route ~ metrics.route ~ miner.route ~ net.route ~ peering.route ~ peers.route ~ pinning.route ~ public.route ~ user.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}