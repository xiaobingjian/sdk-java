// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/shadowsocks/config.proto

package com.v2ray.core.proxy.shadowsocks;

public interface ServerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.proxy.shadowsocks.ServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool udp_enabled = 1;</code>
   */
  boolean getUdpEnabled();

  /**
   * <code>optional .v2ray.core.common.protocol.User user = 2;</code>
   */
  boolean hasUser();
  /**
   * <code>optional .v2ray.core.common.protocol.User user = 2;</code>
   */
  com.v2ray.core.common.protocol.User getUser();
  /**
   * <code>optional .v2ray.core.common.protocol.User user = 2;</code>
   */
  com.v2ray.core.common.protocol.UserOrBuilder getUserOrBuilder();
}
