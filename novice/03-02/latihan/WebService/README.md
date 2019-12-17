#### How To Run

```
gradle build war
wget https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-runner/9.4.24.v20191120/jetty-runner-9.4.24.v20191120.jar
java -jar jetty-runner-9.4.24.v20191120.jar --port 8080 build/libs/WebService.war
```