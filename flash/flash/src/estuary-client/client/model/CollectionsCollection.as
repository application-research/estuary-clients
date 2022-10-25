package estuary-client.client.model {


    [XmlRootNode(name="CollectionsCollection")]
    public class CollectionsCollection {
                [XmlElement(name="cid")]
        public var cid: String = null;
                [XmlElement(name="createdAt")]
        public var createdAt: String = null;
                [XmlElement(name="description")]
        public var description: String = null;
                [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="userId")]
        public var userId: Number = NaN;
                [XmlElement(name="uuid")]
        public var uuid: String = null;

    public function toString(): String {
        var str: String = "CollectionsCollection: ";
        str += " (cid: " + cid + ")";
        str += " (createdAt: " + createdAt + ")";
        str += " (description: " + description + ")";
        str += " (name: " + name + ")";
        str += " (userId: " + userId + ")";
        str += " (uuid: " + uuid + ")";
        return str;
    }

}

}
