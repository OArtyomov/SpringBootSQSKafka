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
public class KafkaOrderMessageDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6203721955648173239L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KafkaOrderMessageDTO\",\"namespace\":\"com.hcl.hclmessaging.dto.auro\",\"fields\":[{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"Data\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"attributes\",\"type\":{\"type\":\"record\",\"name\":\"Attributes\",\"fields\":[{\"name\":\"createdAt\",\"type\":\"string\"},{\"name\":\"lastModifiedAt\",\"type\":\"string\"},{\"name\":\"orderNumber\",\"type\":\"string\"},{\"name\":\"channel\",\"type\":\"string\"},{\"name\":\"totalQuantity\",\"type\":\"int\"},{\"name\":\"overallDeliveryType\",\"type\":\"string\"},{\"name\":\"lineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LineItem\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"productId\",\"type\":\"string\"},{\"name\":\"productName\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"storeId\",\"type\":[\"string\",\"null\"]},{\"name\":\"fulfillmentType\",\"type\":\"string\"},{\"name\":\"sku\",\"type\":{\"type\":\"record\",\"name\":\"Sku\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"lineItemPrice\",\"type\":{\"type\":\"record\",\"name\":\"LineItemPrice\",\"fields\":[{\"name\":\"currencyCode\",\"type\":\"string\"},{\"name\":\"itemPriceBeforeDiscount\",\"type\":\"bytes\",\"java-class\":\"java.math.BigDecimal\",\"logicalType\":\"decimal\",\"precision\":4,\"scale\":2},{\"name\":\"discount\",\"type\":\"bytes\",\"java-class\":\"java.math.BigDecimal\",\"logicalType\":\"decimal\",\"precision\":4,\"scale\":2},{\"name\":\"itemPriceAfterDiscount\",\"type\":\"bytes\",\"java-class\":\"java.math.BigDecimal\",\"logicalType\":\"decimal\",\"precision\":4,\"scale\":2}]}},{\"name\":\"images\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Image\",\"fields\":[{\"name\":\"url\",\"type\":\"string\"}]}}}]}}]}}},{\"name\":\"shippingMethod\",\"type\":{\"type\":\"record\",\"name\":\"ShippingMethod\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"price\",\"type\":{\"type\":\"record\",\"name\":\"Price\",\"fields\":[{\"name\":\"currencyCode\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"bytes\",\"logicalType\":\"decimal\",\"java-class\":\"java.math.BigDecimal\",\"precision\":4,\"scale\":2}]}}]}},{\"name\":\"shippingAddress\",\"type\":{\"type\":\"record\",\"name\":\"Address\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"phoneNumber\",\"type\":\"string\"},{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"deliveryNote\",\"type\":\"string\"}]}},{\"name\":\"billingAddress\",\"type\":\"Address\"},{\"name\":\"paymentInfo\",\"type\":{\"type\":\"record\",\"name\":\"PaymentInfo\",\"fields\":[{\"name\":\"cardNumber\",\"type\":[\"string\",\"null\"]},{\"name\":\"cardType\",\"type\":[\"string\",\"null\"]},{\"name\":\"cardHolderName\",\"type\":[\"string\",\"null\"]},{\"name\":\"cardExpiry\",\"type\":[\"string\",\"null\"]},{\"name\":\"paymentMethod\",\"type\":[\"string\",\"null\"]},{\"name\":\"amount\",\"type\":[\"bytes\",\"null\"],\"logicalType\":\"decimal\",\"java-class\":\"java.math.BigDecimal\",\"precision\":4,\"scale\":2}]}},{\"name\":\"orderTotal\",\"type\":{\"type\":\"record\",\"name\":\"OrderTotal\",\"fields\":[{\"name\":\"currencyCode\",\"type\":\"string\"},{\"name\":\"subtotal\",\"type\":\"bytes\",\"logicalType\":\"decimal\",\"java-class\":\"java.math.BigDecimal\",\"precision\":4,\"scale\":2},{\"name\":\"tax\",\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":4,\"java-class\":\"java.math.BigDecimal\",\"scale\":2},{\"name\":\"shipping\",\"type\":\"bytes\",\"logicalType\":\"decimal\",\"java-class\":\"java.math.BigDecimal\",\"precision\":4,\"scale\":2},{\"name\":\"discount\",\"type\":\"bytes\",\"logicalType\":\"decimal\",\"java-class\":\"java.math.BigDecimal\",\"precision\":4,\"scale\":2},{\"name\":\"total\",\"type\":\"bytes\",\"logicalType\":\"decimal\",\"java-class\":\"java.math.BigDecimal\",\"precision\":4,\"scale\":2}]}}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KafkaOrderMessageDTO> ENCODER =
      new BinaryMessageEncoder<KafkaOrderMessageDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KafkaOrderMessageDTO> DECODER =
      new BinaryMessageDecoder<KafkaOrderMessageDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<KafkaOrderMessageDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<KafkaOrderMessageDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KafkaOrderMessageDTO>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this KafkaOrderMessageDTO to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a KafkaOrderMessageDTO from a ByteBuffer. */
  public static KafkaOrderMessageDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.hcl.hclmessaging.dto.auro.Data data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KafkaOrderMessageDTO() {}

  /**
   * All-args constructor.
   * @param data The new value for data
   */
  public KafkaOrderMessageDTO(com.hcl.hclmessaging.dto.auro.Data data) {
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: data = (com.hcl.hclmessaging.dto.auro.Data)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public com.hcl.hclmessaging.dto.auro.Data getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(com.hcl.hclmessaging.dto.auro.Data value) {
    this.data = value;
  }

  /**
   * Creates a new KafkaOrderMessageDTO RecordBuilder.
   * @return A new KafkaOrderMessageDTO RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder newBuilder() {
    return new com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder();
  }

  /**
   * Creates a new KafkaOrderMessageDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KafkaOrderMessageDTO RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder newBuilder(com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder other) {
    return new com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder(other);
  }

  /**
   * Creates a new KafkaOrderMessageDTO RecordBuilder by copying an existing KafkaOrderMessageDTO instance.
   * @param other The existing instance to copy.
   * @return A new KafkaOrderMessageDTO RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder newBuilder(com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO other) {
    return new com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder(other);
  }

  /**
   * RecordBuilder for KafkaOrderMessageDTO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KafkaOrderMessageDTO>
    implements org.apache.avro.data.RecordBuilder<KafkaOrderMessageDTO> {

    private com.hcl.hclmessaging.dto.auro.Data data;
    private com.hcl.hclmessaging.dto.auro.Data.Builder dataBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
      if (other.hasDataBuilder()) {
        this.dataBuilder = com.hcl.hclmessaging.dto.auro.Data.newBuilder(other.getDataBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing KafkaOrderMessageDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
      this.dataBuilder = null;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public com.hcl.hclmessaging.dto.auro.Data getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder setData(com.hcl.hclmessaging.dto.auro.Data value) {
      validate(fields()[0], value);
      this.dataBuilder = null;
      this.data = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'data' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.hcl.hclmessaging.dto.auro.Data.Builder getDataBuilder() {
      if (dataBuilder == null) {
        if (hasData()) {
          setDataBuilder(com.hcl.hclmessaging.dto.auro.Data.newBuilder(data));
        } else {
          setDataBuilder(com.hcl.hclmessaging.dto.auro.Data.newBuilder());
        }
      }
      return dataBuilder;
    }

    /**
     * Sets the Builder instance for the 'data' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder setDataBuilder(com.hcl.hclmessaging.dto.auro.Data.Builder value) {
      clearData();
      dataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'data' field has an active Builder instance
     * @return True if the 'data' field has an active Builder instance
     */
    public boolean hasDataBuilder() {
      return dataBuilder != null;
    }

    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO.Builder clearData() {
      data = null;
      dataBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KafkaOrderMessageDTO build() {
      try {
        KafkaOrderMessageDTO record = new KafkaOrderMessageDTO();
        if (dataBuilder != null) {
          record.data = this.dataBuilder.build();
        } else {
          record.data = fieldSetFlags()[0] ? this.data : (com.hcl.hclmessaging.dto.auro.Data) defaultValue(fields()[0]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KafkaOrderMessageDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<KafkaOrderMessageDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KafkaOrderMessageDTO>
    READER$ = (org.apache.avro.io.DatumReader<KafkaOrderMessageDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
