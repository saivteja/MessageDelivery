#Project Title: MessageDelivery
RESTful web service accepts a message content and delivery time and returns 202 status code.
#Getting Started
JDK - Java™ Platform, Standard Edition Development Kit.
Spring Boot - Framework to ease the bootstrapping and development of new Spring Applications.
MySQL - Open-Source Relational Database Management System.
git - Free and Open-Source distributed version control system.
Maven - Dependency Management.
External Tools Used.
Postman - API Development Environment (Testing Docmentation).
#Prerequisites
What things you need to install the software and how to install them?
•	Eclipse IDE/ VS code (any IDE which can support the Sprint boot framework)
•	Any Data base ( I used My SQl)
If no profile is provided, an in-memory relational database will be used. If any other profile is provided, the appropriate database server must be started separately. Spring Boot will auto-configure a connection to the database using it's auto-configuration defaults. The connection parameters can be configured by setting the appropriate Spring Boot properties. If more than one of these profiles is provided, the application will throw an exception and fail to start.
#Database drivers
Database drivers for MySQL included in the project. Running the application locally.
#There are several ways to run a Spring Boot application on your local machine.#
One way is to execute the main method in the Package name: com.demo and class name: DemoApplication.java class from your IDE.
Download the zip or clone the Git repository.
Unzip the zip file (if you downloaded one)
Open Command Prompt and Change directory (cd) to folder containing pom.xml
Open Eclipse
File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
Select the project
1.	Add application.properties file with the below values. In this demo I have used mysql database,hence below are sample datasource url,username and password. spring.datasource.url=jdbc:mysql://localhost:3306/demo spring.datasource.username=root spring.datasource.password=password spring.jpa.properties.hibernate.jdbc.time_zone=UTC 
2.	Build the application using "mvn clean install" 
3.	A jar is generated, run the jar using command "java -jar jar-name.jar"
Endpoint for message insertion and fetching: Insert Messages: Method:Post, endpoint: /messages Request body sample : { "messagename": "test message", "deliveryTime": "2020-05-20T20:47:00Z"
} Fetch messages: Method:Get, endpoint:/messages
#packages
models — to hold our entities;
repositories — to communicate with the database;
services — to hold our business logic;
security — security configuration;
controllers — to listen to the client;
resources/ - Contains all the static resources, templates and property files.
resources/static - contains static resources such as css, js and images.
resources/templates - contains server-side templates which are rendered by Spring.
resources/application.properties - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.
pom.xml - contains all the project dependencies

