'use strict';


/**
 * Fetch viewer details
 * This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.
 *
 * returns util.ViewerResponse
 **/
exports.viewerGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "settings" : {
    "dealDuration" : 1,
    "replication" : 2,
    "dealMakingDisabled" : true,
    "flags" : 5,
    "verified" : true,
    "fileStagingThreshold" : 5,
    "uploadEndpoints" : [ "uploadEndpoints", "uploadEndpoints" ],
    "contentAddingDisabled" : true
  },
  "address" : "address",
  "auth_expiry" : "auth_expiry",
  "perms" : 6,
  "id" : 0,
  "miners" : [ "miners", "miners" ],
  "username" : "username"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

