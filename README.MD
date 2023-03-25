# Step-by-Step Guide to Creating a RESTful API with Spring Boot

[![Java: 17](https://img.shields.io/badge/Java-17+-green)](#)
[![Spring Boot: 3.0](https://img.shields.io/badge/Spring--Boot-3.0+-red)](#)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

[![OneMinuteProgramming](https://img.shields.io/badge/OneMinuteProgramming-_-red?style=social&logo=youtube)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)
[![YouTube Channel Subscribers](https://img.shields.io/youtube/channel/subscribers/UC7T7MMEhY8zYd6ekbDRdIhw?style=social)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)
[![YouTube Channel Views](https://img.shields.io/youtube/channel/views/UC7T7MMEhY8zYd6ekbDRdIhw?style=social)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)

[![YouTube Video](https://img.youtube.com/vi/EZOOmoO4byk/0.jpg)](https://www.youtube.com/watch?v=EZOOmoO4byk)

## Prerequisites
- JDK 17+
- Gradle 7.3+

## Build for source
```shell
gradle clean bootJar
```

## Run the application
```shell
java -jar ./build/libs/spring-boot-restful-api-0.0.1-SNAPSHOT.jar
```

## Test the application
```shell
# Get all user
curl -L -i -X GET 'http://localhost:8080/user'

#Get user whose name equal to Name A
curl -L -i -X GET 'localhost:8080/user/Name%20A' 
```
