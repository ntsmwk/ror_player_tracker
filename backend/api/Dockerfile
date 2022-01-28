FROM openjdk:11
COPY . /api
WORKDIR /api
RUN ./gradlew build
ENTRYPOINT ["java","-jar","build/libs/api-0.0.1-SNAPSHOT.jar"]
