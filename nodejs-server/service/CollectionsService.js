'use strict';


/**
 * Produce a CID of the collection contents
 * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
 *
 * coluuid String coluuid
 * returns String
 **/
exports.collectionsColuuidCommitPOST = function(coluuid) {
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
 * Deletes a content from a collection
 * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
 *
 * body Api.deleteContentFromCollectionBody Variable to use when filtering for files (must be either 'path' or 'content_id')
 * coluuid String Collection ID
 * returns String
 **/
exports.collectionsColuuidContentsDELETE = function(body,coluuid) {
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
 * Deletes a collection
 * This endpoint is used to delete an existing collection.
 *
 * coluuid String Collection ID
 * returns String
 **/
exports.collectionsColuuidDELETE = function(coluuid) {
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
 * Get contents in a collection
 * This endpoint is used to get contents in a collection. If no colpath query param is passed
 *
 * coluuid String coluuid
 * dir String Directory (optional)
 * returns List
 **/
exports.collectionsColuuidGET = function(coluuid,dir) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "coluuid" : "coluuid",
  "contId" : 0,
  "size" : 6,
  "name" : "name",
  "dir" : "dir",
  "type" : "directory",
  "cid" : {
    "cid" : { }
  },
  "updatedAt" : "updatedAt"
}, {
  "coluuid" : "coluuid",
  "contId" : 0,
  "size" : 6,
  "name" : "name",
  "dir" : "dir",
  "type" : "directory",
  "cid" : {
    "cid" : { }
  },
  "updatedAt" : "updatedAt"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Add contents to a collection
 * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
 *
 * body List Content IDs to add to collection
 * dir String Directory (optional)
 * overwrite String Overwrite conflicting files (optional)
 * coluuid String Collection UUID
 * returns String
 **/
exports.collectionsColuuidPOST = function(body,dir,overwrite,coluuid) {
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
 * Add a file to a collection
 * This endpoint adds a file to a collection
 *
 * coluuid String Collection ID
 * content String Content
 * dir String Directory inside collection (optional)
 * overwrite String Overwrite file if already exists in path (optional)
 * returns String
 **/
exports.collectionsFsAddPOST = function(coluuid,content,dir,overwrite) {
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
 * List all collections
 * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
 *
 * returns List
 **/
exports.collectionsGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "createdAt" : "createdAt",
  "name" : "name",
  "description" : "description",
  "userId" : 0,
  "uuid" : "uuid",
  "cid" : "cid"
}, {
  "createdAt" : "createdAt",
  "name" : "name",
  "description" : "description",
  "userId" : 0,
  "uuid" : "uuid",
  "cid" : "cid"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Create a new collection
 * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
 *
 * body Api.createCollectionBody Collection name and description
 * returns collections.Collection
 **/
exports.collectionsPOST = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "createdAt" : "createdAt",
  "name" : "name",
  "description" : "description",
  "userId" : 0,
  "uuid" : "uuid",
  "cid" : "cid"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

