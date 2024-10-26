# Aplicación Reactiva con Spring WebFlux
Este proyecto muestra una implementación de una aplicación reactiva utilizando Spring Boot y Project Reactor, conectada a una base de datos PostgreSQL. La aplicación está diseñada para manejar grandes volúmenes de datos de manera eficiente, aprovechando el modelo de programación reactiva de WebFlux.

## Características
- Spring WebFlux: Para la construcción de APIs REST no bloqueantes y altamente escalables.
- PostgreSQL: Base de datos relacional para el almacenamiento de datos de la aplicación.
- Project Reactor: Framework de programación reactiva para operaciones asíncronas.

## Descripción
El enfoque reactivo permite que esta aplicación maneje múltiples solicitudes simultáneamente sin bloquear hilos, haciendo uso eficiente de los recursos. Este proyecto es ideal para quienes están interesados en explorar arquitecturas reactivas en Java, y puede servir de base para agregar WebSockets y transmitir datos de manera reactiva desde una API REST.

## Requisitos
* Java 11 o superior.
* Spring Boot 2.3.x.
* PostgreSQL 12 o superior.

## Instalación
1. Clona el repositorio.
```shell
$ git clone <URL-del-repositorio>
```
2. Configura la conexión a PostgreSQL en application.yml o .properties.
3. Ejecuta la aplicación.
```shell
./mvnw spring-boot:run
```
## Url para más información
https://jugnicaragua.org/construir-aplicacion-reactiva-con-spring/
