FROM openjdk:8-jre-alpine
COPY target/tmbr-customer-api-0.0.1-SNAPSHOT.war /app.war 
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=container", "/app.war"]
