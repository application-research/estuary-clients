'use strict';


/**
 * Get Content by Cid
 * This endpoint returns the content associated with a CID
 *
 * cid String Cid
 * no response value expected for this operation
 **/
exports.publicBy_cidCidGET = function(cid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get public node info
 * This endpoint returns information about the node
 *
 * no response value expected for this operation
 **/
exports.publicInfoGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get deal metrics
 * This endpoint is used to get deal metrics
 *
 * no response value expected for this operation
 **/
exports.publicMetricsDeals_on_chainGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get all miners deals
 * This endpoint returns all miners deals
 *
 * miner String Filter by miner
 * no response value expected for this operation
 **/
exports.publicMinersDealsMinerGET = function(miner) {
  return new Promise(function(resolve, reject) {
    resolve();
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
 * Get miner stats
 * This endpoint returns miner stats
 *
 * miner String Filter by miner
 * no response value expected for this operation
 **/
exports.publicMinersStatsMinerGET = function(miner) {
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


/**
 * Public stats
 * This endpoint is used to get public stats.
 *
 * no response value expected for this operation
 **/
exports.publicStatsGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

