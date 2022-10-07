'use strict';


/**
 * Net Addrs
 * This endpoint is used to get net addrs
 *
 * returns List
 **/
exports.netAddrsGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {};
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
 * no response value expected for this operation
 **/
exports.publicMinersFailuresMinerGET = function(miner) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get all miners
 * This endpoint returns all miners
 *
 * no response value expected for this operation
 **/
exports.publicMinersGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
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
    examples['application/json'] = {};
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
    examples['application/json'] = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

