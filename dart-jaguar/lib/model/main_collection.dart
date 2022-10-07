import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_collection.jser.dart';

class MainCollection {
  
  final String cid;
  
  final String createdAt;
  
  final String description;
  
  final String name;
  
  final int userId;
  
  final String uuid;
  

  MainCollection(
    

{
     this.cid = null,  
     this.createdAt = null,  
     this.description = null,  
     this.name = null,  
     this.userId = null,  
     this.uuid = null 
    
    }
  );

  @override
  String toString() {
    return 'MainCollection[cid=$cid, createdAt=$createdAt, description=$description, name=$name, userId=$userId, uuid=$uuid, ]';
  }
}

@GenSerializer()
class MainCollectionSerializer extends Serializer<MainCollection> with _$MainCollectionSerializer {

}
