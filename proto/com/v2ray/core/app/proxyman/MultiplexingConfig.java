// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

/**
 * Protobuf type {@code v2ray.core.app.proxyman.MultiplexingConfig}
 */
public  final class MultiplexingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.proxyman.MultiplexingConfig)
    MultiplexingConfigOrBuilder {
  // Use MultiplexingConfig.newBuilder() to construct.
  private MultiplexingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiplexingConfig() {
    enabled_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MultiplexingConfig(
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

            enabled_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_MultiplexingConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_MultiplexingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.proxyman.MultiplexingConfig.class, com.v2ray.core.app.proxyman.MultiplexingConfig.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>optional bool enabled = 1;</code>
   */
  public boolean getEnabled() {
    return enabled_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
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
    if (!(obj instanceof com.v2ray.core.app.proxyman.MultiplexingConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.proxyman.MultiplexingConfig other = (com.v2ray.core.app.proxyman.MultiplexingConfig) obj;

    boolean result = true;
    result = result && (getEnabled()
        == other.getEnabled());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.MultiplexingConfig parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.app.proxyman.MultiplexingConfig prototype) {
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
   * Protobuf type {@code v2ray.core.app.proxyman.MultiplexingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.proxyman.MultiplexingConfig)
      com.v2ray.core.app.proxyman.MultiplexingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_MultiplexingConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_MultiplexingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.proxyman.MultiplexingConfig.class, com.v2ray.core.app.proxyman.MultiplexingConfig.Builder.class);
    }

    // Construct using com.v2ray.core.app.proxyman.MultiplexingConfig.newBuilder()
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
    public Builder clear() {
      super.clear();
      enabled_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_MultiplexingConfig_descriptor;
    }

    public com.v2ray.core.app.proxyman.MultiplexingConfig getDefaultInstanceForType() {
      return com.v2ray.core.app.proxyman.MultiplexingConfig.getDefaultInstance();
    }

    public com.v2ray.core.app.proxyman.MultiplexingConfig build() {
      com.v2ray.core.app.proxyman.MultiplexingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.app.proxyman.MultiplexingConfig buildPartial() {
      com.v2ray.core.app.proxyman.MultiplexingConfig result = new com.v2ray.core.app.proxyman.MultiplexingConfig(this);
      result.enabled_ = enabled_;
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
      if (other instanceof com.v2ray.core.app.proxyman.MultiplexingConfig) {
        return mergeFrom((com.v2ray.core.app.proxyman.MultiplexingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.proxyman.MultiplexingConfig other) {
      if (other == com.v2ray.core.app.proxyman.MultiplexingConfig.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
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
      com.v2ray.core.app.proxyman.MultiplexingConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.app.proxyman.MultiplexingConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enabled_ ;
    /**
     * <code>optional bool enabled = 1;</code>
     */
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.proxyman.MultiplexingConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.proxyman.MultiplexingConfig)
  private static final com.v2ray.core.app.proxyman.MultiplexingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.proxyman.MultiplexingConfig();
  }

  public static com.v2ray.core.app.proxyman.MultiplexingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiplexingConfig>
      PARSER = new com.google.protobuf.AbstractParser<MultiplexingConfig>() {
    public MultiplexingConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MultiplexingConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiplexingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiplexingConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.app.proxyman.MultiplexingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

