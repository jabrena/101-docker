#!/bin/sh

# If you don`t use Github Actions for GraalVM ...

sudo apt-get update
sudo apt-get install -y wget gcc libz-dev upx musl-tools
sudo rm -rf /var/lib/apt/lists/*
export VERSION=22.3.0
wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-$VERSION/graalvm-ce-java19-linux-amd64-$VERSION.tar.gz
sudo tar -xvzf graalvm-ce-java19-linux-amd64-$VERSION.tar.gz
sudo rm graalvm-ce-java19-linux-amd64-$VERSION.tar.gz
sudo $(pwd)/graalvm-ce-java19-$VERSION/bin/gu install native-image
export PATH=$(pwd)/graalvm-ce-java19-$VERSION/bin:$PATH