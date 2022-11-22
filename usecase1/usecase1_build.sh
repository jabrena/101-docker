#!/bin/sh

echo "Building image for usecase1_rest_comms_a"
cd usecase1_rest_comms_a
mvn spring-boot:build-image
mvn -Pnative spring-boot:build-image
cd ..

echo "Building image for usecase1_rest_comms_b"
cd usecase1_rest_comms_b
mvn spring-boot:build-image
mvn -Pnative spring-boot:build-image
cd ..

echo "Generated Docker Container Images Summary"
docker images ghcr.io/jabrena/use-case1-a --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
sleep 1
docker images ghcr.io/jabrena/use-case1-b --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t