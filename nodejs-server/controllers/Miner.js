'use strict';

var utils = require('../utils/writer.js');
var Miner = require('../service/MinerService');

module.exports.minerClaimMinerGET = function minerClaimMinerGET (req, res, next, miner) {
  Miner.minerClaimMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.minerClaimPOST = function minerClaimPOST (req, res, next, body) {
  Miner.minerClaimPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.minerSet_infoMinerPUT = function minerSet_infoMinerPUT (req, res, next, body, miner) {
  Miner.minerSet_infoMinerPUT(body, miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.minerSuspendMinerPOST = function minerSuspendMinerPOST (req, res, next, body, miner) {
  Miner.minerSuspendMinerPOST(body, miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.minerUnsuspendMinerPUT = function minerUnsuspendMinerPUT (req, res, next, miner) {
  Miner.minerUnsuspendMinerPUT(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersDealsMinerGET = function publicMinersDealsMinerGET (req, res, next, miner, ignoreFailed) {
  Miner.publicMinersDealsMinerGET(miner, ignoreFailed)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersStatsMinerGET = function publicMinersStatsMinerGET (req, res, next, miner) {
  Miner.publicMinersStatsMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
