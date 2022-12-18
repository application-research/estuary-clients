'use strict';

var utils = require('../utils/writer.js');
var Content = require('../service/ContentService');

module.exports.adminInvitesCodePOST = function adminInvitesCodePOST (req, res, next, code) {
  Content.adminInvitesCodePOST(code)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminInvitesGET = function adminInvitesGET (req, res, next) {
  Content.adminInvitesGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAddPOST = function contentAddPOST (req, res, next, coluuid, replication, ignoreDupes, lazyProvide, dir) {
  Content.contentAddPOST(coluuid, replication, ignoreDupes, lazyProvide, dir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAdd_carPOST = function contentAdd_carPOST (req, res, next, body, ignoreDupes, filename) {
  Content.contentAdd_carPOST(body, ignoreDupes, filename)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAdd_ipfsPOST = function contentAdd_ipfsPOST (req, res, next, body, ignoreDupes) {
  Content.contentAdd_ipfsPOST(body, ignoreDupes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAggregatedContentGET = function contentAggregatedContentGET (req, res, next, content) {
  Content.contentAggregatedContentGET(content)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAll_dealsGET = function contentAll_dealsGET (req, res, next, begin, duration, all) {
  Content.contentAll_dealsGET(begin, duration, all)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentBw_usageContentGET = function contentBw_usageContentGET (req, res, next, content) {
  Content.contentBw_usageContentGET(content)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentContentsGET = function contentContentsGET (req, res, next, limit, offset) {
  Content.contentContentsGET(limit, offset)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentCreatePOST = function contentCreatePOST (req, res, next, body, ignoreDupes) {
  Content.contentCreatePOST(body, ignoreDupes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentDealsGET = function contentDealsGET (req, res, next, limit, offset) {
  Content.contentDealsGET(limit, offset)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentEnsure_replicationDatacidGET = function contentEnsure_replicationDatacidGET (req, res, next, datacid) {
  Content.contentEnsure_replicationDatacidGET(datacid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentFailuresContentGET = function contentFailuresContentGET (req, res, next, content) {
  Content.contentFailuresContentGET(content)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentIdGET = function contentIdGET (req, res, next, id) {
  Content.contentIdGET(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentListGET = function contentListGET (req, res, next) {
  Content.contentListGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStaging_zonesGET = function contentStaging_zonesGET (req, res, next) {
  Content.contentStaging_zonesGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStaging_zonesStaging_zoneContentsGET = function contentStaging_zonesStaging_zoneContentsGET (req, res, next, staging_zone, limit, offset) {
  Content.contentStaging_zonesStaging_zoneContentsGET(staging_zone, limit, offset)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStaging_zonesStaging_zoneGET = function contentStaging_zonesStaging_zoneGET (req, res, next, staging_zone) {
  Content.contentStaging_zonesStaging_zoneGET(staging_zone)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStatsGET = function contentStatsGET (req, res, next, limit, offset) {
  Content.contentStatsGET(limit, offset)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStatusIdGET = function contentStatusIdGET (req, res, next, id) {
  Content.contentStatusIdGET(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
