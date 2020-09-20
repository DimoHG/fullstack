FROM openjdk:11
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD build/libs/server-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]
