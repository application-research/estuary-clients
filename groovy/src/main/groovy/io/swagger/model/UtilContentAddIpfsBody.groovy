package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class UtilContentAddIpfsBody {

    String coluuid = null

    String dir = null

    String filename = null

    List<String> peers = new ArrayList<String>()

    String root = null
  

}

