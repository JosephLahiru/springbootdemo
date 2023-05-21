FROM openjdk:19-jdk-alpine
EXPOSE 8080
WORKDIR project
ADD ./target/springbootdemo-0.0.1-SNAPSHOT.jar /project
ENTRYPOINT ["Java", "-jar", "springbootdemo-0.0.1-SNAPSHOT.jar", "--type='local'"]