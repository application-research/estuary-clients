'use strict';

var utils = require('../utils/writer.js');
var Collections = require('../service/CollectionsService');

module.exports.collectionsColuuidCommitPOST = function collectionsColuuidCommitPOST (req, res, next) {
  var coluuid = req.swagger.params['coluuid'].value;
  Collections.collectionsColuuidCommitPOST(coluuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsColuuidDELETE = function collectionsColuuidDELETE (req, res, next) {
  var coluuid = req.swagger.params['coluuid'].value;
  Collections.collectionsColuuidDELETE(coluuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsColuuidGET = function collectionsColuuidGET (req, res, next) {
  var coluuid = req.swagger.params['coluuid'].value;
  var dir = req.swagger.params['dir'].value;
  Collections.collectionsColuuidGET(coluuid,dir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsColuuidPOST = function collectionsColuuidPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  Collections.collectionsColuuidPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsFsAddPOST = function collectionsFsAddPOST (req, res, next) {
  var coluuid = req.swagger.params['coluuid'].value;
  var content = req.swagger.params['content'].value;
  var path = req.swagger.params['path'].value;
  Collections.collectionsFsAddPOST(coluuid,content,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsGET = function collectionsGET (req, res, next) {
  var id = req.swagger.params['id'].value;
  Collections.collectionsGET(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsPOST = function collectionsPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  Collections.collectionsPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
