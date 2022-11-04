#!/bin/sh

docker build . -t py:http_server

echo "Generated Docker Container Images Summary"
docker images py --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
