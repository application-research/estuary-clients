package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class UtilContentCreateBodyList implements ListWrapper {
        // This declaration below of _util.ContentCreateBody_obj_class is to force flash compiler to include this class
        private var _utilContentCreateBody_obj_class: estuary-client.client.model.UtilContentCreateBody = null;
        [XmlElements(name="utilContentCreateBody", type="estuary-client.client.model.UtilContentCreateBody")]
        public var utilContentCreateBody: Array = new Array();

        public function getList(): Array{
            return utilContentCreateBody;
        }

}

}
