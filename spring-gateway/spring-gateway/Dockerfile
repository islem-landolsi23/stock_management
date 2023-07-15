FROM openjdk:11-jre-slim

WORKDIR /spring-gateway/spring-gateway

COPY target/spring-gateway-0.0.1-SNAPSHOT.jar gateway.jar

EXPOSE 6969

CMD ["java","-jar", "gateway.jar"]