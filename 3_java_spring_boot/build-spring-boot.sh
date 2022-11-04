#!/bin/sh

set -x

echo "Generated Executables with buildpacks"
mvn -Pnative spring-boot:build-image -Dspring-boot.build-image.imageName=benchmark-jibber:buildpacks-native.0.0.1-SNAPSHOT
mvn spring-boot:build-image -Dspring-boot.build-image.imageName=benchmark-jibber:buildpacks-jvm.0.0.1-SNAPSHOT

echo "Generated Docker Container Images Summary"
docker images jwebserver --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images hello --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images jibber-benchmark --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
docker images benchmark-jibber --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t

