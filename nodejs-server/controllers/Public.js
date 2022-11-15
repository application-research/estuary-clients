'use strict';

var utils = require('../utils/writer.js');
var Public = require('../service/PublicService');

module.exports.publicBy_cidCidGET = function publicBy_cidCidGET (req, res, next, cid) {
  Public.publicBy_cidCidGET(cid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicInfoGET = function publicInfoGET (req, res, next) {
  Public.publicInfoGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMetricsDeals_on_chainGET = function publicMetricsDeals_on_chainGET (req, res, next) {
  Public.publicMetricsDeals_on_chainGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersDealsMinerGET = function publicMinersDealsMinerGET (req, res, next, miner, ignoreFailed) {
  Public.publicMinersDealsMinerGET(miner, ignoreFailed)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersFailuresMinerGET = function publicMinersFailuresMinerGET (req, res, next, miner) {
  Public.publicMinersFailuresMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersGET = function publicMinersGET (req, res, next) {
  Public.publicMinersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersStatsMinerGET = function publicMinersStatsMinerGET (req, res, next, miner) {
  Public.publicMinersStatsMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicNetAddrsGET = function publicNetAddrsGET (req, res, next) {
  Public.publicNetAddrsGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicNetPeersGET = function publicNetPeersGET (req, res, next) {
  Public.publicNetPeersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicStatsGET = function publicStatsGET (req, res, next) {
  Public.publicStatsGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
