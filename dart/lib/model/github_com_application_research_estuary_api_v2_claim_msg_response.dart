part of swagger.api;

class GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse {
  
  String hexmsg = null;

  GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse();

  @override
  String toString() {
    return 'GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse[hexmsg=$hexmsg, ]';
  }

  GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    hexmsg = json['hexmsg'];
  }

  Map<String, dynamic> toJson() {
    return {
      'hexmsg': hexmsg
     };
  }

  static List<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>() : json.map((value) => new GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.fromJson(value)).toList();
  }

  static Map<String, GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.fromJson(value));
    }
    return map;
  }
}
