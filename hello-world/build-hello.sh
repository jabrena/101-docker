#!/bin/sh

# Original script from: https://github.com/shaunsmith/tiny-java-containers/tree/main/helloworld

java -version
javac Hello.java
#native-image --static --libc=musl -o hello.static Hello
native-image --native-image-info --verbose --static -o hello.static Hello
ldd hello.static
docker build . -f Dockerfile.static -t hello:static
rm -f hello.upx
upx --lzma --best -o hello.upx hello.static
docker build . -f Dockerfile.upx -t hello:upx

echo "Generated Executables"
ls -lh hello.static hello.upx

echo "Generated Docker Container Images"
docker images hello

echo "Run images as final E2E tests"
time docker run hello:static
time docker run hello:upx


