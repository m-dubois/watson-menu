# Watson Menu

Using docker

## Build the Docker image

```
docker image build -t watson-menu .
```

## Database

### Start the database

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


## Run app

```
docker container run -e SPRING_DATASOURCE_URL=jdbc:postgresql://192.168.1.100/watson-menu -e SPRING_DATASOURCE_PASSWORD=mysecretpassword -p 8080:8080 watson-menu
```

## Browsing the app

[http://localhost:8080/](http://localhost:8080/)
