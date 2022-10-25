package estuary-client.client.model {


    [XmlRootNode(name="UtilContentAddResponse")]
    public class UtilContentAddResponse {
                [XmlElement(name="cid")]
        public var cid: String = null;
                [XmlElement(name="estuaryId")]
        public var estuaryId: Number = NaN;
                // This declaration below of _providers_obj_class is to force flash compiler to include this class
        private var _providers_obj_class: Array = null;
        [XmlElementWrapper(name="providers")]
        [XmlElements(name="providers", type="Array")]
                public var providers: Array = new Array();
                [XmlElement(name="retrieval_url")]
        public var retrievalUrl: String = null;

    public function toString(): String {
        var str: String = "UtilContentAddResponse: ";
        str += " (cid: " + cid + ")";
        str += " (estuaryId: " + estuaryId + ")";
        str += " (providers: " + providers + ")";
        str += " (retrievalUrl: " + retrievalUrl + ")";
        return str;
    }

}

}
