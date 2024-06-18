# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/sidecar-0.0.1-SNAPSHOT.jar sidecar.jar

# Make port 8086 available to the world outside this container
EXPOSE 8086

# Run the JAR file
ENTRYPOINT ["java", "-jar", "sidecar.jar"]
