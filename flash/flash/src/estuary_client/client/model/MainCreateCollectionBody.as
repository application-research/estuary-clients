package estuary_client.client.model {


    [XmlRootNode(name="MainCreateCollectionBody")]
    public class MainCreateCollectionBody {
                [XmlElement(name="description")]
        public var description: String = null;
                [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "MainCreateCollectionBody: ";
        str += " (description: " + description + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
