package io.swagger.model;

import javax.validation.constraints.*;

@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue("pinning") PINNING(.valueOf("pinning")), @XmlEnumValue("pinned") PINNED(.valueOf("pinned")), @XmlEnumValue("failed") FAILED(.valueOf("failed")), @XmlEnumValue("queued") QUEUED(.valueOf("queued")), @XmlEnumValue("offloaded") OFFLOADED(.valueOf("offloaded"));


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
        for (TypesPinningStatus b : TypesPinningStatus.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
