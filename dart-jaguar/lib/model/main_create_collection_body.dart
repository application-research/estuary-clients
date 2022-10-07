import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_create_collection_body.jser.dart';

class MainCreateCollectionBody {
  
  final String description;
  
  final String name;
  

  MainCreateCollectionBody(
    

{
     this.description = null,  
     this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'MainCreateCollectionBody[description=$description, name=$name, ]';
  }
}

@GenSerializer()
class MainCreateCollectionBodySerializer extends Serializer<MainCreateCollectionBody> with _$MainCreateCollectionBodySerializer {

}
