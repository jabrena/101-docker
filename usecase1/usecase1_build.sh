#!/bin/sh

echo "Building image for usecase1_rest_api_gateway"
cd usecase1_api_gateway
mvn spring-boot:build-image
mvn -Pnative spring-boot:build-image
cd ..

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
docker images ghcr.io/jabrena/usecase1-api-gateway --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
sleep 1
docker images ghcr.io/jabrena/usecase1-a --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
sleep 1
docker images ghcr.io/jabrena/usecase1-b --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
