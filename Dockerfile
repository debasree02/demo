FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-web.jar
ENTRYPOINT ["java","-jar","/demo-web.jar"]
EXPOSE 9081