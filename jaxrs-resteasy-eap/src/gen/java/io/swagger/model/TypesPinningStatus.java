package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
public enum TypesPinningStatus {
  PINNING,
  PINNED,
  FAILED,
  QUEUED,
  OFFLOADED;
}