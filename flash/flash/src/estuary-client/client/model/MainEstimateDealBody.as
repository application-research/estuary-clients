package estuary-client.client.model {


    [XmlRootNode(name="MainEstimateDealBody")]
    public class MainEstimateDealBody {
                [XmlElement(name="durationBlks")]
        public var durationBlks: Number = NaN;
                [XmlElement(name="replication")]
        public var replication: Number = NaN;
                [XmlElement(name="size")]
        public var size: Number = NaN;
                [XmlElement(name="verified")]
        public var verified: Boolean = false;

    public function toString(): String {
        var str: String = "MainEstimateDealBody: ";
        str += " (durationBlks: " + durationBlks + ")";
        str += " (replication: " + replication + ")";
        str += " (size: " + size + ")";
        str += " (verified: " + verified + ")";
        return str;
    }

}

}
