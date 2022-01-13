# product-backend
A simple backend service for products of online shop.

# Tools and Frameworks Used

- Backend: [Spring Boot](https://spring.io/projects/spring-boot)
- Database: [PostgreSQL](https://www.postgresql.org/)
- IDE/Code Editor: [VS Code](https://code.visualstudio.com/)
- DB Tool: [pgAdmin](https://www.pgadmin.org/)
- API Execution : [Postman](https://www.postman.com/)


# Steps 

This walkthrough assumes familiarity with Java and other common build tools like Maven as prerequisite.

Clone the git repository.

## Tools/Dependencies required

- [Java](https://www.oracle.com/java/technologies/downloads/)
- [Apache Maven](https://maven.apache.org/)
- [Apache Tomcat](https://tomcat.apache.org/)


If the project is to be run on other IDEs such as Eclipse, run the following command

```sh
mvn install
```

For the development of this project, VS Code was used with a bunch of [extensions](https://github.com/ananddsouza/product-backend/blob/main/extensions.list)
These extensions helped in creating a Spring boot project and alos providing necessary Codelens and Autcomplete features.

## Running the Service

- Go to cloned repo --> product\src\main\java\com\example\product\ProductApplication.java
- Right Click on file and select Run 
- If VSCode is being used, dev should be able to see an option "Run" in the codelens of the file ProductApplication.java just like below image.

  ![image](https://user-images.githubusercontent.com/49438392/149133462-2c35beff-95f3-46f5-9d3b-324435cc0051.png)


## Postman

For development purpose, Postman Tool has been used to perform CRUD operations on Product service. The data created this way has been used to test the frontend application.
In the repo, attached is a postman collection which on import unfolds the CRUD operations and the respective details.
