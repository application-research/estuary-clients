package estuary-client.client.model {

import io.swagger.common.ListWrapper;
import estuary-client.client.model.Object;
import estuary-client.client.model.TypesIpfsPin;

    public class TypesIpfsPinStatusResponseList implements ListWrapper {
        // This declaration below of _types.IpfsPinStatusResponse_obj_class is to force flash compiler to include this class
        private var _typesIpfsPinStatusResponse_obj_class: estuary-client.client.model.TypesIpfsPinStatusResponse = null;
        [XmlElements(name="typesIpfsPinStatusResponse", type="estuary-client.client.model.TypesIpfsPinStatusResponse")]
        public var typesIpfsPinStatusResponse: Array = new Array();

        public function getList(): Array{
            return typesIpfsPinStatusResponse;
        }

}

}
