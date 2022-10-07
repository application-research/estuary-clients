import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_estimate_deal_body.jser.dart';

class MainEstimateDealBody {
  
  final int durationBlks;
  
  final int replication;
  
  final int size;
  
  final bool verified;
  

  MainEstimateDealBody(
    

{
     this.durationBlks = null,  
     this.replication = null,  
     this.size = null,  
     this.verified = null 
    
    }
  );

  @override
  String toString() {
    return 'MainEstimateDealBody[durationBlks=$durationBlks, replication=$replication, size=$size, verified=$verified, ]';
  }
}

@GenSerializer()
class MainEstimateDealBodySerializer extends Serializer<MainEstimateDealBody> with _$MainEstimateDealBodySerializer {

}
