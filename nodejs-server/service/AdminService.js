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
 * Remove peers on Peering Service
 * This endpoint can be used to remove a Peer from the Peering Service
 *
 * body List Peer ids
 * returns String
 **/
exports.adminPeeringPeersDELETE = function(body) {
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
 * List all Peering peers
 * This endpoint can be used to list all peers on Peering Service
 *
 * returns String
 **/
exports.adminPeeringPeersGET = function() {
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
 * Add peers on Peering Service
 * This endpoint can be used to add a Peer from the Peering Service
 *
 * body List Peering Peer array
 * returns String
 **/
exports.adminPeeringPeersPOST = function(body) {
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
 * Start Peering
 * This endpoint can be used to start the Peering Service
 *
 * returns String
 **/
exports.adminPeeringStartPOST = function() {
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
 * Check Peering Status
 * This endpoint can be used to check the Peering status
 *
 * returns String
 **/
exports.adminPeeringStatusGET = function() {
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
 * Stop Peering
 * This endpoint can be used to stop the Peering Service
 *
 * returns String
 **/
exports.adminPeeringStopPOST = function() {
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
 * Get systems(estuary/shuttle) config
 * This endpoint is used to get system configs.
 *
 * returns String
 **/
exports.adminSystemConfigGET = function() {
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
 * Get all users
 * This endpoint is used to get all users.
 *
 * returns String
 **/
exports.adminUsersGET = function() {
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

