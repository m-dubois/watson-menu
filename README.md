# Watson Menu

[![Build Status](https://travis-ci.org/m-dubois/watson-menu.svg?branch=master)](https://travis-ci.org/m-dubois/watson-menu)


## Build the app

Inside the root directory:

```
mvn clean install
```

### Build Docker image

```
docker image build -t watson-menu .
```

## Run app

### Default

Run the complete Spring Boot App:

```
mvn --projects backend spring-boot:run
```

### With Intellij Remote Debugging

With options for intellij remote debugging:

```
mvn --projects backend spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
```

(and launching remote debugging in intellij of course :P)

### Changing the default Spring profile

Launching the app with postgres profile:

```
mvn -Dspring-boot.run.profiles=postgres --projects backend spring-boot:run
```

## Browsing app

[http://localhost:8088/](http://localhost:8088/)

## Run frontend app (for faster development)

```
npm run serve
```
