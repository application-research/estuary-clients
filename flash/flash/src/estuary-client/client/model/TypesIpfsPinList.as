package estuary-client.client.model {

import io.swagger.common.ListWrapper;
import estuary-client.client.model.Object;

    public class TypesIpfsPinList implements ListWrapper {
        // This declaration below of _types.IpfsPin_obj_class is to force flash compiler to include this class
        private var _typesIpfsPin_obj_class: estuary-client.client.model.TypesIpfsPin = null;
        [XmlElements(name="typesIpfsPin", type="estuary-client.client.model.TypesIpfsPin")]
        public var typesIpfsPin: Array = new Array();

        public function getList(): Array{
            return typesIpfsPin;
        }

}

}
