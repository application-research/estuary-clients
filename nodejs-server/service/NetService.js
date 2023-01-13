'use strict';


/**
 * Get all miners
 * This endpoint returns all miners. Note: value may be cached
 *
 * returns api.minerResp
 **/
exports.adminMinersGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "name" : "name",
  "chain_info" : {
    "owner" : "owner",
    "peerId" : "peerId",
    "addresses" : [ "addresses", "addresses" ],
    "worker" : "worker"
  },
  "suspendedReason" : "suspendedReason",
  "addr" : { },
  "version" : "version",
  "suspended" : true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all miners
 * This endpoint returns all miners
 *
 * miner String Filter by miner
 * returns String
 **/
exports.publicMinersFailuresMinerGET = function(miner) {
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
 * Net Addrs
 * This endpoint is used to get net addrs
 *
 * returns List
 **/
exports.publicNetAddrsGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ "", "" ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Net Peers
 * This endpoint is used to get net peers
 *
 * returns List
 **/
exports.publicNetPeersGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ "", "" ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

