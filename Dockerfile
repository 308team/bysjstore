FROM openjdk:8-jdk-alpine  
ADD bysjstore-0.0.1-SNAPSHOT.jar  bysjstore.jar 
EXPOSE 8080 
ENTRYPOINT ["java","-jar","/bysjstore.jar"] 
