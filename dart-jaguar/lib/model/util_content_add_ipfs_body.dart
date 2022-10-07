import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'util_content_add_ipfs_body.jser.dart';

class UtilContentAddIpfsBody {
  
  final String coluuid;
  
  final String dir;
  
  final String filename;
  
  final List<String> peers;
  
  final String root;
  

  UtilContentAddIpfsBody(
    

{
     this.coluuid = null,  
     this.dir = null,  
     this.filename = null,  
     this.peers = const [],  
     this.root = null 
    
    }
  );

  @override
  String toString() {
    return 'UtilContentAddIpfsBody[coluuid=$coluuid, dir=$dir, filename=$filename, peers=$peers, root=$root, ]';
  }
}

@GenSerializer()
class UtilContentAddIpfsBodySerializer extends Serializer<UtilContentAddIpfsBody> with _$UtilContentAddIpfsBodySerializer {

}
