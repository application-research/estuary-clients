package estuary_client.client.model {


    [XmlRootNode(name="UtilContentAddIpfsBody")]
    public class UtilContentAddIpfsBody {
                [XmlElement(name="coluuid")]
        public var coluuid: String = null;
                [XmlElement(name="dir")]
        public var dir: String = null;
                [XmlElement(name="filename")]
        public var filename: String = null;
                // This declaration below of _peers_obj_class is to force flash compiler to include this class
        private var _peers_obj_class: Array = null;
        [XmlElementWrapper(name="peers")]
        [XmlElements(name="peers", type="Array")]
                public var peers: Array = new Array();
                [XmlElement(name="root")]
        public var root: String = null;

    public function toString(): String {
        var str: String = "UtilContentAddIpfsBody: ";
        str += " (coluuid: " + coluuid + ")";
        str += " (dir: " + dir + ")";
        str += " (filename: " + filename + ")";
        str += " (peers: " + peers + ")";
        str += " (root: " + root + ")";
        return str;
    }

}

}
