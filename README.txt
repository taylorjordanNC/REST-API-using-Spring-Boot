# Find "Good" Locations REST API Service
This is a demo REST API that allows the user to interact with location data for businesses that give back
to their community in some way as well as locations that respect Covid protocols, are minority-owned, etc.

## IDE/Language
IDE: IntelliJ Community 2020.2
JDK: Java 11 (Amazon Corretto) with Maven

### Running Application
Run application in IDE via FindGoodServiceApplication entry point.
In your browser, application is running on (127.0.0.1)localhost:8080/findgood
I used Postman to test all Post/Put/Delete operations.
GoodLocationController details how to access commands in browser or postman:
    localhost:8080/findgood/all  == Lists all json objects in MongoDB
    localhost:8080/findgood/search/{city} == Lists all json objects matching the city name parameter typed in (i.e. "Raleigh")
    localhost:8080/findgood/create == In Postman or other tool, pass in json object to be created
    localhost:8080/findgood/update == In Postman or other tool, pass in object to update and change anything but the id.
    localhost:8080/findgood/delete/name={name} == In Postman or other tool, pass in {name} parameter. This delete method finds any objects matching the name and deletes them.
    localhost:8080/findgood/delete/id={id} == In Postman or other tool, pass in {id} parameter. This delete method finds the object matching the id and deletes it.

#### Documentation
Swagger documentation can be accessed at : 127.0.0.1:8080/v2/api-docs
The Swagger UI can be accessed at : 127.0.0.1:8080/swagger-ui/

#### Contact
Author: Taylor Smith
Email: taylorjordansmith@gmail.com

##### Notes
This project is in progress. I am currently working on tests using JUnit and Mockito, improving error handling, and
developing the database. If you have any questions or wish to contribute, feel free to contact me!
