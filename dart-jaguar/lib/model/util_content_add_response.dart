import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'util_content_add_response.jser.dart';

class UtilContentAddResponse {
  
  final String cid;
  
  final int estuaryId;
  
  final List<String> providers;
  
  final String retrievalUrl;
  

  UtilContentAddResponse(
    

{
     this.cid = null,  
     this.estuaryId = null,  
     this.providers = const [],  
     this.retrievalUrl = null 
    
    }
  );

  @override
  String toString() {
    return 'UtilContentAddResponse[cid=$cid, estuaryId=$estuaryId, providers=$providers, retrievalUrl=$retrievalUrl, ]';
  }
}

@GenSerializer()
class UtilContentAddResponseSerializer extends Serializer<UtilContentAddResponse> with _$UtilContentAddResponseSerializer {

}
