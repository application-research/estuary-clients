import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_get_api_keys_resp.jser.dart';

class MainGetApiKeysResp {
  
  final String expiry;
  
  final String label;
  
  final String token;
  
  final String tokenHash;
  

  MainGetApiKeysResp(
    

{
     this.expiry = null,  
     this.label = null,  
     this.token = null,  
     this.tokenHash = null 
    
    }
  );

  @override
  String toString() {
    return 'MainGetApiKeysResp[expiry=$expiry, label=$label, token=$token, tokenHash=$tokenHash, ]';
  }
}

@GenSerializer()
class MainGetApiKeysRespSerializer extends Serializer<MainGetApiKeysResp> with _$MainGetApiKeysRespSerializer {

}
