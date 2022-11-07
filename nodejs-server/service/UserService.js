'use strict';


/**
 * Get API keys for a user
 * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
 *
 * returns List
 **/
exports.userApi_keysGET = function() {
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
 * Revoke a User API Key.
 * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
 *
 * key String Key
 * returns String
 **/
exports.userApi_keysKeyDELETE = function(key) {
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
 * Create API keys for a user
 * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
 *
 * expiry String Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h (optional)
 * perms String Permissions -- currently unused (optional)
 * returns main.getApiKeysResp
 **/
exports.userApi_keysPOST = function(expiry,perms) {
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
 * Export user data
 * This endpoint is used to get API keys for a user.
 *
 * returns String
 **/
exports.userExportGET = function() {
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
 * Create API keys for a user
 * This endpoint is used to create API keys for a user.
 *
 * returns String
 **/
exports.userStatsGET = function() {
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

