// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/headers/srtp/config.proto

package com.v2ray.core.transport.internet.headers.srtp;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_srtp_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_srtp_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;v2ray.com/core/transport/internet/head" +
      "ers/srtp/config.proto\022*v2ray.core.transp" +
      "ort.internet.headers.srtp\"w\n\006Config\022\017\n\007v" +
      "ersion\030\001 \001(\r\022\017\n\007padding\030\002 \001(\010\022\021\n\textensi" +
      "on\030\003 \001(\010\022\022\n\ncsrc_count\030\004 \001(\r\022\016\n\006marker\030\005" +
      " \001(\010\022\024\n\014payload_type\030\006 \001(\rBe\n.com.v2ray." +
      "core.transport.internet.headers.srtpP\001Z\004" +
      "srtp\252\002*V2Ray.Core.Transport.Internet.Hea" +
      "ders.Srtpb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_v2ray_core_transport_internet_headers_srtp_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_transport_internet_headers_srtp_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_srtp_Config_descriptor,
        new java.lang.String[] { "Version", "Padding", "Extension", "CsrcCount", "Marker", "PayloadType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}