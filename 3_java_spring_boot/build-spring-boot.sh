#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

mvn --no-transfer-progress native:compile -Pnative package

echo "Generated Executables"
upx --lzma --best ./target/benchmark-jibber -o ./target/benchmark-jibber-upx

ldd ./target/benchmark-jibber
ldd ./target/benchmark-jibber-upx
ls -lh ./target/benchmark-jibber ./target/benchmark-jibber-upx

docker build . -f Dockerfiles/Dockerfile.native --build-arg APP_FILE=benchmark-jibber-upx -t jibber-benchmark:native.0.0.1-SNAPSHOT
docker build . -f Dockerfiles/Dockerfile.native-static-upx --build-arg APP_FILE=benchmark-jibber-upx -t jibber-benchmark:native-upx.0.0.1-SNAPSHOT

echo "Run images as final E2E tests"
docker run --rm --name native -d -p 8080:8080 jibber-benchmark:native-upx.0.0.1-SNAPSHOT
sleep 5
curl -X POST http://localhost:8080/actuator/shutdown

echo "Generated Docker Container Images"
docker images jwebserver --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images hello --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images jibber-benchmark --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
