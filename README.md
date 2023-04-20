# sakilaAPI
This project provides an API for the Sakila database,  The API is available in two styles: Representational State Transfer (REST) and Simple Object Access Protocol (SOAP). It uses JAX-RS and JAX-WS to create the web services, JPA to interact with MySQL database, and Maven to manage the project. It also utilizes MapStruct for improved code generation and Tomcat for deployment.


## Technologies Used

- JAX-RS
- JAX-WS
- JPA
- Maven
- MapStruct
- Tomcat
## Getting Started


### Requirements

- Java 17
- Maven
- Tomcat
- MySQL Server
- Sakila DB


### Installation

To get started with this project, you will need to clone this repository onto your local machine:

- Configure the Sakila-API/src/main/resources/META-INF/persistence.xml file with your DB credentials.
- Configure the tomcat plguin in the Sakila-API/pom.xml file with your tomcat credentials.


### Deployment

To deploy this project run

```bash
  cd Sakila-API
  mvn install tomcat7:deploy
```


## Documentation

- [Documentation](https://documenter.getpostman.com/view/18968433/2s93Y3ug3i)

## Usage
- The REST endpoints can be accessed at http://localhost:8090/sakilaAPI/rest
- The SOAP endpoints can be accessed at http://localhost:8090/sakilaAPI/soap
## REST API Reference

- The REST API provides endpoints for CRUD operation at all the resources in addintion to enpoints for the bussines logic.

- CRUD operations on the resources follow this pattern.

## Contributing

Contributions are always welcome! Please feel free to open a pull request or an issue if you would like to contribute to this project.