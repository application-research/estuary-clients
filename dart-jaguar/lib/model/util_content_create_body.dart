import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'util_content_create_body.jser.dart';

class UtilContentCreateBody {
  
  final String coluuid;
  
  final String dir;
  
  final String location;
  
  final String name;
  
  final String root;
  
  final int type;
  

  UtilContentCreateBody(
    

{
     this.coluuid = null,  
     this.dir = null,  
     this.location = null,  
     this.name = null,  
     this.root = null,  
     this.type = null 
    
    }
  );

  @override
  String toString() {
    return 'UtilContentCreateBody[coluuid=$coluuid, dir=$dir, location=$location, name=$name, root=$root, type=$type, ]';
  }
}

@GenSerializer()
class UtilContentCreateBodySerializer extends Serializer<UtilContentCreateBody> with _$UtilContentCreateBodySerializer {

}
