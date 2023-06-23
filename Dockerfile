FROM openjdk:22-jdk-slim

WORKDIR /app

RUN ls

COPY target/ /app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-demo.jar"]