package estuary-client

import com.codahale.metrics.Slf4jReporter
import com.typesafe.config.ConfigFactory
import io.ktor.application.Application
import io.ktor.application.ApplicationStopping
import io.ktor.application.install
import io.ktor.application.log
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.config.HoconApplicationConfig
import io.ktor.features.AutoHeadResponse
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.features.HSTS
import io.ktor.gson.GsonConverter
import io.ktor.http.ContentType
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Locations
import io.ktor.routing.Routing
import java.util.concurrent.TimeUnit
import io.ktor.util.KtorExperimentalAPI
import io.ktor.auth.Authentication
import io.ktor.auth.oauth
import io.ktor.metrics.dropwizard.DropwizardMetrics
import io.swagger.server.infrastructure.ApiKeyCredential
import io.swagger.server.infrastructure.ApiPrincipal
import io.swagger.server.infrastructure.apiKeyAuth
import io.swagger.server.apis.AdminApi
import io.swagger.server.apis.AutoretrieveApi
import io.swagger.server.apis.CollectionsApi
import io.swagger.server.apis.ContentApi
import io.swagger.server.apis.DealsApi
import io.swagger.server.apis.MetricsApi
import io.swagger.server.apis.MinerApi
import io.swagger.server.apis.NetApi
import io.swagger.server.apis.PeeringApi
import io.swagger.server.apis.PeersApi
import io.swagger.server.apis.PinningApi
import io.swagger.server.apis.PublicApi
import io.swagger.server.apis.UserApi

@KtorExperimentalAPI
internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

@KtorExperimentalAPI
@KtorExperimentalLocationsAPI
fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
                .outputTo(log)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see http://ktor.io/features/autoheadresponse.html
    install(HSTS, ApplicationHstsConfiguration()) // see http://ktor.io/features/hsts.html
    install(Compression, ApplicationCompressionConfiguration()) // see http://ktor.io/features/compression.html
    install(Locations) // see http://ktor.io/features/locations.html
    install(Authentication) {
        // "Implement API key auth (bearerAuth) for parameter name 'Authorization'."
        apiKeyAuth("bearerAuth") {
            validate { apikeyCredential: ApiKeyCredential ->
                when {
                    apikeyCredential.value == "keyboardcat" -> ApiPrincipal(apikeyCredential)
                    else -> null
                }
            }
        }
    }
    install(Routing) {
        AdminApi()
        AutoretrieveApi()
        CollectionsApi()
        ContentApi()
        DealsApi()
        MetricsApi()
        MinerApi()
        NetApi()
        PeeringApi()
        PeersApi()
        PinningApi()
        PublicApi()
        UserApi()
    }


    environment.monitor.subscribe(ApplicationStopping)
    {
        HTTP.client.close()
    }
}
