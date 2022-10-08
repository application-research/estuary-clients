package estuary_client.client.model {

import io.swagger.common.ListWrapper;

    public class UtilContentAddIpfsBodyList implements ListWrapper {
        // This declaration below of _util.ContentAddIpfsBody_obj_class is to force flash compiler to include this class
        private var _utilContentAddIpfsBody_obj_class: estuary_client.client.model.UtilContentAddIpfsBody = null;
        [XmlElements(name="utilContentAddIpfsBody", type="estuary_client.client.model.UtilContentAddIpfsBody")]
        public var utilContentAddIpfsBody: Array = new Array();

        public function getList(): Array{
            return utilContentAddIpfsBody;
        }

}

}
