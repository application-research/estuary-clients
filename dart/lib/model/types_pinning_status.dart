part of swagger.api;

class TypesPinningStatus {
  /// The underlying value of this enum member.
  String value;

  TypesPinningStatus._internal(this.value);

  static TypesPinningStatus pinning_ = TypesPinningStatus._internal("pinning");
  static TypesPinningStatus pinned_ = TypesPinningStatus._internal("pinned");
  static TypesPinningStatus failed_ = TypesPinningStatus._internal("failed");
  static TypesPinningStatus queued_ = TypesPinningStatus._internal("queued");
  static TypesPinningStatus offloaded_ = TypesPinningStatus._internal("offloaded");

  TypesPinningStatus.fromJson(dynamic data) {
    switch (data) {
          case "pinning": value = data; break;
          case "pinned": value = data; break;
          case "failed": value = data; break;
          case "queued": value = data; break;
          case "offloaded": value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(TypesPinningStatus data) {
    return data.value;
  }
}