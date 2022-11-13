#!/bin/sh

echo "Generated Executables with buildpacks"
mvn -Pnative spring-boot:build-image

echo "Generated Docker Container Images Summary"
docker images dashaun --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
