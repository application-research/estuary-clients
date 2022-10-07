'use strict';


/**
 * Add new content
 * This endpoint is used to upload new content.
 *
 * file File File to upload
 * coluuid String Collection UUID
 * dir String Directory
 * returns util.ContentAddResponse
 **/
exports.contentAddPOST = function(file,coluuid,dir) {
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
 * Add Car object
 * This endpoint is used to add a car object to the network. The object can be a file or a directory.
 *
 * body String Car
 * filename String Filename (optional)
 * commp String Commp (optional)
 * size String Size (optional)
 * no response value expected for this operation
 **/
exports.contentAdd_carPOST = function(body,filename,commp,size) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Add IPFS object
 * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
 *
 * body Util.ContentAddIpfsBody IPFS Body
 * no response value expected for this operation
 **/
exports.contentAdd_ipfsPOST = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get aggregated content stats
 * This endpoint returns aggregated content stats
 *
 * content String Content ID
 * returns String
 **/
exports.contentAggregatedContentGET = function(content) {
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
 * Get all deals for a user
 * This endpoint is used to get all deals for a user
 *
 * begin String Begin
 * duration String Duration
 * all String All
 * no response value expected for this operation
 **/
exports.contentAll_dealsGET = function(begin,duration,all) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get content bandwidth
 * This endpoint returns content bandwidth
 *
 * content String Content ID
 * no response value expected for this operation
 **/
exports.contentBw_usageContentGET = function(content) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Add a new content
 * This endpoint adds a new content
 *
 * body String Content
 * no response value expected for this operation
 **/
exports.contentCreatePOST = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Content with deals
 * This endpoint lists all content with deals
 *
 * limit Integer Limit (optional)
 * offset Integer Offset (optional)
 * no response value expected for this operation
 **/
exports.contentDealsGET = function(limit,offset) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Ensure Replication
 * This endpoint ensures that the content is replicated to the specified number of providers
 *
 * datacid String Data CID
 * no response value expected for this operation
 **/
exports.contentEnsure_replicationDatacidGET = function(datacid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * List all failures for a content
 * This endpoint returns all failures for a content
 *
 * content String Content ID
 * returns String
 **/
exports.contentFailuresContentGET = function(content) {
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
 * Import a deal
 * This endpoint imports a deal into the shuttle.
 *
 * body Main.importDealBody Import a deal
 * no response value expected for this operation
 **/
exports.contentImportdealPOST = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * List all pinned content
 * This endpoint lists all content
 *
 * returns List
 **/
exports.contentListGET = function() {
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
 * Read content
 * This endpoint reads content from the blockstore
 *
 * cont String CID
 * no response value expected for this operation
 **/
exports.contentReadContGET = function(cont) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get staging zone for user
 * This endpoint is used to get staging zone for user.
 *
 * no response value expected for this operation
 **/
exports.contentStaging_zonesGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get content statistics
 * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
 *
 * limit String limit
 * no response value expected for this operation
 **/
exports.contentStatsGET = function(limit) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Content Status
 * This endpoint returns the status of a content
 *
 * id Integer Content ID
 * no response value expected for this operation
 **/
exports.contentStatusIdGET = function(id) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

