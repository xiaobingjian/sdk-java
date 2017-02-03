// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/headers/wechat/config.proto

package com.v2ray.core.transport.internet.headers.wechat;

/**
 * Protobuf type {@code v2ray.core.transport.internet.headers.wechat.VideoConfig}
 */
public  final class VideoConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.headers.wechat.VideoConfig)
    VideoConfigOrBuilder {
  // Use VideoConfig.newBuilder() to construct.
  private VideoConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VideoConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
    return com.v2ray.core.transport.internet.headers.wechat.Config.internal_static_v2ray_core_transport_internet_headers_wechat_VideoConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.headers.wechat.Config.internal_static_v2ray_core_transport_internet_headers_wechat_VideoConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.headers.wechat.VideoConfig.class, com.v2ray.core.transport.internet.headers.wechat.VideoConfig.Builder.class);
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
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.transport.internet.headers.wechat.VideoConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.headers.wechat.VideoConfig other = (com.v2ray.core.transport.internet.headers.wechat.VideoConfig) obj;

    boolean result = true;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.transport.internet.headers.wechat.VideoConfig prototype) {
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
   * Protobuf type {@code v2ray.core.transport.internet.headers.wechat.VideoConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.headers.wechat.VideoConfig)
      com.v2ray.core.transport.internet.headers.wechat.VideoConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.headers.wechat.Config.internal_static_v2ray_core_transport_internet_headers_wechat_VideoConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.headers.wechat.Config.internal_static_v2ray_core_transport_internet_headers_wechat_VideoConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.headers.wechat.VideoConfig.class, com.v2ray.core.transport.internet.headers.wechat.VideoConfig.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.headers.wechat.VideoConfig.newBuilder()
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
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.headers.wechat.Config.internal_static_v2ray_core_transport_internet_headers_wechat_VideoConfig_descriptor;
    }

    public com.v2ray.core.transport.internet.headers.wechat.VideoConfig getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.headers.wechat.VideoConfig.getDefaultInstance();
    }

    public com.v2ray.core.transport.internet.headers.wechat.VideoConfig build() {
      com.v2ray.core.transport.internet.headers.wechat.VideoConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.internet.headers.wechat.VideoConfig buildPartial() {
      com.v2ray.core.transport.internet.headers.wechat.VideoConfig result = new com.v2ray.core.transport.internet.headers.wechat.VideoConfig(this);
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
      if (other instanceof com.v2ray.core.transport.internet.headers.wechat.VideoConfig) {
        return mergeFrom((com.v2ray.core.transport.internet.headers.wechat.VideoConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.headers.wechat.VideoConfig other) {
      if (other == com.v2ray.core.transport.internet.headers.wechat.VideoConfig.getDefaultInstance()) return this;
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
      com.v2ray.core.transport.internet.headers.wechat.VideoConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.headers.wechat.VideoConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.headers.wechat.VideoConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.headers.wechat.VideoConfig)
  private static final com.v2ray.core.transport.internet.headers.wechat.VideoConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.headers.wechat.VideoConfig();
  }

  public static com.v2ray.core.transport.internet.headers.wechat.VideoConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoConfig>
      PARSER = new com.google.protobuf.AbstractParser<VideoConfig>() {
    public VideoConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VideoConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.transport.internet.headers.wechat.VideoConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
