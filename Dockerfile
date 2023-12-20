FROM openjdk:17
RUN mkdir -p /usr/src/app/
WORKDIR /usr/src/app/
COPY . /usr/src/app/
EXPOSE 8082
ENTRYPOINT ["java","-jar","build/libs/labIP-0.0.1-SNAPSHOT.jar"]