part of swagger.api;

class GithubComApplicationResearchEstuaryApiV1ClaimResponse {
  
  bool success = null;

  GithubComApplicationResearchEstuaryApiV1ClaimResponse();

  @override
  String toString() {
    return 'GithubComApplicationResearchEstuaryApiV1ClaimResponse[success=$success, ]';
  }

  GithubComApplicationResearchEstuaryApiV1ClaimResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    success = json['success'];
  }

  Map<String, dynamic> toJson() {
    return {
      'success': success
     };
  }

  static List<GithubComApplicationResearchEstuaryApiV1ClaimResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<GithubComApplicationResearchEstuaryApiV1ClaimResponse>() : json.map((value) => new GithubComApplicationResearchEstuaryApiV1ClaimResponse.fromJson(value)).toList();
  }

  static Map<String, GithubComApplicationResearchEstuaryApiV1ClaimResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, GithubComApplicationResearchEstuaryApiV1ClaimResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new GithubComApplicationResearchEstuaryApiV1ClaimResponse.fromJson(value));
    }
    return map;
  }
}
