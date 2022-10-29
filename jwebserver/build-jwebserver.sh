#!/bin/sh

# Original script from: https://github.com/shaunsmith/tiny-java-containers/tree/main/jwebserver

#native-image --static --libc=musl -m jdk.httpserver -o jwebserver.static
native-image --native-image-info --verbose --static -m jdk.httpserver -o jwebserver.static

docker build . -f Dockerfile.static -t jwebserver:static
rm -f jwebserver.upx
upx --lzma --best -o jwebserver.upx jwebserver.static 
docker build . -f Dockerfile.upx -t jwebserver:upx

echo "Generated Executables"
ls -lh jwebserver.static jwebserver.upx

echo "Generated Docker Container Images"
docker images jwebserver

echo "Run images as final E2E tests"
#time docker run jwebserver:static
#time docker run jwebserver:upx


