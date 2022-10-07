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
 * Deletes a collection
 * This endpoint is used to delete an existing collection.
 *
 * coluuid String Collection ID
 * no response value expected for this operation
 **/
exports.collectionsColuuidDELETE = function(coluuid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get contents in a collection
 * This endpoint is used to get contents in a collection. If no colpath query param is passed
 *
 * coluuid String Collection UUID
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
 * body List Content IDs to add to collection
 * returns Map
 **/
exports.collectionsColuuidPOST = function(body) {
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
 * Add a file to a collection
 * This endpoint adds a file to a collection
 *
 * coluuid String Collection ID
 * content String Content
 * path String Path to file
 * no response value expected for this operation
 **/
exports.collectionsFsAddPOST = function(coluuid,content,path) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * List all collections
 * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
 *
 * id Integer User ID
 * returns List
 **/
exports.collectionsGET = function(id) {
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
 * returns main.Collection
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

