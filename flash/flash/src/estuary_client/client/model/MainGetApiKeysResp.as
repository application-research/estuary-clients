package estuary_client.client.model {


    [XmlRootNode(name="MainGetApiKeysResp")]
    public class MainGetApiKeysResp {
                [XmlElement(name="expiry")]
        public var expiry: String = null;
                [XmlElement(name="token")]
        public var token: String = null;

    public function toString(): String {
        var str: String = "MainGetApiKeysResp: ";
        str += " (expiry: " + expiry + ")";
        str += " (token: " + token + ")";
        return str;
    }

}

}
