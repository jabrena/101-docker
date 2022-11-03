#!/bin/sh

TOOLCHAIN_DIR=`pwd`/../x86_64-linux-musl-native
CC=${TOOLCHAIN_DIR}/bin/gcc
PATH=${TOOLCHAIN_DIR}/bin:${PATH}

set -x

mvn --no-transfer-progress native:compile -Pnative package
echo "Generated Executables"
upx --lzma --best ./target/benchmark-jibber -o ./target/benchmark-jibber-upx
ls -lh ./target/benchmark-jibber ./target/benchmark-jibber-upx
#time ./target/benchmark-jibber-upx &
#sleep 5
#curl http://localhost:8080/jibber/
#curl -X POST http://localhost:8080/actuator/shutdown
docker build -f Dockerfiles/Dockerfile.native --build-arg APP_FILE=benchmark-jibber-upx -t jibber-benchmark:native.0.0.1-SNAPSHOT .
#docker run --rm --name native -d -p 8080:8080 jibber-benchmark:native.0.0.1-SNAPSHOT
#sleep 5
#curl -X POST http://localhost:8080/actuator/shutdown
docker build -f Dockerfiles/Dockerfile.native-static-upx --build-arg APP_FILE=benchmark-jibber-upx -t jibber-benchmark:native.0.0.1-SNAPSHOT .

docker run --rm --name native -d -p 8080:8080 jibber-benchmark:native.0.0.1-SNAPSHOT
sleep 5
curl -X POST http://localhost:8080/actuator/shutdown
docker images