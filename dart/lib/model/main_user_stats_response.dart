part of swagger.api;

class MainUserStatsResponse {
  
  int numPins = null;
  

  int totalSize = null;
  
  MainUserStatsResponse();

  @override
  String toString() {
    return 'MainUserStatsResponse[numPins=$numPins, totalSize=$totalSize, ]';
  }

  MainUserStatsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    numPins =
        json['numPins']
    ;
    totalSize =
        json['totalSize']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'numPins': numPins,
      'totalSize': totalSize
     };
  }

  static List<MainUserStatsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainUserStatsResponse>() : json.map((value) => new MainUserStatsResponse.fromJson(value)).toList();
  }

  static Map<String, MainUserStatsResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainUserStatsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainUserStatsResponse.fromJson(value));
    }
    return map;
  }
}

