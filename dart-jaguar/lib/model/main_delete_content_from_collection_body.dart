import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_delete_content_from_collection_body.jser.dart';

class MainDeleteContentFromCollectionBody {
  
  final String by;
  
  final String value;
  

  MainDeleteContentFromCollectionBody(
    

{
     this.by = null,  
     this.value = null 
    
    }
  );

  @override
  String toString() {
    return 'MainDeleteContentFromCollectionBody[by=$by, value=$value, ]';
  }
}

@GenSerializer()
class MainDeleteContentFromCollectionBodySerializer extends Serializer<MainDeleteContentFromCollectionBody> with _$MainDeleteContentFromCollectionBodySerializer {

}
