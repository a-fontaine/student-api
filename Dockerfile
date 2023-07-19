FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY student-api-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/student-api-0.0.1-SNAPSHOT.jar"]