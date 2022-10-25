package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class CollectionsCollectionList implements ListWrapper {
        // This declaration below of _collections.Collection_obj_class is to force flash compiler to include this class
        private var _collectionsCollection_obj_class: estuary-client.client.model.CollectionsCollection = null;
        [XmlElements(name="collectionsCollection", type="estuary-client.client.model.CollectionsCollection")]
        public var collectionsCollection: Array = new Array();

        public function getList(): Array{
            return collectionsCollection;
        }

}

}
