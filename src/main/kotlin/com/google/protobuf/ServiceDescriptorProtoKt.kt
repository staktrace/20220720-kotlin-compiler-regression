//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/protobuf/descriptor.proto

package com.google.protobuf;

@kotlin.jvm.JvmSynthetic
public inline fun serviceDescriptorProto(block: com.google.protobuf.ServiceDescriptorProtoKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto =
  com.google.protobuf.ServiceDescriptorProtoKt.Dsl._create(com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder()).apply { block() }._build()
public object ServiceDescriptorProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto = _builder.build()

    /**
     * <code>optional string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>optional string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MethodProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .google.protobuf.MethodDescriptorProto method = 2;</code>
     */
     public val method: com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMethodList()
      )
    /**
     * <code>repeated .google.protobuf.MethodDescriptorProto method = 2;</code>
     * @param value The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMethod")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.add(value: com.google.protobuf.DescriptorProtos.MethodDescriptorProto) {
      _builder.addMethod(value)
    }/**
     * <code>repeated .google.protobuf.MethodDescriptorProto method = 2;</code>
     * @param value The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMethod")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.plusAssign(value: com.google.protobuf.DescriptorProtos.MethodDescriptorProto) {
      add(value)
    }/**
     * <code>repeated .google.protobuf.MethodDescriptorProto method = 2;</code>
     * @param values The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMethod")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.MethodDescriptorProto>) {
      _builder.addAllMethod(values)
    }/**
     * <code>repeated .google.protobuf.MethodDescriptorProto method = 2;</code>
     * @param values The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMethod")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.MethodDescriptorProto>) {
      addAll(values)
    }/**
     * <code>repeated .google.protobuf.MethodDescriptorProto method = 2;</code>
     * @param index The index to set the value at.
     * @param value The method to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMethod")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.set(index: kotlin.Int, value: com.google.protobuf.DescriptorProtos.MethodDescriptorProto) {
      _builder.setMethod(index, value)
    }/**
     * <code>repeated .google.protobuf.MethodDescriptorProto method = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMethod")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.clear() {
      _builder.clearMethod()
    }
    /**
     * <code>optional .google.protobuf.ServiceOptions options = 3;</code>
     */
    public var options: com.google.protobuf.DescriptorProtos.ServiceOptions
      @JvmName("getOptions")
      get() = _builder.getOptions()
      @JvmName("setOptions")
      set(value) {
        _builder.setOptions(value)
      }
    /**
     * <code>optional .google.protobuf.ServiceOptions options = 3;</code>
     */
    public fun clearOptions() {
      _builder.clearOptions()
    }
    /**
     * <code>optional .google.protobuf.ServiceOptions options = 3;</code>
     * @return Whether the options field is set.
     */
    public fun hasOptions(): kotlin.Boolean {
      return _builder.hasOptions()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.copy(block: com.google.protobuf.ServiceDescriptorProtoKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto =
  com.google.protobuf.ServiceDescriptorProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
