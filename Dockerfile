FROM maven:3-jdk-11-slim as build

WORKDIR /app

COPY pom.xml .

RUN mkdir /frontend
COPY frontend ./frontend

RUN mkdir /backend
COPY backend ./backend

RUN mvn clean install -Dspring-boot.run.profiles=postgres -Dmaven.test.skip=true

# ----

FROM openjdk:11
VOLUME /tmp
COPY --from=build /app/backend/target/backend*.jar app.jar
EXPOSE 8088
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=postgres", "-jar","/app.jar"]
#CMD ["--spring-boot.run.profiles=postgres"]
