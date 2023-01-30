part of swagger.api;

class PinnerIpfsListPinStatusResponse {
  
  int count = null;

  List<PinnerIpfsPinStatusResponse> results = [];

  PinnerIpfsListPinStatusResponse();

  @override
  String toString() {
    return 'PinnerIpfsListPinStatusResponse[count=$count, results=$results, ]';
  }

  PinnerIpfsListPinStatusResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    count = json['count'];
    results = PinnerIpfsPinStatusResponse.listFromJson(json['results']);
  }

  Map<String, dynamic> toJson() {
    return {
      'count': count,
      'results': results
     };
  }

  static List<PinnerIpfsListPinStatusResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<PinnerIpfsListPinStatusResponse>() : json.map((value) => new PinnerIpfsListPinStatusResponse.fromJson(value)).toList();
  }

  static Map<String, PinnerIpfsListPinStatusResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PinnerIpfsListPinStatusResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PinnerIpfsListPinStatusResponse.fromJson(value));
    }
    return map;
  }
}
