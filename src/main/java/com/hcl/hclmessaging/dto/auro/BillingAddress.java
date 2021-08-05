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
public class BillingAddress extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 494329768972936634L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BillingAddress\",\"namespace\":\"com.hcl.hclmessaging.dto.auro\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"phoneNumber\",\"type\":\"string\"},{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"deliveryNote\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BillingAddress> ENCODER =
      new BinaryMessageEncoder<BillingAddress>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BillingAddress> DECODER =
      new BinaryMessageDecoder<BillingAddress>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BillingAddress> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BillingAddress> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BillingAddress>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BillingAddress to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BillingAddress from a ByteBuffer. */
  public static BillingAddress fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public java.lang.CharSequence email;
  @Deprecated public java.lang.CharSequence phoneNumber;
  @Deprecated public java.lang.CharSequence address;
  @Deprecated public java.lang.CharSequence city;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public java.lang.CharSequence deliveryNote;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BillingAddress() {}

  /**
   * All-args constructor.
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param email The new value for email
   * @param phoneNumber The new value for phoneNumber
   * @param address The new value for address
   * @param city The new value for city
   * @param state The new value for state
   * @param deliveryNote The new value for deliveryNote
   */
  public BillingAddress(java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.CharSequence email, java.lang.CharSequence phoneNumber, java.lang.CharSequence address, java.lang.CharSequence city, java.lang.CharSequence state, java.lang.CharSequence deliveryNote) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.city = city;
    this.state = state;
    this.deliveryNote = deliveryNote;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    case 2: return email;
    case 3: return phoneNumber;
    case 4: return address;
    case 5: return city;
    case 6: return state;
    case 7: return deliveryNote;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: lastName = (java.lang.CharSequence)value$; break;
    case 2: email = (java.lang.CharSequence)value$; break;
    case 3: phoneNumber = (java.lang.CharSequence)value$; break;
    case 4: address = (java.lang.CharSequence)value$; break;
    case 5: city = (java.lang.CharSequence)value$; break;
    case 6: state = (java.lang.CharSequence)value$; break;
    case 7: deliveryNote = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'phoneNumber' field.
   * @return The value of the 'phoneNumber' field.
   */
  public java.lang.CharSequence getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Sets the value of the 'phoneNumber' field.
   * @param value the value to set.
   */
  public void setPhoneNumber(java.lang.CharSequence value) {
    this.phoneNumber = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }

  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'deliveryNote' field.
   * @return The value of the 'deliveryNote' field.
   */
  public java.lang.CharSequence getDeliveryNote() {
    return deliveryNote;
  }

  /**
   * Sets the value of the 'deliveryNote' field.
   * @param value the value to set.
   */
  public void setDeliveryNote(java.lang.CharSequence value) {
    this.deliveryNote = value;
  }

  /**
   * Creates a new BillingAddress RecordBuilder.
   * @return A new BillingAddress RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.BillingAddress.Builder newBuilder() {
    return new com.hcl.hclmessaging.dto.auro.BillingAddress.Builder();
  }

  /**
   * Creates a new BillingAddress RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BillingAddress RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.BillingAddress.Builder newBuilder(com.hcl.hclmessaging.dto.auro.BillingAddress.Builder other) {
    return new com.hcl.hclmessaging.dto.auro.BillingAddress.Builder(other);
  }

  /**
   * Creates a new BillingAddress RecordBuilder by copying an existing BillingAddress instance.
   * @param other The existing instance to copy.
   * @return A new BillingAddress RecordBuilder
   */
  public static com.hcl.hclmessaging.dto.auro.BillingAddress.Builder newBuilder(com.hcl.hclmessaging.dto.auro.BillingAddress other) {
    return new com.hcl.hclmessaging.dto.auro.BillingAddress.Builder(other);
  }

  /**
   * RecordBuilder for BillingAddress instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BillingAddress>
    implements org.apache.avro.data.RecordBuilder<BillingAddress> {

    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private java.lang.CharSequence email;
    private java.lang.CharSequence phoneNumber;
    private java.lang.CharSequence address;
    private java.lang.CharSequence city;
    private java.lang.CharSequence state;
    private java.lang.CharSequence deliveryNote;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.BillingAddress.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[3].schema(), other.phoneNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.city)) {
        this.city = data().deepCopy(fields()[5].schema(), other.city);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.state)) {
        this.state = data().deepCopy(fields()[6].schema(), other.state);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.deliveryNote)) {
        this.deliveryNote = data().deepCopy(fields()[7].schema(), other.deliveryNote);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BillingAddress instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hcl.hclmessaging.dto.auro.BillingAddress other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[3].schema(), other.phoneNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.city)) {
        this.city = data().deepCopy(fields()[5].schema(), other.city);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.state)) {
        this.state = data().deepCopy(fields()[6].schema(), other.state);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.deliveryNote)) {
        this.deliveryNote = data().deepCopy(fields()[7].schema(), other.deliveryNote);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.email = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearEmail() {
      email = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'phoneNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getPhoneNumber() {
      return phoneNumber;
    }

    /**
      * Sets the value of the 'phoneNumber' field.
      * @param value The value of 'phoneNumber'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setPhoneNumber(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.phoneNumber = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'phoneNumber' field has been set.
      * @return True if the 'phoneNumber' field has been set, false otherwise.
      */
    public boolean hasPhoneNumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'phoneNumber' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearPhoneNumber() {
      phoneNumber = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.address = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearAddress() {
      address = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.city = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearCity() {
      city = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setState(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.state = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearState() {
      state = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'deliveryNote' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeliveryNote() {
      return deliveryNote;
    }

    /**
      * Sets the value of the 'deliveryNote' field.
      * @param value The value of 'deliveryNote'.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder setDeliveryNote(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.deliveryNote = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'deliveryNote' field has been set.
      * @return True if the 'deliveryNote' field has been set, false otherwise.
      */
    public boolean hasDeliveryNote() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'deliveryNote' field.
      * @return This builder.
      */
    public com.hcl.hclmessaging.dto.auro.BillingAddress.Builder clearDeliveryNote() {
      deliveryNote = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BillingAddress build() {
      try {
        BillingAddress record = new BillingAddress();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.email = fieldSetFlags()[2] ? this.email : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.phoneNumber = fieldSetFlags()[3] ? this.phoneNumber : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.address = fieldSetFlags()[4] ? this.address : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.city = fieldSetFlags()[5] ? this.city : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.state = fieldSetFlags()[6] ? this.state : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.deliveryNote = fieldSetFlags()[7] ? this.deliveryNote : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BillingAddress>
    WRITER$ = (org.apache.avro.io.DatumWriter<BillingAddress>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BillingAddress>
    READER$ = (org.apache.avro.io.DatumReader<BillingAddress>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}