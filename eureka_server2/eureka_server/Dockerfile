FROM openjdk:11-jre-slim
WORKDIR /eureka_server2/eureka_server
COPY /target/eureka_server-0.0.1-SNAPSHOT.jar eureka.jar
EXPOSE 8888
CMD ["java","-jar", "eureka.jar"]