# Use a base image with Java 17
FROM openjdk:17-jdk-slim

# Install curl
RUN apt-get update && apt-get install -y curl

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar

# Make port 8761 available to the world outside this container
EXPOSE 8761

# Run the JAR file
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]
