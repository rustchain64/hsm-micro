#!/bin/bash

# Navigate to each service directory and build the project
services=("eureka-server" "api-gateway" "service-a" "service-b" "service-c" "service-d" "saga" "sidecar")

for service in "${services[@]}"
do
  echo "Building $service..."
  cd $service
  ./mvnw clean package
  cd ..
done

# Build Docker images using Docker Compose
docker-compose build
