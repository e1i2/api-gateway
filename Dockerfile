FROM openjdk:17-jdk-buster

ARG DEPLOY_VERSION="app"

COPY entrypoint.sh ./
COPY build/libs/${DEPLOY_VERSION}.jar app.jar

ENTRYPOINT ["bash","/entrypoint.sh"]
