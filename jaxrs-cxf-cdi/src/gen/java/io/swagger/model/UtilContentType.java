package io.swagger.model;

import javax.validation.constraints.*;

@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue(0) NUMBER_0(.valueOf(0)), @XmlEnumValue(1) NUMBER_1(.valueOf(1)), @XmlEnumValue(2) NUMBER_2(.valueOf(2));


    private  value;

     ( v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static  fromValue(String v) {
        for (UtilContentType b : UtilContentType.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
