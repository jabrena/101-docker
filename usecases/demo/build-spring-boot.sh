#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

docker login -u="$1" -p="$2"

mvn spring-boot:build-image

BUILD_VERSION=$(mvn help:evaluate -Dexpression=docker.image -q -DforceStdout)
echo $BUILD_VERSION

docker push $BUILD_VERSION