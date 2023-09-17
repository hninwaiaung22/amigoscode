FROM maven As build

WORKDIR /app/amigoscode

COPY . .

RUN mvn clean package

FROM openjdk:11

WORKDIR /app

COPY target/amigoscode-0.0.1-SNAPSHOT.jar /app/

CMD ["java","-jar", "amigoscode-0.0.1-SNAPSHOT.jar"]

#FROM eclipse-temurin:11-jdk-alpine
#VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#EXPOSE 8081
