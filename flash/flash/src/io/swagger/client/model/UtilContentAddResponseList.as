package io.swagger.client.model {

import io.swagger.common.ListWrapper;

    public class UtilContentAddResponseList implements ListWrapper {
        // This declaration below of _util.ContentAddResponse_obj_class is to force flash compiler to include this class
        private var _utilContentAddResponse_obj_class: io.swagger.client.model.UtilContentAddResponse = null;
        [XmlElements(name="utilContentAddResponse", type="io.swagger.client.model.UtilContentAddResponse")]
        public var utilContentAddResponse: Array = new Array();

        public function getList(): Array{
            return utilContentAddResponse;
        }

}

}
