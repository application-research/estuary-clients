part of swagger.api;

class TypesIpfsListPinStatusResponse {
  
  int count = null;

  List<TypesIpfsPinStatusResponse> results = [];

  TypesIpfsListPinStatusResponse();

  @override
  String toString() {
    return 'TypesIpfsListPinStatusResponse[count=$count, results=$results, ]';
  }

  TypesIpfsListPinStatusResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    count = json['count'];
    results = TypesIpfsPinStatusResponse.listFromJson(json['results']);
  }

  Map<String, dynamic> toJson() {
    return {
      'count': count,
      'results': results
     };
  }

  static List<TypesIpfsListPinStatusResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<TypesIpfsListPinStatusResponse>() : json.map((value) => new TypesIpfsListPinStatusResponse.fromJson(value)).toList();
  }

  static Map<String, TypesIpfsListPinStatusResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, TypesIpfsListPinStatusResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new TypesIpfsListPinStatusResponse.fromJson(value));
    }
    return map;
  }
}
