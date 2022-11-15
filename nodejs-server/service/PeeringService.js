'use strict';


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
 * returns String
 **/
exports.adminPeeringPeersPOST = function() {
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

