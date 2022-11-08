'use strict';


/**
 * List all pin status objects
 * This endpoint lists all pin status objects
 *
 * returns types.IpfsListPinStatusResponse
 **/
exports.pinningPinsGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Add and pin object
 * This endpoint adds a pin to the IPFS daemon.
 *
 * pin Types.IpfsPin Pin Body {cid:cid, name:name}
 * returns types.IpfsPinStatusResponse
 **/
exports.pinningPinsPOST = function(pin) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
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
 * returns types.IpfsPinStatusResponse
 **/
exports.pinningPinsPinidGET = function(pinid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Replace a pinned object
 * This endpoint replaces a pinned object.
 *
 * pinid String Pin ID
 * cid String CID of new pin
 * name String Name (filename) of new pin (optional)
 * origins String Origins of new pin (optional)
 * meta String Meta information of new pin (optional)
 * returns types.IpfsPinStatusResponse
 **/
exports.pinningPinsPinidPOST = function(pinid,cid,name,origins,meta) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

