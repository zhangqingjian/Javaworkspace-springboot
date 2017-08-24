FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
LABEL "test"="test1"
EXPOSE 8080
ADD   ./test-1.0.jar ./app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar"]
