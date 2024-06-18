# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Install curl
RUN apt-get update && apt-get install -y curl

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/service-a-0.0.1-SNAPSHOT.jar service-a.jar

# Make port 8081 available to the world outside this container
EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java", "-jar", "service-a.jar"]
