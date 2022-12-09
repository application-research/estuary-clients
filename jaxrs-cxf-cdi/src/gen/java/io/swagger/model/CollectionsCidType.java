package io.swagger.model;

import javax.validation.constraints.*;

@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue("directory") DIRECTORY(.valueOf("directory")), @XmlEnumValue("file") FILE(.valueOf("file"));


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
        for (CollectionsCidType b : CollectionsCidType.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
