// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/tcp/config.proto

package com.v2ray.core.transport.internet.tcp;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.transport.internet.tcp.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .v2ray.core.transport.internet.tcp.ConnectionReuse connection_reuse = 1;</code>
   */
  boolean hasConnectionReuse();
  /**
   * <code>optional .v2ray.core.transport.internet.tcp.ConnectionReuse connection_reuse = 1;</code>
   */
  com.v2ray.core.transport.internet.tcp.ConnectionReuse getConnectionReuse();
  /**
   * <code>optional .v2ray.core.transport.internet.tcp.ConnectionReuse connection_reuse = 1;</code>
   */
  com.v2ray.core.transport.internet.tcp.ConnectionReuseOrBuilder getConnectionReuseOrBuilder();

  /**
   * <code>optional .v2ray.core.common.serial.TypedMessage header_settings = 2;</code>
   */
  boolean hasHeaderSettings();
  /**
   * <code>optional .v2ray.core.common.serial.TypedMessage header_settings = 2;</code>
   */
  com.v2ray.core.common.serial.TypedMessage getHeaderSettings();
  /**
   * <code>optional .v2ray.core.common.serial.TypedMessage header_settings = 2;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getHeaderSettingsOrBuilder();
}