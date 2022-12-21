'use strict';


/**
 * Claim Storage Provider
 * This endpoint lets a user claim a storage provider
 *
 * body Miner.ClaimMinerBody Claim Storage Provider Body
 * returns github_com_application-research_estuary_api_v2.claimResponse
 **/
exports.storage_providersClaimPOST = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "success" : true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get Claim Storage Provider
 * This endpoint lets a user get the message in order to claim a storage provider
 *
 * sp String Storage Provider claim message
 * returns github_com_application-research_estuary_api_v2.claimMsgResponse
 **/
exports.storage_providersClaimSpGET = function(sp) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "hexmsg" : "hexmsg"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all storage providers deals
 * This endpoint returns all storage providers deals
 *
 * sp String Filter by storage provider
 * ignoreFailed String Ignore Failed (optional)
 * returns String
 **/
exports.storage_providersDealsSpGET = function(sp,ignoreFailed) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all storage providers
 * This endpoint returns all storage providers
 *
 * sp String Filter by storage provider
 * returns String
 **/
exports.storage_providersFailuresSpGET = function(sp) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all storage providers
 * This endpoint returns all storage providers
 *
 * returns List
 **/
exports.storage_providersGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "name" : "name",
  "suspendedReason" : "suspendedReason",
  "addr" : { },
  "version" : "version",
  "suspended" : true
}, {
  "name" : "name",
  "suspendedReason" : "suspendedReason",
  "addr" : { },
  "version" : "version",
  "suspended" : true
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Set Storage Provider Info
 * This endpoint lets a user set storage provider info.
 *
 * body Miner.MinerSetInfoParams Storage Provider set info params
 * sp String Storage Provider to set info for
 * no response value expected for this operation
 **/
exports.storage_providersSet_infoSpPUT = function(body,sp) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get storage provider stats
 * This endpoint returns storage provider stats
 *
 * sp String Filter by storage provider
 * returns String
 **/
exports.storage_providersStatsSpGET = function(sp) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Suspend Storage Provider
 * This endpoint lets a user suspend a storage provider.
 *
 * body Miner.SuspendMinerBody Suspend Storage Provider Body
 * sp String Storage Provider to suspend
 * returns Map
 **/
exports.storage_providersSuspendSpPOST = function(body,sp) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "key" : ""
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Unuspend Storage Provider
 * This endpoint lets a user unsuspend a Storage Provider.
 *
 * sp String Storage Provider to unsuspend
 * no response value expected for this operation
 **/
exports.storage_providersUnsuspendSpPUT = function(sp) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

