#!/bin/sh

echo "Running docker compose jvm"
docker-compose -f docker-compose-jvm.yml up -d

sleep 50
curl http://localhost:9191/jvm/ -w '\n'
curl http://localhost:8081/ -w '\n'
curl http://localhost:8080/ -w '\n'
docker-compose -f docker-compose-jvm.yml stop

echo "Running docker compose native"
docker-compose -f docker-compose-native.yml up -d

sleep 25
curl http://localhost:8081/ -w '\n'
curl http://localhost:8080/ -w '\n'
#docker-compose -f docker-compose-native.yml logs -f usecase1ag &
#docker-compose -f docker-compose-native.yml logs -f usecase1a &
#docker-compose -f docker-compose-native.yml logs -f usecase1b &
docker-compose -f docker-compose-native.yml stop

#Logs
#docker-compose -f docker-compose-jvm.yml logs -f usecase1a
#docker-compose -f docker-compose-native.yml logs -f usecase1a
#docker-compose logs -f usecase1b

#docker stats

#
#docker run --rm --name native -d -p 8080:8080 ghcr.io/jabrena/usecase1-b:buildpacks-native.0.0.1-SNAPSHOT
#docker run --name native2 -p 8081:8081 ghcr.io/jabrena/usecase1-b:buildpacks-native.0.0.1-SNAPSHOT
#docker run --rm --name jvm -d -p 8081:8081 ghcr.io/jabrena/usecase1-b:buildpacks-jvm.0.0.1-SNAPSHOT

