FROM openjdk:11-jre-slim
WORKDIR /country_client
COPY /target/country_client-0.0.1-SNAPSHOT.jar mscommunication.jar
EXPOSE 9090
CMD ["java","-jar", "mscommunication.jar"]