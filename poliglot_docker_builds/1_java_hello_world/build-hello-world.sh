#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

# Compile Java source file
javac Hello.java

# Compile Java bytecodes into a fully statically linked executable

case $(uname | tr '[:upper:]' '[:lower:]') in
  linux*)
    echo "Linux detected"
    native-image --static --libc=musl -o hello.static Hello
    ;;
  darwin*)
    echo "OSX detected"
    native-image -o hello.static Hello
    ;;
  *)
    echo "No supported your OS"
    uname
    exit 1
    ;;
esac


rm *.txt
rm -rf hello.upx

# Create a compressed version of the executable
upx --lzma --best hello.static -o hello.upx

ldd hello.static
ldd hello.upx

echo "Create docker images"
docker build . -f Dockerfile.distroless-static -t hello:distroless-static
docker build . -f Dockerfile.static -t hello:static
docker build . -f Dockerfile.upx -t hello:upx

echo "Run images as final E2E tests"
time docker run hello:distroless-static
time docker run hello:static
time docker run hello:upx

echo "Generated Docker Container Images"
docker images hello --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
