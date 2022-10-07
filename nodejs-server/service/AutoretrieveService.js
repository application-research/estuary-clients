'use strict';


/**
 * Register autoretrieve server
 * This endpoint registers a new autoretrieve server
 *
 * addresses String Autoretrieve's comma-separated list of addresses
 * pubKey String Autoretrieve's public key
 * no response value expected for this operation
 **/
exports.adminAutoretrieveInitPOST = function(addresses,pubKey) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * List autoretrieve servers
 * This endpoint lists all registered autoretrieve servers
 *
 * no response value expected for this operation
 **/
exports.adminAutoretrieveListGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Marks autoretrieve server as up
 * This endpoint updates the lastConnection field for autoretrieve
 *
 * token String Autoretrieve's auth token
 * no response value expected for this operation
 **/
exports.autoretrieveHeartbeatPOST = function(token) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

