package estuary-client.client.model {


    [XmlRootNode(name="MainGetApiKeysResp")]
    public class MainGetApiKeysResp {
                [XmlElement(name="expiry")]
        public var expiry: String = null;
                [XmlElement(name="label")]
        public var label: String = null;
                [XmlElement(name="token")]
        public var token: String = null;
                [XmlElement(name="tokenHash")]
        public var tokenHash: String = null;

    public function toString(): String {
        var str: String = "MainGetApiKeysResp: ";
        str += " (expiry: " + expiry + ")";
        str += " (label: " + label + ")";
        str += " (token: " + token + ")";
        str += " (tokenHash: " + tokenHash + ")";
        return str;
    }

}

}
