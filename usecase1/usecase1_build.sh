#!/bin/sh

build_docker_for_spring_boot () {
    echo "Building image for $1"
    cd $1
    mvn spring-boot:build-image
    mvn -Pnative spring-boot:build-image
    cd ..
}

build_docker_for_spring_boot "usecase1_api_gateway"
build_docker_for_spring_boot "usecase1_rest_comms_a"
build_docker_for_spring_boot "usecase1_rest_comms_b"

docker_summary() {
    docker images $1 --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
    sleep 1  
}

echo "Generated Docker Container Images Summary"
docker_summary "ghcr.io/jabrena/usecase1-api-gateway"
docker_summary "ghcr.io/jabrena/usecase1-a"
docker_summary "ghcr.io/jabrena/usecase1-b"
