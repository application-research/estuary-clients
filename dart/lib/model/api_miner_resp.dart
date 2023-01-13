part of swagger.api;

class ApiMinerResp {
  
  AddressAddress addr = null;

  MinerMinerChainInfo chainInfo = null;

  String name = null;

  bool suspended = null;

  String suspendedReason = null;

  String version = null;

  ApiMinerResp();

  @override
  String toString() {
    return 'ApiMinerResp[addr=$addr, chainInfo=$chainInfo, name=$name, suspended=$suspended, suspendedReason=$suspendedReason, version=$version, ]';
  }

  ApiMinerResp.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    addr = new AddressAddress.fromJson(json['addr']);
    chainInfo = new MinerMinerChainInfo.fromJson(json['chain_info']);
    name = json['name'];
    suspended = json['suspended'];
    suspendedReason = json['suspendedReason'];
    version = json['version'];
  }

  Map<String, dynamic> toJson() {
    return {
      'addr': addr,
      'chain_info': chainInfo,
      'name': name,
      'suspended': suspended,
      'suspendedReason': suspendedReason,
      'version': version
     };
  }

  static List<ApiMinerResp> listFromJson(List<dynamic> json) {
    return json == null ? new List<ApiMinerResp>() : json.map((value) => new ApiMinerResp.fromJson(value)).toList();
  }

  static Map<String, ApiMinerResp> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, ApiMinerResp>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new ApiMinerResp.fromJson(value));
    }
    return map;
  }
}
