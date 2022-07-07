FROM openjdk:11.0.15-slim-buster

WORKDIR /app

COPY ./target/api-rest-credit-card-0.0.1-SNAPSHOT.jar .

EXPOSE 8083

ENTRYPOINT ["java","-jar","api-rest-credit-card-0.0.1-SNAPSHOT.jar"]

