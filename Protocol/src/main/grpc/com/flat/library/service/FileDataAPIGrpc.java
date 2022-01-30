package com.flat.library.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: FileService.proto")
public final class FileDataAPIGrpc {

  private FileDataAPIGrpc() {}

  public static final String SERVICE_NAME = "service.FileDataAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.flat.library.service.FileService.File,
      com.flat.library.service.FileService.FileList> getFileListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fileList",
      requestType = com.flat.library.service.FileService.File.class,
      responseType = com.flat.library.service.FileService.FileList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.flat.library.service.FileService.File,
      com.flat.library.service.FileService.FileList> getFileListMethod() {
    io.grpc.MethodDescriptor<com.flat.library.service.FileService.File, com.flat.library.service.FileService.FileList> getFileListMethod;
    if ((getFileListMethod = FileDataAPIGrpc.getFileListMethod) == null) {
      synchronized (FileDataAPIGrpc.class) {
        if ((getFileListMethod = FileDataAPIGrpc.getFileListMethod) == null) {
          FileDataAPIGrpc.getFileListMethod = getFileListMethod =
              io.grpc.MethodDescriptor.<com.flat.library.service.FileService.File, com.flat.library.service.FileService.FileList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fileList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flat.library.service.FileService.File.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flat.library.service.FileService.FileList.getDefaultInstance()))
              .setSchemaDescriptor(new FileDataAPIMethodDescriptorSupplier("fileList"))
              .build();
        }
      }
    }
    return getFileListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileDataAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileDataAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileDataAPIStub>() {
        @java.lang.Override
        public FileDataAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileDataAPIStub(channel, callOptions);
        }
      };
    return FileDataAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileDataAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileDataAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileDataAPIBlockingStub>() {
        @java.lang.Override
        public FileDataAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileDataAPIBlockingStub(channel, callOptions);
        }
      };
    return FileDataAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileDataAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileDataAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileDataAPIFutureStub>() {
        @java.lang.Override
        public FileDataAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileDataAPIFutureStub(channel, callOptions);
        }
      };
    return FileDataAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FileDataAPIImplBase implements io.grpc.BindableService {

    /**
     */
    public void fileList(com.flat.library.service.FileService.File request,
        io.grpc.stub.StreamObserver<com.flat.library.service.FileService.FileList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFileListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFileListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.flat.library.service.FileService.File,
                com.flat.library.service.FileService.FileList>(
                  this, METHODID_FILE_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class FileDataAPIStub extends io.grpc.stub.AbstractAsyncStub<FileDataAPIStub> {
    private FileDataAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDataAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileDataAPIStub(channel, callOptions);
    }

    /**
     */
    public void fileList(com.flat.library.service.FileService.File request,
        io.grpc.stub.StreamObserver<com.flat.library.service.FileService.FileList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFileListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileDataAPIBlockingStub extends io.grpc.stub.AbstractBlockingStub<FileDataAPIBlockingStub> {
    private FileDataAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDataAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileDataAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.flat.library.service.FileService.FileList fileList(com.flat.library.service.FileService.File request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFileListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileDataAPIFutureStub extends io.grpc.stub.AbstractFutureStub<FileDataAPIFutureStub> {
    private FileDataAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileDataAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileDataAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.flat.library.service.FileService.FileList> fileList(
        com.flat.library.service.FileService.File request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFileListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILE_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileDataAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileDataAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FILE_LIST:
          serviceImpl.fileList((com.flat.library.service.FileService.File) request,
              (io.grpc.stub.StreamObserver<com.flat.library.service.FileService.FileList>) responseObserver);
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

  private static abstract class FileDataAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileDataAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.flat.library.service.FileService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileDataAPI");
    }
  }

  private static final class FileDataAPIFileDescriptorSupplier
      extends FileDataAPIBaseDescriptorSupplier {
    FileDataAPIFileDescriptorSupplier() {}
  }

  private static final class FileDataAPIMethodDescriptorSupplier
      extends FileDataAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileDataAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileDataAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileDataAPIFileDescriptorSupplier())
              .addMethod(getFileListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
