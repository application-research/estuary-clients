package estuary-client.client.model {

import estuary-client.client.model.TypesIpfsPinStatusResponse;

    [XmlRootNode(name="TypesIpfsListPinStatusResponse")]
    public class TypesIpfsListPinStatusResponse {
                [XmlElement(name="count")]
        public var count: Number = NaN;
                // This declaration below of _results_obj_class is to force flash compiler to include this class
        private var _results_obj_class: Array = null;
        [XmlElementWrapper(name="results")]
        [XmlElements(name="results", type="Array")]
                public var results: Array = new Array();

    public function toString(): String {
        var str: String = "TypesIpfsListPinStatusResponse: ";
        str += " (count: " + count + ")";
        str += " (results: " + results + ")";
        return str;
    }

}

}
