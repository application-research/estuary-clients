package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class MainImportDealBodyList implements ListWrapper {
        // This declaration below of _main.importDealBody_obj_class is to force flash compiler to include this class
        private var _mainImportDealBody_obj_class: estuary-client.client.model.MainImportDealBody = null;
        [XmlElements(name="mainImportDealBody", type="estuary-client.client.model.MainImportDealBody")]
        public var mainImportDealBody: Array = new Array();

        public function getList(): Array{
            return mainImportDealBody;
        }

}

}
