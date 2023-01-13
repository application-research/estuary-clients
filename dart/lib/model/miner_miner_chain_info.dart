part of swagger.api;

class MinerMinerChainInfo {
  
  List<String> addresses = [];

  String owner = null;

  String peerId = null;

  String worker = null;

  MinerMinerChainInfo();

  @override
  String toString() {
    return 'MinerMinerChainInfo[addresses=$addresses, owner=$owner, peerId=$peerId, worker=$worker, ]';
  }

  MinerMinerChainInfo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    addresses = (json['addresses'] as List).map((item) => item as String).toList();
    owner = json['owner'];
    peerId = json['peerId'];
    worker = json['worker'];
  }

  Map<String, dynamic> toJson() {
    return {
      'addresses': addresses,
      'owner': owner,
      'peerId': peerId,
      'worker': worker
     };
  }

  static List<MinerMinerChainInfo> listFromJson(List<dynamic> json) {
    return json == null ? new List<MinerMinerChainInfo>() : json.map((value) => new MinerMinerChainInfo.fromJson(value)).toList();
  }

  static Map<String, MinerMinerChainInfo> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MinerMinerChainInfo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MinerMinerChainInfo.fromJson(value));
    }
    return map;
  }
}
