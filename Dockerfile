FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/c322-finalproject-backend-0.0.1-SNAPSHOT.jar finalproject.jar
ENTRYPOINT ["java", "-jar", "finalproject.jar"]