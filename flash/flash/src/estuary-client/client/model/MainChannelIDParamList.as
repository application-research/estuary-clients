package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class MainChannelIDParamList implements ListWrapper {
        // This declaration below of _main.ChannelIDParam_obj_class is to force flash compiler to include this class
        private var _mainChannelIDParam_obj_class: estuary-client.client.model.MainChannelIDParam = null;
        [XmlElements(name="mainChannelIDParam", type="estuary-client.client.model.MainChannelIDParam")]
        public var mainChannelIDParam: Array = new Array();

        public function getList(): Array{
            return mainChannelIDParam;
        }

}

}
