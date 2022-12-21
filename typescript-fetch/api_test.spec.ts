/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This file is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the file manually.
 */

import * as api from "./api"
import { Configuration } from "./configuration"

const config: Configuration = {}

describe("AdminApi", () => {
  let instance: api.AdminApi
  beforeEach(function() {
    instance = new api.AdminApi(config)
  });

  test("adminPeeringPeersDelete", () => {
    const body: Array<string> = undefined
    return expect(instance.adminPeeringPeersDelete(body, {})).resolves.toBe(null)
  })
  test("adminPeeringPeersGet", () => {
    return expect(instance.adminPeeringPeersGet({})).resolves.toBe(null)
  })
  test("adminPeeringPeersPost", () => {
    const body: Array<api.PeeringPeeringPeer> = undefined
    return expect(instance.adminPeeringPeersPost(body, {})).resolves.toBe(null)
  })
  test("adminPeeringStartPost", () => {
    return expect(instance.adminPeeringStartPost({})).resolves.toBe(null)
  })
  test("adminPeeringStatusGet", () => {
    return expect(instance.adminPeeringStatusGet({})).resolves.toBe(null)
  })
  test("adminPeeringStopPost", () => {
    return expect(instance.adminPeeringStopPost({})).resolves.toBe(null)
  })
  test("adminSystemConfigGet", () => {
    return expect(instance.adminSystemConfigGet({})).resolves.toBe(null)
  })
  test("adminUsersGet", () => {
    return expect(instance.adminUsersGet({})).resolves.toBe(null)
  })
})

describe("AutoretrieveApi", () => {
  let instance: api.AutoretrieveApi
  beforeEach(function() {
    instance = new api.AutoretrieveApi(config)
  });

  test("adminAutoretrieveInitPost", () => {
    const addresses: string = "addresses_example"
    const pubKey: string = "pubKey_example"
    return expect(instance.adminAutoretrieveInitPost(addresses, pubKey, {})).resolves.toBe(null)
  })
  test("adminAutoretrieveListGet", () => {
    return expect(instance.adminAutoretrieveListGet({})).resolves.toBe(null)
  })
  test("autoretrieveHeartbeatPost", () => {
    const token: string = "token_example"
    return expect(instance.autoretrieveHeartbeatPost(token, {})).resolves.toBe(null)
  })
})

describe("CollectionsApi", () => {
  let instance: api.CollectionsApi
  beforeEach(function() {
    instance = new api.CollectionsApi(config)
  });

  test("collectionsColuuidCommitPost", () => {
    const coluuid: string = "coluuid_example"
    return expect(instance.collectionsColuuidCommitPost(coluuid, {})).resolves.toBe(null)
  })
  test("collectionsColuuidContentsDelete", () => {
    const body: api.ApiDeleteContentFromCollectionBody = undefined
    const coluuid: string = "coluuid_example"
    return expect(instance.collectionsColuuidContentsDelete(body, coluuid, {})).resolves.toBe(null)
  })
  test("collectionsColuuidDelete", () => {
    const coluuid: string = "coluuid_example"
    return expect(instance.collectionsColuuidDelete(coluuid, {})).resolves.toBe(null)
  })
  test("collectionsColuuidGet", () => {
    const coluuid: string = "coluuid_example"
    const dir: string = "dir_example"
    return expect(instance.collectionsColuuidGet(coluuid, dir, {})).resolves.toBe(null)
  })
  test("collectionsColuuidPost", () => {
    const body: Array<number> = undefined
    const coluuid: string = "coluuid_example"
    const dir: string = "dir_example"
    return expect(instance.collectionsColuuidPost(body, coluuid, dir, {})).resolves.toBe(null)
  })
  test("collectionsFsAddPost", () => {
    const coluuid: string = "coluuid_example"
    const content: string = "content_example"
    const path: string = "path_example"
    return expect(instance.collectionsFsAddPost(coluuid, content, path, {})).resolves.toBe(null)
  })
  test("collectionsGet", () => {
    return expect(instance.collectionsGet({})).resolves.toBe(null)
  })
  test("collectionsPost", () => {
    const body: api.ApiCreateCollectionBody = undefined
    return expect(instance.collectionsPost(body, {})).resolves.toBe(null)
  })
})

describe("ContentApi", () => {
  let instance: api.ContentApi
  beforeEach(function() {
    instance = new api.ContentApi(config)
  });

  test("adminInvitesCodePost", () => {
    const code: string = "code_example"
    return expect(instance.adminInvitesCodePost(code, {})).resolves.toBe(null)
  })
  test("adminInvitesGet", () => {
    return expect(instance.adminInvitesGet({})).resolves.toBe(null)
  })
  test("contentAddCarPost", () => {
    const body: string = undefined
    const ignoreDupes: string = "ignoreDupes_example"
    const filename: string = "filename_example"
    return expect(instance.contentAddCarPost(body, ignoreDupes, filename, {})).resolves.toBe(null)
  })
  test("contentAddIpfsPost", () => {
    const body: api.TypesIpfsPin = undefined
    const ignoreDupes: string = "ignoreDupes_example"
    return expect(instance.contentAddIpfsPost(body, ignoreDupes, {})).resolves.toBe(null)
  })
  test("contentAddPost", () => {
    const data: Blob = "data_example"
    const filename: string = "filename_example"
    const coluuid: string = "coluuid_example"
    const replication: number = 56
    const ignoreDupes: string = "ignoreDupes_example"
    const lazyProvide: string = "lazyProvide_example"
    const dir: string = "dir_example"
    return expect(instance.contentAddPost(data, filename, coluuid, replication, ignoreDupes, lazyProvide, dir, {})).resolves.toBe(null)
  })
  test("contentAggregatedContentGet", () => {
    const content: string = "content_example"
    return expect(instance.contentAggregatedContentGet(content, {})).resolves.toBe(null)
  })
  test("contentAllDealsGet", () => {
    const begin: string = "begin_example"
    const duration: string = "duration_example"
    const all: string = "all_example"
    return expect(instance.contentAllDealsGet(begin, duration, all, {})).resolves.toBe(null)
  })
  test("contentBwUsageContentGet", () => {
    const content: string = "content_example"
    return expect(instance.contentBwUsageContentGet(content, {})).resolves.toBe(null)
  })
  test("contentContentsGet", () => {
    const limit: string = "limit_example"
    const offset: string = "offset_example"
    return expect(instance.contentContentsGet(limit, offset, {})).resolves.toBe(null)
  })
  test("contentCreatePost", () => {
    const body: api.UtilContentCreateBody = undefined
    const ignoreDupes: string = "ignoreDupes_example"
    return expect(instance.contentCreatePost(body, ignoreDupes, {})).resolves.toBe(null)
  })
  test("contentDealsGet", () => {
    const limit: number = 56
    const offset: number = 56
    return expect(instance.contentDealsGet(limit, offset, {})).resolves.toBe(null)
  })
  test("contentEnsureReplicationDatacidGet", () => {
    const datacid: string = "datacid_example"
    return expect(instance.contentEnsureReplicationDatacidGet(datacid, {})).resolves.toBe(null)
  })
  test("contentFailuresContentGet", () => {
    const content: string = "content_example"
    return expect(instance.contentFailuresContentGet(content, {})).resolves.toBe(null)
  })
  test("contentIdGet", () => {
    const id: number = 56
    return expect(instance.contentIdGet(id, {})).resolves.toBe(null)
  })
  test("contentListGet", () => {
    return expect(instance.contentListGet({})).resolves.toBe(null)
  })
  test("contentStagingZonesGet", () => {
    return expect(instance.contentStagingZonesGet({})).resolves.toBe(null)
  })
  test("contentStagingZonesStagingZoneContentsGet", () => {
    const stagingZone: number = 56
    const limit: string = "limit_example"
    const offset: string = "offset_example"
    return expect(instance.contentStagingZonesStagingZoneContentsGet(stagingZone, limit, offset, {})).resolves.toBe(null)
  })
  test("contentStagingZonesStagingZoneGet", () => {
    const stagingZone: number = 56
    return expect(instance.contentStagingZonesStagingZoneGet(stagingZone, {})).resolves.toBe(null)
  })
  test("contentStatsGet", () => {
    const limit: string = "limit_example"
    const offset: string = "offset_example"
    return expect(instance.contentStatsGet(limit, offset, {})).resolves.toBe(null)
  })
  test("contentStatusIdGet", () => {
    const id: number = 56
    return expect(instance.contentStatusIdGet(id, {})).resolves.toBe(null)
  })
})

describe("DealsApi", () => {
  let instance: api.DealsApi
  beforeEach(function() {
    instance = new api.DealsApi(config)
  });

  test("dealEstimatePost", () => {
    const body: api.ApiEstimateDealBody = undefined
    return expect(instance.dealEstimatePost(body, {})).resolves.toBe(null)
  })
  test("dealInfoDealidGet", () => {
    const dealid: number = 56
    return expect(instance.dealInfoDealidGet(dealid, {})).resolves.toBe(null)
  })
  test("dealProposalPropcidGet", () => {
    const propcid: string = "propcid_example"
    return expect(instance.dealProposalPropcidGet(propcid, {})).resolves.toBe(null)
  })
  test("dealQueryMinerGet", () => {
    const miner: string = "miner_example"
    return expect(instance.dealQueryMinerGet(miner, {})).resolves.toBe(null)
  })
  test("dealStatusByProposalPropcidGet", () => {
    const propcid: string = "propcid_example"
    return expect(instance.dealStatusByProposalPropcidGet(propcid, {})).resolves.toBe(null)
  })
  test("dealStatusMinerPropcidGet", () => {
    const miner: string = "miner_example"
    const propcid: string = "propcid_example"
    return expect(instance.dealStatusMinerPropcidGet(miner, propcid, {})).resolves.toBe(null)
  })
  test("dealTransferInProgressGet", () => {
    return expect(instance.dealTransferInProgressGet({})).resolves.toBe(null)
  })
  test("dealTransferStatusPost", () => {
    const body: api.ApiChannelIDParam = undefined
    return expect(instance.dealTransferStatusPost(body, {})).resolves.toBe(null)
  })
  test("dealsFailuresGet", () => {
    return expect(instance.dealsFailuresGet({})).resolves.toBe(null)
  })
  test("dealsMakeMinerPost", () => {
    const body: string = undefined
    const miner: string = "miner_example"
    return expect(instance.dealsMakeMinerPost(body, miner, {})).resolves.toBe(null)
  })
  test("dealsStatusDealGet", () => {
    const deal: number = 56
    return expect(instance.dealsStatusDealGet(deal, {})).resolves.toBe(null)
  })
  test("publicDealsFailuresGet", () => {
    return expect(instance.publicDealsFailuresGet({})).resolves.toBe(null)
  })
  test("publicMinersStorageQueryMinerGet", () => {
    const miner: string = "miner_example"
    return expect(instance.publicMinersStorageQueryMinerGet(miner, {})).resolves.toBe(null)
  })
  test("storageProvidersStorageQueryCidGet", () => {
    const cid: string = "cid_example"
    return expect(instance.storageProvidersStorageQueryCidGet(cid, {})).resolves.toBe(null)
  })
})

describe("DefaultApi", () => {
  let instance: api.DefaultApi
  beforeEach(function() {
    instance = new api.DefaultApi(config)
  });

  test("viewerGet", () => {
    return expect(instance.viewerGet({})).resolves.toBe(null)
  })
})

describe("MetricsApi", () => {
  let instance: api.MetricsApi
  beforeEach(function() {
    instance = new api.MetricsApi(config)
  });

  test("publicMetricsDealsOnChainGet", () => {
    return expect(instance.publicMetricsDealsOnChainGet({})).resolves.toBe(null)
  })
})

describe("MinerApi", () => {
  let instance: api.MinerApi
  beforeEach(function() {
    instance = new api.MinerApi(config)
  });

  test("minerClaimMinerGet", () => {
    const miner: string = "miner_example"
    return expect(instance.minerClaimMinerGet(miner, {})).resolves.toBe(null)
  })
  test("minerClaimPost", () => {
    const body: api.MinerClaimMinerBody = undefined
    return expect(instance.minerClaimPost(body, {})).resolves.toBe(null)
  })
  test("minerSetInfoMinerPut", () => {
    const body: api.MinerMinerSetInfoParams = undefined
    const miner: string = "miner_example"
    return expect(instance.minerSetInfoMinerPut(body, miner, {})).resolves.toBe(null)
  })
  test("minerSuspendMinerPost", () => {
    const body: api.MinerSuspendMinerBody = undefined
    const miner: string = "miner_example"
    return expect(instance.minerSuspendMinerPost(body, miner, {})).resolves.toBe(null)
  })
  test("minerUnsuspendMinerPut", () => {
    const miner: string = "miner_example"
    return expect(instance.minerUnsuspendMinerPut(miner, {})).resolves.toBe(null)
  })
  test("publicMinersDealsMinerGet", () => {
    const miner: string = "miner_example"
    const ignoreFailed: string = "ignoreFailed_example"
    return expect(instance.publicMinersDealsMinerGet(miner, ignoreFailed, {})).resolves.toBe(null)
  })
  test("publicMinersStatsMinerGet", () => {
    const miner: string = "miner_example"
    return expect(instance.publicMinersStatsMinerGet(miner, {})).resolves.toBe(null)
  })
})

describe("NetApi", () => {
  let instance: api.NetApi
  beforeEach(function() {
    instance = new api.NetApi(config)
  });

  test("publicMinersFailuresMinerGet", () => {
    const miner: string = "miner_example"
    return expect(instance.publicMinersFailuresMinerGet(miner, {})).resolves.toBe(null)
  })
  test("publicMinersGet", () => {
    return expect(instance.publicMinersGet({})).resolves.toBe(null)
  })
  test("publicNetAddrsGet", () => {
    return expect(instance.publicNetAddrsGet({})).resolves.toBe(null)
  })
  test("publicNetPeersGet", () => {
    return expect(instance.publicNetPeersGet({})).resolves.toBe(null)
  })
})

describe("PinningApi", () => {
  let instance: api.PinningApi
  beforeEach(function() {
    instance = new api.PinningApi(config)
  });

  test("pinningPinsGet", () => {
    return expect(instance.pinningPinsGet({})).resolves.toBe(null)
  })
  test("pinningPinsPinidDelete", () => {
    const pinid: string = "pinid_example"
    return expect(instance.pinningPinsPinidDelete(pinid, {})).resolves.toBe(null)
  })
  test("pinningPinsPinidGet", () => {
    const pinid: string = "pinid_example"
    return expect(instance.pinningPinsPinidGet(pinid, {})).resolves.toBe(null)
  })
  test("pinningPinsPinidPost", () => {
    const body: api.TypesIpfsPin = undefined
    const pinid: string = "pinid_example"
    return expect(instance.pinningPinsPinidPost(body, pinid, {})).resolves.toBe(null)
  })
  test("pinningPinsPost", () => {
    const body: api.TypesIpfsPin = undefined
    return expect(instance.pinningPinsPost(body, {})).resolves.toBe(null)
  })
})

describe("PublicApi", () => {
  let instance: api.PublicApi
  beforeEach(function() {
    instance = new api.PublicApi(config)
  });

  test("getCidGet", () => {
    const cid: string = "cid_example"
    return expect(instance.getCidGet(cid, {})).resolves.toBe(null)
  })
  test("publicByCidCidGet", () => {
    const cid: string = "cid_example"
    return expect(instance.publicByCidCidGet(cid, {})).resolves.toBe(null)
  })
  test("publicInfoGet", () => {
    return expect(instance.publicInfoGet({})).resolves.toBe(null)
  })
  test("publicMetricsDealsOnChainGet", () => {
    return expect(instance.publicMetricsDealsOnChainGet({})).resolves.toBe(null)
  })
  test("publicMinersDealsMinerGet", () => {
    const miner: string = "miner_example"
    const ignoreFailed: string = "ignoreFailed_example"
    return expect(instance.publicMinersDealsMinerGet(miner, ignoreFailed, {})).resolves.toBe(null)
  })
  test("publicMinersFailuresMinerGet", () => {
    const miner: string = "miner_example"
    return expect(instance.publicMinersFailuresMinerGet(miner, {})).resolves.toBe(null)
  })
  test("publicMinersGet", () => {
    return expect(instance.publicMinersGet({})).resolves.toBe(null)
  })
  test("publicMinersStatsMinerGet", () => {
    const miner: string = "miner_example"
    return expect(instance.publicMinersStatsMinerGet(miner, {})).resolves.toBe(null)
  })
  test("publicNetAddrsGet", () => {
    return expect(instance.publicNetAddrsGet({})).resolves.toBe(null)
  })
  test("publicNetPeersGet", () => {
    return expect(instance.publicNetPeersGet({})).resolves.toBe(null)
  })
  test("publicStatsGet", () => {
    return expect(instance.publicStatsGet({})).resolves.toBe(null)
  })
})

describe("SpApi", () => {
  let instance: api.SpApi
  beforeEach(function() {
    instance = new api.SpApi(config)
  });

  test("storageProvidersClaimPost", () => {
    const body: api.MinerClaimMinerBody = undefined
    return expect(instance.storageProvidersClaimPost(body, {})).resolves.toBe(null)
  })
  test("storageProvidersClaimSpGet", () => {
    const sp: string = "sp_example"
    return expect(instance.storageProvidersClaimSpGet(sp, {})).resolves.toBe(null)
  })
  test("storageProvidersDealsSpGet", () => {
    const sp: string = "sp_example"
    const ignoreFailed: string = "ignoreFailed_example"
    return expect(instance.storageProvidersDealsSpGet(sp, ignoreFailed, {})).resolves.toBe(null)
  })
  test("storageProvidersFailuresSpGet", () => {
    const sp: string = "sp_example"
    return expect(instance.storageProvidersFailuresSpGet(sp, {})).resolves.toBe(null)
  })
  test("storageProvidersGet", () => {
    return expect(instance.storageProvidersGet({})).resolves.toBe(null)
  })
  test("storageProvidersSetInfoSpPut", () => {
    const body: api.MinerMinerSetInfoParams = undefined
    const sp: string = "sp_example"
    return expect(instance.storageProvidersSetInfoSpPut(body, sp, {})).resolves.toBe(null)
  })
  test("storageProvidersStatsSpGet", () => {
    const sp: string = "sp_example"
    return expect(instance.storageProvidersStatsSpGet(sp, {})).resolves.toBe(null)
  })
  test("storageProvidersSuspendSpPost", () => {
    const body: api.MinerSuspendMinerBody = undefined
    const sp: string = "sp_example"
    return expect(instance.storageProvidersSuspendSpPost(body, sp, {})).resolves.toBe(null)
  })
  test("storageProvidersUnsuspendSpPut", () => {
    const sp: string = "sp_example"
    return expect(instance.storageProvidersUnsuspendSpPut(sp, {})).resolves.toBe(null)
  })
})

describe("UserApi", () => {
  let instance: api.UserApi
  beforeEach(function() {
    instance = new api.UserApi(config)
  });

  test("userApiKeysGet", () => {
    return expect(instance.userApiKeysGet({})).resolves.toBe(null)
  })
  test("userApiKeysKeyOrHashDelete", () => {
    const keyOrHash: string = "keyOrHash_example"
    return expect(instance.userApiKeysKeyOrHashDelete(keyOrHash, {})).resolves.toBe(null)
  })
  test("userApiKeysPost", () => {
    const expiry: string = "expiry_example"
    const perms: string = "perms_example"
    return expect(instance.userApiKeysPost(expiry, perms, {})).resolves.toBe(null)
  })
  test("userExportGet", () => {
    return expect(instance.userExportGet({})).resolves.toBe(null)
  })
  test("userStatsGet", () => {
    return expect(instance.userStatsGet({})).resolves.toBe(null)
  })
})

