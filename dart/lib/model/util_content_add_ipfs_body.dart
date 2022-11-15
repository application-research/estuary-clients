part of swagger.api;

class UtilContentAddIpfsBody {
  
  String coluuid = null;

  String dir = null;

  String filename = null;

  List<String> peers = [];

  String root = null;

  UtilContentAddIpfsBody();

  @override
  String toString() {
    return 'UtilContentAddIpfsBody[coluuid=$coluuid, dir=$dir, filename=$filename, peers=$peers, root=$root, ]';
  }

  UtilContentAddIpfsBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    coluuid = json['coluuid'];
    dir = json['dir'];
    filename = json['filename'];
    peers = (json['peers'] as List).map((item) => item as String).toList();
    root = json['root'];
  }

  Map<String, dynamic> toJson() {
    return {
      'coluuid': coluuid,
      'dir': dir,
      'filename': filename,
      'peers': peers,
      'root': root
     };
  }

  static List<UtilContentAddIpfsBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilContentAddIpfsBody>() : json.map((value) => new UtilContentAddIpfsBody.fromJson(value)).toList();
  }

  static Map<String, UtilContentAddIpfsBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilContentAddIpfsBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilContentAddIpfsBody.fromJson(value));
    }
    return map;
  }
}
