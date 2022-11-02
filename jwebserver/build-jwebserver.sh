#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

java -version

# Original script from: https://github.com/shaunsmith/tiny-java-containers/tree/main/jwebserver

#native-image --static --libc=musl -m jdk.httpserver -o jwebserver.static
#native-image --native-image-info --verbose --static -m jdk.httpserver -o jwebserver.static
native-image --static -m jdk.httpserver -o jwebserver.static

docker build . -f Dockerfile.static -t jwebserver:static
rm -f jwebserver.upx
upx --lzma --best -o jwebserver.upx jwebserver.static 
docker build . -f Dockerfile.upx -t jwebserver:upx

echo "Generated Executables"
ls -lh jwebserver.static jwebserver.upx

docker build . -f Dockerfile.jwebserver -t jwebserver:jdk

echo "Generated Docker Container Images"
docker images jwebserver

echo "Run images as final E2E tests"
#time docker run -p 8000:8000 jwebserver:static
#time docker run -p 8000:8001 jwebserver:upx
#time docker run -p 8000:8002 jwebserver:jdk
#curl localhost:8000
#curl localhost:8001
#curl localhost:8002


