#!/bin/sh

#Not used until OSX has musl support
TOOLCHAIN_DIR=`pwd`/../../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

docker login https://index.docker.io/v1 -u="$1" -p="$2"

mvn spring-boot:build-image \
    --batch-mode --no-transfer-progress

IMAGE_NAME=$(mvn help:evaluate -Dexpression=docker.image.name -q -DforceStdout)
echo $IMAGE_NAME

docker push $IMAGE_NAME