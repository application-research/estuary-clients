import {interfaces} from "inversify";

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

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<AdminService>("AdminService").to(AdminService).inSingletonScope();
        container.bind<AutoretrieveService>("AutoretrieveService").to(AutoretrieveService).inSingletonScope();
        container.bind<CollectionsService>("CollectionsService").to(CollectionsService).inSingletonScope();
        container.bind<ContentService>("ContentService").to(ContentService).inSingletonScope();
        container.bind<DealsService>("DealsService").to(DealsService).inSingletonScope();
        container.bind<MetricsService>("MetricsService").to(MetricsService).inSingletonScope();
        container.bind<MinerService>("MinerService").to(MinerService).inSingletonScope();
        container.bind<NetService>("NetService").to(NetService).inSingletonScope();
        container.bind<PeeringService>("PeeringService").to(PeeringService).inSingletonScope();
        container.bind<PeersService>("PeersService").to(PeersService).inSingletonScope();
        container.bind<PinningService>("PinningService").to(PinningService).inSingletonScope();
        container.bind<PublicService>("PublicService").to(PublicService).inSingletonScope();
        container.bind<UserService>("UserService").to(UserService).inSingletonScope();
    }
}
