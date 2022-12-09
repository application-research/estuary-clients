'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.viewerGET = function viewerGET (req, res, next) {
  Default.viewerGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
