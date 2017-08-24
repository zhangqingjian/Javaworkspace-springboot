FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
LABEL test1
ADD   ./test-1.5.4.RELEASE.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./test-1.5.4.RELEASE.jar"]
