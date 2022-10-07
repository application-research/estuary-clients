import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_get_api_keys_resp.jser.dart';

class MainGetApiKeysResp {
  
  final String expiry;
  
  final String token;
  

  MainGetApiKeysResp(
    

{
     this.expiry = null,  
     this.token = null 
    
    }
  );

  @override
  String toString() {
    return 'MainGetApiKeysResp[expiry=$expiry, token=$token, ]';
  }
}

@GenSerializer()
class MainGetApiKeysRespSerializer extends Serializer<MainGetApiKeysResp> with _$MainGetApiKeysRespSerializer {

}
