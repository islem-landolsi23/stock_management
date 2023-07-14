FROM openjdk:11-jre-slim
WORKDIR /eurekeserver
COPY /target/eureka_server-0.0.1-SNAPSHOT.jar eureka.jar
EXPOSE 8761
CMD ["java","-jar", "eureka.jar"]