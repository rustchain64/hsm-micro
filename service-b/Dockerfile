# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Install curl
RUN apt-get update && apt-get install -y curl

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/service-b-0.0.1-SNAPSHOT.jar service-b.jar

# Make port 8082 available to the world outside this container
EXPOSE 8082

# Run the JAR file
ENTRYPOINT ["java", "-jar", "service-b.jar"]
