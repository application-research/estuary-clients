part of swagger.api;

class PeeringPeeringPeer {
  
  List<String> addrs = [];

  bool connected = null;

  String ID = null;

  PeeringPeeringPeer();

  @override
  String toString() {
    return 'PeeringPeeringPeer[addrs=$addrs, connected=$connected, ID=$ID, ]';
  }

  PeeringPeeringPeer.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    addrs = (json['Addrs'] as List).map((item) => item as String).toList();
    connected = json['Connected'];
    ID = json['ID'];
  }

  Map<String, dynamic> toJson() {
    return {
      'Addrs': addrs,
      'Connected': connected,
      'ID': ID
     };
  }

  static List<PeeringPeeringPeer> listFromJson(List<dynamic> json) {
    return json == null ? new List<PeeringPeeringPeer>() : json.map((value) => new PeeringPeeringPeer.fromJson(value)).toList();
  }

  static Map<String, PeeringPeeringPeer> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, PeeringPeeringPeer>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new PeeringPeeringPeer.fromJson(value));
    }
    return map;
  }
}
