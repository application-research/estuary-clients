import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('AdminApi', api.AdminApi)
.service('AutoretrieveApi', api.AutoretrieveApi)
.service('CollectionsApi', api.CollectionsApi)
.service('ContentApi', api.ContentApi)
.service('DealsApi', api.DealsApi)
.service('MetricsApi', api.MetricsApi)
.service('MinerApi', api.MinerApi)
.service('NetApi', api.NetApi)
.service('PeeringApi', api.PeeringApi)
.service('PeersApi', api.PeersApi)
.service('PinningApi', api.PinningApi)
.service('PublicApi', api.PublicApi)
.service('UserApi', api.UserApi)

export default apiModule;
