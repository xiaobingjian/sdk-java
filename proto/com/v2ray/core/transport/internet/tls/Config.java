// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/tls/config.proto

package com.v2ray.core.transport.internet.tls;

/**
 * Protobuf type {@code v2ray.core.transport.internet.tls.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.tls.Config)
    ConfigOrBuilder {
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    allowInsecure_ = false;
    certificate_ = java.util.Collections.emptyList();
    serverName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Config(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            allowInsecure_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              certificate_ = new java.util.ArrayList<com.v2ray.core.transport.internet.tls.Certificate>();
              mutable_bitField0_ |= 0x00000002;
            }
            certificate_.add(
                input.readMessage(com.v2ray.core.transport.internet.tls.Certificate.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            serverName_ = s;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        certificate_ = java.util.Collections.unmodifiableList(certificate_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.tls.Config.class, com.v2ray.core.transport.internet.tls.Config.Builder.class);
  }

  private int bitField0_;
  public static final int ALLOW_INSECURE_FIELD_NUMBER = 1;
  private boolean allowInsecure_;
  /**
   * <pre>
   * Whether or not to allow self-signed certificates.
   * </pre>
   *
   * <code>optional bool allow_insecure = 1;</code>
   */
  public boolean getAllowInsecure() {
    return allowInsecure_;
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 2;
  private java.util.List<com.v2ray.core.transport.internet.tls.Certificate> certificate_;
  /**
   * <pre>
   * List of certificates to be served on server.
   * </pre>
   *
   * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
   */
  public java.util.List<com.v2ray.core.transport.internet.tls.Certificate> getCertificateList() {
    return certificate_;
  }
  /**
   * <pre>
   * List of certificates to be served on server.
   * </pre>
   *
   * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
   */
  public java.util.List<? extends com.v2ray.core.transport.internet.tls.CertificateOrBuilder> 
      getCertificateOrBuilderList() {
    return certificate_;
  }
  /**
   * <pre>
   * List of certificates to be served on server.
   * </pre>
   *
   * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
   */
  public int getCertificateCount() {
    return certificate_.size();
  }
  /**
   * <pre>
   * List of certificates to be served on server.
   * </pre>
   *
   * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
   */
  public com.v2ray.core.transport.internet.tls.Certificate getCertificate(int index) {
    return certificate_.get(index);
  }
  /**
   * <pre>
   * List of certificates to be served on server.
   * </pre>
   *
   * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
   */
  public com.v2ray.core.transport.internet.tls.CertificateOrBuilder getCertificateOrBuilder(
      int index) {
    return certificate_.get(index);
  }

  public static final int SERVER_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object serverName_;
  /**
   * <pre>
   * Override server name.
   * </pre>
   *
   * <code>optional string server_name = 3;</code>
   */
  public java.lang.String getServerName() {
    java.lang.Object ref = serverName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serverName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Override server name.
   * </pre>
   *
   * <code>optional string server_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getServerNameBytes() {
    java.lang.Object ref = serverName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serverName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (allowInsecure_ != false) {
      output.writeBool(1, allowInsecure_);
    }
    for (int i = 0; i < certificate_.size(); i++) {
      output.writeMessage(2, certificate_.get(i));
    }
    if (!getServerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serverName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allowInsecure_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, allowInsecure_);
    }
    for (int i = 0; i < certificate_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, certificate_.get(i));
    }
    if (!getServerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serverName_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.transport.internet.tls.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.tls.Config other = (com.v2ray.core.transport.internet.tls.Config) obj;

    boolean result = true;
    result = result && (getAllowInsecure()
        == other.getAllowInsecure());
    result = result && getCertificateList()
        .equals(other.getCertificateList());
    result = result && getServerName()
        .equals(other.getServerName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ALLOW_INSECURE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowInsecure());
    if (getCertificateCount() > 0) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificateList().hashCode();
    }
    hash = (37 * hash) + SERVER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServerName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.tls.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.tls.Config parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.transport.internet.tls.Config prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code v2ray.core.transport.internet.tls.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.tls.Config)
      com.v2ray.core.transport.internet.tls.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.tls.Config.class, com.v2ray.core.transport.internet.tls.Config.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.tls.Config.newBuilder()
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
        getCertificateFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      allowInsecure_ = false;

      if (certificateBuilder_ == null) {
        certificate_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        certificateBuilder_.clear();
      }
      serverName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Config_descriptor;
    }

    public com.v2ray.core.transport.internet.tls.Config getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.tls.Config.getDefaultInstance();
    }

    public com.v2ray.core.transport.internet.tls.Config build() {
      com.v2ray.core.transport.internet.tls.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.internet.tls.Config buildPartial() {
      com.v2ray.core.transport.internet.tls.Config result = new com.v2ray.core.transport.internet.tls.Config(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.allowInsecure_ = allowInsecure_;
      if (certificateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          certificate_ = java.util.Collections.unmodifiableList(certificate_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.certificate_ = certificate_;
      } else {
        result.certificate_ = certificateBuilder_.build();
      }
      result.serverName_ = serverName_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.transport.internet.tls.Config) {
        return mergeFrom((com.v2ray.core.transport.internet.tls.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.tls.Config other) {
      if (other == com.v2ray.core.transport.internet.tls.Config.getDefaultInstance()) return this;
      if (other.getAllowInsecure() != false) {
        setAllowInsecure(other.getAllowInsecure());
      }
      if (certificateBuilder_ == null) {
        if (!other.certificate_.isEmpty()) {
          if (certificate_.isEmpty()) {
            certificate_ = other.certificate_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCertificateIsMutable();
            certificate_.addAll(other.certificate_);
          }
          onChanged();
        }
      } else {
        if (!other.certificate_.isEmpty()) {
          if (certificateBuilder_.isEmpty()) {
            certificateBuilder_.dispose();
            certificateBuilder_ = null;
            certificate_ = other.certificate_;
            bitField0_ = (bitField0_ & ~0x00000002);
            certificateBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCertificateFieldBuilder() : null;
          } else {
            certificateBuilder_.addAllMessages(other.certificate_);
          }
        }
      }
      if (!other.getServerName().isEmpty()) {
        serverName_ = other.serverName_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.transport.internet.tls.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.tls.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean allowInsecure_ ;
    /**
     * <pre>
     * Whether or not to allow self-signed certificates.
     * </pre>
     *
     * <code>optional bool allow_insecure = 1;</code>
     */
    public boolean getAllowInsecure() {
      return allowInsecure_;
    }
    /**
     * <pre>
     * Whether or not to allow self-signed certificates.
     * </pre>
     *
     * <code>optional bool allow_insecure = 1;</code>
     */
    public Builder setAllowInsecure(boolean value) {
      
      allowInsecure_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to allow self-signed certificates.
     * </pre>
     *
     * <code>optional bool allow_insecure = 1;</code>
     */
    public Builder clearAllowInsecure() {
      
      allowInsecure_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.v2ray.core.transport.internet.tls.Certificate> certificate_ =
      java.util.Collections.emptyList();
    private void ensureCertificateIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        certificate_ = new java.util.ArrayList<com.v2ray.core.transport.internet.tls.Certificate>(certificate_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.tls.Certificate, com.v2ray.core.transport.internet.tls.Certificate.Builder, com.v2ray.core.transport.internet.tls.CertificateOrBuilder> certificateBuilder_;

    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.tls.Certificate> getCertificateList() {
      if (certificateBuilder_ == null) {
        return java.util.Collections.unmodifiableList(certificate_);
      } else {
        return certificateBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public int getCertificateCount() {
      if (certificateBuilder_ == null) {
        return certificate_.size();
      } else {
        return certificateBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public com.v2ray.core.transport.internet.tls.Certificate getCertificate(int index) {
      if (certificateBuilder_ == null) {
        return certificate_.get(index);
      } else {
        return certificateBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder setCertificate(
        int index, com.v2ray.core.transport.internet.tls.Certificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificateIsMutable();
        certificate_.set(index, value);
        onChanged();
      } else {
        certificateBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder setCertificate(
        int index, com.v2ray.core.transport.internet.tls.Certificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        ensureCertificateIsMutable();
        certificate_.set(index, builderForValue.build());
        onChanged();
      } else {
        certificateBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder addCertificate(com.v2ray.core.transport.internet.tls.Certificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificateIsMutable();
        certificate_.add(value);
        onChanged();
      } else {
        certificateBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder addCertificate(
        int index, com.v2ray.core.transport.internet.tls.Certificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificateIsMutable();
        certificate_.add(index, value);
        onChanged();
      } else {
        certificateBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder addCertificate(
        com.v2ray.core.transport.internet.tls.Certificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        ensureCertificateIsMutable();
        certificate_.add(builderForValue.build());
        onChanged();
      } else {
        certificateBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder addCertificate(
        int index, com.v2ray.core.transport.internet.tls.Certificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        ensureCertificateIsMutable();
        certificate_.add(index, builderForValue.build());
        onChanged();
      } else {
        certificateBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder addAllCertificate(
        java.lang.Iterable<? extends com.v2ray.core.transport.internet.tls.Certificate> values) {
      if (certificateBuilder_ == null) {
        ensureCertificateIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, certificate_);
        onChanged();
      } else {
        certificateBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder clearCertificate() {
      if (certificateBuilder_ == null) {
        certificate_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        certificateBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public Builder removeCertificate(int index) {
      if (certificateBuilder_ == null) {
        ensureCertificateIsMutable();
        certificate_.remove(index);
        onChanged();
      } else {
        certificateBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public com.v2ray.core.transport.internet.tls.Certificate.Builder getCertificateBuilder(
        int index) {
      return getCertificateFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public com.v2ray.core.transport.internet.tls.CertificateOrBuilder getCertificateOrBuilder(
        int index) {
      if (certificateBuilder_ == null) {
        return certificate_.get(index);  } else {
        return certificateBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public java.util.List<? extends com.v2ray.core.transport.internet.tls.CertificateOrBuilder> 
         getCertificateOrBuilderList() {
      if (certificateBuilder_ != null) {
        return certificateBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(certificate_);
      }
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public com.v2ray.core.transport.internet.tls.Certificate.Builder addCertificateBuilder() {
      return getCertificateFieldBuilder().addBuilder(
          com.v2ray.core.transport.internet.tls.Certificate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public com.v2ray.core.transport.internet.tls.Certificate.Builder addCertificateBuilder(
        int index) {
      return getCertificateFieldBuilder().addBuilder(
          index, com.v2ray.core.transport.internet.tls.Certificate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of certificates to be served on server.
     * </pre>
     *
     * <code>repeated .v2ray.core.transport.internet.tls.Certificate certificate = 2;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.tls.Certificate.Builder> 
         getCertificateBuilderList() {
      return getCertificateFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.tls.Certificate, com.v2ray.core.transport.internet.tls.Certificate.Builder, com.v2ray.core.transport.internet.tls.CertificateOrBuilder> 
        getCertificateFieldBuilder() {
      if (certificateBuilder_ == null) {
        certificateBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.transport.internet.tls.Certificate, com.v2ray.core.transport.internet.tls.Certificate.Builder, com.v2ray.core.transport.internet.tls.CertificateOrBuilder>(
                certificate_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        certificate_ = null;
      }
      return certificateBuilder_;
    }

    private java.lang.Object serverName_ = "";
    /**
     * <pre>
     * Override server name.
     * </pre>
     *
     * <code>optional string server_name = 3;</code>
     */
    public java.lang.String getServerName() {
      java.lang.Object ref = serverName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Override server name.
     * </pre>
     *
     * <code>optional string server_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getServerNameBytes() {
      java.lang.Object ref = serverName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Override server name.
     * </pre>
     *
     * <code>optional string server_name = 3;</code>
     */
    public Builder setServerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serverName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Override server name.
     * </pre>
     *
     * <code>optional string server_name = 3;</code>
     */
    public Builder clearServerName() {
      
      serverName_ = getDefaultInstance().getServerName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Override server name.
     * </pre>
     *
     * <code>optional string server_name = 3;</code>
     */
    public Builder setServerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serverName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.tls.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.tls.Config)
  private static final com.v2ray.core.transport.internet.tls.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.tls.Config();
  }

  public static com.v2ray.core.transport.internet.tls.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.transport.internet.tls.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

