# Testing : Access the Applications:

Eureka Server: http://localhost:8761.
API Gateway: http://localhost:8080
Service A: http://localhost:8081/api/hello.
Service B: http://localhost:8082.
Service C: http://localhost:8083.
Service D: http://localhost:8084.
Saga: http://localhost:8085.
Sidecar: http://localhost:8086.

# Todo PUll Request

<https://github.com/rustchain64/hsm-micro/pull/new/hsm-micro>

# Test Send a Message

curl "http://localhost:8081/send?message=HelloKafka"

# Verify the Message Received ( check docker-compose logs service-b )

Received message: HelloKafka

# Best command for development

docker-compose up --build
