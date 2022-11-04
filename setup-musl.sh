#!/bin/sh

MUSL_VERSION=11
ZLIB_VERSION=1.2.13
TOOLCHAIN_DIR=`pwd`/x86_64-linux-musl-native

# Download musl http://more.musl.cc
echo "musl version=${MUSL_VERSION}"
wget -q http://more.musl.cc/${MUSL_VERSION}/x86_64-linux-musl/x86_64-linux-musl-native.tgz
tar -xzf x86_64-linux-musl-native.tgz
rm x86_64-linux-musl-native.tgz

# Download, build, install zlib into TOOLCHAIN_DIR
echo "zlib version=${ZLIB_VERSION}"
wget -q https://zlib.net/fossils/zlib-${ZLIB_VERSION}.tar.gz
tar -xzf zlib-${ZLIB_VERSION}.tar.gz
rm zlib-${ZLIB_VERSION}.tar.gz
cd zlib-${ZLIB_VERSION}
./configure --prefix=${TOOLCHAIN_DIR} --static
make
make install
cd ..
