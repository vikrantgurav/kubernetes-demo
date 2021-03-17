FROM openjdk:8-jdk-alpine
RUN apk add curl
COPY ./target/kubernetes-demo-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar app.jar --info