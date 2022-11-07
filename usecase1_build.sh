#!/bin/sh

#cd usecase1_rest_comms_a
#mvn spring-boot:build-image
#cd ..
#cd usecase1_rest_comms_b
#mvn spring-boot:build-image
#cd ..

docker-compose up -d
sleep 25
curl http://localhost:8081/
curl http://localhost:8080/
docker-compose down
