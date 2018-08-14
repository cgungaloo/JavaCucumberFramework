FROM maven
RUN apt update
COPY . /

RUN mvn clean test
