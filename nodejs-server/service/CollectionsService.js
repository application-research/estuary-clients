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
 * Deletes a content from a collection
 * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
 *
 * coluuid String Collection ID
 * contentid String Content ID
 * body Main.deleteContentFromCollectionBody Variable to use when filtering for files (must be either 'path' or 'content_id')
 * returns String
 **/
exports.collectionsColuuidContentsDELETE = function(coluuid,contentid,body) {
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
 * Deletes a collection
 * This endpoint is used to delete an existing collection.
 *
 * coluuid String Collection ID
 * returns String
 **/
exports.collectionsColuuidDELETE = function(coluuid) {
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
 * Get contents in a collection
 * This endpoint is used to get contents in a collection. If no colpath query param is passed
 *
 * coluuid String coluuid
 * dir String Directory (optional)
 * returns String
 **/
exports.collectionsColuuidGET = function(coluuid,dir) {
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
 * Add contents to a collection
 * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
 *
 * coluuid String coluuid
 * contentIDs List Content IDs to add to collection
 * returns String
 **/
exports.collectionsColuuidPOST = function(coluuid,contentIDs) {
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
 * Add a file to a collection
 * This endpoint adds a file to a collection
 *
 * coluuid String Collection ID
 * content String Content
 * path String Path to file
 * returns String
 **/
exports.collectionsFsAddPOST = function(coluuid,content,path) {
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
 * List all collections
 * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
 *
 * returns List
 **/
exports.collectionsGET = function() {
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
 * Create a new collection
 * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
 *
 * body Main.createCollectionBody Collection name and description
 * returns collections.Collection
 **/
exports.collectionsPOST = function(body) {
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

