package app.flotilla;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: flotilla.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EdgeServiceGrpc {

  private EdgeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "flotilla.EdgeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.flotilla.echoMessage,
      app.flotilla.echoMessage> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = app.flotilla.echoMessage.class,
      responseType = app.flotilla.echoMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.flotilla.echoMessage,
      app.flotilla.echoMessage> getEchoMethod() {
    io.grpc.MethodDescriptor<app.flotilla.echoMessage, app.flotilla.echoMessage> getEchoMethod;
    if ((getEchoMethod = EdgeServiceGrpc.getEchoMethod) == null) {
      synchronized (EdgeServiceGrpc.class) {
        if ((getEchoMethod = EdgeServiceGrpc.getEchoMethod) == null) {
          EdgeServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<app.flotilla.echoMessage, app.flotilla.echoMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.flotilla.echoMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.flotilla.echoMessage.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeServiceMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EdgeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgeServiceStub>() {
        @java.lang.Override
        public EdgeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgeServiceStub(channel, callOptions);
        }
      };
    return EdgeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EdgeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgeServiceBlockingStub>() {
        @java.lang.Override
        public EdgeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgeServiceBlockingStub(channel, callOptions);
        }
      };
    return EdgeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EdgeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgeServiceFutureStub>() {
        @java.lang.Override
        public EdgeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgeServiceFutureStub(channel, callOptions);
        }
      };
    return EdgeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void echo(app.flotilla.echoMessage request,
        io.grpc.stub.StreamObserver<app.flotilla.echoMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EdgeService.
   */
  public static abstract class EdgeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EdgeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EdgeService.
   */
  public static final class EdgeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EdgeServiceStub> {
    private EdgeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgeServiceStub(channel, callOptions);
    }

    /**
     */
    public void echo(app.flotilla.echoMessage request,
        io.grpc.stub.StreamObserver<app.flotilla.echoMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EdgeService.
   */
  public static final class EdgeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EdgeServiceBlockingStub> {
    private EdgeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.flotilla.echoMessage echo(app.flotilla.echoMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EdgeService.
   */
  public static final class EdgeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EdgeServiceFutureStub> {
    private EdgeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.flotilla.echoMessage> echo(
        app.flotilla.echoMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((app.flotilla.echoMessage) request,
              (io.grpc.stub.StreamObserver<app.flotilla.echoMessage>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEchoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.flotilla.echoMessage,
              app.flotilla.echoMessage>(
                service, METHODID_ECHO)))
        .build();
  }

  private static abstract class EdgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EdgeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.flotilla.Flotilla.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EdgeService");
    }
  }

  private static final class EdgeServiceFileDescriptorSupplier
      extends EdgeServiceBaseDescriptorSupplier {
    EdgeServiceFileDescriptorSupplier() {}
  }

  private static final class EdgeServiceMethodDescriptorSupplier
      extends EdgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EdgeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EdgeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EdgeServiceFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
