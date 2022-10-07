'use strict';


/**
 * List all pin status objects
 * This endpoint lists all pin status objects
 *
 * no response value expected for this operation
 **/
exports.pinningPinsGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Add and pin object
 * This endpoint adds a pin to the IPFS daemon.
 *
 * cid String cid
 * name String name
 * no response value expected for this operation
 **/
exports.pinningPinsPOST = function(cid,name) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Delete a pinned object
 * This endpoint deletes a pinned object.
 *
 * pinid String Pin ID
 * no response value expected for this operation
 **/
exports.pinningPinsPinidDELETE = function(pinid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get a pin status object
 * This endpoint returns a pin status object.
 *
 * pinid String cid
 * no response value expected for this operation
 **/
exports.pinningPinsPinidGET = function(pinid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Replace a pinned object
 * This endpoint replaces a pinned object.
 *
 * pinid String Pin ID
 * no response value expected for this operation
 **/
exports.pinningPinsPinidPOST = function(pinid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

