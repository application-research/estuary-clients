package io.swagger.client.model {

import io.swagger.common.ListWrapper;

    public class MainUserStatsResponseList implements ListWrapper {
        // This declaration below of _main.userStatsResponse_obj_class is to force flash compiler to include this class
        private var _mainUserStatsResponse_obj_class: io.swagger.client.model.MainUserStatsResponse = null;
        [XmlElements(name="mainUserStatsResponse", type="io.swagger.client.model.MainUserStatsResponse")]
        public var mainUserStatsResponse: Array = new Array();

        public function getList(): Array{
            return mainUserStatsResponse;
        }

}

}
