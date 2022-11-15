'use strict';

var utils = require('../utils/writer.js');
var Collections = require('../service/CollectionsService');

module.exports.collectionsColuuidCommitPOST = function collectionsColuuidCommitPOST (req, res, next, coluuid) {
  Collections.collectionsColuuidCommitPOST(coluuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsColuuidContentsDELETE = function collectionsColuuidContentsDELETE (req, res, next, body, coluuid, contentid) {
  Collections.collectionsColuuidContentsDELETE(body, coluuid, contentid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsColuuidDELETE = function collectionsColuuidDELETE (req, res, next, coluuid) {
  Collections.collectionsColuuidDELETE(coluuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsColuuidGET = function collectionsColuuidGET (req, res, next, coluuid, dir) {
  Collections.collectionsColuuidGET(coluuid, dir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsColuuidPOST = function collectionsColuuidPOST (req, res, next, body, coluuid) {
  Collections.collectionsColuuidPOST(body, coluuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsFsAddPOST = function collectionsFsAddPOST (req, res, next, coluuid, content, path) {
  Collections.collectionsFsAddPOST(coluuid, content, path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsGET = function collectionsGET (req, res, next) {
  Collections.collectionsGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.collectionsPOST = function collectionsPOST (req, res, next, body) {
  Collections.collectionsPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
