import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'collections_collection.jser.dart';

class CollectionsCollection {
  
  final String cid;
  
  final String createdAt;
  
  final String description;
  
  final String name;
  
  final int userId;
  
  final String uuid;
  

  CollectionsCollection(
    

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
    return 'CollectionsCollection[cid=$cid, createdAt=$createdAt, description=$description, name=$name, userId=$userId, uuid=$uuid, ]';
  }
}

@GenSerializer()
class CollectionsCollectionSerializer extends Serializer<CollectionsCollection> with _$CollectionsCollectionSerializer {

}
