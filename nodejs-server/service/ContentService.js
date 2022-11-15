'use strict';


/**
 * Add new content
 * This endpoint is used to upload new content.
 *
 * coluuid String Collection UUID (optional)
 * replication Integer Replication value (optional)
 * ignoreDupes String Ignore Dupes true/false (optional)
 * lazyProvide String Lazy Provide true/false (optional)
 * dir String Directory (optional)
 * returns util.ContentAddResponse
 **/
exports.contentAddPOST = function(coluuid,replication,ignoreDupes,lazyProvide,dir) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "retrieval_url" : "retrieval_url",
  "estuaryId" : 0,
  "providers" : [ "providers", "providers" ],
  "cid" : "cid"
};
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
 * ignoreDupes String Ignore Dupes (optional)
 * filename String Filename (optional)
 * returns String
 **/
exports.contentAdd_carPOST = function(body,ignoreDupes,filename) {
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
 * Add IPFS object
 * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
 *
 * body Util.ContentAddIpfsBody IPFS Body
 * ignoreDupes String Ignore Dupes (optional)
 * returns String
 **/
exports.contentAdd_ipfsPOST = function(body,ignoreDupes) {
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
 * Get aggregated content stats
 * This endpoint returns aggregated content stats
 *
 * content String Content ID
 * returns String
 **/
exports.contentAggregatedContentGET = function(content) {
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
 * Get all deals for a user
 * This endpoint is used to get all deals for a user
 *
 * begin String Begin
 * duration String Duration
 * all String All
 * returns String
 **/
exports.contentAll_dealsGET = function(begin,duration,all) {
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
 * Get content bandwidth
 * This endpoint returns content bandwidth
 *
 * content String Content ID
 * returns String
 **/
exports.contentBw_usageContentGET = function(content) {
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
 * Add a new content
 * This endpoint adds a new content
 *
 * body Util.ContentCreateBody Content
 * ignoreDupes String Ignore Dupes (optional)
 * returns String
 **/
exports.contentCreatePOST = function(body,ignoreDupes) {
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
 * Content with deals
 * This endpoint lists all content with deals
 *
 * limit Integer Limit (optional)
 * offset Integer Offset (optional)
 * returns String
 **/
exports.contentDealsGET = function(limit,offset) {
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
 * Ensure Replication
 * This endpoint ensures that the content is replicated to the specified number of providers
 *
 * datacid String Data CID
 * returns String
 **/
exports.contentEnsure_replicationDatacidGET = function(datacid) {
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
 * List all failures for a content
 * This endpoint returns all failures for a content
 *
 * content String Content ID
 * returns String
 **/
exports.contentFailuresContentGET = function(content) {
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
 * Content
 * This endpoint returns a content by its ID
 *
 * id Integer Content ID
 * returns String
 **/
exports.contentIdGET = function(id) {
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
 * Import a deal
 * This endpoint imports a deal into the shuttle.
 *
 * body Main.importDealBody Import a deal
 * returns String
 **/
exports.contentImportdealPOST = function(body) {
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
 * List all pinned content
 * This endpoint lists all content
 *
 * returns String
 **/
exports.contentListGET = function() {
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
 * Read content
 * This endpoint reads content from the blockstore
 *
 * cont String CID
 * returns String
 **/
exports.contentReadContGET = function(cont) {
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
 * Get staging zone for user
 * This endpoint is used to get staging zone for user.
 *
 * returns String
 **/
exports.contentStaging_zonesGET = function() {
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
 * Get content statistics
 * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
 *
 * limit String limit
 * offset String offset
 * returns String
 **/
exports.contentStatsGET = function(limit,offset) {
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
 * Content Status
 * This endpoint returns the status of a content
 *
 * id Integer Content ID
 * returns String
 **/
exports.contentStatusIdGET = function(id) {
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

