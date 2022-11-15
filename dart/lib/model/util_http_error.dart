part of swagger.api;

class UtilHttpError {
  
  int code = null;

  String details = null;

  String reason = null;

  UtilHttpError();

  @override
  String toString() {
    return 'UtilHttpError[code=$code, details=$details, reason=$reason, ]';
  }

  UtilHttpError.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    code = json['code'];
    details = json['details'];
    reason = json['reason'];
  }

  Map<String, dynamic> toJson() {
    return {
      'code': code,
      'details': details,
      'reason': reason
     };
  }

  static List<UtilHttpError> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilHttpError>() : json.map((value) => new UtilHttpError.fromJson(value)).toList();
  }

  static Map<String, UtilHttpError> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilHttpError>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilHttpError.fromJson(value));
    }
    return map;
  }
}
