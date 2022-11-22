#!/bin/sh

#https://downloads.apache.org//jmeter/binaries/

echo "Running docker compose jvm"
docker-compose -f docker-compose-jvm.yml up -d
sleep 25

#Generate load for JVM
rm -rf ./result-jvm.csv
rm -rf html-jvm
jmeter -n -t jvm-test1.jmx \
       -l ./result-jvm.csv

#Generate report
rm -rf ./html/**
mkdir html-jvm
jmeter -g ./result-jvm.csv  \
  -o ./html-jvm

docker-compose -f docker-compose-jvm.yml stop

echo "Running docker compose native"
docker-compose -f docker-compose-hybrid.yml up -d
sleep 25

#Generate load for JVM
rm -rf ./result-native.csv
rm -rf html-native
jmeter -n -t jvm-test1.jmx \
       -l ./result-native.csv

#Generate report
rm -rf ./html-native/**
mkdir html-native
jmeter -g ./result-native.csv  \
  -o ./html-native

docker-compose -f docker-compose-hybrid.yml stop
