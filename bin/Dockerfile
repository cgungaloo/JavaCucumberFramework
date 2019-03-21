FROM maven
RUN apt update
RUN mkdir temproj
COPY . /temproj/

WORKDIR /temproj
ENTRYPOINT ["mvn", "test"]
