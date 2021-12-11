FROM openjdk:11-jdk-slim
COPY "./target/clico4BackEndProductos-0.0.1-SNAPSHOT.war" "app.war"
EXPOSE 8083
ENTRYPOINT ["java","-jar","app.war"]