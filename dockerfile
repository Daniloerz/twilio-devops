FROM openjdk:11
COPY /build/libs/twilio-powerup-0.0.1-SNAPSHOT.jar twilio.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","/twilio.jar"]