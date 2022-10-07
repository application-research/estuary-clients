import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_import_deal_body.jser.dart';

class MainImportDealBody {
  
  final String coluuid;
  
  final List<int> dealIDs;
  
  final String dir;
  
  final String name;
  

  MainImportDealBody(
    

{
     this.coluuid = null,  
     this.dealIDs = const [],  
     this.dir = null,  
     this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'MainImportDealBody[coluuid=$coluuid, dealIDs=$dealIDs, dir=$dir, name=$name, ]';
  }
}

@GenSerializer()
class MainImportDealBodySerializer extends Serializer<MainImportDealBody> with _$MainImportDealBodySerializer {

}
