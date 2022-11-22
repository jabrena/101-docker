# Python

```
docker run --rm --name django -d -p 8000:8000 py:django.0.0.1-SNAPSHOT
curl http://localhost:8000/
docker run --rm --name pyweb -d -p 8000:8000 py:http_server.0.0.1-SNAPSHOT
curl http://localhost:8080
docker run --rm --name fastapi -d -p 8080:8080 py:fastapi.0.0.1-SNAPSHOT
curl http://localhost:8080
```