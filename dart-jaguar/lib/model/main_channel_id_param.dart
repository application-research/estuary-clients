import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_channel_id_param.jser.dart';

class MainChannelIDParam {
  
  final int id;
  
  final String initiator;
  
  final String responder;
  

  MainChannelIDParam(
    

{
     this.id = null,  
     this.initiator = null,  
     this.responder = null 
    
    }
  );

  @override
  String toString() {
    return 'MainChannelIDParam[id=$id, initiator=$initiator, responder=$responder, ]';
  }
}

@GenSerializer()
class MainChannelIDParamSerializer extends Serializer<MainChannelIDParam> with _$MainChannelIDParamSerializer {

}
