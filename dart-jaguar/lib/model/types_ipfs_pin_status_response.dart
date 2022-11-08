import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/types_ipfs_pin.dart';
import 'package:swagger/model/object.dart';
part 'types_ipfs_pin_status_response.jser.dart';

class TypesIpfsPinStatusResponse {
  
  final String created;
  
  final List<String> delegates;
  
  final Object info;
  
  final TypesIpfsPin pin;
  
  final String requestid;
  
  final String status;
  

  TypesIpfsPinStatusResponse(
    

{
     this.created = null,  
     this.delegates = const [],  
     this.info = null,  
     this.pin = null,  
     this.requestid = null,  
     this.status = null 
    
    }
  );

  @override
  String toString() {
    return 'TypesIpfsPinStatusResponse[created=$created, delegates=$delegates, info=$info, pin=$pin, requestid=$requestid, status=$status, ]';
  }
}

@GenSerializer()
class TypesIpfsPinStatusResponseSerializer extends Serializer<TypesIpfsPinStatusResponse> with _$TypesIpfsPinStatusResponseSerializer {

}
