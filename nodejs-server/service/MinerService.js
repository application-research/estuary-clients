'use strict';


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

