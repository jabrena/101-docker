#!/bin/sh

docker build . -t py:django.0.0.1-SNAPSHOT
#docker run -d -p 8000:8000 py:django.0.0.1-SNAPSHOT

echo "Generated Docker Container Images Summary"
docker images py --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t


