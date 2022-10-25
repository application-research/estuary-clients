package estuary-client.client.model {

import io.swagger.common.ListWrapper;

    public class UtilHttpErrorList implements ListWrapper {
        // This declaration below of _util.HttpError_obj_class is to force flash compiler to include this class
        private var _utilHttpError_obj_class: estuary-client.client.model.UtilHttpError = null;
        [XmlElements(name="utilHttpError", type="estuary-client.client.model.UtilHttpError")]
        public var utilHttpError: Array = new Array();

        public function getList(): Array{
            return utilHttpError;
        }

}

}
