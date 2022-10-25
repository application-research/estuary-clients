package estuary-client.client.model {


    [XmlRootNode(name="MainImportDealBody")]
    public class MainImportDealBody {
                [XmlElement(name="coluuid")]
        public var coluuid: String = null;
                // This declaration below of _dealIDs_obj_class is to force flash compiler to include this class
        private var _dealIDs_obj_class: Array = null;
        [XmlElementWrapper(name="dealIDs")]
        [XmlElements(name="dealIDs", type="Array")]
                public var dealIDs: Array = new Array();
                [XmlElement(name="dir")]
        public var dir: String = null;
                [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "MainImportDealBody: ";
        str += " (coluuid: " + coluuid + ")";
        str += " (dealIDs: " + dealIDs + ")";
        str += " (dir: " + dir + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
