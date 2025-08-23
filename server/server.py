from concurrent import futures
import time
import grpc

import flotilla_pb2
import flotilla_pb2_grpc


class EdgeServiceServicer(flotilla_pb2_grpc.EdgeServiceServicer):
    def Echo(self, request, context):
        return flotilla_pb2.echoMessage(text=f"Hello, {request.text}!")


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    flotilla_pb2_grpc.add_EdgeServiceServicer_to_server(EdgeServiceServicer(), server)
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