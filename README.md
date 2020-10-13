# Fiera Link Tracker

Para hacer seguimiento de una campaña publicitaria este servicio te permite crear un enlace intermedio que captura los clicks que son ejecutados para esa determinada comapaña. Instantáneamente se redirige al sitio en cuestión. Se usa: Spring Boot, PostgreSQL, JPA, y Hibernate.


## Configuración de entorno

1. Clonar la Aplicación

```bash
git clone https://github.com/gentilmente/java-challenge.git
```

2. Crear DB PostgreSQL

```bash
psql -f scripts/db-create.sql
```
deberías ver
```bash
CREATE ROLE
CREATE DATABASE
GRANT
You are now connected to database "linktrackerdb" as user "fierita".
CREATE TABLE
ALTER TABLE
INSERT 0 1
 id |       url_target        |     expiration      | clicks |         shortened         |   token    | valid 
----+-------------------------+---------------------+--------+---------------------------+------------+-------
  1 | https://www.example.com | 2020-10-18 00:00:00 |      3 | http://localhost:8080/l/a | 1234567890 |     1
(1 row)
```

# Username and password
## check resources/application.properties

spring.datasource.username = fierita  
spring.datasource.password = contratame