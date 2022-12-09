part of swagger.api;

class CollectionsCidType {
  /// The underlying value of this enum member.
  String value;

  CollectionsCidType._internal(this.value);

  static CollectionsCidType directory_ = CollectionsCidType._internal("directory");
  static CollectionsCidType file_ = CollectionsCidType._internal("file");

  CollectionsCidType.fromJson(dynamic data) {
    switch (data) {
          case "directory": value = data; break;
          case "file": value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(CollectionsCidType data) {
    return data.value;
  }
}