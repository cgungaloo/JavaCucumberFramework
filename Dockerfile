FROM maven
COPY . /app/

WORKDIR /app
RUN mvn install -DskipTests=true
RUN ls
RUN pwd
RUN chmod 777 /app/docker-entrypoint.sh \
    && ln -s /app/docker-entrypoint.sh /
ENTRYPOINT ["/app/docker-entrypoint.sh"]

#FROM java:openjdk-8-jre-alpine
#
#WORKDIR /app
#
#COPY --from=0 /app/target/googleuat-1.0-SNAPSHOT.jar /app/
#
#RUN chmod +x googleuat-1.0-SNAPSHOT.jar
#
#ENTRYPOINT ["java", "-jar", "googleuat-1.0-SNAPSHOT.jar"]
