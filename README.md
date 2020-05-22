1. Clone the code from this place.
2. Add application.properties file with the below values.
   In this demo I have used mysql database,hence below are sample datasource url,username and password.
    spring.datasource.url=jdbc:mysql://localhost:3306/demo
    spring.datasource.username=root
    spring.datasource.password=password
    spring.jpa.properties.hibernate.jdbc.time_zone=UTC
3.Build the application using "mvn clean install"
4.A jar is generated, run the jar using command "java -jar jar-name.jar"


Endpoint for message insertion and fetching:
Insert Messages:
    Method:Post, endpoint: /messages
    Request body sample : {
        "messagename": "test message",
        "deliveryTime": "2020-05-20T20:47:00Z"  
    }
Fetch messages:
 Method:Get, endpoint:/messages
