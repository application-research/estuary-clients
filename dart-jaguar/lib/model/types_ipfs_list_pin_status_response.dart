import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/types_ipfs_pin_status_response.dart';
part 'types_ipfs_list_pin_status_response.jser.dart';

class TypesIpfsListPinStatusResponse {
  
  final int count;
  
  final List<TypesIpfsPinStatusResponse> results;
  

  TypesIpfsListPinStatusResponse(
    

{
     this.count = null,  
     this.results = const [] 
    
    }
  );

  @override
  String toString() {
    return 'TypesIpfsListPinStatusResponse[count=$count, results=$results, ]';
  }
}

@GenSerializer()
class TypesIpfsListPinStatusResponseSerializer extends Serializer<TypesIpfsListPinStatusResponse> with _$TypesIpfsListPinStatusResponseSerializer {

}
