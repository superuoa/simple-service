FROM openjdk:8-jdk-alpine

ADD ROOT.jar ROOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "ROOT.war"]
