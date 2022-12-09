part of swagger.api;

class UtilUserSettings {
  
  bool contentAddingDisabled = null;

  int dealDuration = null;

  bool dealMakingDisabled = null;

  int fileStagingThreshold = null;

  int flags = null;

  int replication = null;

  List<String> uploadEndpoints = [];

  bool verified = null;

  UtilUserSettings();

  @override
  String toString() {
    return 'UtilUserSettings[contentAddingDisabled=$contentAddingDisabled, dealDuration=$dealDuration, dealMakingDisabled=$dealMakingDisabled, fileStagingThreshold=$fileStagingThreshold, flags=$flags, replication=$replication, uploadEndpoints=$uploadEndpoints, verified=$verified, ]';
  }

  UtilUserSettings.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    contentAddingDisabled = json['contentAddingDisabled'];
    dealDuration = json['dealDuration'];
    dealMakingDisabled = json['dealMakingDisabled'];
    fileStagingThreshold = json['fileStagingThreshold'];
    flags = json['flags'];
    replication = json['replication'];
    uploadEndpoints = (json['uploadEndpoints'] as List).map((item) => item as String).toList();
    verified = json['verified'];
  }

  Map<String, dynamic> toJson() {
    return {
      'contentAddingDisabled': contentAddingDisabled,
      'dealDuration': dealDuration,
      'dealMakingDisabled': dealMakingDisabled,
      'fileStagingThreshold': fileStagingThreshold,
      'flags': flags,
      'replication': replication,
      'uploadEndpoints': uploadEndpoints,
      'verified': verified
     };
  }

  static List<UtilUserSettings> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilUserSettings>() : json.map((value) => new UtilUserSettings.fromJson(value)).toList();
  }

  static Map<String, UtilUserSettings> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilUserSettings>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilUserSettings.fromJson(value));
    }
    return map;
  }
}
