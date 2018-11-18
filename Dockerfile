FROM maven:3-jdk-11-slim as build

WORKDIR /app

COPY pom.xml .

RUN mkdir /frontend
COPY frontend ./frontend

RUN mkdir /backend
COPY backend ./backend

RUN mvn install

# ----

FROM openjdk:11
VOLUME /tmp
COPY --from=build /app/backend/target/backend*.jar app.jar
EXPOSE 8088
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]