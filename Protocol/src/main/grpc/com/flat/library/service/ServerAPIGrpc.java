package com.flat.library.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: ServerService.proto")
public final class ServerAPIGrpc {

  private ServerAPIGrpc() {}

  public static final String SERVICE_NAME = "service.ServerAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.flat.library.service.ServerService.ClientInfo,
      com.flat.library.service.ServerService.ServerInfo> getGetDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDetails",
      requestType = com.flat.library.service.ServerService.ClientInfo.class,
      responseType = com.flat.library.service.ServerService.ServerInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.flat.library.service.ServerService.ClientInfo,
      com.flat.library.service.ServerService.ServerInfo> getGetDetailsMethod() {
    io.grpc.MethodDescriptor<com.flat.library.service.ServerService.ClientInfo, com.flat.library.service.ServerService.ServerInfo> getGetDetailsMethod;
    if ((getGetDetailsMethod = ServerAPIGrpc.getGetDetailsMethod) == null) {
      synchronized (ServerAPIGrpc.class) {
        if ((getGetDetailsMethod = ServerAPIGrpc.getGetDetailsMethod) == null) {
          ServerAPIGrpc.getGetDetailsMethod = getGetDetailsMethod =
              io.grpc.MethodDescriptor.<com.flat.library.service.ServerService.ClientInfo, com.flat.library.service.ServerService.ServerInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flat.library.service.ServerService.ClientInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flat.library.service.ServerService.ServerInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ServerAPIMethodDescriptorSupplier("getDetails"))
              .build();
        }
      }
    }
    return getGetDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerAPIStub>() {
        @java.lang.Override
        public ServerAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerAPIStub(channel, callOptions);
        }
      };
    return ServerAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerAPIBlockingStub>() {
        @java.lang.Override
        public ServerAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerAPIBlockingStub(channel, callOptions);
        }
      };
    return ServerAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerAPIFutureStub>() {
        @java.lang.Override
        public ServerAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerAPIFutureStub(channel, callOptions);
        }
      };
    return ServerAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServerAPIImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDetails(com.flat.library.service.ServerService.ClientInfo request,
        io.grpc.stub.StreamObserver<com.flat.library.service.ServerService.ServerInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDetailsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.flat.library.service.ServerService.ClientInfo,
                com.flat.library.service.ServerService.ServerInfo>(
                  this, METHODID_GET_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class ServerAPIStub extends io.grpc.stub.AbstractAsyncStub<ServerAPIStub> {
    private ServerAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerAPIStub(channel, callOptions);
    }

    /**
     */
    public void getDetails(com.flat.library.service.ServerService.ClientInfo request,
        io.grpc.stub.StreamObserver<com.flat.library.service.ServerService.ServerInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerAPIBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServerAPIBlockingStub> {
    private ServerAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.flat.library.service.ServerService.ServerInfo getDetails(com.flat.library.service.ServerService.ClientInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerAPIFutureStub extends io.grpc.stub.AbstractFutureStub<ServerAPIFutureStub> {
    private ServerAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.flat.library.service.ServerService.ServerInfo> getDetails(
        com.flat.library.service.ServerService.ClientInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DETAILS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DETAILS:
          serviceImpl.getDetails((com.flat.library.service.ServerService.ClientInfo) request,
              (io.grpc.stub.StreamObserver<com.flat.library.service.ServerService.ServerInfo>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.flat.library.service.ServerService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerAPI");
    }
  }

  private static final class ServerAPIFileDescriptorSupplier
      extends ServerAPIBaseDescriptorSupplier {
    ServerAPIFileDescriptorSupplier() {}
  }

  private static final class ServerAPIMethodDescriptorSupplier
      extends ServerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerAPIMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerAPIFileDescriptorSupplier())
              .addMethod(getGetDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
