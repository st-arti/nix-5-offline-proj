#!/bin/sh

cd projects/mavenProject/

mvn clean package

java -jar target/maven-project.jar

mvn clean