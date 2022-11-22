#!/bin/sh

echo "Running docker compose jvm"
docker-compose -f docker-compose-jvm.yml up -d

sleep 25
curl http://localhost:8081/
echo ""
curl http://localhost:8080/
echo ""
docker-compose -f docker-compose-jvm.yml stop

echo "Running docker compose native"
docker-compose -f docker-compose-native.yml up -d

sleep 25
curl http://localhost:8081/
echo ""
curl http://localhost:8080/
echo ""
#docker-compose -f docker-compose-native.yml logs -f usecase1a &
docker-compose -f docker-compose-native.yml stop

#Logs
#docker-compose -f docker-compose-jvm.yml logs -f usecase1a
#docker-compose -f docker-compose-native.yml logs -f usecase1a
#docker-compose logs -f usecase1b

#docker stats