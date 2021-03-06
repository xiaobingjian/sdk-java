// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

/**
 * Protobuf type {@code v2ray.core.app.proxyman.DispatchConfig}
 */
public  final class DispatchConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.proxyman.DispatchConfig)
    DispatchConfigOrBuilder {
  // Use DispatchConfig.newBuilder() to construct.
  private DispatchConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DispatchConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DispatchConfig(
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
          case 10: {
            com.v2ray.core.app.proxyman.MultiplexingConfig.Builder subBuilder = null;
            if (muxSettings_ != null) {
              subBuilder = muxSettings_.toBuilder();
            }
            muxSettings_ = input.readMessage(com.v2ray.core.app.proxyman.MultiplexingConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(muxSettings_);
              muxSettings_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_DispatchConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_DispatchConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.proxyman.DispatchConfig.class, com.v2ray.core.app.proxyman.DispatchConfig.Builder.class);
  }

  public static final int MUX_SETTINGS_FIELD_NUMBER = 1;
  private com.v2ray.core.app.proxyman.MultiplexingConfig muxSettings_;
  /**
   * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
   */
  public boolean hasMuxSettings() {
    return muxSettings_ != null;
  }
  /**
   * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
   */
  public com.v2ray.core.app.proxyman.MultiplexingConfig getMuxSettings() {
    return muxSettings_ == null ? com.v2ray.core.app.proxyman.MultiplexingConfig.getDefaultInstance() : muxSettings_;
  }
  /**
   * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
   */
  public com.v2ray.core.app.proxyman.MultiplexingConfigOrBuilder getMuxSettingsOrBuilder() {
    return getMuxSettings();
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
    if (muxSettings_ != null) {
      output.writeMessage(1, getMuxSettings());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (muxSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMuxSettings());
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
    if (!(obj instanceof com.v2ray.core.app.proxyman.DispatchConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.proxyman.DispatchConfig other = (com.v2ray.core.app.proxyman.DispatchConfig) obj;

    boolean result = true;
    result = result && (hasMuxSettings() == other.hasMuxSettings());
    if (hasMuxSettings()) {
      result = result && getMuxSettings()
          .equals(other.getMuxSettings());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasMuxSettings()) {
      hash = (37 * hash) + MUX_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getMuxSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.DispatchConfig parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.app.proxyman.DispatchConfig prototype) {
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
   * Protobuf type {@code v2ray.core.app.proxyman.DispatchConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.proxyman.DispatchConfig)
      com.v2ray.core.app.proxyman.DispatchConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_DispatchConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_DispatchConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.proxyman.DispatchConfig.class, com.v2ray.core.app.proxyman.DispatchConfig.Builder.class);
    }

    // Construct using com.v2ray.core.app.proxyman.DispatchConfig.newBuilder()
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
      if (muxSettingsBuilder_ == null) {
        muxSettings_ = null;
      } else {
        muxSettings_ = null;
        muxSettingsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_DispatchConfig_descriptor;
    }

    public com.v2ray.core.app.proxyman.DispatchConfig getDefaultInstanceForType() {
      return com.v2ray.core.app.proxyman.DispatchConfig.getDefaultInstance();
    }

    public com.v2ray.core.app.proxyman.DispatchConfig build() {
      com.v2ray.core.app.proxyman.DispatchConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.app.proxyman.DispatchConfig buildPartial() {
      com.v2ray.core.app.proxyman.DispatchConfig result = new com.v2ray.core.app.proxyman.DispatchConfig(this);
      if (muxSettingsBuilder_ == null) {
        result.muxSettings_ = muxSettings_;
      } else {
        result.muxSettings_ = muxSettingsBuilder_.build();
      }
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
      if (other instanceof com.v2ray.core.app.proxyman.DispatchConfig) {
        return mergeFrom((com.v2ray.core.app.proxyman.DispatchConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.proxyman.DispatchConfig other) {
      if (other == com.v2ray.core.app.proxyman.DispatchConfig.getDefaultInstance()) return this;
      if (other.hasMuxSettings()) {
        mergeMuxSettings(other.getMuxSettings());
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
      com.v2ray.core.app.proxyman.DispatchConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.app.proxyman.DispatchConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.v2ray.core.app.proxyman.MultiplexingConfig muxSettings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.app.proxyman.MultiplexingConfig, com.v2ray.core.app.proxyman.MultiplexingConfig.Builder, com.v2ray.core.app.proxyman.MultiplexingConfigOrBuilder> muxSettingsBuilder_;
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public boolean hasMuxSettings() {
      return muxSettingsBuilder_ != null || muxSettings_ != null;
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public com.v2ray.core.app.proxyman.MultiplexingConfig getMuxSettings() {
      if (muxSettingsBuilder_ == null) {
        return muxSettings_ == null ? com.v2ray.core.app.proxyman.MultiplexingConfig.getDefaultInstance() : muxSettings_;
      } else {
        return muxSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public Builder setMuxSettings(com.v2ray.core.app.proxyman.MultiplexingConfig value) {
      if (muxSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        muxSettings_ = value;
        onChanged();
      } else {
        muxSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public Builder setMuxSettings(
        com.v2ray.core.app.proxyman.MultiplexingConfig.Builder builderForValue) {
      if (muxSettingsBuilder_ == null) {
        muxSettings_ = builderForValue.build();
        onChanged();
      } else {
        muxSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public Builder mergeMuxSettings(com.v2ray.core.app.proxyman.MultiplexingConfig value) {
      if (muxSettingsBuilder_ == null) {
        if (muxSettings_ != null) {
          muxSettings_ =
            com.v2ray.core.app.proxyman.MultiplexingConfig.newBuilder(muxSettings_).mergeFrom(value).buildPartial();
        } else {
          muxSettings_ = value;
        }
        onChanged();
      } else {
        muxSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public Builder clearMuxSettings() {
      if (muxSettingsBuilder_ == null) {
        muxSettings_ = null;
        onChanged();
      } else {
        muxSettings_ = null;
        muxSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public com.v2ray.core.app.proxyman.MultiplexingConfig.Builder getMuxSettingsBuilder() {
      
      onChanged();
      return getMuxSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    public com.v2ray.core.app.proxyman.MultiplexingConfigOrBuilder getMuxSettingsOrBuilder() {
      if (muxSettingsBuilder_ != null) {
        return muxSettingsBuilder_.getMessageOrBuilder();
      } else {
        return muxSettings_ == null ?
            com.v2ray.core.app.proxyman.MultiplexingConfig.getDefaultInstance() : muxSettings_;
      }
    }
    /**
     * <code>optional .v2ray.core.app.proxyman.MultiplexingConfig mux_settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.app.proxyman.MultiplexingConfig, com.v2ray.core.app.proxyman.MultiplexingConfig.Builder, com.v2ray.core.app.proxyman.MultiplexingConfigOrBuilder> 
        getMuxSettingsFieldBuilder() {
      if (muxSettingsBuilder_ == null) {
        muxSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.app.proxyman.MultiplexingConfig, com.v2ray.core.app.proxyman.MultiplexingConfig.Builder, com.v2ray.core.app.proxyman.MultiplexingConfigOrBuilder>(
                getMuxSettings(),
                getParentForChildren(),
                isClean());
        muxSettings_ = null;
      }
      return muxSettingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.proxyman.DispatchConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.proxyman.DispatchConfig)
  private static final com.v2ray.core.app.proxyman.DispatchConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.proxyman.DispatchConfig();
  }

  public static com.v2ray.core.app.proxyman.DispatchConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DispatchConfig>
      PARSER = new com.google.protobuf.AbstractParser<DispatchConfig>() {
    public DispatchConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DispatchConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DispatchConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DispatchConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.app.proxyman.DispatchConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

