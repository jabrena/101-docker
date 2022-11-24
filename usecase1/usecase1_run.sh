#!/bin/sh

echo "Running docker compose jvm"
docker-compose -f docker-compose-jvm.yml up -d

sleep 50
curl http://localhost:9191/jvm/ -w '\n'
curl http://localhost:8081/ -w '\n'
curl http://localhost:8080/ -w '\n'
docker-compose -f docker-compose-jvm.yml stop

exit 0

echo "Running docker compose native"
docker-compose -f docker-compose-native.yml up -d

sleep 25
curl http://localhost:8081/ -w '\n'
curl http://localhost:8080/ -w '\n'
#docker-compose -f docker-compose-native.yml logs -f usecase1ag &
#docker-compose -f docker-compose-native.yml logs -f usecase1a &
#docker-compose -f docker-compose-native.yml logs -f usecase1b &
docker-compose -f docker-compose-native.yml stop

#Logs
#docker-compose -f docker-compose-jvm.yml logs -f usecase1a
#docker-compose -f docker-compose-native.yml logs -f usecase1a
#docker-compose logs -f usecase1b

#docker stats