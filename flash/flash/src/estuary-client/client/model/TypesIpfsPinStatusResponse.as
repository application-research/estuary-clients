package estuary-client.client.model {

import estuary-client.client.model.Object;
import estuary-client.client.model.TypesIpfsPin;

    [XmlRootNode(name="TypesIpfsPinStatusResponse")]
    public class TypesIpfsPinStatusResponse {
                [XmlElement(name="created")]
        public var created: String = null;
                // This declaration below of _delegates_obj_class is to force flash compiler to include this class
        private var _delegates_obj_class: Array = null;
        [XmlElementWrapper(name="delegates")]
        [XmlElements(name="delegates", type="Array")]
                public var delegates: Array = new Array();
                [XmlElement(name="info")]
        public var info: Object = NaN;
                [XmlElement(name="pin")]
        public var pin: TypesIpfsPin = NaN;
                [XmlElement(name="requestid")]
        public var requestid: String = null;
                [XmlElement(name="status")]
        public var status: String = null;

    public function toString(): String {
        var str: String = "TypesIpfsPinStatusResponse: ";
        str += " (created: " + created + ")";
        str += " (delegates: " + delegates + ")";
        str += " (info: " + info + ")";
        str += " (pin: " + pin + ")";
        str += " (requestid: " + requestid + ")";
        str += " (status: " + status + ")";
        return str;
    }

}

}
