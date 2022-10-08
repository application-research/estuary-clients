package estuary_client.client.model {


    [XmlRootNode(name="UtilHttpError")]
    public class UtilHttpError {
                [XmlElement(name="code")]
        public var code: Number = NaN;
                [XmlElement(name="details")]
        public var details: String = null;
                [XmlElement(name="reason")]
        public var reason: String = null;

    public function toString(): String {
        var str: String = "UtilHttpError: ";
        str += " (code: " + code + ")";
        str += " (details: " + details + ")";
        str += " (reason: " + reason + ")";
        return str;
    }

}

}
