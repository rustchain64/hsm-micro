# Use a base image with Java 17
FROM openjdk:17-jdk-slim

# Install curl
RUN apt-get update && apt-get install -y curl

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
