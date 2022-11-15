'use strict';


/**
 * Register autoretrieve server
 * This endpoint registers a new autoretrieve server
 *
 * returns String
 **/
exports.adminAutoretrieveInitPOST = function() {
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
 * List autoretrieve servers
 * This endpoint lists all registered autoretrieve servers
 *
 * returns String
 **/
exports.adminAutoretrieveListGET = function() {
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
 * Marks autoretrieve server as up
 * This endpoint updates the lastConnection field for autoretrieve
 *
 * token String Autoretrieve's auth token
 * returns String
 **/
exports.autoretrieveHeartbeatPOST = function(token) {
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

