'use strict';


/**
 * Estimate the cost of a deal
 * This endpoint estimates the cost of a deal
 *
 * body Main.estimateDealBody The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
 * returns String
 **/
exports.dealEstimatePOST = function(body) {
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
 * Get Deal Info
 * This endpoint returns the deal info for a deal
 *
 * dealid Integer Deal ID
 * returns String
 **/
exports.dealInfoDealidGET = function(dealid) {
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
 * Get Proposal
 * This endpoint returns the proposal for a deal
 *
 * propcid String Proposal CID
 * returns String
 **/
exports.dealProposalPropcidGET = function(propcid) {
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
 * Query Ask
 * This endpoint returns the ask for a given CID
 *
 * miner String CID
 * returns String
 **/
exports.dealQueryMinerGET = function(miner) {
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
 * Deal Status
 * This endpoint returns the status of a deal
 *
 * miner String Miner
 * propcid String Proposal CID
 * returns String
 **/
exports.dealStatusMinerPropcidGET = function(miner,propcid) {
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
 * Get Deal Status by PropCid
 * Get Deal Status by PropCid
 *
 * propcid String PropCid
 * returns String
 **/
exports.dealStatus_by_proposalPropcidGET = function(propcid) {
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
 * Transfer In Progress
 * This endpoint returns the in-progress transfers
 *
 * returns String
 **/
exports.dealTransferIn_progressGET = function() {
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
 * Transfer Status
 * This endpoint returns the status of a transfer
 *
 * body Main.ChannelIDParam Channel ID
 * returns String
 **/
exports.dealTransferStatusPOST = function(body) {
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
 * Get storage failures for user
 * This endpoint returns a list of storage failures for user
 *
 * returns String
 **/
exports.dealsFailuresGET = function() {
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
 * Make Deal
 * This endpoint makes a deal for a given content and miner
 *
 * body String Deal Request
 * miner String Miner
 * returns String
 **/
exports.dealsMakeMinerPOST = function(body,miner) {
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
 * Get Deal Status
 * This endpoint returns the status of a deal
 *
 * deal Integer Deal ID
 * returns String
 **/
exports.dealsStatusDealGET = function(deal) {
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
 * Get storage failures
 * This endpoint returns a list of storage failures
 *
 * returns String
 **/
exports.publicDealsFailuresGET = function() {
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
 * Query Ask
 * This endpoint returns the ask for a given CID
 *
 * miner String CID
 * returns String
 **/
exports.publicMinersStorageQueryMinerGET = function(miner) {
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

