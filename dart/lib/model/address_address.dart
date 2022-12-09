part of swagger.api;

class AddressAddress {
  
  AddressAddress();

  @override
  String toString() {
    return 'AddressAddress[]';
  }

  AddressAddress.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<AddressAddress> listFromJson(List<dynamic> json) {
    return json == null ? new List<AddressAddress>() : json.map((value) => new AddressAddress.fromJson(value)).toList();
  }

  static Map<String, AddressAddress> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, AddressAddress>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new AddressAddress.fromJson(value));
    }
    return map;
  }
}
