This is my hello world to try out using java in web development, docker and kubernetes

Goals for this Hello World

##  TODO
1. ~~Create a Hello World app with Spring~~
2. ~~Get it running in a docker environment~~
3. Get it running in Kubernetes
4. Deploy on AWS
5. Try some tests -  try an new CI provider


Getting the Spring App running

Ubuntu -
### Prerequisites
- make sure java is installed
- install maven if needed  `sudo apt-get install mvn`

Further instruction can be take from [here](https://spring.io/guides/gs/spring-boot/)


To run on localhost:8080
`mvn package && java -jar target/gs-spring-boot-0.1.0.jar`

# Working with docker

See guide [here](https://spring.io/guides/gs/spring-boot-docker/)

## Prerequisites and install

https://docs.docker.com/engine/installation/linux/docker-ce/ubuntu/#install-docker

`sudo mvn install dockerfile:build`

`sudo docker run -p 8080:8080 -t springio/gs-spring-boot`

This is why I have sudo - maybe I shouldn't?
https://github.com/spotify/docker-maven-plugin/issues/105
