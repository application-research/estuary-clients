/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets util.ContentType
 */
@JsonAdapter(UtilContentType.Adapter.class)
public enum UtilContentType {
  NUMBER_0(0),
  NUMBER_1(1),
  NUMBER_2(2);

  private Integer value;

  UtilContentType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UtilContentType fromValue(Integer input) {
    for (UtilContentType b : UtilContentType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UtilContentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final UtilContentType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UtilContentType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextInt();
      return UtilContentType.fromValue((Integer)(value));
    }
  }
}
