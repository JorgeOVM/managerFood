FROM amazoncorretto:11
WORKDIR /app
ARG JAR_FILE=target/Piquant-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} fastFoodManager.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "fastFoodManager.jar", "--spring.profiles.active=docker"]