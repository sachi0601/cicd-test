# syntax=docker/dockerfile:1

FROM gradle:jdk25 AS build
WORKDIR /workspace

COPY app/build.gradle .
COPY app/src ./src

RUN gradle --no-daemon bootJar

FROM eclipse-temurin:25-jre
WORKDIR /app

COPY --from=build /workspace/build/libs/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]