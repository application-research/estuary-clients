'use strict';


/**
 * Create an Estuary invite
 * This endpoint is used to create an estuary invite.
 *
 * code String Invite code to be created
 * returns String
 **/
exports.adminInvitesCodePOST = function(code) {
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
 * Get Estuary invites
 * This endpoint is used to list all estuary invites.
 *
 * returns String
 **/
exports.adminInvitesGET = function() {
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
 * Upload a file
 * This endpoint uploads a file.
 *
 * returns String
 **/
exports.contentAddPOST = function() {
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
 * Upload content via a car file
 * This endpoint uploads content via a car file
 *
 * returns String
 **/
exports.contentAdd_carPOST = function() {
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
 * body Types.IpfsPin IPFS Body
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
 * Get staging zone for user, excluding its contents
 * This endpoint is used to get staging zone for user, excluding its contents.
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
 * Get contents for a staging zone
 * This endpoint is used to get the contents for a staging zone
 *
 * staging_zone Integer Staging Zone Content ID
 * limit String limit
 * offset String offset
 * returns String
 **/
exports.contentStaging_zonesStaging_zoneContentsGET = function(staging_zone,limit,offset) {
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
 * Get staging zone without its contents field populated
 * This endpoint is used to get a staging zone, excluding its contents.
 *
 * staging_zone Integer Staging Zone Content ID
 * returns String
 **/
exports.contentStaging_zonesStaging_zoneGET = function(staging_zone) {
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
 * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
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

