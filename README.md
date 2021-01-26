# ItemMaster skeleton micro-service springboot and JDBC implementation 

Micro-service Skeleton using SpringBoot and JDBC.

Requires:
- MySQL/MariaDB for storing data
	
	
Change application.properties for DEV or PROD purpose with DB settings:

```
# JDBC Connection
spring.datasource.url=jdbc:mysql://localhost:3306/DIH
spring.datasource.username=user
spring.datasource.password=secret
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
```

Please note that connection to the 'dockerized' MariaDB should point to the internal docker network and not to the port exposed by docker.

### Docker Hub automatic building
Since DockerHub dosen't allow to specify a folder for building the docker image, both Dockerfile and jar file have been located inside the root folder.


### Swagger UI
Access API documentation at url [http://localhost:8081/swagger-ui.html](http://localhost:8080/swagger-ui.html)

