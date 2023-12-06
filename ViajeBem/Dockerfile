


FROM ubuntu:latest AS build


RUN apt-get update && apt-get install -y openjdk-17-jdk

WORKDIR /app

COPY . .

RUN apt-get install -y maven && mvn clean install -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

WORKDIR /app

COPY --from=build /ViajeBem/target/primeiro-exemplo-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
