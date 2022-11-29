#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

echo "Generated Executables with buildpacks"
#mvn spring-boot:build-image

#docker login -u="${DOCKER_USERNAME}" -p="${DOCKER_PASSWORD}"

docker login -u="$1" -p="$2"

mvn spring-boot:build-image \
            --batch-mode --no-transfer-progress \
            -Dspring-boot.build-image.imageName="jabrena/demo-ms:0.1.0"

#docker push docker.io/jabrena/demo-ms:0.1.0
docker push "jabrena/demo-ms:0.1.0"