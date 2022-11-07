import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:swagger/model/object.dart';
part 'types_ipfs_pin.jser.dart';

class TypesIpfsPin {
  
  final String cid;
  
  final Object meta;
  
  final String name;
  
  final List<String> origins;
  

  TypesIpfsPin(
    

{
     this.cid = null,  
     this.meta = null,  
     this.name = null,  
     this.origins = const [] 
    
    }
  );

  @override
  String toString() {
    return 'TypesIpfsPin[cid=$cid, meta=$meta, name=$name, origins=$origins, ]';
  }
}

@GenSerializer()
class TypesIpfsPinSerializer extends Serializer<TypesIpfsPin> with _$TypesIpfsPinSerializer {

}
