package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.TypesIpfsPin;
import java.util.List;
@Canonical
class TypesIpfsPinStatusResponse {

    String created = null

    List<String> delegates = new ArrayList<String>()

    Object info = null

    TypesIpfsPin pin = null

    String requestid = null

    String status = null
  

}

