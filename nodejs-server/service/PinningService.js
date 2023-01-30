'use strict';


/**
 * List all pin status objects
 * This endpoint lists all pin status objects
 *
 * returns pinner.IpfsListPinStatusResponse
 **/
exports.pinningPinsGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "count" : 0,
  "results" : [ {
    "pin" : {
      "meta" : "",
      "name" : "name",
      "origins" : [ "origins", "origins" ],
      "cid" : "cid"
    },
    "created" : "created",
    "requestid" : "requestid",
    "delegates" : [ "delegates", "delegates" ],
    "content" : {
      "aggregatedIn" : 6,
      "offloaded" : true,
      "replication" : 5,
      "pinning" : true,
      "pinMeta" : "pinMeta",
      "replace" : true,
      "active" : true,
      "description" : "description",
      "dagSplit" : true,
      "dealStatus" : "dealStatus",
      "failed" : true,
      "type" : 7,
      "userId" : 9,
      "aggregate" : true,
      "createdAt" : "createdAt",
      "pinningStatus" : "pinningStatus",
      "size" : 5,
      "splitFrom" : 2,
      "name" : "name",
      "origins" : "origins",
      "location" : "location",
      "id" : 1,
      "cid" : {
        "cid" : { }
      },
      "updatedAt" : "updatedAt"
    },
    "info" : "",
    "status" : "pinning"
  }, {
    "pin" : {
      "meta" : "",
      "name" : "name",
      "origins" : [ "origins", "origins" ],
      "cid" : "cid"
    },
    "created" : "created",
    "requestid" : "requestid",
    "delegates" : [ "delegates", "delegates" ],
    "content" : {
      "aggregatedIn" : 6,
      "offloaded" : true,
      "replication" : 5,
      "pinning" : true,
      "pinMeta" : "pinMeta",
      "replace" : true,
      "active" : true,
      "description" : "description",
      "dagSplit" : true,
      "dealStatus" : "dealStatus",
      "failed" : true,
      "type" : 7,
      "userId" : 9,
      "aggregate" : true,
      "createdAt" : "createdAt",
      "pinningStatus" : "pinningStatus",
      "size" : 5,
      "splitFrom" : 2,
      "name" : "name",
      "origins" : "origins",
      "location" : "location",
      "id" : 1,
      "cid" : {
        "cid" : { }
      },
      "updatedAt" : "updatedAt"
    },
    "info" : "",
    "status" : "pinning"
  } ]
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
 * body Pinner.IpfsPin Pin Body {cid:cid, name:name}
 * ignoreDupes String Ignore Dupes (optional)
 * overwrite String Overwrite conflicting files in collections (optional)
 * returns pinner.IpfsPinStatusResponse
 **/
exports.pinningPinsPOST = function(body,ignoreDupes,overwrite) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
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
 * returns pinner.IpfsPinStatusResponse
 **/
exports.pinningPinsPinidGET = function(pinid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
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
 * body Pinner.IpfsPin New pin
 * pinid String Pin ID to be replaced
 * returns pinner.IpfsPinStatusResponse
 **/
exports.pinningPinsPinidPOST = function(body,pinid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

