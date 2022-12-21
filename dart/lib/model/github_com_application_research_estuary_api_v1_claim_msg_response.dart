part of swagger.api;

class GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse {
  
  String hexmsg = null;

  GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse();

  @override
  String toString() {
    return 'GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse[hexmsg=$hexmsg, ]';
  }

  GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    hexmsg = json['hexmsg'];
  }

  Map<String, dynamic> toJson() {
    return {
      'hexmsg': hexmsg
     };
  }

  static List<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>() : json.map((value) => new GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse.fromJson(value)).toList();
  }

  static Map<String, GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse.fromJson(value));
    }
    return map;
  }
}
