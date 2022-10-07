package io.swagger.client.model {

import io.swagger.common.ListWrapper;

    public class MainCollectionList implements ListWrapper {
        // This declaration below of _main.Collection_obj_class is to force flash compiler to include this class
        private var _mainCollection_obj_class: io.swagger.client.model.MainCollection = null;
        [XmlElements(name="mainCollection", type="io.swagger.client.model.MainCollection")]
        public var mainCollection: Array = new Array();

        public function getList(): Array{
            return mainCollection;
        }

}

}
