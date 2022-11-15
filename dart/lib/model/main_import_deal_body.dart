part of swagger.api;

class MainImportDealBody {
  
  String coluuid = null;

  List<int> dealIDs = [];

  String dir = null;

  String name = null;

  MainImportDealBody();

  @override
  String toString() {
    return 'MainImportDealBody[coluuid=$coluuid, dealIDs=$dealIDs, dir=$dir, name=$name, ]';
  }

  MainImportDealBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    coluuid = json['coluuid'];
    dealIDs = (json['dealIDs'] as List).map((item) => item as int).toList();
    dir = json['dir'];
    name = json['name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'coluuid': coluuid,
      'dealIDs': dealIDs,
      'dir': dir,
      'name': name
     };
  }

  static List<MainImportDealBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainImportDealBody>() : json.map((value) => new MainImportDealBody.fromJson(value)).toList();
  }

  static Map<String, MainImportDealBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainImportDealBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainImportDealBody.fromJson(value));
    }
    return map;
  }
}
