#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

echo "Generated Executables with buildpacks"
mvn -Pnative spring-boot:build-image -Dspring-boot.build-image.imageName=benchmark-jibber:buildpacks-native.0.0.1-SNAPSHOT
mvn spring-boot:build-image -Dspring-boot.build-image.imageName=benchmark-jibber:buildpacks-jvm.0.0.1-SNAPSHOT

echo "Generated Docker Container Images Summary"
docker images jwebserver --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images hello --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images jibber-benchmark --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images

