package estuary-client.client.model {

import io.swagger.common.ListWrapper;
import estuary-client.client.model.TypesIpfsPinStatusResponse;

    public class TypesIpfsListPinStatusResponseList implements ListWrapper {
        // This declaration below of _types.IpfsListPinStatusResponse_obj_class is to force flash compiler to include this class
        private var _typesIpfsListPinStatusResponse_obj_class: estuary-client.client.model.TypesIpfsListPinStatusResponse = null;
        [XmlElements(name="typesIpfsListPinStatusResponse", type="estuary-client.client.model.TypesIpfsListPinStatusResponse")]
        public var typesIpfsListPinStatusResponse: Array = new Array();

        public function getList(): Array{
            return typesIpfsListPinStatusResponse;
        }

}

}
