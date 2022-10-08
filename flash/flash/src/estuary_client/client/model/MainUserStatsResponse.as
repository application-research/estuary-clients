package estuary_client.client.model {


    [XmlRootNode(name="MainUserStatsResponse")]
    public class MainUserStatsResponse {
                [XmlElement(name="numPins")]
        public var numPins: Number = NaN;
                [XmlElement(name="totalSize")]
        public var totalSize: Number = NaN;

    public function toString(): String {
        var str: String = "MainUserStatsResponse: ";
        str += " (numPins: " + numPins + ")";
        str += " (totalSize: " + totalSize + ")";
        return str;
    }

}

}
