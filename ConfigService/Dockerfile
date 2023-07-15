FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/configServer-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8887

CMD ["java","-jar", "app.jar"]