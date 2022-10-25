package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class MainDeleteContentFromCollectionBodyList implements ListWrapper {
        // This declaration below of _main.deleteContentFromCollectionBody_obj_class is to force flash compiler to include this class
        private var _mainDeleteContentFromCollectionBody_obj_class: estuary-client.client.model.MainDeleteContentFromCollectionBody = null;
        [XmlElements(name="mainDeleteContentFromCollectionBody", type="estuary-client.client.model.MainDeleteContentFromCollectionBody")]
        public var mainDeleteContentFromCollectionBody: Array = new Array();

        public function getList(): Array{
            return mainDeleteContentFromCollectionBody;
        }

}

}
