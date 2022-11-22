# dockerize-node-hello-world

```
docker build . -t nodejs:express.0.0.1-SNAPSHOT
docker images nodejs
docker run --rm --name nodejs -d -p 8080:8080 nodejs:express.0.0.1-SNAPSHOT
curl http://localhost:8080    
```
