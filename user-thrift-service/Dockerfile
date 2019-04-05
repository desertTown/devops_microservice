FROM 192.168.50.2/micro-service/openjdk:8u191-alpine
MAINTAINER deserttown 136312603722163.com

COPY target/user-thrift-service-0.0.1.jar /user-service.jar

ENTRYPOINT ["java", "-jar", "/user-service.jar"]
