'use strict';

var utils = require('../utils/writer.js');
var Miner = require('../service/MinerService');

module.exports.publicMinersDealsMinerGET = function publicMinersDealsMinerGET (req, res, next) {
  var miner = req.swagger.params['miner'].value;
  Miner.publicMinersDealsMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersStatsMinerGET = function publicMinersStatsMinerGET (req, res, next) {
  var miner = req.swagger.params['miner'].value;
  Miner.publicMinersStatsMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
