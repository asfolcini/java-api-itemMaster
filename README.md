# Wishlist micro-service java implementation 

Micro-service wishlist using JPA.

Requires:
- MySQL/MariaDB for storing data
	
	
Change application.properties for DEV or PROD purpose with DB settings:

```
# JPA and DB connection settings
spring.datasource.url=jdbc:mariadb://localhost:3308/WL
spring.datasource.username=user
spring.datasource.password=secret
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
# DEV PURPOSE
#spring.jpa.hibernate.ddl-auto=create-drop
# PROD PURPOSE
spring.jpa.hibernate.ddl-auto=validate
```