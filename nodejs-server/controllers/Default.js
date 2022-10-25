'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.dealTransferStatusPOST = function dealTransferStatusPOST (req, res, next) {
  Default.dealTransferStatusPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
