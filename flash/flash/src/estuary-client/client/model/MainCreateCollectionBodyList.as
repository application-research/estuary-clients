package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class MainCreateCollectionBodyList implements ListWrapper {
        // This declaration below of _main.createCollectionBody_obj_class is to force flash compiler to include this class
        private var _mainCreateCollectionBody_obj_class: estuary-client.client.model.MainCreateCollectionBody = null;
        [XmlElements(name="mainCreateCollectionBody", type="estuary-client.client.model.MainCreateCollectionBody")]
        public var mainCreateCollectionBody: Array = new Array();

        public function getList(): Array{
            return mainCreateCollectionBody;
        }

}

}
