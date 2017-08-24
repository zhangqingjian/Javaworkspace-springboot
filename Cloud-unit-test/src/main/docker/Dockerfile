FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
LABEL "test"="test1"
ADD   ./test-1.5.4.RELEASE.jar ./app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar"]
