'use strict';


/**
 * Get Claim Miner Message
 * This endpoint lets a user get the message in order to claim a miner
 *
 * miner String Miner claim message
 * returns api.claimMsgResponse
 **/
exports.minerClaimMinerGET = function(miner) {
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
 * Claim Miner
 * This endpoint lets a user claim a miner
 *
 * body Miner.ClaimMinerBody Claim Miner Body
 * returns api.claimResponse
 **/
exports.minerClaimPOST = function(body) {
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
 * Set Miner Info
 * This endpoint lets a user set miner info.
 *
 * body Miner.MinerSetInfoParams Miner set info params
 * miner String Miner to set info for
 * returns api.emptyResp
 **/
exports.minerSet_infoMinerPUT = function(body,miner) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Suspend Miner
 * This endpoint lets a user suspend a miner.
 *
 * body Miner.SuspendMinerBody Suspend Miner Body
 * miner String Miner to suspend
 * returns api.emptyResp
 **/
exports.minerSuspendMinerPOST = function(body,miner) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Unuspend Miner
 * This endpoint lets a user unsuspend a miner.
 *
 * miner String Miner to unsuspend
 * returns api.emptyResp
 **/
exports.minerUnsuspendMinerPUT = function(miner) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all miners deals
 * This endpoint returns all miners deals
 *
 * miner String Filter by miner
 * ignoreFailed String Ignore Failed (optional)
 * returns String
 **/
exports.publicMinersDealsMinerGET = function(miner,ignoreFailed) {
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
 * Get miner stats
 * This endpoint returns miner stats
 *
 * miner String Filter by miner
 * returns String
 **/
exports.publicMinersStatsMinerGET = function(miner) {
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

