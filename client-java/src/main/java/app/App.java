package app;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;


import app.flotilla.EdgeServiceGrpc;
import app.flotilla.echoMessage;

public class App {
    public static void main(String[] args) {

        var channel = NettyChannelBuilder
            .forAddress("127.0.0.1", 50051)
            .usePlaintext()
            .build();        

        try {
            EdgeServiceGrpc.EdgeServiceBlockingStub stub = EdgeServiceGrpc.newBlockingStub(channel);

            String name = (args.length > 0) ? args[0] : "User";
            echoMessage req = echoMessage.newBuilder().setText(name).build();
            echoMessage res = stub.echo(req);

            System.out.println("✅ Server replied: " + res.getText());
        } finally {
            channel.shutdownNow();
        }
    }
}