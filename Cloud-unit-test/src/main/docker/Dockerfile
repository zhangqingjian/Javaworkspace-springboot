#下载镜像到容器中
FROM frolvlad/alpine-oraclejdk8:slim
#将本地文件夹挂在到temp下
VOLUME /tmp
LABEL "test"="test1"
#暴露8080端口
EXPOSE 8080
# 将当前目录下的test-1.0.jar 添加到容器中并取名为app.jar
ADD   ./test-1.0.jar ./app.jar 
# 启动入口，执行java -jar ./app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar"]