FROM openjdk:8-jdk-alpine
EXPOSE 8100
ADD target/*.war kubernatesbasicssql.war
ENTRYPOINT ["sh", "-c", "java -jar /kubernatesbasicssql.war"]