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
 * Add new content
 * This endpoint is used to upload new content.
 *
 * coluuid String Collection UUID (optional)
 * replication Integer Replication value (optional)
 * ignoreDupes String Ignore Dupes true/false (optional)
 * overwrite String Overwrite files with the same path on same collection (optional)
 * lazyProvide String Lazy Provide true/false (optional)
 * dir String Directory (optional)
 * returns util.ContentAddResponse
 **/
exports.contentAddPOST = function(coluuid,replication,ignoreDupes,overwrite,lazyProvide,dir) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "retrieval_url" : "retrieval_url",
  "estuaryId" : 0,
  "estuary_retrieval_url" : "estuary_retrieval_url",
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
 * returns util.ContentAddResponse
 **/
exports.contentAdd_carPOST = function(body,ignoreDupes,filename) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "retrieval_url" : "retrieval_url",
  "estuaryId" : 0,
  "estuary_retrieval_url" : "estuary_retrieval_url",
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
 * Add IPFS object
 * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
 *
 * body Pinner.IpfsPin IPFS Body
 * ignoreDupes String Ignore Dupes (optional)
 * overwrite String Overwrite conflicting files in collections (optional)
 * returns String
 **/
exports.contentAdd_ipfsPOST = function(body,ignoreDupes,overwrite) {
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
 * Get user contents
 * This endpoint is used to get user contents
 *
 * limit String limit
 * offset String offset
 * returns String
 **/
exports.contentContentsGET = function(limit,offset) {
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

