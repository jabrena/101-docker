#!/bin/sh

#https://downloads.apache.org//jmeter/binaries/

echo "Download jmeter"
rm -rf apache-jmeter-5.5
wget https://downloads.apache.org/jmeter/binaries/apache-jmeter-5.5.zip
unzip apache-jmeter-5.5.zip
cd apache-jmeter-5.5/bin
./jmeter -v
cd ../../

echo "Running docker compose jvm"
docker-compose -f docker-compose-jvm.yml up -d
sleep 50

#Generate load for JVM
rm -rf ./result-jvm.csv
rm -rf html-jvm
./apache-jmeter-5.5/bin/jmeter -n -t jvm-test1.jmx \
       -l ./result-jvm.csv

#Generate report
rm -rf ./html/**
mkdir html-jvm
./apache-jmeter-5.5/bin/jmeter -g ./result-jvm.csv  \
  -o ./html-jvm

docker-compose -f docker-compose-jvm.yml stop

echo "Running docker compose native"
docker-compose -f docker-compose-native.yml up -d
sleep 25

#Generate load for JVM
rm -rf ./result-native.csv
rm -rf html-native
./apache-jmeter-5.5/bin/jmeter -n -t jvm-test1.jmx \
       -l ./result-native.csv

#Generate report
rm -rf ./html-native/**
mkdir html-native
./apache-jmeter-5.5/bin/jmeter -g ./result-native.csv  \
  -o ./html-native

docker-compose -f docker-compose-native.yml stop
