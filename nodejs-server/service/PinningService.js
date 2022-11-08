'use strict';


/**
 * List all pin status objects
 * This endpoint lists all pin status objects
 *
 * returns String
 **/
exports.pinningPinsGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "bytes": [],
  "empty": true
};
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
 * returns String
 **/
exports.pinningPinsPOST = function(pin) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "bytes": [],
  "empty": true
};
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
 * returns String
 **/
exports.pinningPinsPinidDELETE = function(pinid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "bytes": [],
  "empty": true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a pin status object
 * This endpoint returns a pin status object.
 *
 * pinid String cid
 * returns String
 **/
exports.pinningPinsPinidGET = function(pinid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "bytes": [],
  "empty": true
};
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
 * returns String
 **/
exports.pinningPinsPinidPOST = function(pinid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "bytes": [],
  "empty": true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

