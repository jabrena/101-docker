#!/bin/sh

#Generate load for JVM
rm -rf ./result.csv
rm -rf html
jmeter -n -t jvm-test1.jmx \
       -l ./result.csv

#Generate report
rm -rf ./html/**
mkdir html
jmeter -g ./result.csv  \
  -o ./html