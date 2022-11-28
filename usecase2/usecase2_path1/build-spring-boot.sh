#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

echo "Generated Executables with buildpacks"
mvn spring-boot:build-image

echo "Running docker compose jvm"
docker-compose -f docker-compose.yml up -d
sleep 60
curl -X GET http://localhost:8080/jibber
curl -X POST http://localhost:8080/actuator/shutdown

docker-compose -f docker-compose.yml down
