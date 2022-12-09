part of swagger.api;

class MinerClaimMinerBody {
  
  String claim = null;

  AddressAddress miner = null;

  String name = null;

  MinerClaimMinerBody();

  @override
  String toString() {
    return 'MinerClaimMinerBody[claim=$claim, miner=$miner, name=$name, ]';
  }

  MinerClaimMinerBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    claim = json['claim'];
    miner = new AddressAddress.fromJson(json['miner']);
    name = json['name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'claim': claim,
      'miner': miner,
      'name': name
     };
  }

  static List<MinerClaimMinerBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<MinerClaimMinerBody>() : json.map((value) => new MinerClaimMinerBody.fromJson(value)).toList();
  }

  static Map<String, MinerClaimMinerBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MinerClaimMinerBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MinerClaimMinerBody.fromJson(value));
    }
    return map;
  }
}
