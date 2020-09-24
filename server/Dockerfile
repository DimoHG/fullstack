FROM openjdk:11
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY ./build/libs/* /usr/app/app.jar
CMD java -agentlib:jdwp=transport=dt_socket,address=5050,server=y,suspend=n -jar /usr/app/app.jar
