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
public class Data extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5512630492363230395L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Data\",\"namespace\":\"com.hcl.hclmessaging.dto.auro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"attributes\",\"type\":{\"type\":\"record\",\"name\":\"Attributes\",\"fields\":[{\"name\":\"createdAt\",\"type\":\"string\"},{\"name\":\"lastModifiedAt\",\"type\":\"string\"},{\"name\":\"orderNumber\",\"type\":\"string\"},{\"name\":\"channel\",\"type\":\"string\"},{\"name\":\"totalQuantity\",\"type\":\"int\"},{\"name\":\"overallDeliveryType\",\"type\":\"string\"},{\"name\":\"lineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LineItem\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"productId\",\"type\":\"string\"},{\"name\":\"productName\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"storeId\",\"type\":\"string\"},{\"name\":\"fulfillmentType\",\"type\":\"string\"},{\"name\":\"sku\",\"type\":{\"type\":\"record\",\"name\":\"Sku\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"lineItemPrice\",\"type\":{\"type\":\"record\",\"name\":\"LineItemPrice\",\"fields\":[{\"name\":\"currencyCode\",\"type\":\"string\"},{\"name\":\"itemPriceBeforeDiscount\",\"type\":\"int\"},{\"name\":\"discount\",\"type\":\"int\"},{\"name\":\"itemPriceAfterDiscount\",\"type\":\"int\"}]}},{\"name\":\"images\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Image\",\"fields\":[{\"name\":\"url\",\"type\":\"string\"}]}}}]}}]}}},{\"name\":\"shippingMethod\",\"type\":{\"type\":\"record\",\"name\":\"ShippingMethod\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"price\",\"type\":{\"type\":\"record\",\"name\":\"Price\",\"fields\":[{\"name\":\"currencyCode\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"int\"}]}}]}},{\"name\":\"shippingAddress\",\"type\":{\"type\":\"record\",\"name\":\"Address\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"phoneNumber\",\"type\":\"string\"},{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"deliveryNote\",\"type\":\"string\"}]}},{\"name\":\"billingAddress\",\"type\":\"Address\"},{\"name\":\"paymentInfo\",\"type\":{\"type\":\"record\",\"name\":\"PaymentInfo\",\"fields\":[{\"name\":\"cardNumber\",\"type\":\"string\"},{\"name\":\"cardType\",\"type\":\"string\"},{\"name\":\"cardHolderName\",\"type\":\"string\"},{\"name\":\"cardExpiry\",\"type\":\"string\"},{\"name\":\"paymentMethod\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"float\"}]}},{\"name\":\"orderTotal\",\"type\":{\"type\":\"record\",\"name\":\"OrderTotal\",\"fields\":[{\"name\":\"currencyCode\",\"type\":\"string\"},{\"name\":\"subtotal\",\"type\":\"int\"},{\"name\":\"tax\",\"type\":\"int\"},{\"name\":\"shipping\",\"type\":\"int\"},{\"name\":\"discount\",\"type\":\"int\"},{\"name\":\"total\",\"type\":\"int\"}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Data> ENCODER =
      new BinaryMessageEncoder<Data>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Data> DECODER =
      new BinaryMessageDecoder<Data>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Data> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Data> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Data>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Data to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Data from a ByteBuffer. */
  public static Data fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence type;
  @Deprecated public com.hcl.hclmessaging.dto.auro.Attributes attributes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Data() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param type The new value for type
   * @param attributes The new value for attributes
   */
  public Data(java.lang.CharSequence id, java.lang.CharSequence type, com.hcl.hclmessaging.dto.auro.Attributes attributes) {
    this.id = id;
    this.type = type;
    this.attributes = attributes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return type;
    case 2: return attributes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: type = (java.lang.CharSequence)value$; break;
    case 2: attributes = (com.hcl.hclmessaging.dto.auro.Attributes)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'attributes' field.
   * @return The value of the 'attributes' field.
   */
  public com.hcl.hclmessaging.dto.auro.Attributes getAttributes() {
    return attributes;
  }

  /**
   * Sets the value of the 'attributes' field.
   * @param value the value to set.
   */
  public void setAttributes(com.hcl.hclmessaging.dto.auro.Attributes value) {
    this.attributes = value;
  }

  /**
   * Creates a new Data RecordBuilder.
   * @return A new Data RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.Data.Builder newBuilder() {
    return new com.hcl.hclmessaging.dto.auro.Data.Builder();
  }

  /**
   * Creates a new Data RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Data RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.Data.Builder newBuilder(com.hcl.hclmessaging.dto.auro.Data.Builder other) {
    return new com.hcl.hclmessaging.dto.auro.Data.Builder(other);
  }

  /**
   * Creates a new Data RecordBuilder by copying an existing Data instance.
   * @param other The existing instance to copy.
   * @return A new Data RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.Data.Builder newBuilder(com.hcl.hclmessaging.dto.auro.Data other) {
    return new com.hcl.hclmessaging.dto.auro.Data.Builder(other);
  }

  /**
   * RecordBuilder for Data instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Data>
    implements org.apache.avro.data.RecordBuilder<Data> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence type;
    private com.hcl.hclmessaging.dto.auro.Attributes attributes;
    private com.hcl.hclmessaging.dto.auro.Attributes.Builder attributesBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.Data.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attributes)) {
        this.attributes = data().deepCopy(fields()[2].schema(), other.attributes);
        fieldSetFlags()[2] = true;
      }
      if (other.hasAttributesBuilder()) {
        this.attributesBuilder = com.hcl.hclmessaging.dto.auro.Attributes.newBuilder(other.getAttributesBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Data instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.Data other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attributes)) {
        this.attributes = data().deepCopy(fields()[2].schema(), other.attributes);
        fieldSetFlags()[2] = true;
      }
      this.attributesBuilder = null;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Data.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Data.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Data.Builder setType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Data.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributes' field.
      * @return The value.
      */
    public com.hcl.hclmessaging.dto.auro.Attributes getAttributes() {
      return attributes;
    }

    /**
      * Sets the value of the 'attributes' field.
      * @param value The value of 'attributes'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Data.Builder setAttributes(com.hcl.hclmessaging.dto.auro.Attributes value) {
      validate(fields()[2], value);
      this.attributesBuilder = null;
      this.attributes = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'attributes' field has been set.
      * @return True if the 'attributes' field has been set, false otherwise.
      */
    public boolean hasAttributes() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'attributes' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.hcl.hclmessaging.dto.auro.Attributes.Builder getAttributesBuilder() {
      if (attributesBuilder == null) {
        if (hasAttributes()) {
          setAttributesBuilder(com.hcl.hclmessaging.dto.auro.Attributes.newBuilder(attributes));
        } else {
          setAttributesBuilder(com.hcl.hclmessaging.dto.auro.Attributes.newBuilder());
        }
      }
      return attributesBuilder;
    }

    /**
     * Sets the Builder instance for the 'attributes' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.hcl.hclmessaging.dto.auro.Data.Builder setAttributesBuilder(com.hcl.hclmessaging.dto.auro.Attributes.Builder value) {
      clearAttributes();
      attributesBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'attributes' field has an active Builder instance
     * @return True if the 'attributes' field has an active Builder instance
     */
    public boolean hasAttributesBuilder() {
      return attributesBuilder != null;
    }

    /**
      * Clears the value of the 'attributes' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.Data.Builder clearAttributes() {
      attributes = null;
      attributesBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Data build() {
      try {
        Data record = new Data();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.CharSequence) defaultValue(fields()[1]);
        if (attributesBuilder != null) {
          record.attributes = this.attributesBuilder.build();
        } else {
          record.attributes = fieldSetFlags()[2] ? this.attributes : (com.hcl.hclmessaging.dto.auro.Attributes) defaultValue(fields()[2]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Data>
    WRITER$ = (org.apache.avro.io.DatumWriter<Data>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Data>
    READER$ = (org.apache.avro.io.DatumReader<Data>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
