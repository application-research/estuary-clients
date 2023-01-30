part of swagger.api;

class StatusPinningStatus {
  /// The underlying value of this enum member.
  String value;

  StatusPinningStatus._internal(this.value);

  static StatusPinningStatus pinning_ = StatusPinningStatus._internal("pinning");
  static StatusPinningStatus pinned_ = StatusPinningStatus._internal("pinned");
  static StatusPinningStatus failed_ = StatusPinningStatus._internal("failed");
  static StatusPinningStatus queued_ = StatusPinningStatus._internal("queued");
  static StatusPinningStatus offloaded_ = StatusPinningStatus._internal("offloaded");

  StatusPinningStatus.fromJson(dynamic data) {
    switch (data) {
          case "pinning": value = data; break;
          case "pinned": value = data; break;
          case "failed": value = data; break;
          case "queued": value = data; break;
          case "offloaded": value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(StatusPinningStatus data) {
    return data.value;
  }
}