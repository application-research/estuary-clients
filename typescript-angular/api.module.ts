import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { AdminService } from './api/admin.service';
import { AutoretrieveService } from './api/autoretrieve.service';
import { CollectionsService } from './api/collections.service';
import { ContentService } from './api/content.service';
import { DealsService } from './api/deals.service';
import { MetricsService } from './api/metrics.service';
import { MinerService } from './api/miner.service';
import { NetService } from './api/net.service';
import { PeeringService } from './api/peering.service';
import { PeersService } from './api/peers.service';
import { PinningService } from './api/pinning.service';
import { PublicService } from './api/public.service';
import { UserService } from './api/user.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: [
    AdminService,
    AutoretrieveService,
    CollectionsService,
    ContentService,
    DealsService,
    MetricsService,
    MinerService,
    NetService,
    PeeringService,
    PeersService,
    PinningService,
    PublicService,
    UserService ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders<ApiModule> {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
