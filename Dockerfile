FROM maven
RUN apt update
COPY . /
