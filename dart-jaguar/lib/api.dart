library swagger.api;

import 'package:http/http.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:swagger/auth/api_key_auth.dart';
import 'package:swagger/auth/basic_auth.dart';
import 'package:swagger/auth/oauth.dart';

import 'package:swagger/api/admin_api.dart';
import 'package:swagger/api/autoretrieve_api.dart';
import 'package:swagger/api/collections_api.dart';
import 'package:swagger/api/content_api.dart';
import 'package:swagger/api/deals_api.dart';
import 'package:swagger/api/metrics_api.dart';
import 'package:swagger/api/miner_api.dart';
import 'package:swagger/api/net_api.dart';
import 'package:swagger/api/peering_api.dart';
import 'package:swagger/api/peers_api.dart';
import 'package:swagger/api/pinning_api.dart';
import 'package:swagger/api/public_api.dart';
import 'package:swagger/api/user_api.dart';

import 'package:swagger/model/collections_collection.dart';
import 'package:swagger/model/main_channel_id_param.dart';
import 'package:swagger/model/main_create_collection_body.dart';
import 'package:swagger/model/main_delete_content_from_collection_body.dart';
import 'package:swagger/model/main_estimate_deal_body.dart';
import 'package:swagger/model/main_get_api_keys_resp.dart';
import 'package:swagger/model/main_import_deal_body.dart';
import 'package:swagger/model/types_ipfs_pin.dart';
import 'package:swagger/model/util_content_add_ipfs_body.dart';
import 'package:swagger/model/util_content_add_response.dart';
import 'package:swagger/model/util_content_create_body.dart';
import 'package:swagger/model/util_http_error.dart';


final jsonJaguarRepo = JsonRepo()
..add(CollectionsCollectionSerializer())
..add(MainChannelIDParamSerializer())
..add(MainCreateCollectionBodySerializer())
..add(MainDeleteContentFromCollectionBodySerializer())
..add(MainEstimateDealBodySerializer())
..add(MainGetApiKeysRespSerializer())
..add(MainImportDealBodySerializer())
..add(TypesIpfsPinSerializer())
..add(UtilContentAddIpfsBodySerializer())
..add(UtilContentAddResponseSerializer())
..add(UtilContentCreateBodySerializer())
..add(UtilHttpErrorSerializer())
;

final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class JaguarApiGen {
    List<Interceptor> interceptors;
    String basePath = "https://api.estuary.tech";
    Route _baseRoute;

    /**
     * Add custom global interceptors, put overrideInterceptors to true to set your interceptors only (auth interceptors will not be added)
     */
    JaguarApiGen({List<Interceptor> interceptors, bool overrideInterceptors = false, String baseUrl}) {
        _baseRoute = Route(baseUrl ?? basePath).withClient(globalClient ?? IOClient());
        if(interceptors == null) {
            this.interceptors = _defaultInterceptors;
        }
        else if(overrideInterceptors){
            this.interceptors = interceptors;
        }
        else {
            this.interceptors = List.from(_defaultInterceptors)..addAll(interceptors);
        }

        this.interceptors.forEach((interceptor) {
            _baseRoute.before(interceptor.before);
            _baseRoute.after(interceptor.after);
        });
    }

    void setOAuthToken(String name, String token) {
        (_defaultInterceptors[0] as OAuthInterceptor).tokens[name] = token;
    }

    void setBasicAuth(String name, String username, String password) {
        (_defaultInterceptors[1] as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }

    void setApiKey(String name, String apiKey) {
        (_defaultInterceptors[2] as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }

    
    /**
     * Get AdminApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    AdminApi getAdminApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return AdminApi(base: base, serializers: serializers);
    }

    
    /**
     * Get AutoretrieveApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    AutoretrieveApi getAutoretrieveApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return AutoretrieveApi(base: base, serializers: serializers);
    }

    
    /**
     * Get CollectionsApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    CollectionsApi getCollectionsApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return CollectionsApi(base: base, serializers: serializers);
    }

    
    /**
     * Get ContentApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    ContentApi getContentApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return ContentApi(base: base, serializers: serializers);
    }

    
    /**
     * Get DealsApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    DealsApi getDealsApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return DealsApi(base: base, serializers: serializers);
    }

    
    /**
     * Get MetricsApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    MetricsApi getMetricsApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return MetricsApi(base: base, serializers: serializers);
    }

    
    /**
     * Get MinerApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    MinerApi getMinerApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return MinerApi(base: base, serializers: serializers);
    }

    
    /**
     * Get NetApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    NetApi getNetApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return NetApi(base: base, serializers: serializers);
    }

    
    /**
     * Get PeeringApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    PeeringApi getPeeringApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return PeeringApi(base: base, serializers: serializers);
    }

    
    /**
     * Get PeersApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    PeersApi getPeersApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return PeersApi(base: base, serializers: serializers);
    }

    
    /**
     * Get PinningApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    PinningApi getPinningApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return PinningApi(base: base, serializers: serializers);
    }

    
    /**
     * Get PublicApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    PublicApi getPublicApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return PublicApi(base: base, serializers: serializers);
    }

    
    /**
     * Get UserApi instance, base route and serializer can be overridden by a given but be careful,
     * by doing that all interceptors will not be executed
     */
    UserApi getUserApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return UserApi(base: base, serializers: serializers);
    }

    
}