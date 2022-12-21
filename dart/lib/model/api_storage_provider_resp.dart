part of swagger.api;

class ApiStorageProviderResp {
  
  AddressAddress addr = null;

  String name = null;

  bool suspended = null;

  String suspendedReason = null;

  String version = null;

  ApiStorageProviderResp();

  @override
  String toString() {
    return 'ApiStorageProviderResp[addr=$addr, name=$name, suspended=$suspended, suspendedReason=$suspendedReason, version=$version, ]';
  }

  ApiStorageProviderResp.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    addr = new AddressAddress.fromJson(json['addr']);
    name = json['name'];
    suspended = json['suspended'];
    suspendedReason = json['suspendedReason'];
    version = json['version'];
  }

  Map<String, dynamic> toJson() {
    return {
      'addr': addr,
      'name': name,
      'suspended': suspended,
      'suspendedReason': suspendedReason,
      'version': version
     };
  }

  static List<ApiStorageProviderResp> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiStorageProviderResp>() : json.map((value) => new ApiStorageProviderResp.fromJson(value)).toList();
  }

  static Map<String, ApiStorageProviderResp> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiStorageProviderResp>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiStorageProviderResp.fromJson(value));
    }
    return map;
  }
}
