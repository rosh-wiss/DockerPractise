FROM openjdk:17-ea-slim-buster
WORKDIR /app
COPY target/DockerTraining.jar app.jar
CMD ["java", "-jar", "app.jar"]



