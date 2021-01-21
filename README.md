# Wishlist micro-service java implementation 

Micro-service wishlist using JPA.

Requires:
- MySQL/MariaDB for storing data
	
	
Change application.properties for DEV or PROD purpose with DB settings:

```
# JPA and DB connection settings
spring.datasource.url=jdbc:mariadb://wl-db:3306/WL
spring.datasource.username=user
spring.datasource.password=secret
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
# DEV PURPOSE
#spring.jpa.hibernate.ddl-auto=create-drop
# PROD PURPOSE
spring.jpa.hibernate.ddl-auto=validate
```

Please note that connection to the 'dockerized' MariaDB should point to the internal docker network and not to the port exposed by docker.

### Docker Hub automatic building
Since DockerHub dosen't allow to specify a folder for building the docker image, both Dockerfile and jar file have been located inside the root folder.


### Swagger UI
Access API documentation at url [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

