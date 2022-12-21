part of swagger.api;

class GithubComApplicationResearchEstuaryApiV2ClaimResponse {
  
  bool success = null;

  GithubComApplicationResearchEstuaryApiV2ClaimResponse();

  @override
  String toString() {
    return 'GithubComApplicationResearchEstuaryApiV2ClaimResponse[success=$success, ]';
  }

  GithubComApplicationResearchEstuaryApiV2ClaimResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    success = json['success'];
  }

  Map<String, dynamic> toJson() {
    return {
      'success': success
     };
  }

  static List<GithubComApplicationResearchEstuaryApiV2ClaimResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<GithubComApplicationResearchEstuaryApiV2ClaimResponse>() : json.map((value) => new GithubComApplicationResearchEstuaryApiV2ClaimResponse.fromJson(value)).toList();
  }

  static Map<String, GithubComApplicationResearchEstuaryApiV2ClaimResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, GithubComApplicationResearchEstuaryApiV2ClaimResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new GithubComApplicationResearchEstuaryApiV2ClaimResponse.fromJson(value));
    }
    return map;
  }
}
