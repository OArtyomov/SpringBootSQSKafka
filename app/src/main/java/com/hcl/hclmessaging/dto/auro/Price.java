/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.hcl.hclmessaging.dto.auro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Price extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 533052562588767987L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Price\",\"namespace\":\"com.hcl.hclmessaging.dto.auro\",\"fields\":[{\"name\":\"currencyCode\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"bytes\",\"logicalType\":\"decimal\",\"java-class\":\"java.math.BigDecimal\",\"precision\":4,\"scale\":2}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Price> ENCODER =
      new BinaryMessageEncoder<Price>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Price> DECODER =
      new BinaryMessageDecoder<Price>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Price> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Price> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Price>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Price to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Price from a ByteBuffer. */
  public static Price fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence currencyCode;
  @Deprecated public java.nio.ByteBuffer price;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Price() {}

  /**
   * All-args constructor.
   * @param currencyCode The new value for currencyCode
   * @param price The new value for price
   */
  public Price(java.lang.CharSequence currencyCode, java.nio.ByteBuffer price) {
    this.currencyCode = currencyCode;
    this.price = price;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return currencyCode;
    case 1: return price;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: currencyCode = (java.lang.CharSequence)value$; break;
    case 1: price = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'currencyCode' field.
   * @return The value of the 'currencyCode' field.
   */
  public java.lang.CharSequence getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the value of the 'currencyCode' field.
   * @param value the value to set.
   */
  public void setCurrencyCode(java.lang.CharSequence value) {
    this.currencyCode = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.nio.ByteBuffer getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.nio.ByteBuffer value) {
    this.price = value;
  }

  /**
   * Creates a new Price RecordBuilder.
   * @return A new Price RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.Price.Builder newBuilder() {
    return new com.hcl.hclmessaging.dto.auro.Price.Builder();
  }

  /**
   * Creates a new Price RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Price RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.Price.Builder newBuilder(com.hcl.hclmessaging.dto.auro.Price.Builder other) {
    return new com.hcl.hclmessaging.dto.auro.Price.Builder(other);
  }

  /**
   * Creates a new Price RecordBuilder by copying an existing Price instance.
   * @param other The existing instance to copy.
   * @return A new Price RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.Price.Builder newBuilder(com.hcl.hclmessaging.dto.auro.Price other) {
    return new com.hcl.hclmessaging.dto.auro.Price.Builder(other);
  }

  /**
   * RecordBuilder for Price instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Price>
    implements org.apache.avro.data.RecordBuilder<Price> {

    private java.lang.CharSequence currencyCode;
    private java.nio.ByteBuffer price;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.Price.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.currencyCode)) {
        this.currencyCode = data().deepCopy(fields()[0].schema(), other.currencyCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.price)) {
        this.price = data().deepCopy(fields()[1].schema(), other.price);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Price instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.Price other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.currencyCode)) {
        this.currencyCode = data().deepCopy(fields()[0].schema(), other.currencyCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.price)) {
        this.price = data().deepCopy(fields()[1].schema(), other.price);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'currencyCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getCurrencyCode() {
      return currencyCode;
    }

    /**
      * Sets the value of the 'currencyCode' field.
      * @param value The value of 'currencyCode'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Price.Builder setCurrencyCode(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.currencyCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'currencyCode' field has been set.
      * @return True if the 'currencyCode' field has been set, false otherwise.
      */
    public boolean hasCurrencyCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'currencyCode' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Price.Builder clearCurrencyCode() {
      currencyCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getPrice() {
      return price;
    }

    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Price.Builder setPrice(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.price = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Price.Builder clearPrice() {
      price = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Price build() {
      try {
        Price record = new Price();
        record.currencyCode = fieldSetFlags()[0] ? this.currencyCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.price = fieldSetFlags()[1] ? this.price : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Price>
    WRITER$ = (org.apache.avro.io.DatumWriter<Price>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Price>
    READER$ = (org.apache.avro.io.DatumReader<Price>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}