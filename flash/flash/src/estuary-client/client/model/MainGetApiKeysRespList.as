package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class MainGetApiKeysRespList implements ListWrapper {
        // This declaration below of _main.getApiKeysResp_obj_class is to force flash compiler to include this class
        private var _mainGetApiKeysResp_obj_class: estuary-client.client.model.MainGetApiKeysResp = null;
        [XmlElements(name="mainGetApiKeysResp", type="estuary-client.client.model.MainGetApiKeysResp")]
        public var mainGetApiKeysResp: Array = new Array();

        public function getList(): Array{
            return mainGetApiKeysResp;
        }

}

}
