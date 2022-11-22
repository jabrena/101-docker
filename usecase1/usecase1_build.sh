#!/bin/sh

echo "Building image for usecase1_rest_comms_a"
cd usecase1_rest_comms_a
mvn spring-boot:build-image
mvn -Pnative spring-boot:build-image
cd ..

echo "Building image for usecase1_rest_comms_b"
cd usecase1_rest_comms_b
mvn spring-boot:build-image
mvn -Pnative spring-boot:build-image
cd ..

echo "Generated Docker Container Images Summary"
docker images ghcr.io/jabrena/use-case1-a --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
sleep 1
docker images ghcr.io/jabrena/use-case1-b --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

echo "Running docker compose jvm"
docker-compose -f docker-compose-jvm.yml up -d

sleep 25
curl http://localhost:8081/
curl http://localhost:8080/
docker-compose -f docker-compose-jvm.yml stop

echo "Running docker compose native"
docker-compose -f docker-compose-native.yml up -d

sleep 5
curl http://localhost:8081/
curl http://localhost:8080/
docker-compose -f docker-compose-native.yml logs -f usecase1a &
docker-compose -f docker-compose-native.yml stop

#Logs
#docker-compose -f docker-compose-jvm.yml logs -f usecase1a
#docker-compose -f docker-compose-native.yml logs -f usecase1a
#docker-compose logs -f usecase1b

#docker stats