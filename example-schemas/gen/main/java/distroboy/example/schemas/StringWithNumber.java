// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package distroboy.example.schemas;

/**
 * Protobuf type {@code distroboy.example.StringWithNumber}
 */
public final class StringWithNumber extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:distroboy.example.StringWithNumber)
    StringWithNumberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StringWithNumber.newBuilder() to construct.
  private StringWithNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StringWithNumber() {
    someString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StringWithNumber();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StringWithNumber(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            someString_ = s;
            break;
          }
          case 16: {

            someNumber_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return distroboy.example.schemas.Example.internal_static_distroboy_example_StringWithNumber_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return distroboy.example.schemas.Example.internal_static_distroboy_example_StringWithNumber_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            distroboy.example.schemas.StringWithNumber.class, distroboy.example.schemas.StringWithNumber.Builder.class);
  }

  public static final int SOME_STRING_FIELD_NUMBER = 1;
  private volatile java.lang.Object someString_;
  /**
   * <code>string some_string = 1;</code>
   * @return The someString.
   */
  @java.lang.Override
  public java.lang.String getSomeString() {
    java.lang.Object ref = someString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      someString_ = s;
      return s;
    }
  }
  /**
   * <code>string some_string = 1;</code>
   * @return The bytes for someString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSomeStringBytes() {
    java.lang.Object ref = someString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      someString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOME_NUMBER_FIELD_NUMBER = 2;
  private long someNumber_;
  /**
   * <code>int64 some_number = 2;</code>
   * @return The someNumber.
   */
  @java.lang.Override
  public long getSomeNumber() {
    return someNumber_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSomeStringBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, someString_);
    }
    if (someNumber_ != 0L) {
      output.writeInt64(2, someNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSomeStringBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, someString_);
    }
    if (someNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, someNumber_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof distroboy.example.schemas.StringWithNumber)) {
      return super.equals(obj);
    }
    distroboy.example.schemas.StringWithNumber other = (distroboy.example.schemas.StringWithNumber) obj;

    if (!getSomeString()
        .equals(other.getSomeString())) return false;
    if (getSomeNumber()
        != other.getSomeNumber()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SOME_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getSomeString().hashCode();
    hash = (37 * hash) + SOME_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSomeNumber());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static distroboy.example.schemas.StringWithNumber parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static distroboy.example.schemas.StringWithNumber parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static distroboy.example.schemas.StringWithNumber parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static distroboy.example.schemas.StringWithNumber parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(distroboy.example.schemas.StringWithNumber prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code distroboy.example.StringWithNumber}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:distroboy.example.StringWithNumber)
      distroboy.example.schemas.StringWithNumberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return distroboy.example.schemas.Example.internal_static_distroboy_example_StringWithNumber_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return distroboy.example.schemas.Example.internal_static_distroboy_example_StringWithNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              distroboy.example.schemas.StringWithNumber.class, distroboy.example.schemas.StringWithNumber.Builder.class);
    }

    // Construct using distroboy.example.schemas.StringWithNumber.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      someString_ = "";

      someNumber_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return distroboy.example.schemas.Example.internal_static_distroboy_example_StringWithNumber_descriptor;
    }

    @java.lang.Override
    public distroboy.example.schemas.StringWithNumber getDefaultInstanceForType() {
      return distroboy.example.schemas.StringWithNumber.getDefaultInstance();
    }

    @java.lang.Override
    public distroboy.example.schemas.StringWithNumber build() {
      distroboy.example.schemas.StringWithNumber result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public distroboy.example.schemas.StringWithNumber buildPartial() {
      distroboy.example.schemas.StringWithNumber result = new distroboy.example.schemas.StringWithNumber(this);
      result.someString_ = someString_;
      result.someNumber_ = someNumber_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof distroboy.example.schemas.StringWithNumber) {
        return mergeFrom((distroboy.example.schemas.StringWithNumber)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(distroboy.example.schemas.StringWithNumber other) {
      if (other == distroboy.example.schemas.StringWithNumber.getDefaultInstance()) return this;
      if (!other.getSomeString().isEmpty()) {
        someString_ = other.someString_;
        onChanged();
      }
      if (other.getSomeNumber() != 0L) {
        setSomeNumber(other.getSomeNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      distroboy.example.schemas.StringWithNumber parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (distroboy.example.schemas.StringWithNumber) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object someString_ = "";
    /**
     * <code>string some_string = 1;</code>
     * @return The someString.
     */
    public java.lang.String getSomeString() {
      java.lang.Object ref = someString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        someString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string some_string = 1;</code>
     * @return The bytes for someString.
     */
    public com.google.protobuf.ByteString
        getSomeStringBytes() {
      java.lang.Object ref = someString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        someString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string some_string = 1;</code>
     * @param value The someString to set.
     * @return This builder for chaining.
     */
    public Builder setSomeString(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      someString_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string some_string = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSomeString() {
      
      someString_ = getDefaultInstance().getSomeString();
      onChanged();
      return this;
    }
    /**
     * <code>string some_string = 1;</code>
     * @param value The bytes for someString to set.
     * @return This builder for chaining.
     */
    public Builder setSomeStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      someString_ = value;
      onChanged();
      return this;
    }

    private long someNumber_ ;
    /**
     * <code>int64 some_number = 2;</code>
     * @return The someNumber.
     */
    @java.lang.Override
    public long getSomeNumber() {
      return someNumber_;
    }
    /**
     * <code>int64 some_number = 2;</code>
     * @param value The someNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSomeNumber(long value) {
      
      someNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 some_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSomeNumber() {
      
      someNumber_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:distroboy.example.StringWithNumber)
  }

  // @@protoc_insertion_point(class_scope:distroboy.example.StringWithNumber)
  private static final distroboy.example.schemas.StringWithNumber DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new distroboy.example.schemas.StringWithNumber();
  }

  public static distroboy.example.schemas.StringWithNumber getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringWithNumber>
      PARSER = new com.google.protobuf.AbstractParser<StringWithNumber>() {
    @java.lang.Override
    public StringWithNumber parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StringWithNumber(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StringWithNumber> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringWithNumber> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public distroboy.example.schemas.StringWithNumber getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

