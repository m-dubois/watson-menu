# Watson Menu

## Build app

Inside the root directory:

```
mvn clean install
```

## Run app

Run the complete Spring Boot App:

```
mvn --projects backend spring-boot:run
```

or with options for intellij remote debugging:

```
mvn --projects backend spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
```

(and launching remote debugging in intellij of course :P)


## Browsing app

[http://localhost:8088/](http://localhost:8088/)

## Run frontend app (for faster development)

```
npm run serve
```
