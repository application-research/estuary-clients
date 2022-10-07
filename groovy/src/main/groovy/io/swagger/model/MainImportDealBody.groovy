package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class MainImportDealBody {

    String coluuid = null

    List<Integer> dealIDs = new ArrayList<Integer>()

    String dir = null

    String name = null
  

}

