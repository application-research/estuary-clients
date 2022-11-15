'use strict';

var utils = require('../utils/writer.js');
var Net = require('../service/NetService');

module.exports.netAddrsGET = function netAddrsGET (req, res, next) {
  Net.netAddrsGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersFailuresMinerGET = function publicMinersFailuresMinerGET (req, res, next, miner) {
  Net.publicMinersFailuresMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersGET = function publicMinersGET (req, res, next) {
  Net.publicMinersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicNetAddrsGET = function publicNetAddrsGET (req, res, next) {
  Net.publicNetAddrsGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicNetPeersGET = function publicNetPeersGET (req, res, next) {
  Net.publicNetPeersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
