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
 * Gets or Sets types.PinningStatus
 */
@JsonAdapter(TypesPinningStatus.Adapter.class)
public enum TypesPinningStatus {
  PINNING("pinning"),
  PINNED("pinned"),
  FAILED("failed"),
  QUEUED("queued"),
  OFFLOADED("offloaded");

  private String value;

  TypesPinningStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TypesPinningStatus fromValue(String input) {
    for (TypesPinningStatus b : TypesPinningStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TypesPinningStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TypesPinningStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TypesPinningStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TypesPinningStatus.fromValue((String)(value));
    }
  }
}
