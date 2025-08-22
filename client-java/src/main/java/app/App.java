package app;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;


import app.flotilla.GreeterGrpc;
import app.flotilla.HelloReply;
import app.flotilla.HelloRequest;

public class App {
    public static void main(String[] args) {

        var channel = NettyChannelBuilder
            .forAddress("127.0.0.1", 50051)
            .usePlaintext()
            .build();        

        try {
            GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(channel);

            String name = (args.length > 0) ? args[0] : "User";
            HelloRequest req = HelloRequest.newBuilder().setName(name).build();
            HelloReply res = stub.sayHello(req);

            System.out.println("✅ Server replied: " + res.getMessage());
        } finally {
            channel.shutdownNow();
        }
    }
}