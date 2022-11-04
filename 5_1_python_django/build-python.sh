#!/bin/sh

docker build . -t py:django.0.0.1-SNAPSHOT
#docker run -d -p 8000:8000 py:django.0.0.1-SNAPSHOT
docker images py

