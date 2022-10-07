import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'util_http_error.jser.dart';

class UtilHttpError {
  
  final int code;
  
  final String details;
  
  final String reason;
  

  UtilHttpError(
    

{
     this.code = null,  
     this.details = null,  
     this.reason = null 
    
    }
  );

  @override
  String toString() {
    return 'UtilHttpError[code=$code, details=$details, reason=$reason, ]';
  }
}

@GenSerializer()
class UtilHttpErrorSerializer extends Serializer<UtilHttpError> with _$UtilHttpErrorSerializer {

}
