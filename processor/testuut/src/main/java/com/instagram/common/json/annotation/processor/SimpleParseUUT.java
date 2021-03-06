// Copyright 2004-present Facebook. All Rights Reserved.

package com.instagram.common.json.annotation.processor;

import java.util.List;
import java.util.Queue;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;

/**
 * Simple UUT for testing the most basic functionality.
 */
@JsonType
public class SimpleParseUUT {
  public static final String INT_FIELD_NAME = "int";
  public static final String INTEGER_FIELD_NAME = "Integer";
  public static final String FLOAT_FIELD_NAME = "float";
  public static final String FLOAT_OBJ_FIELD_NAME = "Float";
  public static final String STRING_FIELD_NAME = "String";
  public static final String INTEGER_LIST_FIELD_NAME = "IntegerList";
  public static final String INTEGER_QUEUE_FIELD_NAME = "IntegerQueue";
  public static final String SUBOBJECT_FIELD_NAME = "Subobject";

  @JsonField(fieldName = INT_FIELD_NAME)
  public int intField;

  @JsonField(fieldName = INTEGER_FIELD_NAME)
  public Integer integerField;

  @JsonField(fieldName = FLOAT_FIELD_NAME)
  public float floatField;

  @JsonField(fieldName = FLOAT_OBJ_FIELD_NAME)
  public Float FloatField;

  @JsonField(fieldName = STRING_FIELD_NAME, mapping = JsonField.TypeMapping.EXACT)
  public String stringField;

  @JsonField(fieldName = INTEGER_LIST_FIELD_NAME)
  public List<Integer> integerListField;

  @JsonField(fieldName = INTEGER_QUEUE_FIELD_NAME)
  public Queue<Integer> integerQueueField;

  @JsonField(fieldName = SUBOBJECT_FIELD_NAME)
  public SubobjectParseUUT subobjectField;

  /**
   * UUT for embedding a subobject.
   */
  @JsonType
  public static class SubobjectParseUUT {
    public static final String INT_FIELD_NAME = "int";

    @JsonField(fieldName = INT_FIELD_NAME)
    public int intField;
  }
}
