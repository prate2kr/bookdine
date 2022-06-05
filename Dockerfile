FROM ubuntu:20.04
# ENV JAVA_HOME=/u01/middleware/openjdk-11.0.1
# ENV PATH=$PATH:$JAVA_HOME/bin

# RUN mkdir -p /u01/middleware/
# WORKDIR /u01/middleware/

# ADD https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.1_linux-x64_bin.tar.gz .
# RUN tar -xzvf openjdk-11.0.1_linux-x64_bin.tar.gz
# RUN rm -rf openjdk-11.0.1_linux-x64_bin.tar.gz
#COPY run.sh .
#RUN chmod u+x run.sh
RUN mkdir -p /u01/application
RUN apt update -y
RUN apt install -y openjdk-11-jdk
WORKDIR /u01/application
COPY target/bookdine-0.0.1-SNAPSHOT.jar .
#RUN chmod u+x bookdine-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD [ "java", "-jar", "bookdine-0.0.1-SNAPSHOT.jar" ]
