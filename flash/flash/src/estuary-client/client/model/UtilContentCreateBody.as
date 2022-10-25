package estuary-client.client.model {


    [XmlRootNode(name="UtilContentCreateBody")]
    public class UtilContentCreateBody {
                [XmlElement(name="coluuid")]
        public var coluuid: String = null;
                [XmlElement(name="dir")]
        public var dir: String = null;
                [XmlElement(name="location")]
        public var location: String = null;
                [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="root")]
        public var root: String = null;
                [XmlElement(name="type")]
        public var type: Number = NaN;

    public function toString(): String {
        var str: String = "UtilContentCreateBody: ";
        str += " (coluuid: " + coluuid + ")";
        str += " (dir: " + dir + ")";
        str += " (location: " + location + ")";
        str += " (name: " + name + ")";
        str += " (root: " + root + ")";
        str += " (type: " + type + ")";
        return str;
    }

}

}
