'use strict';

var utils = require('../utils/writer.js');
var Metrics = require('../service/MetricsService');

module.exports.publicMetricsDeals_on_chainGET = function publicMetricsDeals_on_chainGET (req, res, next) {
  Metrics.publicMetricsDeals_on_chainGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
