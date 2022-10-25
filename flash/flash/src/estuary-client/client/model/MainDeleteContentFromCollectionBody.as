package estuary-client.client.model {


    [XmlRootNode(name="MainDeleteContentFromCollectionBody")]
    public class MainDeleteContentFromCollectionBody {
                [XmlElement(name="by")]
        public var by: String = null;
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "MainDeleteContentFromCollectionBody: ";
        str += " (by: " + by + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
