package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class MainEstimateDealBodyList implements ListWrapper {
        // This declaration below of _main.estimateDealBody_obj_class is to force flash compiler to include this class
        private var _mainEstimateDealBody_obj_class: estuary-client.client.model.MainEstimateDealBody = null;
        [XmlElements(name="mainEstimateDealBody", type="estuary-client.client.model.MainEstimateDealBody")]
        public var mainEstimateDealBody: Array = new Array();

        public function getList(): Array{
            return mainEstimateDealBody;
        }

}

}
