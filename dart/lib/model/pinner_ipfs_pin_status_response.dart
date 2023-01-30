part of swagger.api;

class PinnerIpfsPinStatusResponse {
  
  UtilContent content = null;

  String created = null;

  List<String> delegates = [];

  Map info = {};

  PinnerIpfsPin pin = null;

  String requestid = null;

  StatusPinningStatus status = null;

  PinnerIpfsPinStatusResponse();

  @override
  String toString() {
    return 'PinnerIpfsPinStatusResponse[content=$content, created=$created, delegates=$delegates, info=$info, pin=$pin, requestid=$requestid, status=$status, ]';
  }

  PinnerIpfsPinStatusResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    content = new UtilContent.fromJson(json['content']);
    created = json['created'];
    delegates = (json['delegates'] as List).map((item) => item as String).toList();
    info = Object.mapFromJson(json['info']);
    pin = new PinnerIpfsPin.fromJson(json['pin']);
    requestid = json['requestid'];
    status = new StatusPinningStatus.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'content': content,
      'created': created,
      'delegates': delegates,
      'info': info,
      'pin': pin,
      'requestid': requestid,
      'status': status
     };
  }

  static List<PinnerIpfsPinStatusResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<PinnerIpfsPinStatusResponse>() : json.map((value) => new PinnerIpfsPinStatusResponse.fromJson(value)).toList();
  }

  static Map<String, PinnerIpfsPinStatusResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PinnerIpfsPinStatusResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PinnerIpfsPinStatusResponse.fromJson(value));
    }
    return map;
  }
}
