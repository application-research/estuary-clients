part of swagger.api;

class TypesIpfsPinStatusResponse {
  
  String created = null;
  

  List<String> delegates = [];
  

  Object info = null;
  

  TypesIpfsPin pin = null;
  

  String requestid = null;
  

  String status = null;
  
  TypesIpfsPinStatusResponse();

  @override
  String toString() {
    return 'TypesIpfsPinStatusResponse[created=$created, delegates=$delegates, info=$info, pin=$pin, requestid=$requestid, status=$status, ]';
  }

  TypesIpfsPinStatusResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    created =
        json['created']
    ;
    delegates =
        (json['delegates'] as List).map((item) => item as String).toList()
    ;
    info =
      
      
      new Object.fromJson(json['info'])
;
    pin =
      
      
      new TypesIpfsPin.fromJson(json['pin'])
;
    requestid =
        json['requestid']
    ;
    status =
        json['status']
    ;
  }

  Map<String, dynamic> toJson() {
    return {
      'created': created,
      'delegates': delegates,
      'info': info,
      'pin': pin,
      'requestid': requestid,
      'status': status
     };
  }

  static List<TypesIpfsPinStatusResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<TypesIpfsPinStatusResponse>() : json.map((value) => new TypesIpfsPinStatusResponse.fromJson(value)).toList();
  }

  static Map<String, TypesIpfsPinStatusResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, TypesIpfsPinStatusResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new TypesIpfsPinStatusResponse.fromJson(value));
    }
    return map;
  }
}

