#!/bin/sh

cd http-server
docker build . -f Dockerfile -t py:http_server.0.0.1-SNAPSHOT
cd ..

cd django
docker build . -f Dockerfile -t py:django.0.0.1-SNAPSHOT
#docker run -d -p 8000:8000 py:django.0.0.1-SNAPSHOT
#curl http://localhost:8000/
cd ..

cd fastapi
docker build . -f Dockerfile -t py:fastapi.0.0.1-SNAPSHOT
#docker run -d -p 8000:8000 py:django.0.0.1-SNAPSHOT
#curl http://localhost:8000/
cd ..

echo "Generated Docker Container Images Summary"
docker images py --format '{{.Size}}\t{{.Repository}}\t{{.Tag}}\t{{.ID}}' | sed 's/ //' | sort -h -r | column -t
