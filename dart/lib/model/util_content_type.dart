part of swagger.api;

class UtilContentType {
  /// The underlying value of this enum member.
  int value;

  UtilContentType._internal(this.value);

  static UtilContentType number0_ = UtilContentType._internal(0);
  static UtilContentType number1_ = UtilContentType._internal(1);
  static UtilContentType number2_ = UtilContentType._internal(2);

  UtilContentType.fromJson(dynamic data) {
    switch (data) {
          case 0: value = data; break;
          case 1: value = data; break;
          case 2: value = data; break;
    default: throw('Unknown enum value to decode: $data');
    }
  }

  static dynamic encode(UtilContentType data) {
    return data.value;
  }
}