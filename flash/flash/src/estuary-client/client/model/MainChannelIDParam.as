package estuary-client.client.model {


    [XmlRootNode(name="MainChannelIDParam")]
    public class MainChannelIDParam {
                [XmlElement(name="id")]
        public var id: Number = NaN;
                [XmlElement(name="initiator")]
        public var initiator: String = null;
                [XmlElement(name="responder")]
        public var responder: String = null;

    public function toString(): String {
        var str: String = "MainChannelIDParam: ";
        str += " (id: " + id + ")";
        str += " (initiator: " + initiator + ")";
        str += " (responder: " + responder + ")";
        return str;
    }

}

}
