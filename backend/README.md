# Backend

## Database

### Start database

```
docker run --name watson-menu-psql \
    -p 5432:5432 \
    -e POSTGRES_DB=watson-menu \
    -e POSTGRES_PASSWORD=mysecretpassword \
    -d postgres
```

port exposed by default: 5432

### Stop the database

```
docker stop watson-menu-psql
```

### Restart the database

```
docker start watson-menu-psql
```

### Remove the container

```
docker rm watson-menu-psql
```

### Connect to db (with psql)

```
docker run -it --rm --link watson-menu-psql:postgres postgres psql -h postgres -U postgres
```

password: mysecretpassword

## Application

### Start the application

```
mvn
```

(will launch the default H2 profile)

To launch with postgres:

```
mvn -Ppostgres
```

## Feeding the beast

Adding a menu via the REST API

```
curl -i -X POST -H "Content-Type:application/json" http://localhost:8080/api/v1/menus -d '{"day":"2018-12-12"}'
```

## Misc

Some useful URLs

* [http://localhost:8080/api/v1/menus?day=2018-12-31](http://localhost:8080/api/v1/menus?day=2018-12-31)
* [http://localhost:8080/api/v1/hello?delay=3](http://localhost:8080/api/v1/hello?delay=3)
* [http://localhost:8080/h2-console/](http://localhost:8080/h2-console/)
