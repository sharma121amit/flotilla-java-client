from concurrent import futures
import time
import grpc

import flotilla_pb2
import flotilla_pb2_grpc


class GreeterServicer(flotilla_pb2_grpc.GreeterServicer):
    def SayHello(self, request, context):
        return flotilla_pb2.HelloReply(message=f"Hello, {request.name}!")


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    flotilla_pb2_grpc.add_GreeterServicer_to_server(GreeterServicer(), server)
    server.add_insecure_port("[::]:50051")
    server.start()
    print("✅ gRPC Python server running on :50051")
    try:
        while True:
            time.sleep(24 * 60 * 60)
    except KeyboardInterrupt:
        print("Shutting down...")
        server.stop(0)


if __name__ == "__main__":
    serve()