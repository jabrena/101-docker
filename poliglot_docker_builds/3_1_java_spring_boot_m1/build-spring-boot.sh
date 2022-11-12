#!/bin/sh

echo "Generated Executables with buildpacks"
mvn -Pnative spring-boot:build-image
