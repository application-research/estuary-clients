import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'main_user_stats_response.jser.dart';

class MainUserStatsResponse {
  
  final int numPins;
  
  final int totalSize;
  

  MainUserStatsResponse(
    

{
     this.numPins = null,  
     this.totalSize = null 
    
    }
  );

  @override
  String toString() {
    return 'MainUserStatsResponse[numPins=$numPins, totalSize=$totalSize, ]';
  }
}

@GenSerializer()
class MainUserStatsResponseSerializer extends Serializer<MainUserStatsResponse> with _$MainUserStatsResponseSerializer {

}
