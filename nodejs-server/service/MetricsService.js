'use strict';


/**
 * Get deal metrics
 * This endpoint is used to get deal metrics
 *
 * returns String
 **/
exports.publicMetricsDeals_on_chainGET = function() {
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

