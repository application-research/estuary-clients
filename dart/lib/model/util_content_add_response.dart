part of swagger.api;

class UtilContentAddResponse {
  
  String cid = null;

  int estuaryId = null;

  String estuaryRetrievalUrl = null;

  List<String> providers = [];

  String retrievalUrl = null;

  UtilContentAddResponse();

  @override
  String toString() {
    return 'UtilContentAddResponse[cid=$cid, estuaryId=$estuaryId, estuaryRetrievalUrl=$estuaryRetrievalUrl, providers=$providers, retrievalUrl=$retrievalUrl, ]';
  }

  UtilContentAddResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    cid = json['cid'];
    estuaryId = json['estuaryId'];
    estuaryRetrievalUrl = json['estuary_retrieval_url'];
    providers = (json['providers'] as List).map((item) => item as String).toList();
    retrievalUrl = json['retrieval_url'];
  }

  Map<String, dynamic> toJson() {
    return {
      'cid': cid,
      'estuaryId': estuaryId,
      'estuary_retrieval_url': estuaryRetrievalUrl,
      'providers': providers,
      'retrieval_url': retrievalUrl
     };
  }

  static List<UtilContentAddResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilContentAddResponse>() : json.map((value) => new UtilContentAddResponse.fromJson(value)).toList();
  }

  static Map<String, UtilContentAddResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilContentAddResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilContentAddResponse.fromJson(value));
    }
    return map;
  }
}
