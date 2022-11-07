package estuary-client.client.model {

import estuary-client.client.model.Object;

    [XmlRootNode(name="TypesIpfsPin")]
    public class TypesIpfsPin {
                [XmlElement(name="cid")]
        public var cid: String = null;
                [XmlElement(name="meta")]
        public var meta: Object = NaN;
                [XmlElement(name="name")]
        public var name: String = null;
                // This declaration below of _origins_obj_class is to force flash compiler to include this class
        private var _origins_obj_class: Array = null;
        [XmlElementWrapper(name="origins")]
        [XmlElements(name="origins", type="Array")]
                public var origins: Array = new Array();

    public function toString(): String {
        var str: String = "TypesIpfsPin: ";
        str += " (cid: " + cid + ")";
        str += " (meta: " + meta + ")";
        str += " (name: " + name + ")";
        str += " (origins: " + origins + ")";
        return str;
    }

}

}
